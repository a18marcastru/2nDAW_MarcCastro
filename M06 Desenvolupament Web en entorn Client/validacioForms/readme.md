# Requisits del formulari
1.Al arrancar la pàgina el focus ha d'estar sobre la capsa name
2.Si s'escull pagament per PayPal, s'han de desabilitar les caselles de card number i expiration date. 
3.Si es marca que la Shipping information es la mateixa que la billing information, s'amaguen tots el camps.
4.Has de validar que el codi postal te format de 5 nombres. Per aixo pots fer servir la funció match() de Jquery conjuntament amb expressions regulars. Si hi ha error has de marcar-ho canviant el fons de la capsa de text.
5.Si l'usuari fa un submit tot i haver un error, no l'ha de deixar fer el submit i ho te que avisar mitjançant un alert.
