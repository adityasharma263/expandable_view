package com.example.upsc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ExpandableListView;

//import com.example.upsc.Model.Question;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity {

//    List<Question> QuestionList;
//    private ExpandableListView expandableListView;
//    private MyExpandbleListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExpandableListView expandableListView = findViewById(R.id.expandableListView);
        LinkedHashMap<String, List<String>> item  = new LinkedHashMap<>();

        item.put(null, null);

        ArrayList<String> Answer3 = new ArrayList<>();
        Answer3.add("While academic knowledge and quirky mental alertness are the key components that form basic tenets of an IAS officer, honesty and integrity are also equally important. This question is generally posed by the IAS interview panel to not only understand your strengths and weaknesses but also to assess how honest you are to them. Aspirants should keep in mind that the IAS interview panel consists of subject matter experts, who have vast experience. In short, cheating them by giving vague or confusing answers is not going to serve you well. Thus, try to be honest and list out your strengths and weaknesses to the best of your understanding and back them up with logical explanations and examples.\n" +
                "\n" +
                "Apart from these standards ones, the IAS Interview Questions tend to be random in general. Thus, there is no way in which candidates can prepare for it in advance. However, we have listed a few of the different and quirky ones below to give you a basic idea of what to expect during your IAS interview.");
        item.put("1Tell me about your positive and negative strengths.", Answer3);


        ArrayList<String> Answer4 = new ArrayList<>();
        Answer4.add("Concrete floors are very hard to crack!");
        item.put("How can you drop a raw egg onto a concrete floor without cracking?", Answer4);



        item.put(null, null);



        ArrayList<String> Answer5 = new ArrayList<>();
        Answer5.add("I would be very happy, as I won’t be able to find a better match for my sister than you.");
        item.put("2What will you do if I run away with your sister?", Answer5);

        ArrayList<String> Answer6 = new ArrayList<>();
        Answer6.add("Alphabet ‘T’ comes before ‘U’ and therefore T is before U.");
        item.put("3Interviewer ordered a cup of coffee for the candidate. Coffee arrived and was kept before the candidate. what is before you?", Answer6);

        ArrayList<String> Answer7 = new ArrayList<>();
        Answer7.add("The candidate who got selected answered ‘It caused a revolution’.");
        item.put("4What happened when the wheel was invented?The candidate who got selected answered ‘It caused a revolution’.", Answer7);

        ArrayList<String> Answer8 = new ArrayList<>();
        Answer8.add("The candidate, who cracked his interview with this question said, he would give the car to his friend and tell him to drive the old lady to the hospital, while he waits at the bus stop with his perfect partner.");
        item.put("5You are driving along in your car on a wild, stormy night, it's raining heavily, when suddenly you pass by a bus stop, and you see three people waiting for a bus: An old lady who looks as if she is about to die; an old friend who once saved your life and the perfect partner you have been dreaming about. Which one would you choose to offer a ride to, knowing very well that there could only be one passenger in your car?", Answer8);

        ArrayList<String> Answer9 = new ArrayList<>();
        Answer9.add("I would be very happy, take an off and celebrate the good news with my husband.");
        item.put("6What if one morning you woke up & found that you were pregnant? ( asked to a female candidate)", Answer9);

        ArrayList<String> Answer10 = new ArrayList<>();
        Answer10.add("This is a tricky one, as it involves both academic knowledge as well as practical knowhow of things. Generally, the common know how dictates that Lord Rama may have celebrated his first Diwali at Ayodya, Mitila [Janaki's place] or at Lanka.\n" +
                "\n" +
                "However, if we consider the literary history, Diwali was a celebrated as a mark of Lord Krishna Killing Narakasura. In Dusavataar, Krishnavathaar comes after Raamavathaar. In other words, the celebration of Diwali started after Raamavathaar and therefore, Lord Rama would not have celebrated the Diwali At all!\n" +
                "\n" +
                "These are just a few of the common as well as quirky IAS Interview Questions that have been asked in the past. While there is no guarantee that the same or similar questions will be asked in future as well, but they do provide a solid reference point from which aspirants can get a rough idea about it. Based upon such questions, candidates can start their preparation for  IAS interview and crack it with great ease!");
        item.put("7Where Lord Rama would have celebrated his \"First Diwali\"?", Answer10);


        ArrayList<String> Answer2 = new ArrayList<>();
        Answer2.add("This is another standard IAS interview question that aspirants " +
                "face which is aimed at bringing out not only the candidates’ goals as an IAS officer but also indicates the clarity of thought in this regards. Although considered to a common question, this is one of the most important one, as it gives a brief overview to the panellists about your passion, goals, interests and the motivation that has driven you up to this point to join the civil services." +
                " Therefore, it is advised that aspirants do some advance preparation for this question.");
        item.put("8Why do you want to become IAS Officer?", Answer2);

        item.put(null, null);

        ArrayList<String> Answer1 = new ArrayList<>();
        Answer1.add("This is probably the most standard question asked in almost every interview and not only for civil services exams. If you are asked this question, you can begin by giving a brief background about your family, personal information, academic qualification and professional engagements. The information should be precise and to the point without any ambiguities, when compared to the resume or information you have already provided to the panel.");
        item.put("9Tell me about yourself? or Give a brief Introduction about yourself.", Answer1);


//        ArrayList<String> Answer = new ArrayList<>();
//        Answer.add("fghbg");
//        item.put("fgd", Answer);






        MyExpandbleListAdapter adapter = new MyExpandbleListAdapter(item);
        expandableListView.setAdapter(adapter);



    }

    //Adapter (Item Ui)

//    private List<Question> initDataList(){
////        Question question1= new Question("Question1","answer1", "explaination");
////        Question question2= new Question("Question2","answer2", "getExplaination");
////        Question question3= new Question("Question3","answer3", "getExplaination");
////        Question question4= new Question("Question4","answer4", "erfdg");
//        QuestionList = new ArrayList<>();
//        QuestionList.add(question1);
//        QuestionList.add(question2);
//        QuestionList.add(question3);
//        QuestionList.add(question4);
//        return QuestionList;
//    }





}