## let's assume blue ball's location is #00b1 , red ball's location is #00b2.
			
Java method's argument will copy the references coming in, and then locate it to NEW postion.
so, Argument b1's location would be #00a1, b2 would be #00a2. 
#00a1 pointing to blue ball. 
#00a2 pointing to red ball.
      
color will be changed. because this copied reference still pointing to same object which is blue ball.
#00a1(#00b1)'s color changed - green. 
    
but 
swap won't work. because they swap copied references each other. not original one.

#00a1 : red ball. 
#00a2 : green ball

but still. 
#00b1 : green ball
#00b2 : red ball.
