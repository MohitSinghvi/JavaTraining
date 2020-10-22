public class Assignment4
{
    public static void main( String[] args )
    {
		// initializing variables as integer.
        int cars, drivers, passengers, cars_not_driven, cars_driven;
		
		//Initializing variables as double
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

		//assigniment
        cars = 100;
		
		//Integer value could have been used..
		//if just 4, still stored as double internally. 
		
        space_in_a_car = 4;
		
		//int assigniment
        drivers = 30;
		
		//int assigniment
        passengers = 90;
        
		
		cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


		System.out.println(space_in_a_car);
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}

//Single Equal to: "=" is assignment operator.
//Double Equal to: "==" is relational operator
