import platform
import subprocess
import time
import multiprocessing as mulp

def obter_nome_so():
    return platform.system()

def processando(so,coma):
    try:
        # Executa o comando e captura a saída
        resultado = subprocess.run(coma, capture_output=True, text=True, encoding='cp850' if so == "Windows" else 'utf-8')
        linhas = resultado.stdout.strip().split('\n')

        time.sleep(0.5)
        
        if not linhas:
            print("Não foi possível obter resposta do ping.")
            return

        ultima_linha = linhas[-1]

        if so == "Windows":
            partes = ultima_linha.split('=')
            valor_media = partes[-1].strip()
            print("Host:",coma,f"Mdia = {valor_media}")

        elif so == "Linux":
            valores = ultima_linha.split('=')[1].split('/')
            media = valores[1]
            print("Host:",coma,f"avg {media} ms")

    except Exception as e:
        print(f"Erro ao executar o processo: {e}")

def main():
    host: str
    comando: str = [' ']*5
    listaComando: str = [(' ',' ')]*10
    cont: int
    h: str

    so = obter_nome_so()
    host = ["www.uol.com.br","www.terra.com.br","www.google.com.br"]
    

    # Define o comando baseado no SO
    for cont in range(3):
        h = host[cont]
        print(f"Detectado: {so}. Iniciando teste para {h}...")
        if so == "Windows":
            comando = ["ping", "-4", "-n", "10", h]
        elif so == "Linux":
            comando = ["ping", "-4", "-c", "10", h]
        else:
            print("Sistema operacional não suportado para este teste.")
    
        listaComando[cont] = so,comando

    with mulp.Pool(processes=3) as pool:
        pool.starmap(processando,listaComando)


if __name__ == "__main__":
    main()