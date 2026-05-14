import platform
import subprocess

def obter_nome_so():
    return platform.system()

def processar_ping():
    so = obter_nome_so()
    host = "www.google.com.br"
    
    print(f"Detectado: {so}. Iniciando teste para {host}...")

    if so == "Windows":
        comando = ["ping", "-4", "-n", "10", host]
    elif so == "Linux":
        comando = ["ping", "-4", "-c", "10", host]
    else:
        print("Sistema operacional não suportado para este teste.")
        return

    try:
        resultado = subprocess.run(comando, capture_output=True, text=True, encoding='cp850' if so == "Windows" else 'utf-8')
        linhas = resultado.stdout.strip().split('\n')
        
        if not linhas:
            print("Não foi possível obter resposta do ping.")
            return

        ultima_linha = linhas[-1]

        if so == "Windows":
            partes = ultima_linha.split('=')
            valor_media = partes[-1].strip()
            print(f"Mdia = {valor_media}")

        elif so == "Linux":
            valores = ultima_linha.split('=')[1].split('/')
            media = valores[1]
            print(f"avg {media} ms")

    except Exception as e:
        print(f"Erro ao executar o processo: {e}")

# Execução do programa
if __name__ == "__main__":
    processar_ping()