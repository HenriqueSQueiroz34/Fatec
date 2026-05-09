import platform
import os

def get_os_name():
    """Função que identifica e retorna o nome do Sistema Operacional."""
    return platform.system()

def executar_comando_so(comando_base, alvo=None):
    """Procedimento que executa processos filhos de acordo com o SO."""
    so = get_os_name()
    
    # Dicionário de comandos conforme as dicas da imagem
    comandos = {
        "Windows": {
            "listar": "TASKLIST /FO TABLE",
            "matar_pid": f"TASKKILL /PID {alvo} /F",
            "matar_nome": f"TASKKILL /IM {alvo} /F"
        },
        "Linux": {
            "listar": "ps -ef",
            "matar_pid": f"kill -9 {alvo}",
            "matar_nome": f"pkill -f {alvo}"
        }
    }

    if so in comandos:
        cmd = comandos[so][comando_base]
        print(f"\nExecutando no {so}: {cmd}\n")
        os.system(cmd)
    else:
        print("Sistema Operacional não suportado.")

def main():
    while True:
        print("\n--- GERENCIADOR DE PROCESSOS ---")
        print("1 – Listar os processos")
        print("2 – Matar por PID")
        print("3 – Matar por nome")
        print("9 – Encerrar a aplicação")
        
        opcao = input("\nEscolha uma opção: ")

        if opcao == "1":
            executar_comando_so("listar")
        
        elif opcao == "2":
            pid = input("Digite o PID do processo: ")
            executar_comando_so("matar_pid", pid)
            
        elif opcao == "3":
            nome = input("Digite o nome do processo: ")
            executar_comando_so("matar_nome", nome)
            
        elif opcao == "9":
            print("Encerrando aplicação...")
            break
        
        else:
            print("Opção inválida!")

if __name__ == "__main__":
    main()