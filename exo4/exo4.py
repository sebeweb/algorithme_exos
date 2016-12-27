i = 1 #index colonne #index lignes
k = 0
triangle = []
calcul = []
result = 0

def pyramideHt(htmax) :

	for i in range(htmax) :
		if i < 2 :
			triangle.append(1)
		else :
			for j in range(len(triangle)) :
				#calcul[] = triangle[]
				result = triangle[j] + triangle[j+1]
				triangle.insert(i-1,result)
		print triangle




pyramideHt(5)
i = 1 #index colonne
j = 0 #index lig