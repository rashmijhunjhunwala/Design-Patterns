
abstract class ToppingDecorator implements Pizza {
		protected Pizza pizza;
		public ToppingDecorator(Pizza pizza)
		{
			this.pizza=pizza;
		}
		public double cost()
		{
			return this.pizza.cost();
		}
		public String getDescription()
		{
			return this.pizza.getDescription();
		}
}
