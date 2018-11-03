import java.util.Random;
class RandomOps {
	Random op = new Random();
	public String[] next() {
		int operId = op.nextInt(4) +1;
		switch (operId) {
			case 1:
				//sum
				return  sum();
			
			case 2 : 
				return subtrack();
			
			case 3 :
				return multiply();

			case 4 :
				return divide();	
		}
		throw new UnknownError();
	}

	public String[] sum() {
		int x = op.nextInt(99) + 1;
		int y = op.nextInt(99) + 1;
		String s = x + " + " + y +" = ";
		Integer result = x + y;
		return new String[]{s,result.toString()};

	}

	public String[] subtrack() {
		int x = op.nextInt(99) + 1;
		int y = op.nextInt(99) + 1;
		String s = x + " - " + y +" = ";
		Integer result = x - y;
		return new String[]{s,result.toString()};

	}

	public String[] multiply() {
		int x = op.nextInt(9) + 1;
		int y = op.nextInt(9) + 1;
		String s = x + " * " + y +" = ";
		Integer result = x * y;
		return new String[]{s,result.toString()};
	}

	public String[] divide() {
		int x;
		loopX:
		do {
		 x = op.nextInt(99) + 1;
			for(int i = 2;i<8;i++) {
				if((x%i) == 0) {
				 break loopX;
				}
			}

		}while(true);

		int y;
		loopY:
		do {
			y= op.nextInt(9) + 1;
			if((x % y) ==0) break loopY;
		}while(true);

		String s = x + " / " + y +" = ";
		Integer result = x / y;
		return new String[]{s,result.toString()};
	}

}
