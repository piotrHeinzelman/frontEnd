
 
 
 
function myfunction()
{
nr = $('#head img:first').attr('imageid');
$('#hide').load('img/next.php?imageid='+nr , function()
{
$('#hide img').appendTo('#head'); 
myfunction2();
});
}

function myfunction2()
{
nr = $('#head img:last').attr('imageid');

$('#hide').load('img/next.php?imageid='+nr , function(data)
{
$('#hide img').appendTo('#head'); 
next(); 
});
}



function next()
{
$('#hide img').appendTo('#head'); 
$('#head img:first').css('margin-left',0);
$('#head img:first').delay('6000').animate({
    'margin-left': '-=980'
  },  1200,

  function() {
    // Animation complete.
	$('#head img:first').css('margin-left',0);
	$('#head img:first').remove();
	myfunction3();
	
	
  });
}


function  myfunction3()
{
nr = $('#head img:first').attr('imageid');
$('#motto2').load('img/next2.php?imageid='+nr , function()
{
myfunction2();
});
}

