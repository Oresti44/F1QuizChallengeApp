package com.example.f1quiz;

import java.util.ArrayList;
import java.util.Collections;

public class QuizData {

    public static ArrayList<Question> getDriverQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("Who has won the most Formula 1 World Championships?",
                new String[]{"Max Verstappen", "Lewis Hamilton", "Fernando Alonso", "Sebastian Vettel"}, 1));

        questions.add(new Question("Which driver is known as 'The Iceman'?",
                new String[]{"Kimi Räikkönen", "Michael Schumacher", "Nico Rosberg", "Valtteri Bottas"}, 0));

        questions.add(new Question("Which country is Max Verstappen from?",
                new String[]{"Germany", "Belgium", "Netherlands", "Austria"}, 2));

        questions.add(new Question("Who won the 2021 Formula 1 World Championship?",
                new String[]{"Lewis Hamilton", "Max Verstappen", "Charles Leclerc", "Sergio Perez"}, 1));

        questions.add(new Question("Which driver raced with number 44?",
                new String[]{"Lewis Hamilton", "Lando Norris", "Carlos Sainz", "George Russell"}, 0));

        questions.add(new Question("Which driver is from Monaco?",
                new String[]{"Charles Leclerc", "Pierre Gasly", "Esteban Ocon", "Oscar Piastri"}, 0));

        questions.add(new Question("Who won the 2016 Formula 1 World Championship?",
                new String[]{"Lewis Hamilton", "Nico Rosberg", "Sebastian Vettel", "Daniel Ricciardo"}, 1));

        questions.add(new Question("Which driver is associated with the number 1 in recent Red Bull seasons?",
                new String[]{"Sergio Perez", "Max Verstappen", "Yuki Tsunoda", "Fernando Alonso"}, 1));

        questions.add(new Question("Which driver is nicknamed 'Checo'?",
                new String[]{"Carlos Sainz", "Sergio Perez", "Fernando Alonso", "Felipe Massa"}, 1));

        questions.add(new Question("Which driver won seven titles with Ferrari and Benetton?",
                new String[]{"Ayrton Senna", "Michael Schumacher", "Alain Prost", "Nigel Mansell"}, 1));

        Collections.shuffle(questions);
        return questions;
    }

    public static ArrayList<Question> getTeamQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("Which team is famous for the red car color?",
                new String[]{"Mercedes", "Ferrari", "McLaren", "Williams"}, 1));

        questions.add(new Question("Which team uses the name 'Scuderia'?",
                new String[]{"Ferrari", "Red Bull", "Alpine", "Haas"}, 0));

        questions.add(new Question("Which team is based in Milton Keynes?",
                new String[]{"Red Bull Racing", "Mercedes", "Ferrari", "McLaren"}, 0));

        questions.add(new Question("Which team is strongly associated with papaya orange?",
                new String[]{"McLaren", "Williams", "Aston Martin", "Alpine"}, 0));

        questions.add(new Question("Which team dominated much of the turbo-hybrid era starting in 2014?",
                new String[]{"Ferrari", "Mercedes", "Red Bull", "Renault"}, 1));

        questions.add(new Question("Which team has used British racing green?",
                new String[]{"Aston Martin", "Haas", "Sauber", "AlphaTauri"}, 0));

        questions.add(new Question("Which team was founded by Bruce McLaren?",
                new String[]{"Williams", "McLaren", "Ferrari", "Lotus"}, 1));

        questions.add(new Question("Which team is historically linked with Frank Williams?",
                new String[]{"Williams", "Alpine", "Red Bull", "Haas"}, 0));

        questions.add(new Question("Which team is connected to the energy drink brand?",
                new String[]{"Mercedes", "Red Bull Racing", "Aston Martin", "Ferrari"}, 1));

        questions.add(new Question("Which team entered F1 as an American-owned team in 2016?",
                new String[]{"Haas", "Williams", "Alpine", "Sauber"}, 0));

        Collections.shuffle(questions);
        return questions;
    }

    public static ArrayList<Question> getCircuitQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("Which circuit hosts the Monaco Grand Prix?",
                new String[]{"Silverstone", "Circuit de Monaco", "Monza", "Spa-Francorchamps"}, 1));

        questions.add(new Question("Which circuit is known as the 'Temple of Speed'?",
                new String[]{"Monza", "Suzuka", "Zandvoort", "Bahrain"}, 0));

        questions.add(new Question("Which circuit includes the Eau Rouge and Raidillon section?",
                new String[]{"Spa-Francorchamps", "Silverstone", "Monaco", "Interlagos"}, 0));

        questions.add(new Question("Which country is Suzuka Circuit in?",
                new String[]{"China", "Japan", "Singapore", "South Korea"}, 1));

        questions.add(new Question("Which circuit hosts the British Grand Prix?",
                new String[]{"Silverstone", "Monza", "Hungaroring", "Jeddah"}, 0));

        questions.add(new Question("Which circuit is famous for Turn 8?",
                new String[]{"Istanbul Park", "Monaco", "Baku", "Miami"}, 0));

        questions.add(new Question("Which circuit is located in Brazil?",
                new String[]{"Interlagos", "Zandvoort", "Yas Marina", "Qatar"}, 0));

        questions.add(new Question("Which circuit hosts the Abu Dhabi Grand Prix?",
                new String[]{"Yas Marina", "Bahrain International Circuit", "Losail", "Sepang"}, 0));

        questions.add(new Question("Which circuit is a street circuit in Azerbaijan?",
                new String[]{"Baku", "Monza", "Barcelona-Catalunya", "Austria Red Bull Ring"}, 0));

        questions.add(new Question("Which circuit is located in the Netherlands?",
                new String[]{"Zandvoort", "Spa", "Hungaroring", "Paul Ricard"}, 0));

        Collections.shuffle(questions);
        return questions;
    }
}