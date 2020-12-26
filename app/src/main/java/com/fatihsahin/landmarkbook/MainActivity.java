package com.fatihsahin.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //Data

        ArrayList <String> landmarkNames = new ArrayList<>();
        landmarkNames.add("Pisa");
        landmarkNames.add("Eiffel");
        landmarkNames.add("Collosseo");
        landmarkNames.add("London Bridge");
        landmarkNames.add("Taj Mahal");
        landmarkNames.add("Great Wall");
        landmarkNames.add("Kremlin");
        landmarkNames.add("Great Pyramid of Giza");
        landmarkNames.add("Sydney Opera House");
        landmarkNames.add("Statue of Liberty");
        landmarkNames.add("Easter Island Moai");

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("Italy");
        countryNames.add("France");
        countryNames.add("Italy");
        countryNames.add("United Kingdom");
        countryNames.add("India");
        countryNames.add("China");
        countryNames.add("Russia");
        countryNames.add("Egypt");
        countryNames.add("Australia");
        countryNames.add("United State of America");
        countryNames.add("Island/Chile");

        ArrayList<String> detailedDescription = new ArrayList<>();
        detailedDescription.add("The Leaning Tower of Pisa is one of Italy’s major tourist attractions. The freestanding bell tower of the Pisa Cathedral was built over almost two hundred years and was finished in 1399.\n" +
                "\n" +
                "The original hight of the tower was 60 meters/196ft, but as it is leaning, the lowest side is now less than 56 meters/184ft. The construction already caused many problems as the soil was soft, sandy and unstable. Already during construction, the builders tried to balance the leaning side with more columns on the other side, but the tower still leaned - like many other buildings in the area.\n" +
                "\n" +
                "In 2000, the tower was strengthened by putting stronger soil underneath the tower. You can walk up the 251 stairs to the viewing platform at the top of the tower which is quite an amazing experience.");


        detailedDescription.add("This metal tower with three floors stands in the city centre of Paris. It was built for the 1889 World Fair (Universal Expo) to celebrate the 100th anniversary of the French Revolution.\n" +
                "\n" +
                "The 324metres/1062ft high Eiffel Tower was constructed by Auguste Eiffel and a team of engineers. If you would like to take the steps up to the tower viewing platform on the second floor, there are 704 steps to climb, but luckily there are also lifts in each of the leg up to the second floor.\n" +
                "\n" +
                "The tower has been visited by over 250 million people since its opening and in 2016 more than 7 million visitors were welcomed on the tower's top platform! More info about the Eiffel Tower and facts for children about the famous landmark here.");
        detailedDescription.add("The Colosseum (/ˌkɒləˈsiːəm/ KOL-ə-SEE-əm; Italian: Colosseo [kolosˈsɛːo]), is an oval amphitheatre in the centre of the city of Rome, Italy, just east of the Roman Forum and is the largest ancient amphitheatre ever built, and is still the largest standing amphitheater in the world today, despite its age. Construction began under the emperor Vespasian (r. 69–79 AD) in 72 and was completed in AD 80 under his successor and heir, Titus (r. 79–81). Further modifications were made during the reign of Domitian (r. 81–96). The three emperors that were patrons of the work are known as the Flavian dynasty, and the amphitheatre was named the Flavian Amphitheatre (Latin: Amphitheatrum Flavium; Italian: Anfiteatro Flavio [aɱfiteˈaːtro ˈflaːvjo]) by later classicists and archaeologists for its association with their family name (Flavius).");
        detailedDescription.add("Several bridges named London Bridge have spanned the River Thames between the City of London and Southwark, in central London. The current crossing, which opened to traffic in 1973, is a box girder bridge built from concrete and steel. It replaced a 19th-century stone-arched bridge, which in turn superseded a 600-year-old stone-built medieval structure. This was preceded by a succession of timber bridges, the first of which was built by the Roman founders of London.\n" +
                "\n" +
                "The current bridge stands at the western end of the Pool of London and is positioned 30 metres (98 ft) upstream from previous alignments. The approaches to the medieval bridge were marked by the church of St Magnus-the-Martyr on the northern bank and by Southwark Cathedral on the southern shore.");
        detailedDescription.add("The Taj Mahal 'Crown of the Palace', is an ivory-white marble mausoleum on the southern bank of the river Yamuna in the Indian city of Agra. It was commissioned in 1632 by the Mughal emperor Shah Jahan (reigned from 1628 to 1658) to house the tomb of his favourite wife, Mumtaz Mahal; it also houses the tomb of Shah Jahan himself. The tomb is the centrepiece of a 17-hectare (42-acre) complex, which includes a mosque and a guest house, and is set in formal gardens bounded on three sides by a crenellated wall.");
        detailedDescription.add("The Great Wall of China (traditional Chinese: 萬里長城; simplified Chinese: 万里长城; pinyin: Wànlǐ Chángchéng) is a series of fortifications that were built across the historical northern borders of ancient Chinese states and Imperial China as protection against various nomadic groups from the Eurasian Steppe. Several walls were built from as early as the 7th century BC, with selective stretches later joined together by Qin Shi Huang (220–206 BC), the first emperor of China. Little of the Qin wall remains. Later on, many successive dynasties have built and maintained multiple stretches of border walls. The most well-known sections of the wall were built by the Ming dynasty (1368–1644).");
        detailedDescription.add("The Grand Kremlin Palace is part of the Kremlin complex and is located next to the Red Square and St Basil’s Cathedral in Russia’s capital city Moscow.\n" +
                "\n" +
                "The Kremlin is a fortress with enclosing walls and is built along the Moskva River. The name ‘Kremlin’ means ‘fortress within a city’. The more than 500-year-old Kremlin includes the wall with its 20 towers as well as four churches and five palaces within the walls.\n" +
                "\n" +
                "The Kremlin was once the residence of the Tzars. Today, it is where the Russian president resides. The Cathedral of Vasily the Blessed, usually refered to as Saint Basil’s Cathedral, is easily recognised due to its nine brightly coloured onion domes. ");
        detailedDescription.add("The Great Pyramid of Giza near Cairo is one of the Seven Wonders of the Ancient World and the only one of these ancient world wonders which still exists. The pyramids are made of stone and bricks and stand near Cairo which is the capital of Egypt.\n" +
                "\n" +
                "The Egyptian pyramids were built during a time when there was only manual labour and no machine lifting equipment available. The pyramids were build to house the bodies of the pharaoh who ruled in ancient Egypt. Next to the Giza pyramids there is the Sphinx, the famous monument of a lion body with a pharaoh’s head.\n" +
                "\n");
        detailedDescription.add("The Sydney Opera House, built in Australia’s biggest city, is famous for its roof’s architecture resembling shells or sails. The opera house was designed by Jørn Utzon from Denmark and it was built between 1959 and 1973.\n" +
                "\n" +
                "The roof is covered with more than 1 million roof tiles. These were manufactured in Sweden. The opera house has several performance halls and theatre and exhibition spaces.\n" +
                "\n" +
                "More than 40 shows are staged here every week. Every year, more than 8 million visitors visit this Australian landmark! Every evening the roof is lit up in a colourful spectacle. More info on the opera house.");
        detailedDescription.add("The Statue of Liberty is 92 meters/305ft high and is made of a iron structure with copper skin.\n" +
                "\n" +
                "Lady Liberty, as the statue often is referred to, was designed by Frederic Auguste Bartholdi and the massive iron skeleton of the lady was designed by Alexandre Gustave Eiffel who also designed the Eiffel Tower.\n" +
                "\n" +
                "The statue was built and completed in France in 1884. The monument was then disassembled into 350 pieces and packed into 214 crates and shipped to New York. The Statue of Liberty was a gift of the people of France to the American people on the American Centennial in 1886. The torch’s flame is covered with 24k gold and the crown has seven rays for the seven continents.");
        detailedDescription.add("The Moai are huge statues on the Polynesian island Rapa Nui. The island is commonly called Easter Island and belongs to Chile. The Easter Island is more than 2,200 miles away from Chile in the middle of the Pacific Ocean.\n" +
                "\n" +
                "The islanders created more than 900 carved stone figures between 1250 and 1500. Most of the stone figures with the oversized heads were built with tuff stone and compressed volcanic ash.\n" +
                "\n" +
                "The figures weigh on average 14 tons which is as much as two elephants! However, the size of the statues varies, there are some smaller ones and some much bigger ones too. The heaviest stone figure weights 82 tons and is 10 metres /33ft long! They are about 4metres/13ft tall. Most of the islanders believe the huge stone statues represent their ancestors.");
        Bitmap pisa = BitmapFactory.decodeResource(getApplication().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplication().getResources(),R.drawable.eifel);
        Bitmap collosseo = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.colosseo);
        Bitmap londonBridge = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.londonbridge);
        Bitmap tajmahal = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.tajmahal);
        Bitmap greatWall = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.greatwall);
        Bitmap kremlin = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.kremlin);
        Bitmap greatPyramid = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.greatpyramid);
        Bitmap operaHouse = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.sydneyopera);
        Bitmap statueofLiberty = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.statueofliberty);
        Bitmap moai = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.moaieaster);

        ArrayList<Bitmap> landmarkImages = new ArrayList<>();
        landmarkImages.add(pisa);
        landmarkImages.add(eiffel);
        landmarkImages.add(collosseo);
        landmarkImages.add(londonBridge);
        landmarkImages.add(tajmahal);
        landmarkImages.add(greatWall);
        landmarkImages.add(kremlin);
        landmarkImages.add(greatPyramid);
        landmarkImages.add(operaHouse);
        landmarkImages.add(statueofLiberty);
        landmarkImages.add(moai);

        //ListView

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,landmarkNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                //System.out.println(landmarkNames.get(i));
                //System.out.println(countryNames.get(i));

                Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra("name", landmarkNames.get(i));
                intent.putExtra("name2",countryNames.get(i));
                intent.putExtra("name3",detailedDescription.get(i));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(landmarkImages.get(i));

                startActivity(intent);
            }
        });
    }
}