<?php

	include("produto.php");
	
	$produto = new Produto();
	$produto->preco = 1200.00;
	echo $produto->calculaDesconto(10); 
	// imprime 120
	
	
	function calcularIdade($anoNascimento){
		return date("Y") - $anoNascimento;
	}	
	echo "Idade: " . calcularIdade(1916);
	
	$nome = "Joyce Miranda dos Santos";
	$partesNome = explode(" " , $nome);
	$ultimoIndice = count($partesNome) - 1;
	echo $partesNome[0] . " " . $partesNome[$ultimoIndice];
	
	$data = "13/10/2016";
	$dia  = substr($data, 0, 2);
	$mes  = substr($data, 3, 2);
	$ano  = substr($data, 6, 4);
	echo "Dia: " . $dia . "<br>";
	echo "Mês: " . $mes . "<br>";
	echo "Ano: " . $ano . "<br>";
	
	 
	$carrinho = array("radio", "tv", "geladeira", "tv");
	$freqProdutos = array_count_values($carrinho);
	print_r($freqProdutos);
	$maiorFreq = 0;
	$produtoMaiorFreq = "";
	foreach($freqProdutos as $key => $value){
		if($value > $maiorFreq){
			$maiorFreq = $value;
			$produtoMaiorFreq = $key;
		}
	}
	echo $maiorFreq . " : " . $produtoMaiorFreq;

	
	
	
	
	
?>
