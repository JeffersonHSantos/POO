@echo off
REM Script para compilar e executar o Sistema de Gerenciamento de Produtos no Windows

echo ==========================================
echo   Sistema de Gerenciamento de Produtos
echo   TDE Semana 20/11/2025
echo ==========================================
echo.

REM Compilar o projeto
echo Compilando o projeto...
javac -d bin -sourcepath src src\br\upf\ads\tde\front\TelaProdutos.java

if %ERRORLEVEL% EQU 0 (
    echo [OK] Compilacao concluida com sucesso!
    echo.
    echo Iniciando a aplicacao...
    echo.
    
    REM Executar a aplicação
    java -cp bin br.upf.ads.tde.front.TelaProdutos
) else (
    echo [ERRO] Erro na compilacao!
    pause
    exit /b 1
)
