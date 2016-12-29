<?php
//perroquet
//author sebastien
//beWeb

$quitter = false;
$reponse = "";
$flag = false;

while ($quitter == false) {
	echo("Entrer une phrase ou un mot:\r\n");
	$reponse = fgets(STDOUT);
	echo $reponse;
	$flag = true;

	while ($flag == true){
		echo("Voulez vous quitter o/n ?\r\n");
		$reponse = fgets(STDOUT);
		if ($reponse == "o\n") {
			$quitter = true;
			$flag = false;
		}elseif ($reponse ==  "n\n"){
			$flag = false;
		}else{
			echo("J'ai pas compris\r\n");
		}
	}
}
?>
