#perroquet
#author sebastien
#beWeb

quitter = False
reponse = ""
flag = False

while quitter == False:
	perroquet = raw_input("entrez une phrase ou un mot:\r\n")
	print(str(perroquet))
	flag = True

	while flag == True:
		reponse = raw_input("Voulez vous quitter o/n ?\r\n")

		if "o" == reponse:
			quitter = True
			flag = False
		elif "n" == reponse:
			flag = False
		else:
			print("J'ai pas compris")
