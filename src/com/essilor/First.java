package com.essilor;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class First {

    public static void main(String[] args) {

        List<People> peopleList=Arrays.asList(
                new People("Ravi","AEIE",5,Gender.MALE),
                new People("Ravi","AEIE",55,Gender.MALE),
                new People("Lala","AEIE",52,Gender.MALE),
                new People("Abhishek","ECE",43,Gender.MALE),
                new People("Jaya", "AEIE", 51, Gender.FEMALE),
                new People("Somu", "AEIE", 52, Gender.FEMALE)

        );
/*		peopleList.stream().forEach(
				people -> System.out.println(people.getName())
				);
		peopleList.stream().filter(people ->people.getName().startsWith("R")).forEach(people ->System.out.println(people));
		System.out.println(peopleList.stream().map(People::getRollNo).max((int1,int2) ->int2-int1));*/
        //.max((people1,people2) ->people1.getRollNo()-people2.getRollNo());

        //28th Auh
        System.out.println("------------Today----------");
        List<String> names = peopleList.stream().filter(people ->people.getRollNo()>5).map(people->people.getName())
                .map(name->name.toUpperCase()).collect(toList());
        System.out.println(names);
        System.out.println(peopleList);

        System.out.println("Test");
        /*List<Integer> names2 =
               // System.out.println(
        peopleList.stream()
                .filter(people ->
                {
                    System.out.println("filter "+people.getName());
                    return people.getRollNo()>45;
                })
                .map(people->
                        {
                            System.out.println("map "+people.getName());
                            people.setName(people.getName().toUpperCase());
                            //System.out.println(people);
                            return people;
                        }
                )
                .map(People::getRollNo)
                        .limit(2)
                .collect(toList());
              // .reduce(0,(carry,age) ->carry+age));
          System.out.println(names2);*/

//        Map<String,People> mapPeople = peopleList.stream().filter(people -> people.getGender()==Gender.MALE).
//                collect(toMap(person->person.getName()+" :",person ->person));
//        System.out.println("map Of People "+mapPeople);
        List<Integer> numbers=Stream.iterate(0,i->i+1).limit(15).collect(toList());
        System.out.println("numbers are "+numbers);
        System.out.println(Stream.iterate("b",b->"a"+b).limit(3).collect(toList()));
        System.out.println(Stream.iterate(1,i->i+1).filter(i-> i%2==0).limit(12).anyMatch(i->i==2));
        System.out.println(Stream.iterate(1,i->i+1).filter(i-> i%2==0).limit(12).count());
        System.out.println(Stream.iterate(1,i->i+1).filter(i-> i%2==0).limit(5).reduce((i,j) ->i+j).get());
        System.out.println(Stream.iterate(1,i->i+1).filter(i-> i%2==0).limit(12).allMatch(i->i%2==0));
        System.out.println(Stream.iterate(1,i->i+1).filter(i-> i%2==0).limit(12).distinct().collect(toList()));
        System.out.println(Stream.iterate("a",b->"a"+b).limit(3).collect(toList()));
        System.out.println(Stream.iterate("b",b->"a"+b).limit(3).collect(toList()));
        System.out.println(Stream.iterate("b",b->"a"+b).filter(a->a.equals("aaaab")).findFirst().get());
        System.out.println(Stream.iterate("b",b->"a"+b).limit(3).findAny());

       System.out.println(peopleList.stream().collect(toMap(people->people.getName(), people->people,(p1,p2)->p2)));
        System.out.println(peopleList.stream()
                .collect(groupingBy(People::getName)));
        System.out.println(peopleList.stream()
                .collect(groupingBy(People::getName,mapping(People::getRollNo,toList()))));
        Map<String,People> mapOfPeople =new HashMap<>();
        for(People p:peopleList) {
            mapOfPeople.put(p.getName(), p);
        }
       // System.out.println(mapOfPeople);



        //System.out.println(peopleList);

		/*List<People> name3 = peopleList.stream().filter(people ->people.getRollNo()>5).map(people-> new People(people.getName().toUpperCase(),people.getDept(),people.getRollNo(),people.getGender()))
				.collect(toList());
		System.out.println(name3);
		System.out.println(peopleList);*/



/*		List<String> names = peopleList.stream().filter(people ->people.getRollNo()>5).map(People::getName)
				.map(String::toUpperCase).collect(toList());
		System.out.println(names);*/

/*		List<People> person = peopleList.stream().filter(people ->people.getRollNo()>5).collect(toList());
		System.out.println(person);

		peopleList.stream().filter(people ->people.getGender() ==Gender.MALE).forEach(System.out::println);
				*/

    List<Integer> integers = new ArrayList();
    }

}
enum Gender{
    MALE,FEMALE
}
