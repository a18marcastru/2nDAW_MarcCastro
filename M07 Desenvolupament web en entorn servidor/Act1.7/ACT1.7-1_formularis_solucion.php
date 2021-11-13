<!--
   ACT1.7 formularis SOL.html
   
   Copyright 2020 m07 <m07@m07-VirtualBox>
   
   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
   MA 02110-1301, USA.
   
   
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>Formularis</title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
	<meta name="generator" content="Geany 1.36" />
</head>

<body>
	<!--
	
	 <!--/*1-. Implementa un formulari tal com mostra la figura. Processar el formulari és mostrar les dades introduïdes. 
	 Explica dins d'un comentari dins el codi, que hauries de canviar si fas servir l'altre mètode HTTP.*/ -->
	 
	 <center>
   <h2>Formulari i Resposta</h2>
     <?php
      if(!$_POST){
     ?>
     <form method="POST" action="<?php echo $_SERVER['PHP_SELF'] ?>">
        <table>
          <tr>
            <td align="LEFT">Model:</td>
            <td align="RIGHT" colspan="3"><input type="TEXT" name="cotxe[model]" size=25" required></td>
          </tr>
          <tr>
            <td align="LEFT">Marca:</td>
            <td align="RIGHT" colspan="3"><input type="TEXT" name="cotxe[marca]" size=25"></td>
          </tr>
          <TR align="LEFT">
            <td>Motor:</td>
            <td><input TYPE="TEXT" NAME="cotxe[motor]" SIZE="5"></td>
            <td>Cilindrada:</td>
            <td><input TYPE="TEXT" NAME="cotxe[cc]" SIZE="5"></td>
          </tr>
          <tr>
            <td align="LEFT">Energia:</td>
            <td align="RIGHT" COLSPAN="3">
               <input TYPE="RADIO" NAME="cotxe[energia]" value="gasolina" CHECKED>Gasolina
               <input TYPE="RADIO" NAME="cotxe[energia]" value="diesel">Diesel
               <input TYPE="RADIO" NAME="cotxe[energia]" value="hibrid">Híbrid
               <input TYPE="RADIO" NAME="cotxe[energia]" value="electric">Elèctric
            </td>
          </tr>
          <tr>
            <td align="LEFT">Opcions:</td>
            <td align="RIGHT" COLSPAN="3">
               <select MULTIPLE NAME="opcions[]">
                  <option value="PS">Pack Sport</option>
                  <option value="MS">Millora seguretat</option>
                  <option value="CL">Climatizador</option>
                  <option value="OB">Ordinador a bord</option>
               </select>
            </td>
          </tr>
        </table><HR><BR>
        <input TYPE="SUBMIT" value="Envia"> <input TYPE="RESET" value="Inicialitza">
     </form>
     
     <?php
      } else {
          echo "<br>";
          foreach ($_POST['cotxe'] as $key => $value) {
                if (empty($_POST['cotxe'][$key])) {
                    echo "falta valor" . "<br>";
                   } else {
                    $value = test_input($value);
               echo "<I>$key</I> = $value <BR>";}
          }
          echo "<HR>";
          echo "<HR><I>Opcions = </I>";
          foreach ($_POST['opcions'] as $key => $value)
               echo "$value ";
          echo "<pre><a href='javascript:history.go(-1)'>volver</a></pre>";
       }

      function test_input($valor){
          $valor = trim($valor);
          $valor = stripslashes($valor);
          $valor = htmlspecialchars($valor);
          return $valor;

      }

     ?>
   </center>
	 
	 
	-->
	 
	 
	 

 <!--2-. Dissenya i implementa un formulari  de subscripció a un portal  d'intercanvi d'ensanyament
 de llengües _Ha de demanar: nom sencer, correu electrònic, data de naixement, telèfon, idiomes que es parlen, idioma que es vol aprendre, 4 temes d'interès i un espai per comentaris.

Ha de permetre enviar les dades introduïdes i inicialitzar el formulari. Tractar el formulari és mostrar les dades enviades.
-->



	
	
	
</body>

</html>
