# 🌡 Sistema de Controle de Temperatura da Estufa

## Descrição
Projeto simples em Java que simula o monitoramento de temperatura de uma estufa durante 24 horas.
O usuário informa a temperatura mínima e máxima aceitáveis e depois insere 24 leituras (uma por hora).
O programa calcula a média, identifica a menor e maior temperatura, conta quantas leituras ficaram acima do limite máximo
e exibe alertas quando a temperatura está fora do padrão.

## Requisitos
- Java JDK 8 ou superior (javac e jar).

## Estrutura do projeto
```
estufa_full/
 ├── src/
 │    └── TemperatureControl.java
 ├── manifest.txt
 ├── build.sh
 ├── build.bat
 ├── README.md
 └── .gitignore
```

## Como compilar e gerar o .jar

### Linux / macOS
1. Abra um terminal na pasta do projeto (onde está o `build.sh`).
2. Torne o script executável (se necessário):
   ```
   chmod +x build.sh
   ```
3. Execute:
   ```
   ./build.sh
   ```

### Windows (cmd)
Abra o prompt de comando na pasta do projeto e execute:
```
build.bat
```

Os comandos irão:
- Compilar `src/TemperatureControl.java` para `bin/`
- Criar o arquivo `TemperatureControl.jar` usando o `manifest.txt`

## Executando o programa
Depois de gerar o JAR:
```
java -jar TemperatureControl.jar
```

### Exemplo de uso
- Informe temperatura mínima: `18.0`
- Informe temperatura máxima: `30.0`
- Em seguida insira 24 valores numéricos (ex: `22.5`) quando solicitado para cada hora.

## Subindo no GitHub
1. Crie um repositório no GitHub.
2. No diretório do projeto:
   ```
   git init
   git add .
   git commit -m "Entrega: Estufa - sistema de controle de temperatura"
   git branch -M main
   git remote add origin <URL_DO_REPO>
   git push -u origin main
   ```

## Observações
- O JAR é gerado localmente no passo de build; esse ambiente não possui `javac`, por isso o build deve ser executado na sua máquina com JDK.
- Scripts `build.sh` e `build.bat` são fornecidos para facilitar a compilação em diferentes sistemas operacionais.

## Autor
Gerado por assistente — adaptar nomes e informações conforme necessário antes de enviar.
