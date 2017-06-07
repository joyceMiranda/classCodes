<?php

	include("Produto.php");
	
	$produto = new Produto();
	$produto->preco = 1200.00;
	echo $produto->calculaDesconto(10); 
	// imprime 120
	
?>
