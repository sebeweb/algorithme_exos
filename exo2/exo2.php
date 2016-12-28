<?php

#tri decendant de nbr
#author sebastien



$tableau = array(3, 20, 15, 28, 6, 52, 9, 60);
$permut = "";
$sorted = False;

while ($sorted == False) {
    $moved = False;
    $i = 0;
    while ($i < count($tableau) - 1) {
        if ($tableau[$i + 1] > $tableau[$i]) {

            $permut = $tableau[$i];
            $tableau[$i] = $tableau[$i + 1];
            $tableau[$i + 1] = $permut;
            $moved = True;
        }
        $i++;
    }
    echo "[" . implode(",", $tableau) . "]\r\n";
    if ($moved == False) {
        $sorted = True;
    }
}
echo "le tableau tier: [" . implode(",", $tableau) . "]\r\n";
?>
