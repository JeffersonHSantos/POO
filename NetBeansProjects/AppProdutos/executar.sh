#!/bin/bash
# Script para compilar e executar o Sistema de Gerenciamento de Produtos

echo "=========================================="
echo "  Sistema de Gerenciamento de Produtos"
echo "  TDE Semana 20/11/2025"
echo "=========================================="
echo ""

# Compilar o projeto
echo "Compilando o projeto..."
javac -d bin -sourcepath src src/br/upf/ads/tde/front/TelaProdutos.java

if [ $? -eq 0 ]; then
    echo "✓ Compilação concluída com sucesso!"
    echo ""
    echo "Iniciando a aplicação..."
    echo ""
    
    # Executar a aplicação
    java -cp bin br.upf.ads.tde.front.TelaProdutos
else
    echo "✗ Erro na compilação!"
    exit 1
fi
