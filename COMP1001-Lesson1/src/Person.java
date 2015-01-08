
public class Person{
		
		private double height;
		private double weight;
		private String name;
		
		public Person(){
			this.setHeight(6);
			this.setWeight(200);
		}
		
		public Person(String name,double height, double weight){
			this.setHeight(height);
			this.setWeight(weight);
			this.name = name; 
		}
		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double d) {
			this.weight = d;
		}

		public void walks(){
			this.setWeight(this.getWeight() * 0.9);
			System.out.println(this.name + " lost weight!");
			System.out.println( this.name + " weigh: " + this.getWeight() + "lbs");
		}
		
		public void eats(){
			this.setWeight(this.getWeight() * 1.2);
			System.out.println(this.name + " gaied weight!");
			System.out.println(this.name + " weigh:" + this.getWeight() + "lbs");
		}
		
}
