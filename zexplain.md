I think a lot of the confusion stems from the verbiage. Expressions like, “pass by value” and “pass by reference” lead people to think we are, “passing the value” and “passing the reference”, respectively. It’s clearer to simply say, “we are not passing the value or the reference, we are passing a NEW reference to the same value.”





## let's assume blue ball's location is #00b1 , red ball's location is #00b2.
			
Java method's argument will copy the references coming in, and then locate it to NEW postion.
so, Argument b1's location would be #00a1, b2 would be #00a2. 
#00a1 pointing to blue ball. 
#00a2 pointing to red ball.
      
color will be changed. because this copied reference still pointing to same object which is blue ball.
#00a1(#00b1)'s color changed - green. 
    
but 
swap won't work. because they swap copied references each other. not original one.
after swap.
#00a1 --> red ball. 
#00a2 --> green ball

but still. 
#00b1 : green ball
#00b2 : red ball.

