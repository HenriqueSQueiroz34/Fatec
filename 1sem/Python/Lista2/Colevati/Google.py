import platform
import subprocess

def obter_nome_so():
    """Função que retorna o nome do Sistema Operacional."""
    return platform.system()

def processar_ping():
    """Procedimento que executa o ping e processa a média da última linha."""
    so = obter_nome_so()
    host = "www.google.com.br"
    
    print(f"Detectado: {so}. Iniciando teste para {host}...")

    # Define o comando baseado no SO
    if so == "Windows":
        comando = ["ping", "-4", "-n", "10", host]
    elif so == "Linux":
        comando = ["ping", "-4", "-c", "10", host]
    else:
        print("Sistema operacional não suportado para este teste.")
        return

    try:
        # Executa o comando e captura a saída
        resultado = subprocess.run(comando, capture_output=True, text=True, encoding='cp850' if so == "Windows" else 'utf-8')
        linhas = resultado.stdout.strip().split('\n')
        
        if not linhas:
            print("Não foi possível obter resposta do ping.")
            return

        # A última linha geralmente contém as estatísticas
        ultima_linha = linhas[-1]

        if so == "Windows":
            # Exemplo Windows: Médio = 15ms -> Mdia = 15 ms
            # O split busca o valor após o 'Médio =' ou 'Average ='
            partes = ultima_linha.split('=')
            valor_media = partes[-1].strip()
            print(f"Mdia = {valor_media}")

        elif so == "Linux":
            # Exemplo Linux: rtt min/avg/max/mdev = 14.1/15.2/16.3/0.1 ms
            # O split busca os valores separados por '/'
            valores = ultima_linha.split('=')[1].split('/')
            media = valores[1] # O segundo valor é a média (avg)
            print(f"avg {media} ms")

    except Exception as e:
        print(f"Erro ao executar o processo: {e}")

# Execução do programa
if __name__ == "__main__":
    processar_ping()