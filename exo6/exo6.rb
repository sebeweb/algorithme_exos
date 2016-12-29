$quitter = false
$reponse = ""
$flag = false

while $quitter == false
	print "entrez une phrase ou un mot: \n\r"
	$perroquet = gets
	print $perroquet
	$flag = true

	while $flag == true
		print "Voulez vous quitter o/n ?\n\r"
		$reponse = gets.chomp

		if "o" == $reponse
			$quitter = true
			$flag = false
		elsif "n" == $reponse
			$flag = false		
		else
			print "J'ai pas compris \r\n"
		end
	end
end
