#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.14.5
 Author:xHavkedx

 Función del script:Recolector de semillas 1x12
	Template AutoIt script.

#ce ----------------------------------------------------------------------------
;HotKeySet("{F7}","PararScript");Salir del bucle de espera
HotKeySet("{F8}","EmpezarScript");Pausar o reanudar programa
HotKeySet("{F9}","endProg");Tecla para parar el programa
$idelayRecoleccion = 1200;Delay de la recolección de cultivos.
$bScript = True

While 1
	While $bScript = True
		;1x12
		;1ra casilla enfrente.
		MouseClick("right",1009,515,1,3000)
		sleep(1000)
		MouseClick("left",935,427,1,1000)
		Sleep($idelayRecoleccion)

		;2nda cassilla en el lado derecho.
		For $i = 1 to 11 step +1
			MouseClick("right",1068,546,1,3000)
			sleep(1000)
			MouseClick("left",990,477,1,1000)
			sleep($idelayRecoleccion)
		Next
		;final de las casillas 1x12
	WEnd
WEnd

Func EmpezarScript() ;Función de pausa y comenzar
	$Script = False
	ToolTip("Pausado|Presiona F7 para comenzar el script",753,502,"Pausado",1,1)
	Sleep(6000)
	ToolTip("")
	While 1
		Sleep(100)
	WEnd
EndFunc ;EmpezarScript

;Func PararScript()
;	ExitLoop
;EndFunc

Func endProg() ;Función de Parar
	Exit
EndFunc
