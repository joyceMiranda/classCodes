<?php
	require_once("../model/dao/usuariodao.php");
	session_start();
	$login = $_POST["txtLogin"];
	$senha = $_POST["txtSenha"];
	 
	require_once("../connection/FabricaConexao.php");
    $conn = FabricaConexao::conectar();
	$dao = new UsuarioDAO($conn);
	
	$loginCorreto = $dao->validaLogin($login, $senha);
	if($loginCorreto){
	    $_SESSION["logado"] = true;
		header("location:../view/formCadProduto.php");
	}else{
		session_destroy();
		echo "<script>
				  alert('Dados incorretos!')  ;
				  window.open('../view/formLogin.php', '_self');
			  </script>"    ;
	 
	}	
?>