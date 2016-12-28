i = 1 #index colonne #index lignes
k = 0
triangle = []
result = 0
calcul = []
def pyramideHt(htmax) :

	for i in range(htmax) :
		result = []
		if i < 2 :
			
			calcul.append(1)
			result = calcul
			triangle[i-1].append(result)
		print triangle




pyramideHt(5)
