public class Calculator {
        Double x;
        /*
        * Chops up input on ' ' then decides whether to add or multiply.
        * If the string does not contain a valid format returns null.
        */
        public Double x(String x){
        	if (x.split(" ")[1].matches("\\+")){ //If the string involves + it will add both numbers
        		this.x = Double.valueOf(x.split(" ")[0]);
        		x(Double.valueOf(x.split(" ")[2]));
        		return this.x;
        	}
        	else if (x.split(" ")[1].matches("x")){ //If the string involves x it will multiply both numbers
        		this.x = Double.valueOf(x.split(" ")[0]);
        		x(Double.valueOf(x.split(" ")[2]).doubleValue());
        		return this.x;
        	}
        	else{
        		return null;
        	}
        }

        /*
        * Adds the parameter x to the instance variable x and returns the answer as a Double.
        */
        public Double x(Double x){ //This is for adding the numbers
                System.out.println("== Adding ==");
                this.x = this.x + x;
                return this.x;
        }

        /*
        * Multiplies the parameter x by instance variable x and return the value as a Double.
        */
        public Double x(double x){ //This is for multiplying the numbers
                System.out.println("== Multiplying ==");
                this.x = this.x*x;
                return this.x;
        }

}
