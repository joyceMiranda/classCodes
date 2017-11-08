<?php
class Produto
{
	// atributos
	public $codigo;

	public $nome;

	public $preco;

	// métodos
	public function calculaDesconto($porcento)
	{
		return $this->preco * $porcento/100;
	}
}
?>

