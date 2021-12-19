@echo off
title QuitaADBocks
goto 3
:3
set /p url=Inserta la URL:  
set path50 = %appdata%\pagina\
set path1 = %appdata%\pagina\pagina.html
if exist "C:\Users\%username%\AppData\Roaming\pagina" (goto 1) else goto 2

:2
cd %appdata% 
mkdir pagina 
goto 1

:1
cd %userprofile%\desktop
curl "%url%" > ./pagina.txt
echo Se ha cargado el curl
ren pagina.txt pagina.html
move pagina.html %appdata%\pagina\pagina.html
call %appdata%\pagina\pagina.html
set /p opcion=Dese salir o realizar otra consulta? Si[1] No[2] 
if %opcion%==1 goto 3
if %opcion%==2 goto exit
:exit
cd %appdata%\pagina
del pagina.html
exit