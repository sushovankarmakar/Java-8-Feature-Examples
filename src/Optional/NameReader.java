package Optional;

import java.util.Optional;

public class NameReader {

    public void print(String mayBeName){
        System.out.println(mayBeName);
    }


    public static void main(String[] args){
        NameReader reader = new NameReader();
        Optional<String> mayBeName = reader.getName(1);

        //mayBeName.ifPresent(System.out::println);
        //mayBeName.ifPresent(reader::print);

        // mayBeName.ifPresent((value)->reader.print(value));
        mayBeName.ifPresent(value -> reader.print(value));


        /*if(mayBeName.isPresent()){
            System.out.println(mayBeName.get());
        }*/
    }

    public Optional<String> getName(int id){
        if(id == 1) {
            return Optional.of("ABC");
        }
        return Optional.empty();
    }
}

