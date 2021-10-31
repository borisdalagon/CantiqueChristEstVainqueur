package com.cmfi.cantique.ui.share;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cmfi.cantique.Adapter.AdapterNumero;
import com.cmfi.cantique.ClassSimple.ListNumero;
import com.cmfi.cantique.R;
import com.cmfi.cantique.listerner.BaseListener;
import com.cmfi.cantique.ui.numero.GalleryViewModel;

import java.util.ArrayList;
import java.util.List;

public class ShareFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    GridLayoutManager lLayout;
    private BaseListener listener;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate( R.layout.fragment_numero_en, container, false );

        galerie(root);

        return root;
    }


    public void galerie(View v) {

        List<ListNumero> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager( getContext(), 6 );

        RecyclerView recycleViewGalerie = (RecyclerView) v.findViewById( R.id.recyclerview_numero );
        recycleViewGalerie.setHasFixedSize( true );
        recycleViewGalerie.setLayoutManager( lLayout );

        AdapterNumero rcAdapter = new AdapterNumero( getContext(), rowListItem, listener );
        recycleViewGalerie.setAdapter( rcAdapter );

        initListeners();

    }

    private List<ListNumero> getAllItemList() {

        int i=0;
        String s;

        List<ListNumero> allItems = new ArrayList<ListNumero>();


        allItems.add( new ListNumero( "1", "There's a Man on the Throne of God",
                "1 T HERE's a Man on the Throne of God\n" +
                        "He's the Saviour of the world\n" +
                        "In His hands are the nail prints\n" +
                        "Of His suffering for all\n" +
                        "He offers salvation full and free\n" +
                        "To all who would come to Him\n",
                "2 Behold Him at the right hand of God\n" +
                        "Interceding day and night\n" +
                        "You're the object of His cries to God,\n" +
                        "Pleading that you may be saved\n" +
                        "He is labouring, He is giving all\n" +
                        "That from sin you may be saved",
                "3 Behold, behold, God's outstretched arms\n" +
                        "Waiting to receive you\n" +
                        "He looks at the Saviour's blood\n" +
                        "And hears His cries from the throne\n" +
                        "Because of these, He will receive you\n" +
                        "And make you His forever;",
                "4 Oh, my brother, oh, my sister\n" +
                        "Fellow creatures of our God\n" +
                        "I've been to Him who's the Saviour\n" +
                        "And been saved and freed from sin\n" +
                        "You too should come, just as you are\n" +
                        "And He'll do the same for you",
                "", "",
                "",
                "Hallelujah !\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "He's the Saviour of the world,\n" +
                        "Hallelujah!\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "He's the Saviour of the world.",
                "Hallelujah !\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "Jesus-Christ labours for you,\n" +
                        "Hallelujah!\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "Jesus-Christ labours for you.",
                "Hallelujah !\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "Now's your hour to come to Him,\n" +
                        "Hallelujah!\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "Now's your hour to come to Him.",
                "Hallelujah !\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "Now's your hour to come to Him,\n" +
                        "Hallelujah!\n" +
                        "Hallelujah ! Hallelujah !\n" +
                        "Receive Him now as your all.",
                "",
                ""));


        allItems.add( new ListNumero( "2", "WORTHY art Thou to take the scroll",
                "1 WORTHY art Thou to take the scroll\n" +
                        "And, Saviour, open all its seals\n" +
                        "For Thou wast slain and by Thy blood\n" +
                        "Didst ransom men.",
                "2 Worthy art Thou blessed Saviour\n" +
                        "For‟ t'was unto God the Father\n" +
                        "That Thou didst ransom the lost\n" +
                        "Unto our God.",
                "3 Wondrous and blessed Saviour King\n" +
                        "It was from every tribe and tongue\n" +
                        "Lord from all peoples and nations\n" +
                        "Thou ransomed them.",
                "4 Exalted, King of all glory\n" +
                        "Thou hast made of all the\n" +
                        "ransomed\n" +
                        "A kingdom of priests unto our God\n" +
                        "With Thee they'll reign.",
                "5 Blessed Saviour, Holy Jesus,\n" +
                        "Thou hast made of wretched me\n" +
                        "One of those to sit on the throne\n" +
                        "And reign with Thee.", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "3", "WILL praise Thee O Lord, among the people,",
                "1 For Thy mercy is great unto the heavens,\n" +
                        "And Thy truth right unto the clouds.\n" +
                        " 2x Ch.",
                "2 Be Thou exalted, O God, above heavens,\n" +
                        "Let Thy glory be above all the earth.\n" +
                        " 2x Ch.",
                "3 I will sing of Thy power, yea, I will,\n" +
                        "Sing aloud of Thy mercy in the morning. \n" +
                        "2x Ch.",
                "4 For Thou hast been my only Defence\n" +
                        "And my Refuge in the day of trouble.\n" +
                        "2x Ch.",
                "5 Unto Thee, O God, will I sing,\n" +
                        "God of mercy and my strength\n" +
                        "2x Ch.",
                "",
                "WILL praise Thee O Lord,\n" +
                        "among the people,\n" +
                        "will sing unto Thee among the nations.",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "4", "ALL saints to war ! arise,",
                "1 ALL saints to war ! arise,\n" +
                        "And fight the Lord's battle,\n" +
                        "Put in your all and then prevail\n" +
                        "With the eternal King.",
                "2 All saints to war ! arise,\n" +
                        "Arise with strength t'oppose,\n" +
                        "Standing with Christ over Satan's host\n" +
                        "To conquer and to reign.",
                "3 Slumbering Christians ! arise,\n" +
                        "Arise from sleep and ease,\n" +
                        "Princes and powers muster their arrays\n" +
                        "Arise and watch and pray.",
                "4 All saints to war ! arise,\n" +
                        "With Him to stand on His side,\n" +
                        "Wrestle to overthrow all Satan's host\n" +
                        "Triumphing every foe.",
                "5 Arise and watch ! arise,\n" +
                        "The Master will soon appear,\n" +
                        "The time is short, stand and fight now,\n" +
                        "For soon it will be night.",
                "6 And when He shall appear,\n" +
                        "After these battling days\n" +
                        "From Him shall come rewards of rowns\n" +
                        "To every faithful one.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "5", "I HEAR my glorious Saviour say,",
                "1 I HEAR my glorious Saviour say,\n" +
                        "\"Follow Me; follow Me; follow Me.\"\n" +
                        "His voice is calling all the day,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "For you, I trod the bitter way,\n" +
                        "For you, I gave My life away,\n" +
                        "I drank the gall thy debt to pay,\n" +
                        "\"Follow Me, follow Me, follow Me.\"",
                "2 \"Come, cast on Me your many ares,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "I am the answer for your needs,\n" +
                        "\"Follow Me, follow Me, Follow Me.\"" +
                        "Though you have sinned I pardon you,\n" +
                        "I am the answer to your backsliding\n" +
                        "I restore you to all My fullness,\n" +
                        "\"Follow Me, follow Me, follow Me.\"",
                "3 Behold the past is all forgiven,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "Your past sins I remember no more,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "I offer you the joy of My life\n" +
                        "And the pathway of suffering unto death\n" +
                        "And in all these I'll be with you,\n" +
                        "\"Follow Me, follow Me, follow Me.\"",
                "4 I am your never-falling Guide,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "Forsake the world, what'er betide,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "And walk by faith and not by sight,\n" +
                        "My hand shall guide you everyday,\n" +
                        "Through day time bright or darkened night,\n" +
                        "\"Follow Me, follow Me, follow Me.\"",
                "5 Suffering and shame wont be the end,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "Behold I have a crown in store for you,\n" +
                        "\"Follow Me, follow Me, follow Me.\"\n" +
                        "And My Father's wondrous presence,\n" +
                        "The home prepared for My very own,\n" +
                        "Then you will sit with Me on the throne\n" +
                        "And rejoice for having followed Me.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "6", "WHEN the children of God,",
                "1 WHEN the children of God,\n" +
                        "Have taken their stand,\n" +
                        "What right have you to protest ?\n" +
                        "We cast you out, In Jesus' name,\n" +
                        "What right have you to protest ?\n" +
                        "",
                "2 We rebuke you this day,\n" +
                        "In Jesus' name !\n" +
                        "We cast you out ; in Jesus' name !\n" +
                        "We send you into The deepest pit,\n" +
                        "You must go and wait for your doom \n" +
                        "ch.\n" +
                        "",
                "3 With the power in the blood,\n" +
                        "We hit you with the cross,\n" +
                        "We cut you with the Word, in Jesus' name.\n" +
                        "We overcome you, In Jesus'name.\n" +
                        "What right have you to protest ?    Ch.\n" +
                        "",
                "4 We are children of God,\n" +
                        "We have authority\n" +
                        "Over you Satan and your agents,\n" +
                        "We break your powers,\n" +
                        "We crush you down in Jesus' name this day.\n" +
                        "ch",
                "5You, son of perdition, You Lucifer,\n" +
                        "And your demons, we know you all,\n" +
                        "You came in spirits,\n" +
                        "You came in diseases,\n" +
                        "We cast you out in Jesus' name     Ch\n" +
                        "",
                "6 We have our victory,\n" +
                        "Where is your victory ?\n" +
                        "You, son of perdition ; you are defeated!\n" +
                        "We shame you this day In Jesus'name !\n" +
                        "What right have you to protest? Ch\n\n\n" +

                        "7 You, master liar, You, destroyer,\n" +
                        "You, devourer, Where is your victory?\n" +
                        "We shame you this day,\n" +
                        "n Jesus' name !\n" +
                        "What right have you to protest ?\n" +
                        "",
                "",
                "What right ?   (twice)\n" +
                        "What right have you to protest ?\n" +
                        "We command you in Jesus' name,\n" +
                        "What right have you to protest ?",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "7", "I AM holy for the Lord has made me holy.",
                "1 I AM holy for the Lord has made me holy.\n" +
                        "I am holy for He has sanctified me.\n" +
                        "I am holy by His very holiness.\n" +
                        "I am holy, it is the work of His mighty hand.\n",
                "2 I am clean for the Lord has made me very clean\n" +
                        "I am clean for He has washed me, washed me\n" +
                        "I am clean by His very cleanliness\n" +
                        "I am clean, it is the work of His mighty hand.\n" +
                        "",
                "3 I am righteous for the Lord has made me righteous\n" +
                        "I am righteous for He has justified me\n" +
                        "I am righteous by His very righteousness\n" +
                        "I am righteous, it is the work of His mighty hand.",
                "4 I am wise for the Lord has made me very wise\n" +
                        "I am wise for He has taught me, taught me\n" +
                        "I am wise by His very wisdom\n" +
                        "I am wise, it is the work of His mighty hand.",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "8", "YOU a disciple",
                "1 YOU a disciple\n" +
                        "Of the Lord Jesus\n" +
                        "Your Lord learned to pray.\n" +
                        "He spends time praying\n" +
                        "Praying to the Father\n" +
                        "That your faith might grow\n" +
                        "Rise from sleep\n" +
                        "And pray like Him\n" +
                        "Wrestle on your knees\n" +
                        "Your Captain the Lord Jesus-Christ\n" +
                        "Is right now at prayer.",
                "2 He calls to prayer\n" +
                        "All those who are His\n" +
                        "All who will follow Him into conflict\n" +
                        "With the powers\n" +
                        "That hold men captive\n" +
                        "Rise from ease\n" +
                        "Oh man for victory\n" +
                        "For to that you are called\n" +
                        "Labour with Him praying at night\n" +
                        "And in the day too.\n" +
                        "",
                "3 At the Jordan\n" +
                        "Wrestling in prayer\n" +
                        "He rent the heavens\n" +
                        "Then the Spirit came as a dove\n" +
                        "And rested on Him\n" +
                        "He then went\n" +
                        "In might and power\n" +
                        "And laboured in prayer\n" +
                        "Until the Father's gracious will\n" +
                        "Was fully accomplished.\n" +
                        "",
                "4 Though now on the throne\n" +
                        "Right in His glory\n" +
                        "He yet does one thing\n" +
                        "He does intercede\n" +
                        "Praying night and day\n" +
                        "For the saints on earth.\n" +
                        "You are the one\n" +
                        "For whom He has prayed.\n" +
                        "For so many years.\n" +
                        "That you may enter right now\n" +
                        "Into His fullness.",
                "5 He is praying\n" +
                        "He is fasting\n" +
                        "He holds nothing back\n" +
                        "Arise, my sister\n" +
                        "Arise, my brother\n" +
                        "Join Him in prayer\n" +
                        "Then the power Of our God\n" +
                        "Will be poured out on all\n" +
                        "Many will then be transformed\n" +
                        "And then the King will come.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "9", "HARK Hark the voice of Christ",
                "1 H ARK Hark the voice of Christ our Lord is ringing\n" +
                        "Calling His sheep ; to follow and obey\n" +
                        "The fight is on ; our Captain is proclaiming\n" +
                        "Come ye my soldiers ; I am on the move.",
                "2 Awake from sleep ; the harvest awaiting\n" +
                        "Go in His name, possess the land for Him\n" +
                        "Lift up your voice ; the name of Christ proclaiming\n" +
                        "Let weary souls find refuge in the King\n" +
                        "Ch",
                "3 Watch ! keep alert ; the heavens\n" +
                        "will open\n" +
                        "We'll hear the sound ; our Lord will\n" +
                        "soon appear\n" +
                        "Oh ! Church of God ; Behold the hour soon cometh\n" +
                        "Oh ! What a wonder to behold His face. Ch.",
                "",
                "", "",
                "Christians, rejoice ; your Faithful keeps watching\n" +
                        "Sing and proclaim the triumph of the Lord\n" +
                        "Till all His foes are crushed and bow before Him\n" +
                        "Christ is the Victor ; He's the Lord and King.",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "10", "I SEE before me just two wills",
                "1 I SEE before me just two wills\n" +
                        "The will of God and the enemy's\n" +
                        "No other will besides these two\n" +
                        "I'll do Your will.",
                "2 I will not bring in my own will\n" +
                        "For my will would be the enemy's\n" +
                        "I take Your will, my Lord, for mine\n" +
                        "I'll do Your will.",
                "3 I give myself to seek Your will\n" +
                        "n all I think and say and do\n" +
                        "And when it's found my choice made\n" +
                        "I'll do Your will.",
                "",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "11", "OH GOD, Oh God, you are Lord",
                "1 OH GOD, Oh God, you are Lord\n" +
                        "You are God above all gods.\n" +
                        "1 OH GOD, Oh God, you are Lord\n" +
                        "You are God above all gods.\n" +
                        "You are Lord above all the lords on earth,\n" +
                        "You are God above all the gods.\n" +
                        "Oh God, oh God, you are Lord,\n" +
                        "You are God above all the gods.\n",
                "2 Oh God, oh God, you are Lord\n" +
                        "You are Lord of heaven and earth\n" +
                        "Oh God, oh God, you are Lord\n" +
                        "You are Lord of heaven and earth\n" +
                        "You are greater than all the powers on high ;\n" +
                        "The Lord of hosts most high.\n" +
                        "Oh God, oh God, you are Lord,\n" +
                        "You are Lord of heaven and earth.\n",
                "3 Oh God, oh God, you are Lord,\n" +
                        "You are the Almighty King\n" +
                        "Oh God, oh God, you are Lord,\n" +
                        "You are the Almighty King\n" +
                        "Your kingdom is forever more,\n" +
                        "On earth as well in heaven.\n" +
                        "Oh God, oh God, you are Lord,\n" +
                        "Your reign is forever more.",
                "",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "12", "BEHOLD the Lamb, the Son of God",
                "1 B EHOLD the Lamb, the Son of God\n" +
                        "He loved me and He gave His life\n" +
                        "He bled and died upon the tree\n" +
                        "To change my life and set me free\n" +
                        "How sweet to know that I am saved\n" +
                        "Because He died on Calvary.",
                "2 Behold the Lamb, the risen Lord\n" +
                        "He rose again ! What victory !\n" +
                        "He went to heaven at the right hand of God.\n" +
                        "He's lifted up in power and might\n" +
                        "How sweet to know that at the throne\n" +
                        "On my behalf He intercedes.",
                "3 Behold the Lamb, the Faithful One\n" +
                        "My hand in His He'll see me through\n" +
                        "And take me through this world of sin\n" +
                        "In holiness and victory,\n" +
                        "When the trumpet sounds on that great day\n" +
                        "In joy I'll see Him face to face.",
                "4 Behold the Lamb, eternal King\n" +
                        "He is coming to reign eternally\n" +
                        "I yield to Thee, O King of kings\n" +
                        "I crown Thee King, King of my life\n" +
                        "Accept this day, in mercy and grace\n" +
                        "This sacrifice, my very life.",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "13", "JESUS-CHRIST is our Lord and King",
                "1 JESUS-CHRIST is our Lord and King\n" +
                        "He is our King\n" +
                        "We have found in Him our deliverance\n" +
                        "He is our Shield\n" +
                        "All the demons of hell may rage\n" +
                        "And the principalities may scream\n" +
                        "But Jesus-Christ is the Victory\n" +
                        "He is our Rock !",
                "2 When all of hell stood in triumph\n" +
                        "Jesus came down\n" +
                        "He took the powers of sin to task\n" +
                        "And triumphed over them\n" +
                        "On that glorious day at Calvary\n" +
                        "He went to war against Satan\n" +
                        "He disarmed the principalities\n" +
                        "And stood Victor !",
                "3 In union with Him on Calvary\n" +
                        "Our Lord took us\n" +
                        "His victory became our victory\n" +
                        "Over Satan\n" +
                        "We are now victors over demons\n" +
                        "We overthrow principalities\n" +
                        "We bring down all powers of darkness\n" +
                        "In Jesus's name !",
                "4 Soon Satan and all his forces\n" +
                        "Will be in hell\n" +
                        "We shall then reign with our\n" +
                        "Saviour In His heaven\n" +
                        "Then seated with Christ in glory\n" +
                        "We shall worship Him endlessly\n" +
                        "And bless His glorious Holy name\n" +
                        "For ever more !",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "14", "O LORD my God, You are King of kings",
                "1 O LORD my God, You are King of kings\n" +
                        "You are enthroned above all names\n" +
                        "In heaven on high, on earth below\n" +
                        "Jesus, my Lord, You are King of kings.",
                "2 Heaven Your throne, earth Your footstool\n" +
                        "Principalities and powers must bow\n" +
                        "All dominion, all rule must bow\n" +
                        "And they'll confess Jesus-Christ is Lord.",
                "3 You are sovereign, You are supreme\n" +
                        "Your will in heaven, on earth must be\n" +
                        "Your Kingdom comes, all knees must bow\n" +
                        "And every tongue confess You Lord.",
                "4 Jesus, You reign in Your Church on earth\n" +
                        "Jesus, You reign in heaven above\n" +
                        "Jesus, You reign under earth beneath\n" +
                        "Jesus, You reign in the universe.",
                "5 Glory and honour to You, O Lord\n" +
                        "Glory and honour to Jesus-Christ\n" +
                        "Power and might are Thine, O Lord\n" +
                        "Excellence, splendour and majesty\n" +
                        "Amen.", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "15", "IN the Father's good pleasure",
                "1 I N the Father's good pleasure\n" +
                        "He's ordained intercession\n" +
                        "And then invited those who would\n" +
                        "To stand now in the gap.",
                "2 He could have established\n" +
                        "That without intercession\n" +
                        "His will might yet be established\n" +
                        "On earth as in heaven.",
                "3 Yet that pathway He did not choose\n" +
                        "But set forth a divine law\n" +
                        "That unless men interceded\n" +
                        "He would not do many things.",
                "4 So unchanging is this law\n" +
                        "That it is binding on all\n" +
                        "Even the Son right on the throne\n" +
                        "Must intercede night and day.",
                "5 The Son understands this law\n" +
                        "And bearing the Church on His heart\n" +
                        "Since His return to the throne\n" +
                        "Does nothing but intercede.",
                "6 The Father waits for the Redeemed\n" +
                        "To follow in His steps\n" +
                        "And make daily intercession\n" +
                        "Life's most important work.\n\n" +

                        "7 My Lord, My God and My King\n" +
                        "I give myself to Thee\n" +
                        "And now make intercession\n" +
                        "My life's one priority.\n\n" +


                        "8 O ! blessed Holy Spirit\n" +
                        "You intercede in me\n" +
                        "Help me daily in this work\n" +
                        "As I labour in Thee.\n\n" +


                        "9 O ! blessed Father of glory\n" +
                        "Hearken to my intercessions\n" +
                        "And grant the requests of my heart\n" +
                        "As I labour with Thine Christ.\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "16", "WELL-DONE good and faithful servant",
                "1 W ELL-DONE good and faithful servant\n" +
                        "You gave your all for Me\n" +
                        "You suffered shame on earth for Me\n" +
                        "You were faithful to the end.",
                "2 Enter now into My glory\n" +
                        "Prepared for My very own\n" +
                        "Come into My very presence\n" +
                        "And be lost in My love.",
                "3 Sit at the banquet I've prepared\n" +
                        "For My special lovers\n" +
                        "Sit at My own very table\n" +
                        "And eat from My own plate.",
                "4 Behold the joy of My Father\n" +
                        "The home prepared for you\n" +
                        "Behold its wondrous beauty\n" +
                        "And it is all for you.",
                "5 Here flows the river of life\n" +
                        "And it flows just for you\n" +
                        "Here grows that evergreen tree\n" +
                        "My Father's plant for you.",
                "6 Together we will live and reign\n" +
                        "On My Father's great throne\n" +
                        "Angels shall serve us together\n" +
                        "Through all eternity.\n\n" +


                        "7 Then through all eternity,\n" +
                        "Reigning on the throne with Me\n" +
                        "You'll know that it was all by grace\n" +
                        "And praise the eternal King.\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "17", "DOWN on earth and up in heaven",
                "1 D OWN on earth and up in heaven\n" +
                        "There's no other name so sweet\n" +
                        "No ! no other that my heart wants\n" +
                        "But the Christ who died for me !",
                "2 Get the names of all the princes\n" +
                        "Then the names of all the kings\n" +
                        "Oh the wondrous name of Jesus\n" +
                        "His, the greatest name of all.   Ch.",
                "3 Glorious are the names of angels\n" +
                        "Seraphims and archangels\n" +
                        "There's none like the name of Jesus\n" +
                        "Name that charms my heart from earth.",
                "4 Jesus heals the broken hearted\n" +
                        "Makes the wounded spirit whole\n" +
                        "Fills the trembling heart with courage\n" +
                        "Sets the weary souls at rest.    Ch.",
                "5 At the name of Jesus bowing\n" +
                        "Falling prostrate at His feet", "",
                "",
                "Precious name ... Oh how sweet !\n" +
                        "The Anointed of the Lord\n" +
                        "Precious name, oh, how s-w-e-e-t\n" +
                        "Tis the name ! Emmanuel.\n" +
                        "King of glory now we crown Him\n" +
                        "And throughout eternity.    Ch.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "18", "MORE holiness give me, more strivings within;",
                "1.MORE holiness give me, more strivings within;\n" +
                        "More patience in suffering, more sorrow for sin;\n" +
                        "More faith in my Saviour, more sense in His care\n" +
                        "More joy in His service, more purpose in prayer",
                "2.More gratitude give me, more trust in the Lord;\n" +
                        "More zeal for His glory, more hope in His Word ;\n" +
                        "More tears for His sorrows, more pain at His grief ;\n" +
                        "More meekness in trial, more praise for relief.",
                "3. More purity give me, more strength to overcome ;\n" +
                        "More freedom from earth-stains, more longings for home ;\n" +
                        "More fit for the Kingdom, more used would I be ;\n" +
                        "More blessed and holy, more, saviour, like thee",
                "",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "19", "On a hill far -way Stood an old rugged cross,",
                "1. On a hill far -way Stood an old rugged cross,\n" +
                        "The emblem of suffering and shame ;\n" +
                        "And I love that old cross\n" +
                        "Where the dearest and best\n" +
                        "For a world of lost sinners was slain",
                "2. Oh, that old rugged cross\n" +
                        "So despised by the world,\n" +
                        "Has a wondrous attraction for me ;\n" +
                        "For the dear Lamb of God\n" +
                        "Left His glory above, To bear it on dark Calvary.\n" +
                        "",
                "3. In the old rugged cross,\n" +
                        "Stained with blood so divine,\n" +
                        "A wondrous beauty I see ;\n" +
                        "For „twas on that old cross\n" +
                        "Jesus suffered and died,\n" +
                        "To pardon and sanctify me." ,
                "4. To the old rugged cross\n" +
                        "I will ever be true,\n" +
                        "It‟s shame and reproach Gladly bear ;\n" +
                        "Then He‟ll call me some day\n" +
                        "To my home far away ;\n" +
                        "Where His glory forever I‟ll share",
                "", "",
                "",
                "So I’ll cherish the old rugged cross,\n" +
                        "Till my trophies at last I lay down ;\n" +
                        "I will cling to the old rugged cross,\n" +
                        "And exchange it some day for a crown.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero( "20", "WHEN I survey the wondrous cross",
                "1. WHEN I survey the wondrous cross\n" +
                        "On which the Prince of glory died,\n" +
                        "My richest gain I count but loss,\n" +
                        "And pour contempt on all my pride.",
                "2. Forbid it ,Lord, that I should boast,\n" +
                        "Save in the death of Christ my God:\n" +
                        "All the vain things that charm me most,\n" +
                        "I sacrifice them to His blood.",
                "3.See ! From His head, His hands, His feet,\n" +
                        "Sorrow and love flow mingled down\n" +
                        "Did e'er such love and sorrow meet,\n" +
                        "Or thorns compose so rich a crown?",
                "4. Were the whole realm of nature mine,\n" +
                        "That were an offering far too small\n" +
                        "Love so amazing, so divine,\n" +
                        "Demands my soul, my life, my all.",
                "", "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));


        allItems.add( new ListNumero("21", "CHRIST the victor",
                "1. CHRIST the victor\n" +
                        "This day we chant His victory\n" +
                        "Christ the victor.\n" +
                        "He's overcome the foe of the elect\n" +
                        "Christ's reign forever shall endure\n" +
                        "Yea His victory forever endures\n" +
                        "And His power always endures\n" +
                        "To Him who sits exalted on the throne.\n" +
                        "Be honour, praise, and glory\n" +
                        "To Him who sits exalted on the throne.\n" +
                        "Be honour, praise, and glory",
                "2. Conquered Satan\n" +
                        "This day we chant your demise\n" +
                        "Conquered are you !\n" +
                        "Prostrate are you before the King of kings\n" +
                        "Forever you are overthrown\n" +
                        "You are conquered forevermore\n" +
                        "And your weakness always endures\n" +
                        "To the accuser of the elect of God\n" +
                        "Shame and confusion be thine.\n" +
                        "To the accuser of the elect of God\n" +
                        "Shame and confusion be thine.",
                "3. Oh ye dark powers\n" +
                        "Demons and all dominions\n" +
                        "You are confused\n" +
                        "Judged and destroyed lies your kingdom in ruins\n" +
                        "Conquered is Satan forevermore\n" +
                        "You are conquered no more to rise\n" +
                        "And your weakness always endures\n" +
                        "To the accuser of the elect of God\n" +
                        "Shame and confusion be thine.\n" +
                        "To the accuser of the elect of God\n" +
                        "Shame and confusion be thine.",
                "4. Redeemed of the Lord\n" +
                        "With all hearts all minds In union be\n" +
                        "Bowed in our hearts to our Redeemer Lord\n" +
                        "There lies the pathway to glory\n" +
                        "And our victory rests unshaken\n" +
                        "And our power always endures\n" +
                        "To Him who sits exalted on the throne\n" +
                        "Be honour, praise and glory.\n" +
                        "To Him who sits exalted on the throne\n" +
                        "Be honour, praise and glory.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("22", "HOLY, Holy, Holy!",
                "1. HOLY, Holy, Holy!\n" +
                        "Lord God Almighty!\n" +
                        "Early in the morning our song shall rise to Thee ;\n" +
                        "Holy, Holy, Holy! Merciful and Mighty,\n" +
                        "God in Three Persons,\n" +
                        "Blessed Trinity!",
                "2. Holy, Holy, Holy !\n" +
                        "All the saints adore Thee,\n" +
                        "Casting down their golden crowns\n" +
                        "around the glassy sea,\n" +
                        "Cherubim and seraphim falling down before Thee,\n" +
                        "Which wert, and art, And evermore shalt be.",
                "3. Holy, Holy, Holy !\n" +
                        "Though the darkness hide Thee,\n" +
                        "Though the eye of sinful man Thy glory may not see,\n" +
                        "Only Thou art holy ;\n" +
                        "There is none beside Thee,\n" +
                        "Perfect in power, in love, and purity.",
                "4. Holy, Holy, Holy!\n" +
                        "Lord God Almighty!\n" +
                        "All Thy works shall praise Thy Name\n" +
                        "in earth and sky and sea ;\n" +
                        "Holy, Holy, Holy, merciful and mighty,\n" +
                        "God in Three Persons, Blessed Trinity!",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("23", "GLORY be to God the Father",
                "1. GLORY be to God the Father\n" +
                        "Glory be to God the Son,\n" +
                        "Glory be to God the Spirit,\n" +
                        "Great Jehovah, Three in One !\n" +
                        "Glory, glory\n" +
                        "While eternal ages run !",
                "2. Glory be to Him who loved us,\n" +
                        "Washed us from each spot and stain!\n" +
                        "Glory be to Him who bought us,\n" +
                        "Made us kings with Him to reign !\n" +
                        "Glory, glory\n" +
                        "To the Lamb that once was slain !",
                "3. Glory to the King of angels,\n" +
                        "Glory to the Church's King,\n" +
                        "Glory to the King of nations !\n" +
                        "Heaven and earth, your praises bring;\n" +
                        "Glory, glory\n" +
                        "To the King of Glory bring !",
                "4. 'Glory, blessing, praise eternal !'\n" +
                        "Thus the choir of angels sings ;\n" +
                        "'Honour, riches, power, dominion !'\n" +
                        "Thus its praise creation brings ;\n" +
                        "Glory, glory,\n" +
                        "Glory to the King of kings !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("24", "IMMORTAL, invisible, God only wise",
                "1. IMMORTAL, invisible, God only wise\n" +
                        "In light inaccessible hid from our eyes,\n" +
                        "Most blessed, most glorious, the Ancient of Days,\n" +
                        "Almighty, victorious, Thy great Name we praise.\n",
                "2. Unresting, unhasting, and silent as light,\n" +
                        "Nor wanting, nor wasting, Thou rulest in might ;\n" +
                        "Thy justice like mountains high soaring above\n" +
                        "Thy clouds which are fountains of goodness and love",
                "3. To all, life Thou givest to both great and small ;\n" +
                        "In all life Thou livest, the true life of all;\n" +
                        "We blossom and flourish as leaves on the tree,\n" +
                        "And wither and perish but nought changeth Thee.",
                "4. Great Father of Glory, pure Father of Light,\n" +
                        "Thine angels adore Thee, all veiling their sight ;\n" +
                        "All laud we would render : O help us to see\n" +
                        "'Tis only the splendour of light hideth Thee.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("25", "PRAISE, my soul, the King of heaven",
                "1. Praise, my soul, the King of heaven\n" +
                        "To His feet thy tribute bring ;\n" +
                        "Ransomed, healed, restored, forgiven,\n" +
                        "Who like me His praise should sing ?\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise the everlasting King.",
                "2. Praise Him for His grace and favour\n" +
                        "To our fathers in distress ;\n" +
                        "Praise Him, still the same for ever,\n" +
                        "Slow to chide and swift to bless :\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Glorious in His faithfulness.",
                "3. Father-like He tends and spares us\n" +
                        "Well our feeble frame He knows\n" +
                        "In His hands He gently bears us,\n" +
                        "Rescues us from all our foes :\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Widely as His mercy flows.",
                "4 Frail as summer's flower we flourish\n" +
                        "Blows the wind and it is gone ;\n" +
                        "But, while mortals rise and perish,\n" +
                        "God endures unchanging on :\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise the high eternal One.",
                "5. Angels, help us to adore Him ;\n" +
                        "Ye behold Him face to face ;\n" +
                        "Sun and moon, bow down before Him\n" +
                        "Dwellers all in time and space.\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise Him ! Praise Him !\n" +
                        "Praise with us the God of grace.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("26", "PRAISE to the Lord, the Almighty, the King of creation",
                "1 P RAISE to the Lord, the\n" +
                        "Almighty, the King of creation ;\n" +
                        "O my soul, praise Him, for He is\n" +
                        "thy Health and Salvation ;\n" +
                        "All ye who hear,\n" +
                        "Now to His temple draw near,\n" +
                        "Joining in glad adoration.",
                "2 Praise to the Lord, who o'er all\n" +
                        "things so wondrously reigneth,\n" +
                        "Shieldeth thee gently from harm, or\n" +
                        "when fainting sustaineth ;\n" +
                        "Hast thou not seen\n" +
                        "How thy heart's wishes have been\n" +
                        "Granted in what He ordaineth ?",
                "3. Praise to the Lord, who doth\n" +
                        "prosper thy work and defend thee ;\n" +
                        "Surely His goodness and mercy\n" +
                        "shall daily attend thee ; Ponder anew\n" +
                        "What the Almighty can do,\n" +
                        "If with His love He befriend thee.",
                "4. Praise to the Lord ! O let all that is \n" +
                        "in me adore Him !\n" +
                        "All that hath life and breath, come\n" +
                        "now with praises before Him !\n" +
                        "Let the Amen Sound from His people again :\n" +
                        "Gladly for aye we adore Him",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("27", "HARK ! the herald angels sing,",
                "1. HARK ! the herald angels sing,\n" +
                        "'Glory to the new-born King,\n" +
                        "Peace on earth, and mercy mild,\n" +
                        "God and sinners reconciled !'\n" +
                        "Joyful, all ye nations rise,\n" +
                        "Join the triumph of the skies,\n" +
                        "With the angelic host proclaim,\n" +
                        "'Christ is born in Bethlehem.'",
                "2. Christ, by highest heaven adored,\n" +
                        "Christ, the everlasting Lord,\n" +
                        "Late in time behold Him come,\n" +
                        "Offspring of a virgin's womb.\n" +
                        "Veiled in flesh the Godhead see ;\n" +
                        "Hail, the Incarnate Deity,\n" +
                        "Pleased as Man with man to dwell,\n" +
                        "Jesus, our Immanuel !",
                "3 Hail, the heaven-born Prince of Peace!\n" +
                        "Hail, the Sun of Righteousness !\n" +
                        "Light and life to all He brings,\n" +
                        "Risen with healing in His wings.\n" +
                        "Mild He lays His glory by,\n" +
                        "Born that man no more may die,\n" +
                        "Born to raise the sons of earth,\n" +
                        "Born to give them second birth.",
                "",
                "",
                "",
                "",
                "Hark ! the herald angels sing,\n" +
                        "'Glory to the new-born King.'",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("28", "O SACRED Head, sore wounded,",
                "1. O SACRED Head, sore wounded,\n" +
                        "With grief and shame weighed down!\n" +
                        "O Kingly Head, surrounded\n" +
                        "With thorns, Thine only crown !\n" +
                        "How pale art Thou with anguish,\n" +
                        "With sore abuse and scorn !\n" +
                        "How does that visage languish,\n" +
                        "Which once was bright as morn !",
                "2. O Lord of life and glory,\n" +
                        "What bliss till now was Thine !\n" +
                        "I read the wondrous story ;\n" +
                        "I joy to call Thee mine.\n" +
                        "Thy grief and bitter passion\n" +
                        "Were all for sinners' gain ;\n" +
                        "Mine, mine was the transgression,\n" +
                        "But Thine the deadly pain.",
                "3. What language shall I borrow\n" +
                        "To praise Thee, heavenly Friend,\n" +
                        "For this Thy dying sorrow,\n" +
                        "Thy pity without end ?\n" +
                        "O make me Thine for ever,\n" +
                        "And, should I fainting be,\n" +
                        "Lord, let me never, never\n" +
                        "Outlive my love to Thee.",
                "4 Be near me, Lord, when dying ;\n" +
                        "O show Thy Cross to me ;\n" +
                        "And, for my succour flying,\n" +
                        "Come, Lord, to set me free ;\n" +
                        "These eyes, new faith receiving,\n" +
                        "From Thee shall never move ;\n" +
                        "For he who dies believing\n" +
                        "Dies safely through Thy love.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("29", "AND can it be, that I should gain",
                "1. AND can it be, that I should gain\n" +
                        "An interest in the Saviour's blood ?\n" +
                        "Died He for me, who caused His pain\n" +
                        "For me, who Him to death pursued?\n" +
                        "Amazing love ! how can it be\n" +
                        "That Thou, my God, shouldst die for me?",
                "2. 'Tis mystery all ! The Immortal dies\n" +
                        "Who can explore His strange design?\n" +
                        "In vain the first-born seraph tries\n" +
                        "To sound the depths of love divine.\n" +
                        "Tis mercy all ! let earth adore,\n" +
                        "Let angel minds inquire no more.",
                "3. He left His Father's throne above,\n" +
                        "So free, so infinite His grace\n" +
                        "Emptied Himself of all but love,\n" +
                        "And bled for Adam's helpless race\n" +
                        "'Tis mercy all, immense and free ;\n" +
                        "For, O my God, it found out me !",
                "4 Long my imprisoned spirit lay\n" +
                        "Fast bound in sin and nature's night ;\n" +
                        "Thine eye diffused a quickening ray,\n" +
                        "I woke, the dungeon flamed with light;\n" +
                        "My chains fell off, my heart was free,\n" +
                        "I rose, went forth, and followed Thee.",
                "5. No condemnation now I dread ;\n" +
                        "Jesus, and all in Him, is mine !\n" +
                        "Alive in Him, my living Head,\n" +
                        "And clothed in righteousness divine,\n" +
                        "Bold I approach the eternal throne,\n" +
                        "And claim the crown, through Christ my own.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("30", "CHRIST the Lord is risen today',",
                "1. CHRIST the Lord is risen today'\n" +
                        "Sons of men and angels say ;\n" +
                        "Raise your joys and triumphs high ;\n" +
                        "Sing, ye heavens, and, earth, reply.\n" +
                        "Love's redeeming work is done,\n" +
                        "Fought the fight, the battle won ;\n" +
                        "Lo ! our Sun's eclipse is o'er ;\n" +
                        "Lo ! He sets in blood no more.",
                "2. Vain the stone, the watch, the seal\n" +
                        "Christ has burst the gates of hell :\n" +
                        "Death in vain forbids His rise ;\n" +
                        "Christ has opened Paradise.\n" +
                        "Lives again our glorious King ;\n" +
                        "Where, O death, is now thy sting ?\n" +
                        "Once He died, our souls to save ;\n" +
                        "Where thy victory, O grave ?",
                "3 Soar we now where Christ has led\n" +
                        "Following our exalted Head ;\n" +
                        "Made like Him, like Him we rise ;\n" +
                        "Ours the Cross, the grave, the skies.\n" +
                        "Hail, the Lord of earth and heaven!\n" +
                        "Praise to Thee by both be given ;\n" +
                        "Thee we greet triumphant now ;\n" +
                        "Hail, the Resurrection Thou !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("31", "HALLELUYAH ! HALLELUYAH ! HALLELUYAH !",
                "1. T HE strife is o'er, the battle done ;\n" +
                        "Now is the Victor's triumph won ;\n" +
                        "Now be the song of praise begun, _\n" +
                        "'Halleluyah !'",
                "2. The powers of death have done their worst,\n" +
                        "But Christ their legions hath dispersed\n" +
                        "Let shouts of holy joy outburst,\n" +
                        "'Halleluyah !'",
                "3 The three sad days have quickly sped\n" +
                        "He rises glorious from the dead ;\n" +
                        "All glory to our risen Head\n" +
                        "!'Halleluyah !'",
                "4. He brake the age-bound chains of hell;\n" +
                        "The bars from heaven's high portals fell;\n" +
                        "Let hymns of praise His triumph tell.\n" +
                        "!'Halleluyah !'",
                "5. Lord, by the stripes which wounded Thee,\n" +
                        "From death's dread sting Thy servants free,\n" +
                        "That we may live, and sing to Thee,\n" +
                        "!'Halleluyah !'",
                "",
                "HALLELUYAH ! HALLELUYAH ! \n" +
                        "HALLELUYAH !",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("32", "REJOICE, the Lord is King",
                "1. REJOICE, the Lord is King\n" +
                        "Your Lord and King adore ;\n" +
                        "Mortals, give thanks and sing\n" +
                        "And triumph evermore :\n" +
                        "Lift up your heart, lift up your voice\n" +
                        "Rejoice ; again I say, 'Rejoice.'",
                "2. Jesus, the Saviour, reigns,\n" +
                        "The God of truth and love ;\n" +
                        "When He had purged our stains,\n" +
                        "He took His seat above :\n" +
                        "Lift up your heart, lift up your voice!\n" +
                        "Rejoice ; again I say, 'Rejoice.'",
                "3 His Kingdom cannot fail ;\n" +
                        "He rules o'er earth and heaven ;\n" +
                        "The keys of death and hell\n" +
                        "Are to our Jesus given :\n" +
                        "Lift up your heart, lift up your voice;\n" +
                        "Rejoice ; again I say, 'Rejoice.'",
                "4 He sits at God's right hand\n" +
                        "Till all His foes submit,\n" +
                        "And bow to His command,\n" +
                        "And fall beneath His feet :\n" +
                        "Lift up your heart, lift up your voice;\n" +
                        "Rejoice ; again I say, 'Rejoice.'",
                "5 Rejoice in glorious hope ;\n" +
                        "Jesus, the Judge, shall come,\n" +
                        "And take His servants up\n" +
                        "To their eternal home ;\n" +
                        "We soon shall hear the archangel's voice;\n" +
                        "The trump of God shall sound, 'Rejoice.'",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("33", "ALL hail, the power of Jesus'Name!",
                "1. ALL hail, the power of Jesus'Name!\n" +
                        "Let angels prostrate fall ;\n" +
                        "Bring forth the royal diadem,\n" +
                        "And crown Him Lord of all.",
                "2. Crown Him, ye martyrs of your God,\n" +
                        "Who from His altar call ;\n" +
                        "Extol Him in whose path ye trod,\n" +
                        "And crown Him Lord of all.",
                "3. Ye seed of Israel's chosen race,\n" +
                        "Ye ransomed of the fall,\n" +
                        "Hail Him who saves you by His grace.\n" +
                        "And crown Him Lord of all.",
                "4. Sinners, whose love can ne'er forget\n" +
                        "The wormwood and the gall,\n" +
                        "Go, spread your trophies at His feet,\n" +
                        "And crown Him Lord of all.",
                "5 Let every tongue and every tribe,\n" +
                        "Responsive to the call,\n" +
                        "To Him all majesty ascribe,\n" +
                        "And crown Him Lord of all.",
                "6 O that, with yonder sacred throng,\n" +
                        "We at His feet may fall,\n" +
                        "Join in the everlasting song,\n" +
                        "And crown Him Lord of all !",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("34", "THY Kingdom come, O God",
                "1. THY Kingdom come, O God ;\n" +
                        "Thy rule, O Christ, begin ;\n" +
                        "Break with Thine iron rod\n" +
                        "The tyrannies of sin.",
                "2. Where is Thy reign of peace\n" +
                        "And purity and love ?\n" +
                        "When shall all hatred cease,\n" +
                        "As in the realms above ?",
                "3. When comes the promised time\n" +
                        "That war shall be no more,\n" +
                        "And lust, oppression, crime,\n" +
                        "Shall flee Thy face before ?",
                "4. We pray Thee, Lord, arise,\n" +
                        "And come in Thy great might ;\n" +
                        "Revive our longing eyes,\n" +
                        "Which languish for Thy sight.",
                "5. Men scorn Thy sacred Name,\n" +
                        "And wolves devour Thy fold ;\n" +
                        "By many deeds of shame\n" +
                        "We learn that love grows cold.",
                "6. O'er heathen lands afar\n" +
                        "Thick darkness broodeth yet ;\n" +
                        "Arise, O Morning Star,\n" +
                        "Arise, and never set.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("35", "MINE eyes have seen the glory of the coming of the Lord",
                "1. MINE eyes have seen the glory of the coming of the Lord\n" +
                        "He is trampling out the vintage\n" +
                        "where the grapes of wrath are stored\n" +
                        "He hath loosed the fatal lightning of\n" +
                        "His terrible swift sword :\n" +
                        "His truth is marching on.",
                "2. He hath sounded forth the trumpet that shall never call retreat ;\n" +
                        "He is sifting out the hearts of men\n" +
                        "before His judgment-seat :\n" +
                        "O, be swift, my soul, to answer\n" +
                        "Him ; be jubilant, my feet !\n" +
                        "Our God is marching on.",
                "3. In the beauty of the lilies Christ\n" +
                        "was born across the sea,\n" +
                        "With a glory in His bosom that\n" +
                        "transfigures you and me :\n" +
                        "As He died to make men holy,\n" +
                        "let us live to make men free,\n" +
                        "While God is marching on.",
                "4. He is coming like the glory of\n" +
                        "he morning on the wave ;\n" +
                        "He is wisdom to the mighty ;\n" +
                        "He is Succour to the brave ;\n" +
                        "So the world shall be His footstool,\n" +
                        "and the soul of time His slave\n" +
                        "Our God is marching on !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("36", "O FOR a thousand tongues, to sing",
                "1. O FOR a thousand tongues, to sing\n" +
                        "My great Redeemer's praise,\n" +
                        "The glories of my God and King,\n" +
                        "The triumphs of His grace !",
                "2 My gracious Master and my God,\n" +
                        "Assist me to proclaim,\n" +
                        "To spread through all the earth abroad\n" +
                        "The honours of Thy Name.",
                "3. Jesus ! the Name that charms our fears,\n" +
                        "That bids our sorrows cease ;\n" +
                        "'Tis music in the sinner's ears,\n" +
                        "'Tis life, and health, and peace.",
                "4. He breaks the power of cancelled sin\n" +
                        "He sets the prisoner free ;\n" +
                        "His blood can make the foulest clean,\n" +
                        "His blood availed for me.",
                "5 He speaks, and, listening to His voice\n" +
                        "New life the dead receive,\n" +
                        "The mournful, broken hearts rejoice,\n" +
                        "The humble poor believe.",
                "6. Hear Him, ye deaf ; His praise, ye dumb,\n" +
                        "Your loosened tongues employ ;\n" +
                        "Ye blind, behold your Saviour come\n" +
                        "And leap, ye lame, for joy !" +
                        "\n\n" +
                        "7. Glory to God, and praise, and love\n" +
                        "Be ever, ever given\n" +
                        "By saints below and saints above,\n" +
                        "The Church in earth and heaven.\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("37", "YE servants of God, your Master proclaim,",
                "1. YE servants of God, your Master proclaim,\n" +
                        "And publish abroad His wonderful Name;\n" +
                        "The Name all-victorious of Jesus extol;\n" +
                        "His Kingdom is glorious, and rules over all.",
                "2. God ruleth on high, almighty to save;\n" +
                        "And still He is nigh, His presence we have ;\n" +
                        "The great congregation His triumph shall sing,\n" +
                        "Ascribing salvation to Jesus our King.",
                "3. Salvation to God, who sits on the throne!\n" +
                        "Let all cry aloud, and honour the son:\n" +
                        "The praises of Jesus the angels proclaim,\n" +
                        "Fall down on their faces, and worship the Lamb.",
                "4. Then let us adore, and give Him His right,\n" +
                        "All glory and power, all wisdom and might,\n" +
                        "All honour and blessing, with angels above,\n" +
                        "And thanks never-ceasing, and infinite love",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("38", "SPIRIT Divine, attend our prayers,",
                "1. SPIRIT Divine, attend our prayers,\n" +
                        "And make this house Thy home ;\n" +
                        "Descend with all Thy gracious powers\n" +
                        "O come, great Spirit, come !",
                "2. Come as the light : to us reveal\n" +
                        "Our emptiness and woe ;\n" +
                        "And lead us in those paths of life\n" +
                        "Where all the righteous go.",
                "3. Come as the fire : and purge our hearts\n" +
                        "Like sacrificial flame ;\n" +
                        "Let our whole soul an offering be\n" +
                        "To our Redeemer's Name.",
                "4. Come as the dew : and sweetly bless\n" +
                        "This consecrated hour ;\n" +
                        "May barrenness rejoice to own\n" +
                        "Thy fertilizing power.",
                "5 Come as the dove : and spread Thy wings,\n" +
                        "The wings of peaceful love ;\n" +
                        "And let Thy Church on earth become\n" +
                        "Blest as the Church above.",
                "6. Come as the wind, with rushing sound\n" +
                        "And Pentecostal grace,\n" +
                        "That all of woman born may see\n" +
                        "The glory of Thy face.\n" +
                        " \n\n" +
                        "7 Spirit Divine, attend our prayers ;\n" +
                        "Make a lost world Thy home ;\n" +
                        "Descend with all Thy gracious powers\n" +
                        "O come, great Spirit, come !",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("39", "BREATHE on me, Breath of God;",
                "1. BREATHE on me, Breath of God;\n" +
                        "Fill me with life anew,\n" +
                        "That I may love what Thou dost love,\n" +
                        "And do what Thou wouldst do.",
                "2. Breathe on me, Breath of God,\n" +
                        "Until my heart is pure,\n" +
                        "Until with Thee I will one will,\n" +
                        "To do and to endure.",
                "3 Breathe on me, Breath of God,\n" +
                        "Till I am wholly Thine,\n" +
                        "Until this earthly part of me\n" +
                        "Glows with Thy fire divine.",
                "4 Breathe on me, Breath of God ;\n" +
                        "So shall I never die,\n" +
                        "But live with Thee the perfect life\n" +
                        "Of Thine eternity.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("40", "ALL people that on earth do dwell",
                "1. ALL people that on earth do dwell\n" +
                        "Sing to the Lord with cheerful voice.\n" +
                        "Him serve with mirth, His praise forth tell;\n" +
                        "Come ye before Him and rejoice.",
                "2. Know that the Lord is God indeed;\n" +
                        "Without our aid He did us make ;\n" +
                        "We are His folk, He doth us feed,\n" +
                        "And for His sheep He doth us take.",
                "3. O enter then His gates with praise,\n" +
                        "Approach with joy His courts unto ;\n" +
                        "Praise, laud, and bless His Name always,\n" +
                        "For it is seemly so to do.",
                "4. For why the Lord our God is good;\n" +
                        "His mercy is for ever sure ;\n" +
                        "His truth at all times firmly stood,\n" +
                        "And shall from age to age endure.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("41", "THE Church's one foundation",
                "1. THE Church's one foundation\n" +
                        "Is Jesus Christ her Lord :\n" +
                        "She is His new creation\n" +
                        "By water and the word ;\n" +
                        "From heaven He came and sought her\n" +
                        "To be His holy bride;\n" +
                        "With His own blood He bought her,\n" +
                        "And for her life He died.",
                "2. Elect from every nation,\n" +
                        "Yet one o'er all the earth,\n" +
                        "Her charter of salvation\n" +
                        "One Lord, one faith, one birth :\n" +
                        "One holy Name she blesses,\n" +
                        "Partakes one holy food,\n" +
                        "And to one hope she presses,\n" +
                        "With every grace endued.",
                "3. Though with a scornful wonder3 Though with a scornful wonder\n" +
                        "Men see her sore oppressed,\n" +
                        "By schisms rent asunder,\n" +
                        "By heresies distressed,\n" +
                        "Yet saints their watch are keeping,\n" +
                        "Their cry goes up, 'How long ?'\n" +
                        "And soon the night of weeping\n" +
                        "Shall be the morn of song.",
                "4. 'Mid toil and tribulation,\n" +
                        "And tumult of her war,\n" +
                        "She waits the consummation\n" +
                        "Of peace for evermore,\n" +
                        "Till with the vision glorious\n" +
                        "Her longing eyes are blest,\n" +
                        "And the great Church victorious\n" +
                        "Shall be the Church at rest.",
                "5. Yet she on earth hath union\n" +
                        "With God the Three in One,\n" +
                        "And mystic sweet communion\n" +
                        "With those whose rest is won.\n" +
                        "O happy ones and holy !\n" +
                        "Lord, give us grace that we,\n" +
                        "Like them, the meek and lowly,\n" +
                        "On high may dwell with Thee.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));


        allItems.add( new ListNumero("42", "ABIDE with me : fast falls the eventide",
                "1. ABIDE with me : fast falls the eventide\n" +
                        "The darkness deepens ; Lord, with me abide :\n" +
                        "When other helpers fail, and comforts flee,\n" +
                        "Help of the helpless, O abide with me.",
                "2. Swift to its close ebbs out life's little day\n" +
                        "Earth's joys grow dim, its glories pass away ;\n" +
                        "Change and decay in all around I see:\n" +
                        "O Thou who changest not, abide with me.\n",
                "3. I need Thy presence every passing hour ;\n" +
                        "What but Thy grace can foil the tempter's power ?\n" +
                        "Who like Thyself my guide and stay can be ?\n" +
                        "Through cloud and sunshine, O abide with me.",
                "4. I fear no foe, with Thee at hand to bless;\n" +
                        "Ills have no weight, and tears no bitterness:\n" +
                        "Where is death's sting where, grave, thy victory ?\n" +
                        "I triumph still if Thou abide with me",
                "5. Hold Thou Thy Cross before my closing eyes,\n" +
                        "Shine through the gloom, and point me to the skies ;\n" +
                        "Heaven's morning breaks, and earth's vain shadows flee\n" +
                        "In life and death, O Lord, abide with me.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("43", "JUST as I am, without one plea",
                "1. JUST as I am, without one plea\n" +
                        "But that Thy blood was shed for me,\n" +
                        "And that Thou bidd'st me come to Thee,\n" +
                        "O Lamb of God, I come.",
                "2. Just as I am, and waiting not\n" +
                        "To rid my soul of one dark blot,\n" +
                        "To Thee, whose blood can cleanse\n" +
                        "each spot, O Lamb of God, I come.",
                "3. Just as I am, though tossed about\n" +
                        "With many a conflict, many a doubt\n" +
                        "Fightings and fears within, without,\n" +
                        "O Lamb of God, I come.",
                "4 Just as I am, poor, wretched, blind,\n" +
                        "Sight, riches healing of the mind,\n" +
                        "Yea, all I need, in Thee to find,\n" +
                        "O Lamb of God, I come.",
                "5 Just as I am, Thou wilt receive,\n" +
                        "Wilt welcome, pardon, cleanse relieve\n" +
                        "Because Thy promise I believe,\n" +
                        "O Lamb of God, I come.",
                "6 Just as I am __ Thy love unknown\n" +
                        "Has broken every barrier down __\n" +
                        "Now to be Thine, yea, Thine alone, 45\n" +
                        "O Lamb of God, I come,\n" +
                        "\n\n" +
                        "7. Just as I am, of that free love\n" +
                        "The breadth, length, depth, and height to prove,\n" +
                        "Here for a season, then above,\n" +
                        "O Lamb of God, I come.\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("44", "ROCK of Ages, cleft for me,",
                "1. ROCK of Ages, cleft for me,\n" +
                        "Let me hide myself in Thee ;\n" +
                        "Let the water and the blood,\n" +
                        "From Thy riven side which flowed,\n" +
                        "Be of sin the double cure,\n" +
                        "Cleanse me from its guilt and power.",
                "2. Not the labours of my hands\n" +
                        "Can fulfil Thy law's demands ;\n" +
                        "Could my zeal no respite know,\n" +
                        "Could my tears for ever flow,\n" +
                        "All for sin could not atone :\n" +
                        "Thou must save, and Thou alone.",
                "3. Nothing in my hand I bring,\n" +
                        "Simply to Thy Cross I cling ;\n" +
                        "Naked, come to Thee for dress ;\n" +
                        "Helpless, look to Thee for grace ;\n" +
                        "Foul, I to the fountain fly ;\n" +
                        "Wash me, saviour, or I die.",
                "4. While I hear the trumpet sound,\n" +
                        "When I meet him in the air,\n" +
                        "When I soar through tracts\n" +
                        "unknown,\n" +
                        "See Thee on Thy judgment throne,\n" +
                        "Rock of Ages, cleft for me,\n" +
                        "Let me hide myself in Thee",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("45", "JESUS, Lover of my soul",
                "1. JESUS, Lover of my soul\n" +
                        "Let me to Thy bosom fly,\n" +
                        "While the nearer waters roll,\n" +
                        "While the tempest still is high ;\n" +
                        "Hide me, O my Saviour, hide,\n" +
                        "Till the storm of life is past ;\n" +
                        "Safe into the haven guide ;\n" +
                        "O receive my soul at last !",
                "2. Other refuge have I none ;\n" +
                        "Hangs my helpless soul on Thee ;\n" +
                        "Leave, ah ! leave me not alone ;\n" +
                        "Still support and comfort me.\n" +
                        "All my trust on Thee is stayed ;\n" +
                        "All my help from Thee I bring ;\n" +
                        "Cover my defenceless head\n" +
                        "With the shadow of Thy wing.",
                "3. Thou, O Christ, art all I want ;\n" +
                        "More than all in Thee I find ;\n" +
                        "Raise the fallen, cheer the faint,\n" +
                        "Heal the sick, and lead the blind.\n" +
                        "Just and holy is Thy Name,\n" +
                        "I am all unrighteousness ;\n" +
                        "False and full of sin I am,\n" +
                        "Thou art full of truth and grace.",
                "4 Plenteous grace with Thee is found,\n" +
                        "Grace to cover all my sin ;\n" +
                        "Let the healing streams abound ;\n" +
                        "Make and keep me pure within.\n" +
                        "Thou of life the fountain art,\n" +
                        "Freely let me take of Thee ;\n" +
                        "Spring Thou up within my heart,\n" +
                        "Rise to all eternity.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("46", "HOW sweet the Name of Jesus",
                "1. HOW sweet the Name of Jesus sounds\n" +
                        "In a believer's ear !\n" +
                        "It soothes his sorrows, heals his wounds,\n" +
                        "And drives away his fear.",
                "2. It makes the wounded spirit whole,\n" +
                        "And calms the troubled breast ;\n" +
                        "'Tis manna to the hungry soul,\n" +
                        "And to the weary rest.",
                "3. Dear Name ! the rock on which I build,\n" +
                        "My shield and hiding-place,\n" +
                        "My never-failing treasury, filled\n" +
                        "With boundless stores of grace.",
                "4. Jesus, my Shepherd, Husband, Friend,\n" +
                        "My Prophet, Priest, and King,\n" +
                        "My Lord, my Life, my Way, my End,\n" +
                        "Accept the praise I bring.",
                "5 Weak is the effort of my heart,\n" +
                        "And cold my warmest thought ;\n" +
                        "But, when I see Thee as Thou art,\n" +
                        "I'll praise Thee as I ought.",
                "6. Till then I would Thy love proclaim\n" +
                        "With every fleeting breath ;\n" +
                        "And may the music of Thy Name\n" +
                        "Refresh my soul each day.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("47", "LIKE a river glorious",
                "1. LIKE a river glorious\n" +
                        "Is God's perfect peace,\n" +
                        "Over all victorious\n" +
                        "In its bright increase ;\n" +
                        "Perfect, yet it floweth\n" +
                        "Fuller every day,\n" +
                        "Perfect, yet it groweth\n" +
                        "Deeper, all the way",
                "2. Hidden in the hollow\n" +
                        "Of His blessed hand,\n" +
                        "Never foe can follow,\n$" +
                        "Never traitor stand ;\n" +
                        "Not a surge of worry,\n" +
                        "Not a shade of care,\n" +
                        "Not a blast of hurry,\n" +
                        "Touch the spirit there.",
                "3. Every joy or trial\n" +
                        "Falleth from above,\n" +
                        "Traced upon our dial\n" +
                        "By the Sun of Love.\n" +
                        "We may trust Him fully\n" +
                        "All for us to do ;\n" +
                        "They who trust Him wholly\n" +
                        "Find Him wholly true.",
                "",
                "",
                "",
                "",
                "Stayed upon Jehovah,\n" +
                        "Hearts are fully blest,\n" +
                        "Finding, as He promised,\n" +
                        "Perfect peace and rest.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("48", "PEACE, perfect peace, in this dark world of sin ?",
                "1. PEACE, perfect peace, in this dark world of sin ?\n" +
                        "The blood of Jesus whispers peace within.",
                "2. Peace, perfect peace, by thronging duties pressed ?\n" +
                        "To do the will of Jesus, this is rest",
                "3. Peace, perfect peace, with sorrows surging round ?\n" +
                        "On Jesus' bosom nought but calm is found.",
                "4. Peace, perfect peace, with loved ones far away ?\n" +
                        "In Jesus' keeping we are safe, and they.",
                "5 Peace, perfect peace, our future all unknown ?\n" +
                        "Jesus we know, and He is on the throne.",
                "6 Peace, perfect peace, death shadowing us and ours ?\n" +
                        "Jesus has vanquished death and all its powers.\n" +
                        "\n\n" +
                        "7. It is enough : earth's struggles\n" +
                        "soon shall cease,\n" +
                        "And Jesus call us to heaven's\n" +
                        "perfect peace.\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("49", "NEARER, my God, to Thee, Nearer to Thee !",
                "1. NEARER, my God, \n" +
                        "to Thee, Nearer to Thee !\n" +
                        "Even though it be a cross\n" +
                        "That raiseth me,\n" +
                        "Still all my song would be,\n" +
                        "'Nearer, my God, to Thee,\n" +
                        "Nearer to Thee !'",
                "2 Though, like the wanderer,\n" +
                        "The sun gone down,\n" +
                        "Darkness be over me,\n" +
                        "My rest a stone,\n" +
                        "Yet in my dreams I'd be\n" +
                        "Nearer, my God, to Thee,\n" +
                        "Nearer to Thee !",
                "3 There let the way appear\n" +
                        "Steps unto heaven,\n" +
                        "All that Thou send'st to me\n" +
                        "In mercy given,\n" +
                        "Angels to beckon me\n" +
                        "Nearer, my God, to Thee,\n" +
                        "Nearer to Thee !",
                "4. Then, with my waking thoughts\n" +
                        "Bright with Thy praise,\n" +
                        "Out of my stony griefs\n" +
                        "Bethel I'll raise,\n" +
                        "So by my woes to be\n" +
                        "Nearer, my God, to Thee,\n" +
                        "Nearer to Thee !",
                "5 Or if on joyful wing\n" +
                        "Cleaving the sky,\n" +
                        "Sun, moon, and stars forgot,\n" +
                        "Upwards I fly,\n" +
                        "Still all my song shall be,\n" +
                        "'Nearer, my God, to Thee,\n" +
                        "Nearer to Thee !'",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("50", "BLEST be the tie that binds",
                "1. BLEST be the tie that binds\n" +
                        "Our hearts in Jesus' love ;\n" +
                        "The fellowship of Christian minds\n" +
                        "Is like to that above.",
                "2. Before our Father's throne\n" +
                        "We pour our ardent prayers ;\n" +
                        "Our fears, our hopes, our aims are one,\n" +
                        "Our comforts, and our cares.",
                "3. When for awhile we part,\n" +
                        "This thought will soothe our pain,\n" +
                        "That we shall still be joined in heart\n" +
                        "And one day meet again.",
                "4. This glorious hope revives\n" +
                        "Our courage by the way ;\n" +
                        "While each in expectation lives,\n" +
                        "And longs to see the day.",
                "5. When from all toil and pain\n" +
                        "And sin we shall be free,\n" +
                        "And perfect love and friendship reign\n" +
                        "Through all eternity.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("51", "TAKE my life, and let it be",
                "1. TAKE my life, and let it be\n" +
                        "Consecrated, Lord, to Thee.\n" +
                        "Take my moments and my days ;\n" +
                        "Let them flow in ceaseless praise.",
                "2. Take my hands, and let them move\n" +
                        "At the impulse of Thy love.\n" +
                        "Take my feet, and let them be\n" +
                        "Swift and beautiful for Thee.",
                "3. Take my voice, and let me sing\n" +
                        "Always, only, for my King.\n" +
                        "Take my lips, and let them be\n" +
                        "Filled with messages from Thee.",
                "4. Take my silver and my gold ;\n" +
                        "Not a mite would I withhold.\n" +
                        "Take my intellect, and use\n" +
                        "Every power as Thou shalt choose.",
                "5. Take my will, and make it Thine ;\n" +
                        "It shall be no longer mine.\n" +
                        "Take my heart __ it is Thine own ;\n" +
                        "It shall be Thy royal throne.",
                "6. Take my love ; my Lord, I pour\n" +
                        "At Thy feet its treasure-store.\n" +
                        "Take myself, and I will be\n" +
                        "Ever, only, all for Thee.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("52", "A SAFE stronghold our God is still,",
                "1. A SAFE stronghold our God is still,\n" +
                        "A trusty shield and weapon ;\n" +
                        "He'll help us clear from all the ill\n" +
                        "That hath us now o'ertaken.\n" +
                        "The ancient prince of hell\n" +
                        "Hath risen with purpose fell ;\n" +
                        "Strong mail of craft and power\n" +
                        "He weareth in this hour ;\n" +
                        "On earth is not his fellow.",
                "2. With force of arms we nothing can\n" +
                        "Full soon were we down-ridden ;\n" +
                        "But for us fights the proper Man,\n" +
                        "Whom God Himself hath bidden.\n" +
                        "Ask ye who is this same ?\n" +
                        "Christ Jesus is His Name,\n" +
                        "The Lord Sabaoth's Son ;\n" +
                        "He, and no other one,\n" +
                        "Shall conquer in the battle.",
                "3. And were this world all devils o'er,\n" +
                        "And watching to devour us,\n" +
                        "We lay it not to heart so sore ;\n" +
                        "Not they can overpower us.\n" +
                        "And let the prince of ill\n" +
                        "Look grim as e'er he will,\n" +
                        "He harms us not a whit ;\n" +
                        "For why his doom is writ ;\n" +
                        "A word shall quickly slay him.",
                "4. God's word, for all their craft and force\n" +
                        "One moment will not linger,\n" +
                        "But, spite of hell, shall have its course;\n" +
                        "'Tis written by His finger.\n" +
                        "And, though they take our life,\n" +
                        "Goods, honour, children, wife,\n" +
                        "Yet is their profit small ;\n" +
                        "These things shall vanish all :\n" +
                        "The city of God remaineth.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("53", "STAND up ! stand up for Jesus,",
                "1. STAND up ! stand up for Jesus,\n" +
                        "Ye soldiers of the Cross !\n" +
                        "Lift high His royal banner ;\n" +
                        "It must not suffer loss.\n" +
                        "From victory to victory\n" +
                        "His army He shall lead,\n" +
                        "Till every foe is vanquished,\n" +
                        "And Christ is Lord indeed.",
                "2 Stand up ! stand up for Jesus !\n" +
                        "The trumpet-call obey ;\n" +
                        "Forth to the mighty conflict\n" +
                        "In this His glorious day\n" +
                        "Ye that are men, now serve Him\n" +
                        "Against unnumbered foes ;\n" +
                        "Your courage rise with danger,\n" +
                        "And strength to strength oppose.",
                "3 Stand up ! stand up for Jesus !\n" +
                        "Stand in His strength alone ;\n" +
                        "The arm of flesh will fail you ;\n" +
                        "Ye dare not trust your own.\n" +
                        "Put on the gospel armour,\n" +
                        "Each piece put on with prayer ;\n" +
                        "Where duty calls, or danger,\n" +
                        "Be never wanting there.",
                "4 Stand up ! stand up for Jesus !\n" +
                        "The strife will not be long ;\n" +
                        "This day the noise of battle,\n" +
                        "The next the victor's song.\n" +
                        "To him that overcometh\n" +
                        "A crown of life shall be ;\n" +
                        "He with the King of Glory\n" +
                        "Shall reign eternally.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("54", "ONWARD ! Christian soldiers,",
                "1. ONWARD ! Christian soldiers,\n" +
                        "Marching as to war,\n" +
                        "With the Cross of Jesus\n" +
                        "Going on before.\n" +
                        "Christ, the Royal Master,\n" +
                        "Leads against the foe ;\n" +
                        "Forward into battle,\n" +
                        "See ! His banners go.",
                "2. At the sign of triumph\n" +
                        "Satan's legions flee ;\n" +
                        "On then, Christian solders,\n" +
                        "On to victory !\n" +
                        "Hell's foundations quiver\n" +
                        "At the shout of praise ;\n" +
                        "Brothers, lift your voices,\n" +
                        "Loud your anthems raise.",
                "3. Like a mighty army\n" +
                        "Moves the Church of God ;\n" +
                        "Brothers, we are treading\n" +
                        "Where the saints have trod.\n" +
                        "We are not divided,\n" +
                        "All one body we,\n" +
                        "One in hope, in doctrine,\n" +
                        "One in charity.",
                "4. Crowns and thrones may perish,\n" +
                        "Kingdoms rise and wane,\n" +
                        "But the Church of Jesus\n" +
                        "Constant will remain ;\n" +
                        "Gates of hell can never\n" +
                        "'Gainst that Church prevail ;\n" +
                        "We have Christ's own promise,\n" +
                        "And that cannot fail.",
                "5. Onward, then, ye people !\n" +
                        "Join our happy throng ;\n" +
                        "Blend with ours your voices\n" +
                        "In the triumph song ;\n" +
                        "'Glory, laud, and honour\n" +
                        "Unto Christ the King !'\n" +
                        "This, through countless ages,\n" +
                        "Men and angels sing.",
                "",
                "",
                "Onward ! Christian soldiers,\n" +
                        "Marching as to war,\n" +
                        "With the Cross of Jesus\n" +
                        "Going on before.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("55", "JERUSALEM, my happy home",
                "1. JERUSALEM, my happy home\n" +
                        "When shall I come to thee ?\n" +
                        "When shall my sorrows have an end?\n" +
                        "Thy joys when shall I see ?",
                "2. O happy harbour of the saints !\n" +
                        "O sweet and pleasant soil !\n" +
                        "In thee no sorrow may be found,\n" +
                        "No grief, no care, no toil.",
                "3. Thy walls are made of precious\n" +
                        "stones,\n" +
                        "Thy bulwarks diamonds square ;\n" +
                        "Thy gates are of right orient pearl,\n" +
                        "Exceeding rich and rare ;",
                "4. Thy gardens and thy gallant walks\n" +
                        "Continually are green ;\n" +
                        "There grow such sweet and\n" +
                        "pleasant flowers\n" +
                        "As nowhere else are seen.",
                "5. Quite through the streets, with\n" +
                        "silver sound,\n" +
                        "The flood of life doth flow,\n" +
                        "Upon whose banks on every side\n" +
                        "The wood of life doth grow.",
                "6 Our sweet is mixed with bitter gall,\n" +
                        "Our pleasure is but pain,\n" +
                        "Our joys scarce last the looking on,\n" +
                        "Our sorrows still remain.\n" +
                        "\n\n" +
                        "7 But there they live in such delight,\n" +
                        "Such pleasure and such play,\n" +
                        "As that to them a thousand years\n" +
                        "Doth seem as yesterday.\n" +
                        "\n\n" +
                        "8 Jerusalem, my happy home,\n" +
                        "Would God I were in thee !\n" +
                        "Would God my woes were at an end,\n" +
                        "Thy joys that I might see !\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("56", "JESUS loves me ! this I know,",
                "1. JESUS loves me ! this I know,\n" +
                        "For the Bible tells me so ;\n" +
                        "Little ones to Him belong ;\n" +
                        "They are weak, but He is strong.",
                "2. Jesus loves me ! He who died\n" +
                        "Heaven's gate to open wide ;\n" +
                        "He will wash away my sin,\n" +
                        "Let His little child come in.",
                "3. Jesus loves me ! He will stay\n" +
                        "Close beside me all the way ;\n" +
                        "Then His little child will take\n" +
                        "Up to heaven, for His dear sake",
                "",
                "",
                "",
                "",
                "Yes ! Jesus loves me !\n" +
                        "The Bible tells me so.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("57", "TELL me the old, old story",
                "1. TELL me the old, old story\n" +
                        "Of unseen things above,\n" +
                        "Of Jesus and His glory,\n" +
                        "Of Jesus and His love.",
                "2. Tell me the story simply,\n" +
                        "As to a little child ;\n" +
                        "For I am weak and weary,\n" +
                        "And helpless, and defiled.",
                "3. Tell me the story slowly,\n" +
                        "That I may take it in, __\n" +
                        "That wonderful redemption,\n" +
                        "God's remedy for sin.",
                "4. Tell me the story often,\n" +
                        "For I forget so soon ;\n" +
                        "The early dew of morning\n" +
                        "Has passed away at noon.",
                "5. Tell me the story softly,\n" +
                        "With earnest tones and grave ;\n" +
                        "Remember, I'm the sinner\n" +
                        "Whom Jesus came to save.",
                "6. Tell me the story always,\n" +
                        "If you would really be,\n" +
                        "In any time of trouble,\n" +
                        "A comforter to me.\n" +
                        "\n\n" +
                        "7. Tell me the same old story\n" +
                        "When you have cause to fear\n" +
                        "That this world's empty glory\n" +
                        "Is costing me too dear.\n" +
                        "\n\n" +
                        "8. Yes, and, when that world's glory\n" +
                        "Shall dawn upon my soul,\n" +
                        "Tell me the old, old story,\n" +
                        "'Christ Jesus makes thee whole.'\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("58", "LORD, I hear of showers of",
                "1. LORD, I hear of showers of blessing\n" +
                        "Thou art scattering, full and free, __\n" +
                        "Showers, the thirsty land refreshing\n" +
                        "Let some drops descend on me, Even me.",
                "2. Pass me not. O gracious Father,\n" +
                        "Sinful though my heart may be !\n" +
                        "Thou might'st leave me, but the rather\n" +
                        "Let Thy mercy light on me, Even me.",
                "3. Pass me not, O tender Saviour !\n" +
                        "Let me love and cling to Thee ;\n" +
                        "I am longing for Thy favour ;\n" +
                        "When Thou comest, call for me, Even me.",
                "4. Pass me not, O mighty Spirit !\n" +
                        "Thou canst make the blind to see ;\n" +
                        "Witnesser of Jesus' merit,\n" +
                        "Speak the word of power to me, Even me.\n" +
                        "",
                "5. Have I long in sin been sleeping\n" +
                        "Long been slighting, grieving Thee\n" +
                        "Has the world my heart been keeping?\n" +
                        "O forgive and rescue me, Even me.",
                "6. Love of God, so pure and changeless,\n" +
                        "Blood of Christ, so rich and free,\n" +
                        "Grace of God, so strong and boundless\n" +
                        "Magnify them all in me, Even me.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("59", "I NEED Thee every hour,",
                "1. I NEED Thee every hour,\n" +
                        "Most gracious Lord ;\n" +
                        "No tender voice but Thine\n" +
                        "Can peace afford.",
                "2. I need Thee every hour ;\n" +
                        "Stay Thou near by ;\n" +
                        "Temptations lose their power\n" +
                        "When Thou art nigh.",
                "3 I need Thee every hour,\n" +
                        "In joy or pain ;\n" +
                        "Come quickly and abide,\n" +
                        "Or life is vain.",
                "4. I need Thee every hour ;\n" +
                        "Teach me Thy will ;\n" +
                        "And Thy rich promises\n" +
                        "In me fulfil.",
                "",
                "",
                "",
                "I need Thee, O I need Thee ;\n" +
                        "Every hour I need Thee ;\n" +
                        "O bless me now, my Saviour ;\n" +
                        "I come to Thee.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("60", "THROUGH the love of God our Saviour",
                "1. THROUGH the love of God our Saviour\n" +
                        "All will be well.\n" +
                        "Free and changeless is His favour;\n" +
                        "All, all is well,\n" +
                        "Precious is the blood that healed us,\n" +
                        "Perfect is the grace that sealed us,\n" +
                        "Strong the hand stretched forth to shield us ;\n" +
                        "All must be well.",
                "2. Though we pass through tribulation,\n" +
                        "All will be well.\n" +
                        "Ours is such a full salvation,\n" +
                        "All, all is well.\n" +
                        "Happy, still in God confiding,\n" +
                        "Fruitful, if in Christ abiding,\n" +
                        "Holy, through the Spirit's guiding ;\n" +
                        "All must be well.",
                "3. We expect a bright to-morrow ;\n" +
                        "All will be well.\n" +
                        "Faith can sing through days of sorrow,\n" +
                        "'All, all is well.'\n" +
                        "On our Father's love relying,\n" +
                        "Jesus every need supplying,\n" +
                        "Or in living or in dying,\n" +
                        "All must be well.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("61", "I'VE found a Friend ; O such a Friend!",
                "1. I'VE found a Friend ; O such a Friend!\n" +
                        "He loved me ere I knew Him ;\n" +
                        "He drew me with the cords of love,\n" +
                        "And thus He bound me to Him ;\n" +
                        "And round my heart still closely twine\n" +
                        "Those ties which nought can sever\n" +
                        "For I am His, and He is mine,\n" +
                        "For ever and for ever.",
                "2 I've found a Friend ; O such a Friend!\n" +
                        "He bled, He died to save me ;\n" +
                        "And not alone the gift of life,\n" +
                        "But His own self He gave me.\n" +
                        "Nought that I have mine own I'll call\n" +
                        "I'll hold it for the Giver ;\n" +
                        "My heart, my strength, my life, my all,\n" +
                        "Are His, and His for ever.",
                "3. I've found a Friend ; O such a Friend!\n" +
                        "All power to Him is given,\n" +
                        "To guard me on my onward course\n" +
                        "And bring me safe to heaven.\n" +
                        "The eternal glories gleam afar,\n" +
                        "To nerve my faint endeavour ;\n" +
                        "So now to watch, to work, to war,\n" +
                        "And then to rest for ever.",
                "4. I've found a Friend ; O such a Friend,\n" +
                        "So kind, and true, and tender !\n" +
                        "So wise a Counsellor and Guide,\n" +
                        "So mighty a Defender !\n" +
                        "From Him who loves me now so well\n" +
                        "What power my soul shall sever ?\n" +
                        "Shall life or death, shall earth or hell?\n" +
                        "No ! I am His for ever.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("62", "A MIGHTY fortress is our God,",
                "1. A MIGHTY fortress is our God,\n" +
                        "A bulwark never failing ;\n" +
                        "Our Helper He, amid the flood\n" +
                        "Of mortal ills prevailing.\n" +
                        "For still our ancient foe\n" +
                        "Doth seek to work his woe ;\n" +
                        "His craft and power are great,\n" +
                        "And armed with cruel hate \n" +
                        "On earth is not his equal.",
                "2 Did we in our own strength confide\n" +
                        "Our striving would be losing,\n" +
                        "Were not the right Man on our side\n" +
                        "The Man of God's own choosing.\n" +
                        "Dost ask who that may be ?\n" +
                        "Christ Jesus, it is He !\n" +
                        "Lord Sabaoth is His name, _n" +
                        "From age to age the same :\n" +
                        "And He must win the battle.",
                "3. And though this world, with devils filled,\n" +
                        "Should threaten to undo us :\n" +
                        "We will not fear ; for God hath willed\n" +
                        "His truth to triumph through us.\n" +
                        "Let goods and kindred go,\n" +
                        "This mortal life also ;\n" +
                        "The body they may kill :\n" +
                        "God's truth abideth still,\n" +
                        "His kingdom is for ever.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("63", "OH, worship the King,",
                "1. OH, worship the King,\n" +
                        "All glorious above !\n" +
                        "Oh, gratefully sing\n" +
                        "His power and His love ;\n" +
                        "Our Shield and Defender,\n" +
                        "The Ancient of Days,\n" +
                        "Pavilioned in splendour,\n" +
                        "And girded with praise.",
                "2. Oh, tell of His might,\n" +
                        "Oh, sing of His grace !\n" +
                        "Whose robe is the light,\n" +
                        "Whose canopy space ;\n" +
                        "His chariots of wrath\n" +
                        "The deep thunder-clouds form,\n" +
                        "And dark is His path\n" +
                        "On the wings of the storm.",
                "3. The earth with its store\n" +
                        "Of wonders untold,\n" +
                        "Almighty ! Thy power\n" +
                        "Hath founded of old :\n" +
                        "Hath 'stablished it fast\n" +
                        "By a changeless decree ;\n" +
                        "And round it hath cast,\n" +
                        "Like a mantle, the sea.",
                "4. Thy bountiful care,\n" +
                        "What tongue can recite ?\n" +
                        "It breathes in the air,\n" +
                        "It shines in the light ;\n" +
                        "It streams from the hills,\n" +
                        "It descends to the plain,\n" +
                        "And sweetly distils in\n" +
                        "The dew and the rain.",
                "5. Frail children of dust,\n" +
                        "And feeble as frail\n" +
                        "In Thee do we trust,\n" +
                        "Nor find Thee to fail :\n" +
                        "Thy mercies how tender,\n" +
                        "How firm to the end !\n" +
                        "Our Maker, Defender,\n" +
                        "Redeemer, and Friend !",
                "6. O measureless Might !\n" +
                        "Ineffable Love !\n" +
                        "While angels delight\n" +
                        "To hymn Thee above,\n" +
                        "The humbler creation,\n" +
                        "Though feeble their lays,\n" +
                        "With true adoration\n" +
                        "Shall sing to Thy praise.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("64", "TO GOD be the glory ! great things He hath done :",
                "1. TO GOD be the glory ! great things He hath done :\n" +
                        "So loved He the world that He gave us His Son ;\n" +
                        "Who yielded His life an atonement for sin,\n" +
                        "And opened the Life-gate that all may go in.",
                "2. O perfect redemption, the purchase of blood,\n" +
                        "To every believer the promise of God;\n" +
                        "The vilest offender who truly believes,\n" +
                        "That moment from Jesus a pardon receives.",
                "3. Great things He hath taught us, great things He hath done,\n" +
                        "And great our rejoicing through Jesus the Son ;\n" +
                        "But purer, and higher, and greater will be\n" +
                        "Our wonder, our transport, when Jesus we see.",
                "",
                "",
                "",
                "",
                "Praise the Lord ! Praise the Lord !\n" +
                        "Let the earth hear His voice !\n" +
                        "Praise the Lord ! Praise the Lord !\n" +
                        "Let the people rejoice !\n" +
                        "Oh, come to the Father, through\n" +
                        "Jesus the Son ;\n" +
                        "And give Him the glory __ great\n" +
                        "things He hath done !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("65", "WHILE shepherds watched their flocks by night,",
                "1. WHILE shepherds watched their flocks by night,\n" +
                        "All seated on the ground ;\n" +
                        "The angel of the Lord came down,\n" +
                        "And glory shone around.",
                "2. \"Fear not !\" said he for mighty dread\n" +
                        "Had seized their troubled mind,\n" +
                        "\"Glad tidings of great joy I bring\n" +
                        "To you and all mankind.",
                "3. \"To you, in David's town, this day,\n" +
                        "Is born of David's line\n" +
                        "The Saviour, who is Christ the Lord ;\n" +
                        "And this shall be the sign :",
                "4 \"The heavenly Babe you there shall find\n" +
                        "To human view displayed,\n" +
                        "All meanly wrapped in swathing bands\n" +
                        "And in a manger laid.\"",
                "5. Thus spake the seraph and forthwith\n" +
                        "Appeared a shining throng \n" +
                        "Of angels, praising God, who thus\n" +
                        "Addressed their joyful song :",
                "6. \"All glory be to God on high !\n" +
                        "And to the earth be peace !\n" +
                        "Goodwill henceforth from heaven to men\n" +
                        "Begin, and never cease !\"",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("66", "THOU didst leave Thy throne",
                "1. THOU didst leave Thy throne and Thy kingly crown\n" +
                        "When Thou camest to earth for me\n" +
                        "But in Bethlehem's home was there found no room\n" +
                        "For Thy holy Nativity : ",
                "2. Heaven's arches rang when the angels sang,\n" +
                        "Proclaiming Thy royal degree ;\n" +
                        "But of lowly birth cam'st Thou,Lord, on earth,\n" +
                        "And in great humility :",
                "3 The foxes found rest, and the birds had their nest\n" +
                        "In the shade of the forest tree ;\n" +
                        "But Thy couch was the sod, O Thou Son of God,\n" +
                        "In the deserts of Galilee :",
                "4. Thou camest, O Lord, with the living Word\n" +
                        "That should set Thy people free ;\n" +
                        "But with mocking scorn, and with crown of thorn,\n" +
                        "They bore Thee to Calvary :",
                "5. When heaven's arches shall ring,and her choirs shall sing\n" +
                        "At Thy coming to victory ;\n" +
                        "Let Thy voice call me home, saying, Yet there is room,\n" +
                        "There is room at My side for thee !\"",
                "",
                "",
                "Oh, come to my heart, Lord Jesus !\n" +
                        "There is room in my heart for Thee;\n" +
                        "Oh, come to my heart, Lord Jesus,come!\n" +
                        "There is room in my heart for Thee.",
                "",
                "",
                "Oh, come to my heart, Lord Jesus!\n" +
                        "Thy cross is my only plea ;\n" +
                        "Oh, come to my heart, Lord Jesus, come!\n" +
                        "Thy cross is my only plea.",
                "And my heart shall rejoice, Lord Jesus!\n" +
                        "When Thou comest and callest for me;\n" +
                        "And my heart shall rejoice, Lord Jesus!\n" +
                        "When Thou comest and callest for me.",
                ""));

        allItems.add( new ListNumero("67", "I AM so glad that our Father in",
                "1. I AM so glad that our Father in heaven\n" +
                        "Tells of His love in the Book He has given :\n" +
                        "Wonderful things in the Bible I see;\n" +
                        "This is the dearest, that Jesus loves me",
                "2. Though I forget Him, and wander away\n" +
                        "Still He doth love me wherever I stray;\n" +
                        "Back to His dear loving arms do I flee.\n" +
                        "When I remember that Jesus loves me.",
                "3. Oh, if there's only one song I can sing,\n" +
                        "When in His beauty I see the great King,\n" +
                        "This shall my song in eternity be,\n" +
                        "\"Oh, what a wonder that Jesus loves me!\"",
                "4 Jesus loves me, and I know I love Him:\n" +
                        "Love brought Him down my poor soul to redeem ;\n" +
                        "Yes, it was love made Him die on the tree:\n" +
                        "Oh, I am certain that Jesus loves me!",
                "5 If one should ask of me, how can I tell?\n" +
                        "Glory to Jesus, I know very well !\n" +
                        "God's Holy Spirit with mine doth agree,\n" +
                        "Constantly witnessing _ Jesus loves me",
                "6 In this assurance I find sweetest rest,\n" +
                        "Trusting in Jesus, I know I am blest\n" +
                        "Satan, dismayed, from my soul now doth flee,\n" +
                        "When I just tell him that Jesus loves me.",
                "",
                "I am so glad that Jesus loves me\n" +
                        "Jesus loves me, Jesus loves me,\n" +
                        "I am so glad that Jesus loves me,\n" +
                        "Jesus loves even me.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("68", "SAFE in the arms of Jesus",
                "1. S AFE in the arms of Jesus,\n" +
                        "Safe on His gentle breast,\n" +
                        "There by His love o'ershaded,\n" +
                        "Sweetly my soul shall rest.\n" +
                        "Hark ! 'tis the voice of angels\n" +
                        "Borne in a song to me,\n" +
                        "Over the fields of glory,\n" +
                        "Over the jasper sea.",
                "2. Safe in the arms of Jesus,\n" +
                        "Safe from corroding care,\n" +
                        "Safe from the world's temptations,\n" +
                        "Sin cannot harm me there.\n" +
                        "Free from the blight of sorrow,\n" +
                        "Free from my doubts and fears ;\n" +
                        "Only a few more trials,\n" +
                        "Only a few more tears.",
                "3. Jesus, my heart's dear refuge,\n" +
                        "Jesus has died for me ;\n" +
                        "Firm on the Rock of Ages\n" +
                        "Ever my trust shall be.\n" +
                        "Here let me wait with patience,\n" +
                        "Wait till the night is o'er ;\n" +
                        "Wait till I see the morning\n" +
                        "Break on the golden shore.",
                "",
                "",
                "",
                "",
                "Safe in the arms of Jesus,\n" +
                        "Safe on His gentle breast,\n" +
                        "There by His love o'ershaded.\n" +
                        "Sweetly my soul shall rest.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("69", "JESUS, the very thought of Thee",
                "1. JESUS, the very thought of Thee\n" +
                        "With sweetness fills my breast ;\n" +
                        "But sweeter far Thy face to see,\n" +
                        "And in Thy presence rest.",
                "2. Nor voice can sing, nor heart can frame,\n" +
                        "Nor can the memory find\n" +
                        "A sweeter sound than Thy blest name,\n" +
                        "O Saviour of mankind !",
                "3 Oh, hope of every contrite heart !\n" +
                        "Oh, joy of all the meek !\n" +
                        "To those who fall, how kind Thou art !\n" +
                        "How good to those who seek !",
                "4 And those who find Thee, find a bliss\n" +
                        "Nor tongue nor pen can show ;\n" +
                        "The love of Jesus, what it is\n" +
                        "None but His loved ones know.",
                "5 Jesus ! our only joy be Thou,\n" +
                        "As Thou our prize wilt be ;\n" +
                        "Jesus ! be Thou our glory now,\n" +
                        "And through eternity.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("70", "WHO is He in yonder stall,",
                "1. WHO is He in yonder stall,\n" +
                        "At whose feet the shepherds fall ?",
                "2. Who is He in deep distress,\n" +
                        "Fasting in the wilderness ?",
                "3. Who is He the people bless\n" +
                        "For His words of gentleness ?",
                "4. Who is He to whom they bring\n" +
                        "All the sick and sorrowing ?",
                "5. Who is He who stands and weeps\n" +
                        "At the grave where Lazarus sleeps?",
                "6. Who is He the gathering throng\n" +
                        "Greet with loud triumphant song ?\n" +
                        "\n" +
                        "7. Lo, at midnight, who is He\n" +
                        "Prays in dark Gethsemane ?\n" +
                        "\n" +
                        "8 Who is He on yonder tree\n" +
                        "Dies in grief and agony ?\n" +
                        "\n" +
                        "9. Who is He who from the grave\n" +
                        "Comes to succour, help, and save ?\n" +
                        "\n" +
                        "10. Who is He who from His throne\n" +
                        "Rules through all the worlds alone?\n",
                "",
                "'Tis the Lord ! O wondrous story !\n" +
                        "'Tis the Lord, the King of Glory !\n" +
                        "At His feet we humbly fall __\n" +
                        "Crown Him, crown Him Lord of all !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("71", "THE Great Physician now is near",
                "1. THE Great Physician now is near\n" +
                        "The sympathising Jesus ;\n" +
                        "He speaks the drooping heart to cheer,\n" +
                        "Oh, hear the voice of Jesus !",
                "2 Your many sins are all forgiven ;\n" +
                        "Oh, hear the voice of Jesus !\n" +
                        "Go on your way in peace to heaven,\n" +
                        "And wear a crown with Jesus.",
                "3 All glory to the risen Lamb !\n" +
                        "I now believe in Jesus ;\n" +
                        "I love the blessed Saviour's name\n" +
                        "I love the name of Jesus.",
                "4 His name dispels my guilt and fear\n" +
                        "No other name but Jesus ;\n" +
                        "Oh, how my soul delights to hear\n" +
                        "The precious name of Jesus.",
                "5 Come, brethren, help me sing His praise,\n" +
                        "Oh, praise the name of Jesus !\n" +
                        "Come, sisters, all your voices raise\n" +
                        "Oh, bless the name of Jesus !",
                "6 The children, too, both great and small,\n" +
                        "Who love the name of Jesus,\n" +
                        "May now accept the gracious call\n" +
                        "To work and live for Jesus.\n" +
                        "\n\n" +
                        "7. And when to the bright world above\n" +
                        "We rise to see our Jesus,\n" +
                        "We'll sing around the throne of love\n" +
                        "His name, the name of Jesus.\n",
                "",
                "Sweetest note in seraph song,\n" +
                        "Sweetest name on mortal tongue,\n" +
                        "Sweetest carol ever sung :\n" +
                        "Jesus ! blessed Jesus !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("72", "TAKE the name of Jesus with you",
                "1. TAKE the name of Jesus with you\n" +
                        "Child of sorrow and of woe ;\n" +
                        "It will joy and comfort give you\n" +
                        "Take it then where'er you go.",
                "2. Take the name of Jesus ever,\n" +
                        "As a shield from every snare ;\n" +
                        "If temptations round you gather,\n" +
                        "Breathe that holy name in prayer.",
                "3. Oh, the precious name of Jesus !\n" +
                        "How it thrills our souls with joy,\n" +
                        "When His loving arms receive us,\n" +
                        "And His songs our tongues employ.",
                "4. At the name of Jesus bowing,\n" +
                        "Falling prostrate at His feet,\n" +
                        "King of kings in heaven we'll crown Him\n" +
                        "When our journey is complete.",
                "",
                "",
                "",
                "Precious name,.. oh, how sweet !..\n" +
                        "Hope of earth and joy of heaven !\n" +
                        "Precious name,.. oh, how sweet !..\n" +
                        "Hope of earth and joy of heaven.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("73", "MAN of Sorrows, what a name",
                "1. \" M AN of Sorrows,\" what a name\n" +
                        "For the Son of God, who came\n" +
                        "Ruined sinners to reclaim !\n" +
                        "Hallelujah ! what a Saviour !",
                "2. Bearing shame and scoffing rude,\n" +
                        "In my place condemned He stood ;\n" +
                        "Sealed my pardon with His blood :\n" +
                        "Hallelujah ! what a Saviour !",
                "3. Guilty, vile, and helpless, we ;\n" +
                        "Spotless Lamb of God was He :\n" +
                        "\"Full atonement !\" --can it be ?\n" +
                        "Hallelujah ! what a Saviour !",
                "4. \"Lifted up\" was He to die,\n" +
                        "\"It is finished !\" was His cry ;\n" +
                        "Now in heaven exalted high :\n" +
                        "Hallelujah ! what a Saviour !",
                "5. When He comes, our glorious King,\n" +
                        "All His ransomed home to bring,\n" +
                        "Then anew this song we'll sing :\n" +
                        "Hallelujah ! what a Saviour !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("74", "JOY to the world ; the Lord is come!",
                "1. JOY to the world ; the Lord is come!\n" +
                        "Let earth receive her King ;\n" +
                        "Let every heart prepare Him room,\n" +
                        "And heaven and nature sing.",
                "2. Joy to the world ; the Saviour reigns!\n" +
                        "Let men their songs employ ;\n" +
                        "While fields and floods, rocks, hills, and plains,\n" +
                        "Repeat the sounding joy.",
                "3. He rules the world with truth and grace;\n" +
                        "And makes the nations prove\n" +
                        "The glories of His righteousness,\n" +
                        "And wonders of His love.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("75", "BLESSÈD be the Fountain of blood",
                "1. BLESSÈD be the Fountain of blood,\n" +
                        "To a world of sinners revealed ;\n" +
                        "Blessed be the dear Son of God :\n" +
                        "Only by His stripes we are healed,\n" +
                        "Tho' I've wandered far from His fold,\n" +
                        "Bringing to my heart pain and woe,\n" +
                        "Wash me in the Blood of the Lamb\n" +
                        "And I shall be whiter than snow !",
                "2. Thorny was the crown that He wore,\n" +
                        "And the cross His body o'ercame ;\n" +
                        "Grievous were the sorrows He bore,\n" +
                        "But He suffered not thus in vain.\n" +
                        "May I to that Fountain be led,\n" +
                        "Made to cleanse my sins here below!\n" +
                        "Wash me in the Blood that He shed,\n" +
                        "And I shall be whiter than snow !",
                "3. Father, I have wandered from Thee\n" +
                        "Often has my heart gone astray ;\n" +
                        "Crimson do my sins seem to me\n" +
                        "Water cannot wash them away.\n" +
                        "Jesus, to that Fountain of Thine,\n" +
                        "Leaning on Thy promise I go ;\n" +
                        "Cleanse me by Thy washing divine\n" +
                        "And I shall be whiter than snow !",
                "",
                "",
                "",
                "",
                "Whiter than the snow,...\n" +
                        "Whi ter than the snow,...\n" +
                        "Wash me in the Blood of the Lamb,.\n" +
                        "And I shall be whiter than snow !...",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("76", "LOOK, ye saints, the sight is glorious:",
                "1. LOOK, ye saints, the sight is glorious:\n" +
                        "See the \"Man of Sorrows\" now\n" +
                        "From the fight return victorious :\n" +
                        "Every knee to Him shall bow !",
                "2 Crown the Saviour ! angels, crown Him!\n" +
                        "Rich the trophies Jesus brings :\n" +
                        "In the seat of power enthrone Him,\n" +
                        "While the vault of heaven rings.",
                "3. Sinners in derision crowned Him,\n" +
                        "Mocking thus the Saviour's claim ;\n" +
                        "Saints and angels crowd around Him,\n" +
                        "Own His title, praise His name.",
                "4. Hark the bursts of acclamation !\n" +
                        "Hark those loud triumphant chords!\n" +
                        "Jesus takes the highest station ;\n" +
                        "Oh, what joy the sight affords !",
                "",
                "",
                "",
                "Crown Him ! crown Him !\n" +
                        "Angels, crown Him !\n" +
                        "Crown the Saviour \"King of kings !\"",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("77", "THERE is a fountain filled with blood",
                "1. THERE is a fountain filled with blood,\n" +
                        "Drawn from Immanuel's veins,\n" +
                        "And sinners plunged beneath that flood\n" +
                        "Lose all their guilty stains.",
                "2. The dying thief rejoiced to see\n" +
                        "That fountain in his day ;\n" +
                        "And there may I, though vile as he,\n" +
                        "Wash all my sins away.",
                "3. E'er since by faith I saw the stream\n" +
                        "Thy flowing wounds supply,\n" +
                        "Redeeming love has been my theme,\n" +
                        "And shall be till I rise.",
                "4. Then in a nobler, sweeter song\n" +
                        "I'll sing Thy power to save,\n" +
                        "When this poor lisping, stammering tongue\n" +
                        "Will praise the Son You gave",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("78", "RIDE on ! ride on in majesty !",
                "1. RIDE on ! ride on in majesty !\n" +
                        "Hark ! all the tribes hosanna cry !\n" +
                        "O Saviour meek, pursue Thy road\n" +
                        "With palms and scattered garments strewed.",
                "2. Ride on ! ride on in majesty !\n" +
                        "The angel armies of the sky\n" +
                        "Look down with sad and wondering eyes.\n" +
                        "To see th'approaching Sacrifice.",
                "3. Ride on ! ride on in majesty !\n" +
                        "The last and fiercest strife is nigh ;\n" +
                        "The Father on His sapphire throne\n" +
                        "Awaits His own anointed Son.",
                "4. Ride on ! ride on in majesty !\n" +
                        "In lowly pomp ride on to die ;\n" +
                        "Bow Thy meek head to mortal pain\n" +
                        "Then take, O God, Thy power, and reign.",
                "",
                "",
                "",
                "Ride on !.. ride on..in majesty !..\n" +
                        "In lowly pomp .. ride on .. to die !..",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("79", "WOULD you be free from your burden of sin ?",
                "1. WOULD you be free from your burden of sin ?\n" +
                        "There's power in the blood, power in the blood ;\n" +
                        "Would you o'er evil a victory win ?\n" +
                        "There's wonderful power in the blood.",
                "2. Would you be free from your Passion and pride ?\n" +
                        "There's power in the blood, power in the blood ;\n" +
                        "Come for a cleansing to Calvary's tide,\n" +
                        "There's wonderful power in the blood.",
                "3. Would you be whiter, much whiter than snow ?\n" +
                        "There's power in the blood, power in the blood ;\n" +
                        "Sin-stains are lost in its life-giving flow,\n" +
                        "There's wonderful power in the blood.",
                "4. Would you do service for Jesus your King ?\n" +
                        "There's power in the blood, power in the blood ;\n" +
                        "Would you live daily His praises to sing?\n" +
                        "There's wonderful power in the blood.",
                "",
                "",
                "",
                "There is power,...\n" +
                        "power, wonder-working power\n" +
                        "In the blood ... of the Lamb ;...\n" +
                        "There is power,...\n" +
                        "power, wonder-working power\n" +
                        "In the precious blood of the Lamb.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("80", "LOW in the grave He lay",
                "1. LOW in the grave He lay\n" +
                        "Jesus, my Saviour !\n" +
                        "Waiting the coming day\n" +
                        "Jesus, my Lord !",
                "2. Vainly they watch His bed\n" +
                        "Jesus, my Saviour !\n" +
                        "Vainly they seal the dead\n" +
                        "Jesus, my Lord !",
                "3 Death cannot keep his prey\n" +
                        "Jesus, my Saviour !\n" +
                        "He tore the bars away\n" +
                        "Jesus, my Lord !",
                "",
                "",
                "",
                "",
                "Up from the grave He arose,...\n" +
                        "With a mighty triumph o'er His foes;...\n" +
                        "He arose a Victor from the dark domain,\n" +
                        "And He lives for ever with His saints to reign :\n" +
                        "He arose !... He arose !...\n" +
                        "Hallelujah ! Christ arose !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("81", "CHRIST hath risen ! Hallelujah !",
                "1. C HRIST hath risen ! Hallelujah !\n" +
                        "Blessed morn of life and light !\n" +
                        "Lo, the grave is rent asunder,\n" +
                        "Death is conquered through His might.",
                "2 Christ hath risen ! Hallelujah !\n" +
                        "Friends of Jesus, dry your tears ;\n" +
                        "Through the vail of gloom and darkness.\n" +
                        "Lo, the Son of God appears !",
                "3 Christ hath risen ! Hallelujah !\n" +
                        "He hath risen, as He said ;\n" +
                        "He is now the King of glory,\n" +
                        "And our great exalted Head.",
                "",
                "",
                "",
                "",
                "Christ is risen ! Hallelujah !\n" +
                        "Gladness fills the world to-day ;\n" +
                        "From the tomb that could not hold Him\n" +
                        "See, the stone is rolled away !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("82", "OH, spread the tidings round,",
                "1 O H, spread the tidings round,\n" +
                        "Wherever man is found,\n" +
                        "Wherever human hearts and\n" +
                        "human woes abound ;\n" +
                        "Let every Christian tongue\n" +
                        "proclaim the Joyful sound :\n" +
                        "The Comforter has come !",
                "2 The long, long, night is past,\n" +
                        "The morning breaks at last ;\n" +
                        "And hushed the dreadful wail\n" +
                        "And fury of the blast,\n" +
                        "As o'er the golden hills\n" +
                        "The day advances fast :\n" +
                        "The Comforter has come !",
                "3 The mighty King of kings,\n" +
                        "With healing in His wings,\n" +
                        "To every captive soul\n" +
                        "A full deliverance brings ;\n" +
                        "And through the vacant cells\n" +
                        "The song of triumph rings :\n" +
                        "The Comforter has come !",
                "4 Oh, boundless love divine !\n" +
                        "How shall this tongue of mine\n" +
                        "To wondering mortals tell\n" +
                        "The matchless grace divine __\n" +
                        "That I may with Him dwell,\n" +
                        "And in His image shine ! __\n" +
                        "The Comforter has come !",
                "5 Oh, let the echoes fly\n" +
                        "Above the vaulted sky,\n" +
                        "And all the saints above\n" +
                        "To all below reply\n" +
                        "In strains of endless love,\n" +
                        "The song that ne'er will die :\n" +
                        "The Comforter has come !",
                "",
                "",
                "The Comforter has come,\n" +
                        "the Comforter has come !\n" +
                        "The Holy Ghost from heaven,\n" +
                        "the Father's promise given ;\n" +
                        "Oh, spread the tidings round,\n" +
                        "wherever man is found :\n" +
                        "The Comforter has come !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("83", "PRAISE Him ! Praise Him ! Jesus,",
                "1 PRAISE Him ! Praise Him ! Jesus, our blessed Redeemer !\n" +
                        "Sing, O earth __ His wonderful love proclaim !\n" +
                        "Hail Him ! hail Him ! highest archangels in glory ;\n" +
                        "Strength and honour give to His holy name !\n" +
                        "Like a shepherd, Jesus will guard His children,\n" +
                        "In His arms He carries them all day long;",
                "2. Praise Him ! praise Him ! Jesus, our blessed Redeemer !\n" +
                        "For our sins He suffered, and bled, and died ;\n" +
                        "He __ our Rock, our hope of eternal salvation,\n" +
                        "Hail Him ! Hail Him ! Jesus, the Crucified !\n" +
                        "Sound His praises-Jesus who bore our sorrows,\n" +
                        "Love unbounded, wonderful, deep, and strong ;",
                "3. Praise Him ! praise Him ! Jesus, our blessed Redeemer !\n" +
                        "Heavenly portals, loud with hosannas ring!\n" +
                        "Jesus, Saviour, reigneth for ever and ever:\n" +
                        "Crown Him ! Crown Him ! Prophet, and Priest, and King !\n" +
                        "Christ is coming, over the world victorious,\n" +
                        "Power and glory unto the Lord belong;",
                "",
                "",
                "",
                "",
                "Praise Him ! praise Him ! tell of His excellent greatness\n" +
                        "Praise Him ! Praise Him ever in Joyful song !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("84", "GLORIOUS things of thee are spoken,",
                "1. GLORIOUS things of thee are spoken,\n" +
                        "Zion, city of our God !\n" +
                        "He, whose word cannot be broken\n" +
                        "Formed thee for His own abode.\n" +
                        "On the Rock of Ages founded,\n" +
                        "What can shake thy sure repose ?\n" +
                        "Whith salvation's walls surrounded\n" +
                        "Thou may'st smile at all thy foes.",
                "2 See, the streams of living waters,\n" +
                        "Springing from eternal love,\n" +
                        "Well supply thy sons and daughters,\n" +
                        "And all fear of want remove :\n" +
                        "Who can faint, while such a river\n" +
                        "Ever flows their thirst t'assuage ?\n" +
                        "Grace, witch, like the Lord, the giver,\n" +
                        "Never fails from age to age.",
                "3. Round each habitation hovering,\n" +
                        "See the cloud and fire appear !\n" +
                        "For a glory and a covering,\n" +
                        "Showing that the Lord is near ;\n" +
                        "He who gives them daily manna,\n" +
                        "He who listens when they cry\n" +
                        "Let Him hear the loud hosanna,\n" +
                        "Rising to His throne on high.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("85", "HARK, hark ! my soul ! angelic songs are swelling",
                "1. HARK, hark ! my soul ! angelic songs are swelling\n" +
                        "O'er earth's green fields and ocean's wave-beat shore ;\n" +
                        "How sweet the truth those blessed strains are telling\n" +
                        "Of that new life when sin shall be no more.",
                "2. Far, far away, like bells at evening pealing,\n" +
                        "The voice of Jesus sounds o'er l and sea,\n" +
                        "And laden souls, by thousands meekly stealing,\n" +
                        "Kind Shepherd, turn their weary steps to Thee.",
                "3. Onward we go, for still we hear them singing,\n" +
                        "\"Come, weary' souls ! for Jesus bids you come\" ;\n" +
                        "And through the dark, its echoes sweetly ringing,\n" +
                        "The music of the Gospel leads us home.",
                "",
                "",
                "",
                "",
                "Angels, sing on ! your faithful watches keeping ;\n" +
                        "Sing us sweet fragments of the songs above ;\n" +
                        "Till morning's Joy shall end the night of weeping,\n" +
                        "And life's long shadows break in cloudless love.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("86", "MY faith looks up to Thee,",
                "1. MY faith looks up to Thee,\n" +
                        "Thou Lamb of Calvary,\n" +
                        "Saviour divine ;\n" +
                        "Now hear me while I pray ;\n" +
                        "Take all my guilt away ;\n" +
                        "Oh, let me from this day\n" +
                        "Be wholly Thine.",
                "2. May Thy rich grace impart\n" +
                        "Strength to my fainting heart,\n" +
                        "My zeal inspire :\n" +
                        "As Thou hast died for me,\n" +
                        "Oh, may my love to Thee\n" +
                        "Pure, warm, and changeless be\n" +
                        "A living fire.",
                "3. While life's dark maze I tread,\n" +
                        "And griefs around me spread,\n" +
                        "Be Thou my Guide :\n" +
                        "Bid darkness turn to day,\n" +
                        "Wipe sorrow's tears away ;\n" +
                        "Nor let me ever stray\n" +
                        "From Thee aside.",
                "4. When ends life's transient dream\n" +
                        "When death's cold, sullen stream\n" +
                        "Shall o'er me roll\n" +
                        "Blest Saviour, then in love,\n" +
                        "Fear and distrust remove ;\n" +
                        "Oh, bear me safe above\n" +
                        "A ransomed soul.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("87", "NOW the day is over,",
                "1. NOW the day is over,\n" +
                        "Night is drawing nigh,\n" +
                        "Shadows of the evening\n" +
                        "Steal across the sky.",
                "2. Jesus, give the weary\n" +
                        "Calm and sweet repose ;\n" +
                        "With Thy tenderest blessing\n" +
                        "May our eyelids close.",
                "3. Through the long night-watches\n" +
                        "May Thine angels spread\n" +
                        "Their white wings above us,\n" +
                        "Watching round each bed.",
                "4. When the morning wakens,\n" +
                        "Then may I arise\n" +
                        "Pure, and fresh, and sinless\n" +
                        "In Thy holy eyes.",
                "5. Glory to the Father,\n" +
                        "Glory to the Son,\n" +
                        "And to Thee, blest Spirit,\n" +
                        "Whilst all ages run.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("88", "GOD be with you till we meet again!",
                "1. GOD be with you till we meet again!\n" +
                        "By His counsels guide, uphold you,\n" +
                        "With His sheep securely fold you ;\n" +
                        "God be with you till we meet again!",
                "2. God be with you till we meet again!\n" +
                        "'Neath His wings securely hide you\n" +
                        "Daily manna still provide you ;\n" +
                        "God be with you till we meet again!",
                "3. God be with you till we meet again!\n" +
                        "When life's perils thick confound you,\n" +
                        "Put His loving arms around you ;\n" +
                        "God be with you till we meet again!",
                "4. God be with you till we meet again!\n" +
                        "Keep love's banner floating o'er you,\n" +
                        "Smite death's threatening wave before you;\n" +
                        "God be with you till we meet again!",
                "",
                "",
                "",
                "Till we meet !... Till we meet !...\n" +
                        "Till we meet at Jesus' feet ;...\n" +
                        "Till we meet !... Till we meet !...\n" +
                        "God be with you till we meet again!",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("89", "SUN of my soul, Thou Saviour dear,",
                "1. SUN of my soul, Thou Saviour dear,\n" +
                        "It is not night if Thou be near ;\n" +
                        "Oh, may no earth-born cloud arise,\n" +
                        "To hide Thee from Thy servant's eyes!",
                "2. When the soft dews of kindly sleep\n" +
                        "My wearied eyelids gently steep,\n" +
                        "Be my last thought How sweet to rest\n" +
                        "For ever on my Saviour's breast !",
                "3. Abide with me from morn till eve,\n" +
                        "For without Thee I cannot live ;\n" +
                        "Abide with me when night is nigh,\n" +
                        "For without Thee I dare not die.",
                "4. If some poor wandering child of Thine\n" +
                        "Have spurned to-day the voice Divine,\n" +
                        "Now, Lord, the gracious work begin,\n" +
                        "Let him no more lie down in sin.",
                "5. Come near and bless us when we wake,\n" +
                        "Ere through the world our way we take;\n" +
                        "Till, in the ocean of Thy love,\n" +
                        "We lose ourselves in heaven above.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("90", "SWEET hour of prayer ! sweet hour of prayer !",
                "1. SWEET hour of prayer ! sweet hour of prayer !\n" +
                        "That calls me from a world of care,\n" +
                        "And bids me at my Father's throne\n" +
                        "Make all my wants and wishes known.\n" +
                        "In seasons of distress and grief,\n" +
                        "My soul has often found relief,\n" +
                        "And oft escaped the tempter's snare,\n" +
                        "By thy return, sweet hour of prayer!",
                "2. Sweet hour of prayer ! sweet hour of prayer !\n" +
                        "Thy wings shall my petition bear\n" +
                        "To Him whose truth and faithfulness\n" +
                        "Engage the waiting soul to bless ;\n" +
                        "And since He bids me seek His face,\n" +
                        "Believe His word, and trust His grace,\n" +
                        "I'll cast on Him my every care,\n" +
                        "And wait for thee, sweet hour of prayer!",
                "3. Sweet hour of prayer ! sweet hour of prayer !\n" +
                        "May I thy consolation share,\n" +
                        "Till, from Mount Pisgah's lofty height,\n" +
                        "I view my home and take my flight.\n" +
                        "This robe of flesh I'll drop, and rise\n" +
                        "To seize the everlasting prize ;\n" +
                        "And shout, while passing through the air,\n" +
                        "\"Farewell, farewell, sweet hour of prayer!\"",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("91", "COME, my soul, thy suit prepare",
                "1. COME, my soul, thy suit prepare;\n" +
                        "Jesus loves to answer prayer :\n" +
                        "He Himself has bid thee pray,\n" +
                        "Therefore will not say thee nay.",
                "2. Thou art coming to a King ;\n" +
                        "Large petitions with thee bring ;\n" +
                        "For His grace and power are such,\n" +
                        "None can ever ask too much.",
                "3. With my burden I begin\n" +
                        "Lord, remove this load of sin ;\n" +
                        "Let thy blood, for sinners spilt,\n" +
                        "Set my conscience free from guilt.",
                "4. Lord, I come to Thee for rest\n" +
                        "Take possession of my breast,\n" +
                        "There Thy blood-bought right maintain,\n" +
                        "And without a rival reign.",
                "5 While I am a pilgrim here\n" +
                        "Let Thy love my spirit cheer ;\n" +
                        "As my Guide, my Guard, my Friend\n" +
                        "Lead me to my Journey's end.",
                "6. Show me what I have to do,\n" +
                        "Every hour my strength renew ;\n" +
                        "Let me live a life of faith,\n" +
                        "Let me die Thy people's death.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("92", "O WANDERER from thy Father's house,",
                "1. O WANDERER from thy Father's house,\n" +
                        "Why wilt thou longer roam ?\n" +
                        "Return ! oh, hear the gentle voice\n" +
                        "That bids thee now come home.",
                "2. To Jesus come _ oh, trust His word\n" +
                        "And on His name believe ;\n" +
                        "Forsake thy sins, and thro' His blood\n" +
                        "Eternal life receive.",
                "3.The gracious Saviour calls thee now\n" +
                        "To feast upon His love ;\n" +
                        "And of the living water drink,\n" +
                        "And all His mercy prove.",
                "4. The Church, His bride, invites thee now,\n" +
                        "To own her risen Lord ;\n" +
                        "For, \"Whosoever will may come.\"\n" +
                        "Is God's eternal word.",
                "",
                "",
                "",
                "\"The Spirit and the bride say, Come!..\n" +
                        "And let him that heareth say, Come!..\n" +
                        "And let him that is athirst come,\n" +
                        "And whosoever will, let him take the\n" +
                        "water of life freely.\"",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("93", "HARK, my soul ! it is the Lord ;",
                "1. HARK, my soul ! it is the Lord ;\n" +
                        "'Tis thy Saviour, hear His word ;\n" +
                        "Jesus speaks, and speaks to thee\n" +
                        "\"Say, poor sinner, lov'st thou Me ?\"",
                "2. \"I delivered thee when bound,\n" +
                        "And, when bleeding, healed thy wound;\n" +
                        "Sought thee wandering, set thee right;\n" +
                        "Turned thy darkness into light.",
                "3. \"Can a woman's tender care\n" +
                        "Cease towards the child she bare?\n" +
                        "Yes ! she may forgetful be ;\n" +
                        "Yet will I remember thee.",
                "4. \"Mine is an unchanging love,\n" +
                        "Higher than the heights above ;\n" +
                        "Deeper than the depths beneath,\n" +
                        "Free and faithful, strong as death.",
                "5. \"Thou shalt see My glory soon,\n" +
                        "When the work of grace is done ;\n" +
                        "Partner of My throne shalt be ;\n" +
                        "Say, poor sinner, lov'st thou Me ?\"",
                "6. Lord, it is my chief complaint\n" +
                        "That my love is weak and faint ;\n" +
                        "Yet, I love Thee and adore ;\n" +
                        "Oh, for grace to love Thee more !",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("94", "COME unto Me, ye weary,",
                "1. COME unto Me, ye weary,\n" +
                        "And I will give you rest.\n" +
                        "Oh, blessed voice of Jesus,\n" +
                        "Which comes to hearts opprest !\n" +
                        "It tells of benediction ;\n" +
                        "Of pardon, grace, and peace ;\n" +
                        "Of Joy that hath no ending ;\n" +
                        "Of love which cannot cease.",
                "2. \"Come unto Me, ye wanderers,\n" +
                        "And I will give you light.\"\n" +
                        "Oh, loving voice of Jesus,\n" +
                        "Which comes to cheer the night !\n" +
                        "Our hearts were filled with sadness\n" +
                        "And we had lost our way ;\n" +
                        "But He has brought us gladness,\n" +
                        "And songs at break of day.",
                "3. \"Come unto Me, ye fainting,\n" +
                        "And I will give you life.\"\n" +
                        "Oh, cheering voice of Jesus,\n" +
                        "Which comes to aid our strife :\n" +
                        "The foe is stern and eager,\n" +
                        "The fight is fierce and long,\n" +
                        "But He has made us mighty,\n" +
                        "And stronger than the strong.",
                "4. \"And whosoever cometh\n" +
                        "I will not cast him out.\"\n" +
                        "Oh, welcome voice of Jesus,\n" +
                        "Which drives away our doubt :\n" +
                        "Which calls us __ very sinners,\n" +
                        "Unworthy though we be\n" +
                        "Of love so free and boundless __\n" +
                        "To come, dear Lord, to Thee !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("95", "COME, ye sinners, poor and",
                "1. COME, ye sinners, poor and needy,\n" +
                        "Weak and wounded, sick and sore;\n" +
                        "Jesus ready stands to save you,\n" +
                        "Full of pity, love, and power.\n" +
                        "He is able ;\n" +
                        "He is willing : doubt no more.",
                "2. Now ye needy, come and welcome ;\n" +
                        "God's free bounty glorify :\n" +
                        "True belief and true repentance\n" +
                        "Every grace that brings you nigh\n" +
                        "Without money,\n" +
                        "Come to Jesus Christ and buy.",
                "3. Let not conscience make you linger,\n" +
                        "Nor of fitness fondly dream ;\n" +
                        "All the fitness He requireth\n" +
                        "Is to feel your need of Him :\n" +
                        "This He gives you\n" +
                        "'Tis the Spirit's rising beam ;",
                "4. Come, ye weary, heavy-laden,\n" +
                        "Bruised and ruined by the Fall ;\n" +
                        "If you tarry till you're better,\n" +
                        "You will never come at all :\n" +
                        "Not the righteous\n" +
                        "Sinners, Jesus came to call,",
                "5. View Him prostrate in the garden,\n" +
                        "On the ground your Maker lies !\n" +
                        "On the bloody tree behold Him,\n" +
                        "Hear Him cry before He dies\n" +
                        "\"It is finished !\"\n" +
                        "Sinner, will not this suffice ?",
                "6. Lo, th'incarnate God, ascended,\n" +
                        "Pleads the merit of His blood ;\n" +
                        "Venture on Him, venture wholly,\n" +
                        "Let no other trust intrude :\n" +
                        "None but Jesus\n" +
                        "Can do helpless sinners good.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("96", "HAVE you been to Jesus for the",
                "1. HAVE you been to Jesus for the cleansing power ?\n" +
                        "Are you washed in the blood of the Lamb?\n" +
                        "Are you fully trusting in His grace this hour ?\n" +
                        "Are you washed in the blood of the Lamb?",
                "2. Are you walking daily by the Saviour's side ?\n" +
                        "Are you washed in the blood of the Lamb?\n" +
                        "Do you rest each moment in the Crucified?\n" +
                        "Are you washed in the blood of the Lamb?",
                "3. When the Bridegroom cometh will your robes be white ?\n" +
                        "Pure and w hite in the blood of the Lamb?\n" +
                        "Will your soul be ready for the mansions bright,\n" +
                        "And be washed in the blood of the Lamb?",
                "4. Lay aside the garments that are stained with sin,\n" +
                        "And be washed in the blood of the Lamb!\n" +
                        "There's a fountain flowing for the soul unclean\n" +
                        "Oh, be washed in the blood of the Lamb!",
                "",
                "",
                "",
                "Are you washed... in the blood,...\n" +
                        "In the soul-cleansing blood of the Lamb ?...\n" +
                        "Are your garments spotless ? \n" +
                        "Are they white as snow ?\n" +
                        "Are you washed in the blood of the Lamb?",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("97", "SINNERS Jesus will receive ;",
                "1. SINNERS Jesus will receive ;\n" +
                        "Sound this word of grace to all\n" +
                        "Who the heavenly pathway leave,\n" +
                        "All who linger, all who fall !",
                "2. Come : and He will give you rest ;\n" +
                        "Trust Him : for His word is plain ;\n" +
                        "He will take the sinfulest :\n" +
                        "Christ receiveth sinful men.",
                "3. Now my heart condemns me not,\n" +
                        "Pure before the law I stand ;\n" +
                        "He who cleansed me from all spot,\n" +
                        "Satisfied its last demand.",
                "4 Christ receiveth sinful men,\n" +
                        "Even me with all my sin ;\n" +
                        "Purged from every spot and stain,\n" +
                        "Heaven with Him I enter in.",
                "",
                "",
                "",
                "Sing it o'er... and o'er again :...\n" +
                        "Christ receiv eth sinful men ;...\n" +
                        "Make the message clear and plain:\n" +
                        "Christ receiveth sinful men.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("98", "ART thou weary ? art thou languid ?",
                "1. ART thou weary ? art thou languid ?\n" +
                        "Art thou sore distrest ?\n" +
                        "\"Come to Me,\" saith One ; \"and coming,\n" +
                        "Be at rest !\"",
                "2. Hath He marks to lead me to Him,\n" +
                        "If He be my guide ?\n" +
                        "\"In His feet and hands are wound-prints, And His side.\"",
                "3. Is there diadem as Monarch\n" +
                        "That His brow adorns ?\n" +
                        "\"Yea, a crown, in very surety, But of thorns.\"",
                "4. If I find Him, if I follow,\n" +
                        "What His guerdon here ?\n" +
                        "\"Many a sorrow, many a labour, Many a tear.\"",
                "5. If I still hold closely to Him,\n" +
                        "What hath He at last ?\n" +
                        "\"Sorrow vanquished, labour ended, Jordan passed.\"",
                "6 If I ask Him to receive me, \n" +
                        "Will He say me nay ?\n" +
                        "\"Not till earth, and not till heaven, Pass away.\"\n" +
                        "\n" +
                        "7. Finding, following, keeping, struggling,\n" +
                        "Is He sure to bless ?\n" +
                        "\"Saints, Apostles, Prophets, Martyrs,\n" +
                        "Answer Yes !\"\n",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("99", "I'VE a message from the Lord,",
                "1. I'VE a message from the Lord, Hallelujah!\n" +
                        "The message unto you I'll give ;\n" +
                        "'Tis recorded in His Word, Hallelujah!\n" +
                        "It is only that you \"look and live.\"",
                "2. I've a message full of love Hallelujah!\n" +
                        "A message, O my friend, for you ;\n" +
                        "'Tis a message from above, Hallelujah!\n" +
                        "Jesus said it  and I know 'tis true !",
                "3. Life is offered unto thee, Hallelujah!\n" +
                        "Eternal life thy soul shall have,\n" +
                        "If you'll only look to Him, Hallelujah!\n" +
                        "Look to Jesus, who alone can save",
                "",
                "",
                "",
                "",
                "\"Look and live,\" ... my brother, live!...\n" +
                        "Look to Jesus now and live ;\n" +
                        "'Tis recorded in His Word, Hallelujah!\n" +
                        "It is only that you \"look and live !\"",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("100", "SOFTLY and tenderly Jesus is calling",
                "1. SOFTLY and tenderly Jesus is calling\n" +
                        "Calling for you and for me ;\n" +
                        "Patiently Jesus is waiting and watching\n" +
                        "Watching for you and for me !",
                "2. Why should we tarry when Jesus is pleading\n" +
                        "Pleading for you and for me ?\n" +
                        "Why should we linger and heed not His mercies\n" +
                        "Mercies for you and for me ?",
                "3. Time is now fleeting, the moments are passing\n" +
                        "Passing from you and from me ;\n" +
                        "Shadows are gathering, deathbeds are coming\n" +
                        "Coming for you and for me !",
                "4. Oh for the wonderful love He has promised\n" +
                        "Promised for you and for me !\n" +
                        "Though we have sinned, He has mercy and pardon\n" +
                        "Pardon for you and for me !",
                "",
                "",
                "",
                "\"Come Home !... come home !...\n" +
                        "Ye who are weary come home !\"\n" +
                        "Earnestly, tenderly Jesus is calling _\n" +
                        "Calling, O sinner, \"come home !\"\n",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("101", "AT the feast of Belshazzar and a thousand of his lords,",
                "1. AT the feast of Belshazzar and a thousand of his lords,\n" +
                        "While they drank from golden vessels\n " +
                        "as the Book of Truth records :\n" +
                        "In the night, as they revelled in the " +
                        "royal palace hall,\n" +
                        "They were seized with consternation\n" +
                        "'twas the Hand upon the wall !",
                "2. See the brave captive, Daniel,\n" +
                        "as he stood before the throng,\n" +
                        "And rebuked the haughty monarch\n" +
                        "for his mighty deeds of wrong ;\n" +
                        "As he read out the writing 'twas\n" +
                        "the doom of one and all,\n" +
                        "For the kingdom now was finished\n" +
                        "said the Hand upon the wall !",
                "3. See the faith, zeal, and courage,\n" +
                        "that would dare to do the right,\n" +
                        "Which the Spirit gave to Daniel\n" +
                        "'twas the secret of his might ;\n" +
                        "In his home in Judea, or a captive in the hall,\n" +
                        "He understood the writing of his\n" +
                        "God upon the wall !",
                "4. So our deeds are recorded there's\n" +
                        "a Hand that's writing now ;\n" +
                        "Sinner, give your heart to Jesus to\n" +
                        "His royal mandate bow ;\n" +
                        "For the day is approaching it must\n" +
                        "come to one and all,\n" +
                        "When the sinner's condemnation\n" +
                        "will be written on the wall !",
                "",
                "",
                "",
                "'Tis the hand of God on the wall !...\n" +
                        "'Tis the hand of God on the wall !...\n" +
                        "Shall the record be \"Found wanting!\"\n" +
                        "Or shall it be __ \"Found trusting !\"\n" +
                        "While that hand is writing on the wall?...",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("102", "I'VE wandered far away from God",
                "1. I'VE wandered far away from God:\n" +
                        "Now I'm coming home ;\n" +
                        "The paths of sin too long I've trod :\n" +
                        "Lord, I'm coming home.",
                "2. I've wasted many precious years :\n" +
                        "Now I'm coming home ;\n" +
                        "I now repent with bitter tears :\n" +
                        "Lord, I'm coming home.",
                "3. I'm tired of sin and straying, Lord :\n" +
                        "Now I'm coming home ;\n" +
                        "I'll trust Thy love, believe Thy word:\n" +
                        "Lord, I'm coming home.",
                "4 My soul is sick, my heart is sore :\n" +
                        "Now I'm coming home ;\n" +
                        "My strength renew, my hope restore:\n" +
                        "Lord, I'm coming home.",
                "",
                "",
                "",
                "Coming home, coming home\n" +
                        "nevermore to roam ;\n" +
                        "By Thy grace I will be Thine : Lord,\n" +
                        "I'm coming home.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("103", "PASS me not, O gentle Saviour,",
                "1. PASS me not, O gentle Saviour,\n" +
                        "Hear my humble cry ;\n" +
                        "While on others Thou art calling,\n" +
                        "Do not pass me by.",
                "2 Let me at a throne of mercy\n" +
                        "Find a sweet relief ;\n" +
                        "Kneeling there in deep contrition,\n" +
                        "Help my unbelief.",
                "3. Trusting only in Thy merit,\n" +
                        "Would I seek Thy face ;\n" +
                        "Heal my wounded, broken spirit,\n" +
                        "Save me by Thy grace.",
                "4. Thou the spring of all my comfort,\n" +
                        "More than life to me ;\n" +
                        "Whom have I on earth beside Thee?\n" +
                        "Whom in heaven but Thee ?",
                "",
                "",
                "",
                "Saviour, Saviour, hear my humble cry!\n" +
                        "And while others Thou art calling,\n" +
                        "do not pass me by !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("104", "PRAISE the Saviour, ye who",
                "1. PRAISE the Saviour, ye who know Him;\n" +
                        "Who can tell how much we owe Him?\n" +
                        "Gladly let us render to Him\n" +
                        "All we are and have.",
                "2. \"Jesus\" is the name that charms us;\n" +
                        "He for conflicts fits and arms us ;\n" +
                        "Nothing moves and nothing harms\n" +
                        "us, When we trust in Him.",
                "3. Trust in Him, ye saints, for ever ;\n" +
                        "He is faithful, changing never ;\n" +
                        "Neither force nor guile can sever\n" +
                        "Those He loves from Him.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("105", "O GOD, our help in ages past,",
                "1. O GOD, our help in ages past,\n" +
                        "Our hope for years to come,\n" +
                        "Our shelter from the stormy blast,\n" +
                        "And our eternal home.",
                "2. Under the shadow of Thy throne\n" +
                        "Thy saints have dwelt secure ;\n" +
                        "Sufficient is Thine arm alone,\n" +
                        "And our defence is sure.",
                "3. Before the hills in order stood,\n" +
                        "Or earth received her frame,\n" +
                        "From everlasting Thou art God,\n" +
                        "To endless years the same.",
                "4. A thousand ages in Thy sight\n" +
                        "Are like an evening gone ;\n" +
                        "Short as the watch that ends the night\n" +
                        "Before the rising sun.",
                "5. Time, like and ever-rolling stream,\n" +
                        "Bears all its sons away ;\n" +
                        "They fly forgotten, as a dream\n" +
                        "Dies at the opening day.",
                "6. O God, our help in ages past,\n" +
                        "Our hope for years to come,\n" +
                        "Be Thou our guard while life shall last,\n" +
                        "And our eternal home.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("106", "WHEN all Thy mercies, O my God",
                "1. WHEN all Thy mercies, O my God\n" +
                        "My rising soul surveys\n" +
                        "Transported with the view, I'm lost\n" +
                        "In wonder, love, and praise.",
                "2. Unnumbered comforts on my soul\n" +
                        "Thy tender care bestowed,\n" +
                        "Before my infant heart conceived\n" +
                        "From whom these comforts flowed",
                "3. When worn with sickness, oft hast Thou\n" +
                        "With health renewed my face ;\n" +
                        "And when in sins and sorrows sunk\n" +
                        "Revived my soul with grace.",
                "4. Ten thousand thousand precious gifts\n" +
                        "My daily thanks employ ;\n" +
                        "Nor is the least a cheerful heart\n" +
                        "That tastes those gifts with Joy.",
                "5. Through every period of my life\n" +
                        "Thy goodness I'll pursue ;\n" +
                        "And after death, in distant worlds,\n" +
                        "The glorious theme renew.",
                "6. Blind unbelief is sure to err,\n" +
                        "And scan His work in vain ;\n" +
                        "God is His own interpreter,\n" +
                        "And He will make it plain.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("107", "GOD moves in a mysterious way",
                "1. GOD moves in a mysterious way\n" +
                        "His wonders to perform ;\n" +
                        "He plants His footsteps in the sea,\n" +
                        "And rides upon the storm.",
                "2 Deep in unfathomable mines\n" +
                        "Of never-failing skill,\n" +
                        "He treasures up His bright designs,\n" +
                        "And works His sovereign will.",
                "3. Ye fearful saints, fresh courage take!\n" +
                        "The clouds ye so much dread\n" +
                        "Are big with mercy, and will break\n" +
                        "In blessings on your head.",
                "4 Judge not the Lord by feeble sense,\n" +
                        "But trust Him for His grace ;\n" +
                        "Behind a frowning providence\n" +
                        "He hides a smiling face.",
                "5. His purposes will ripen fast,\n" +
                        "Unfolding every hour ;\n" +
                        "The bud may have a bitter taste,\n" +
                        "But sweet will be the flower.",
                "6. Blind unbelief is sure to err,\n" +
                        "And scan His work in vain ;\n" +
                        "God is His own interpreter,\n" +
                        "And He will make it plain.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("108", "HOW firm a foundation, ye saints",
                "1. HOW firm a foundation, ye saints of the Lord,\n" +
                        "Is laid for your faith in His excellent Word !\n" +
                        "What more can He say, than to you He hath said\n" +
                        "To you, who for refuge to Jesus have fled?",
                "2. \"Fear not, I am with thee ; oh, be not dismayed !\n" +
                        "For I am thy God, I will still give thee aid;\n" +
                        "I'll strengthen thee, help thee, and cause thee to stand,\n" +
                        "Upheld by My gracious, omnipotent hand.",
                "3. \"When through the deep waters I call thee to go,\n" +
                        "The rivers of sorrow shall not overflow,\n" +
                        "For I will be with thee, thy trials to bless\n" +
                        "And sanctify to thee thy deepest distress.",
                "4. \"When through fiery trials thy pathway shall lie,\n" +
                        "My grace, all-sufficient, shall be thy supply :\n" +
                        "The flame shall not hurt thee : I only design\n" +
                        "Thy dross to consume, and thy gold to refine.",
                "5. \"E'en down to old age all My people shall prove\n" +
                        "My sovereign, eternal, unchangeable love;\n" +
                        "And then, when grey hairs shall their temples adorn,\n" +
                        "Like lambs they shall still in My bosom be borne.",
                "6. \"The soul that on Jesus hath leaned for repose,\n" +
                        "I will not _ I will not desert to its foes\n" +
                        "That soul _ though all hell should endeavour to shake\n" +
                        "I'll never no, never no, never for sake!",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("109", "TENDERLY guide us, O Shepherd",
                "1. TENDERLY guide us, O Shepherd of love,\n" +
                        "To the green pastures and waters above,\n" +
                        "Guarding us ever by night and by day,\n" +
                        "Never from Thee would we stray. ",
                "2. What though the heavens with clouds be o'ercast !\n" +
                        "Fearful the tempest, and bitter the blast!\n" +
                        "Still with the light of Thy Word on the way,\n" +
                        "Never from Thee would we stray.",
                "3. Over our weakness Thy strength has been cast ;\n" +
                        "Keep us in meekness, Thine own till the last ;\n" +
                        "Then, safely folded, with Joy we shall say\n" +
                        "Never from Thee would we stray.",
                "",
                "",
                "",
                "",
                "Never !... never ! Never ! Oh, never !\n" +
                        "for Thou art the way;\n" +
                        "Never ! ... never !...\n" +
                        "Never from Thee would we stray.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("110", "JESUS, Saviour, pilot me,",
                "1. JESUS, Saviour, pilot me,\n" +
                        "Over life's tempestuous sea ;\n" +
                        "Unknown waves before me roll,\n" +
                        "Hiding rock and treacherous shoal;\n" +
                        "Chart and compass come from Thee:\n" +
                        "Jesus, Saviour, pilot me !",
                "2. As a mother stills her child,\n" +
                        "Thou canst hush the ocean wild ;\n" +
                        "Boisterous waves obey Thy will\n" +
                        "When Thou say'st to them \"Be still !\"\n" +
                        "Wondrous Sovereign of the sea,\n" +
                        "Jesus, Saviour, pilot me !",
                "3. When at last I near the shore,\n" +
                        "And the fearful breakers roar\n" +
                        "'Twixt me and the peaceful rest\n" +
                        "Then, while leaning on Thy breast,\n" +
                        "May I hear Thee say to me,\n" +
                        "\"Fear not ! I will pilot thee !\"",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("111", "THE Lord's my Shepherd, I'll not want:",
                "1. THE Lord's my Shepherd, I'll not want:\n" +
                        "He makes me down to lie\n" +
                        "In pastures green ; He leadeth me\n" +
                        "The quiet waters by.",
                "2. My soul He doth restore again ;\n" +
                        "And me to walk doth make\n" +
                        "Within the paths of righteousness,\n" +
                        "Ev'n for His own name's sake.",
                "3. Yea, though I walk in death's dark vale,\n" +
                        "Yet will I fear none ill ;\n" +
                        "For Thou art with me ; and Thy rod\n" +
                        "And staff me comfort still.",
                "4. My table Thou hast furnishèd\n" +
                        "In presence of my foes ;\n" +
                        "My head Thou dost with oil anoint,\n" +
                        "And my cup overflows.",
                "5. Goodness and mercy all my life\n" +
                        "Shall surely follow me ;\n" +
                        "And in God's house for evermore\n" +
                        "My dwelling-place shall be.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("112", "MORE about Jesus would I know,",
                "1. MORE about Jesus would I know,\n" +
                        "More of His grace to others show ;\n" +
                        "More of His saving fullness see,\n" +
                        "More of His love __ who died for me.",
                "2. More about Jesus let me learn,\n" +
                        "More of His holy will discern ;\n" +
                        "Spirit of God, my teacher be,\n" +
                        "Showing the things of Christ to me.",
                "3 More about Jesus ; in His Word\n" +
                        "Holding communion with my Lord ;\n" +
                        "Hearing His voice in every line,\n" +
                        "Making each faithful saying mine.",
                "4. More about Jesus, on His throne,\n" +
                        "Riches in glory all His own ;\n" +
                        "More of His kingdom's sure increase;\n" +
                        "More of His coming  Prince of Peace.",
                "",
                "",
                "",
                "More, more about Jesus,\n" +
                        "More, more about Jesus ;\n" +
                        "More of His saving fullness see,\n" +
                        "More of His love who died for me.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("113", "THOU my everlasting Portion,",
                "1. THOU my everlasting Portion,\n" +
                        "More than friend or life to me,\n" +
                        "All along my pilgrim Journey,\n" +
                        "Saviour, let me walk with Thee.",
                "2. Not for ease or worldly pleasure,\n" +
                        "Not for fame my prayer shall be ;\n" +
                        "Gladly will I toil and suffer,\n" +
                        "Only let me walk with Thee.",
                "3 Lead me through the vale of shadows,\n" +
                        "Bear me o'er life's fitful sea ;\n" +
                        "Then the gate of life eternal\n" +
                        "May I enter, Lord, with Thee.",
                "",
                "",
                "",
                "",
                "Close to Thee, close to Thee,\n" +
                        "Close to Thee, close to Thee,\n" +
                        "All along my pilgrim Journey,\n" +
                        "Saviour, let me walk with Thee.",
                "Gladly will I toil and suffer,\n" +
                        "Only let me walk with Thee.",
                "Then the gate of life eternal\n" +
                        "May I enter, Lord, with Thee.",
                "",
                "",
                ""));

        allItems.add( new ListNumero("114", "THY will, O Lord, not mine,",
                "1. THY will, O Lord, not mine,\n" +
                        "Teach me to say ;\n" +
                        "Not my will, Lord, but Thine,\n" +
                        "I would obey ;\n" +
                        "Then shall I know the Joy,\n" +
                        "And Thy name glorify,\n" +
                        "When I, on earth, shall try\n" +
                        "To follow Thee.",
                "2. My weakness, Lord, I own,\n" +
                        "From day to day ;\n" +
                        "I listen for Thy voice\n" +
                        "To lead the way ;\n" +
                        "Oh, wilt Thou send the light\n" +
                        "To make my pathway bright,\n" +
                        "And show me what is right,\n" +
                        "The only way.",
                "3. I cannot see Just where\n" +
                        "The Spirit leads,\n" +
                        "But know that Christ is there,\n" +
                        "Who intercedes ;\n" +
                        "Oh, help me now to rest\n" +
                        "On, Jesus'loving breast,\n" +
                        "Till He shall manifest\n" +
                        "His love in me !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("115", "ALL to Jesus I surrender,",
                "1. ALL to Jesus I surrender,\n" +
                        "All to Him I freely give ;\n" +
                        "I will ever love and trust Him,\n" +
                        "In His presence daily live.",
                "2. ALL to Jesus I surrender,\n" +
                        "Humbly at His feet I bow ;\n" +
                        "Worldly pleasures all forsaken\n" +
                        "Take me, Jesus, take me now.",
                "3. All to Jesus I surrender,\n" +
                        "Make me, Saviour, wholly Thine ;\n" +
                        "Let the Holy Spirit witness\n" +
                        "I am Thine and Thou art mine.",
                "4. All to Jesus I surrender :\n" +
                        "Lord, I give myself to Thee ;\n" +
                        "Fill me with Thy love and power,\n" +
                        "Let Thy blessing rest on me.",
                "5. All to Jesus I surrender :\n" +
                        "Now I feel the sacred flame ;\n" +
                        "Oh the Joy of full salvation !\n" +
                        "Glory, glory to His name !",
                "",
                "",
                "I surrender all,... I surrender all ;...\n" +
                        "All to Thee, my blessed Saviour,\n" +
                        "I surrender all...",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("116", "O JESUS, I have promised",
                "1. O JESUS, I have promised\n" +
                        "To serve Thee to the end ;\n" +
                        "Be Thou for ever near me,\n" +
                        "My Master and my Friend !\n" +
                        "I shall not fear the battle,\n" +
                        "If Thou art by my side ;\n" +
                        "Nor wander from the pathway,\n" +
                        "If Thou wilt be my Guide.",
                "2. Oh, let me feel Thee near me,\n" +
                        "The world is ever near ;\n" +
                        "I see the sights that dazzle,\n" +
                        "The tempting sounds I hear :\n" +
                        "My foes are ever near me,\n" +
                        "Around me and within ;\n" +
                        "But, Jesus, draw Thou nearer,\n" +
                        "And shield my soul from sin.",
                "3. Oh, let me hear Thee speaking,\n" +
                        "In accents clear and still,\n" +
                        "Above the storms of passion,\n" +
                        "The murmurs of self-will.\n" +
                        "Oh speak, to reassure me,\n" +
                        "To hasten or control ;\n" +
                        "Oh speak, and make me listen,\n" +
                        "Thou Guardian of my soul !",
                "4 O Jesus, Thou hast promised\n" +
                        "To all who follow Thee,\n" +
                        "That where Thou art in glory\n" +
                        "There shall Thy servant be !\n" +
                        "And, Jesus, I have promised\n" +
                        "To serve Thee to the end ; \n" +
                        "Oh, give me grace to follow\n" +
                        "My Master and my Friend !",
                "5. Oh, let me see Thy footmarks,\n" +
                        "And in them plant mine own ;\n" +
                        "My hope to follow duly\n" +
                        "Is in Thy strength alone.\n" +
                        "Oh, guide me, call me, draw me,\n" +
                        "Uphold me to the end ;\n" +
                        "And then in heaven receive me,\n" +
                        "My Saviour and my Friend !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("117", "TAKE time to be holy, speak oft",
                "1. TAKE time to be holy, speak oft with thy Lord ;\n" +
                        "Abide in Him always, and feed on His Word.\n" +
                        "Make friends of God's children ; help those who are weak ;\n" +
                        "Forgetting in nothing His blessing to seek.\n",
                "2. Take time to be holy, the world rushes on;\n" +
                        "Spend much time in secret with Jesus alone\n" +
                        "By looking to Jesus, like Him thou shalt be ;\n" +
                        "Thy friends in thy conduct His likeness shall see.",
                "3. Take time to be holy, let Him be thy Guide ;\n" +
                        "And run not before Him, whatever betide;\n" +
                        "In Joy or in sorrow still follow thy Lord,\n" +
                        "And, looking to Jesus, still trust in His Word.",
                "4. Take time to be holy, be calm in thy soul;\n" +
                        "Each thought and each temper beneath His control :\n" +
                        "Thus led by His Spirit to fountains of love,\n" +
                        "Thou soon shalt be fitted for service above.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));


        allItems.add( new ListNumero("118", "I GAVE My life for thee ;",
                "1. I GAVE My life for thee ;\n" +
                        "My precious blood I shed,\n" +
                        "That thou might'st ransomed be,\n" +
                        "And quickened from the dead.\n" +
                        "I gave My life for thee :\n" +
                        "What hast thou given for Me ?\"",
                "2. \"I spent long years for thee\n" +
                        "In weariness and woe,\n" +
                        "That an eternity\n" +
                        "Of Joy thou mightest know.\n" +
                        "I spent long years for thee :\n" +
                        "Hast thou spent one for Me ?\"",
                "3. \"My Father's home of light,\n" +
                        "My rainbow-circled throne,\n" +
                        "left for earthly night,\n" +
                        "For wanderings sad and lone.\n" +
                        "I left it all for thee :\n" +
                        "Hast thou left aught for Me ?\"",
                "4. \"I suffered much for thee \n" +
                        "More than thy tongue can tell,\n" +
                        "Of bitterest agony \n" +
                        "To rescue thee from hell,\n" +
                        "I suffered much for thee :\n" +
                        "What canst thou bear for Me ?\"",
                "5. \"And I have brought to thee,\n" +
                        "Down from My home above.\n" +
                        "Salvation full and free,\n" +
                        "My pardon and My love.\n" +
                        "Great gifts I brought to thee :\n" +
                        "What hast thou brought to Me ?\"",
                "6 Oh, let thy life be given,\n" +
                        "Thy years for Him be spent ;\n" +
                        "World-fetters all be riven,\n" +
                        "And Joy with suffering blent ;\n" +
                        "Bring thou thy worthless all :\n" +
                        "Follow thy Saviour's call.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("119", "A NYWHERE with Jesus I can",
                "1. A NYWHERE with Jesus I can safely go!\n" +
                        "Anywhere He leads me in this world below !\n" +
                        "Anywhere without Him dearest Joys would fade\n" +
                        "Anywhere with Jesus, I am not afraid!",
                "2 Anywhere with Jesus I am not alone!\n" +
                        "Other friends may fail me, He is still my own !\n" +
                        "Though His hand may lead me over dreariest ways,\n" +
                        "Anywhere with Jesus is a house of praise!",
                "3. Anywhere with Jesus I can go to sleep,\n" +
                        "When the darkling shadows round about me creep !\n" +
                        "Knowing I shall waken, never more to roam :\n" +
                        "Anywhere with Jesus will be home, sweet home !",
                "",
                "",
                "",
                "",
                "Anywhere ! anywhere ! Fear I cannot know ;\n" +
                        "Anywhere with Jesus I can safely go!",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("120", "OH, what fellowship ; oh, what Joy is mine,",
                "1. OH, what fellowship ; oh, what Joy is mine,\n" +
                        "Resting in the everlasting arms !\n" +
                        "Oh, what blessedness ; oh, what peace divine,\n" +
                        "Resting in the everlasting arms !",
                "2 Oh, how safe am I in this pilgrim way,\n" +
                        "Resting in the everlasting arms !\n" +
                        "Oh, how bright the path grows from day to day.\n" +
                        "Resting in the everlasting arms !",
                "3. What have I to dread, what have to fear,\n" +
                        "Resting in the everlasting arms ?\n" +
                        "I have perfect peace with my Saviour near,\n" +
                        "Resting in the everlasting arms !",
                "",
                "",
                "",
                "",
                "Resting, resting,\n" +
                        "Safe and secure from all alarms ;\n" +
                        "Resting, resting,\n" +
                        "Resting in the everlasting arms !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("121", "MY Jesus, I love Thee, I know Thou art mine !",
                "1. MY Jesus, I love Thee, I know Thou art mine !\n" +
                        "For Thee all the pleasures of sinI resign;\n" +
                        "My gracious Redeemer, my Saviour art Thou !\n" +
                        "If ever I loved Thee, my Jesus, 'tis now!",
                "2. I love Thee, because Thou hast first lovèd me,\n" +
                        "And purchased my pardon on Calvary's tree ;\n" +
                        "I love Thee for wearing the thorns on Thy brow ;\n" +
                        "If ever I loved Thee, my Jesus, 'tis now!",
                "3. I will love Thee in life, I will love, Thee in death,\n" +
                        "And praise Thee as long as Thou lendest me breath ;\n" +
                        "And say when the death-dew lies cold on my brow,\n" +
                        "\"If ever I loved Thee, my Jesus, 'tis now!\"",
                "4. In mansions of glory and endless delight,\n" +
                        "I'll ever adore Thee in heaven so bright;\n" +
                        "I'll sing with the glittering crown on my brow,\n" +
                        "\"If ever I loved Thee, my Jesus, tis now!\" ",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("122", "GRACIOUS Spirit, Holy Ghost,",
                "1. GRACIOUS Spirit, Holy Ghost,\n" +
                        "Taught by Thee, we covet most\n" +
                        "Of Thy gifts at Pentecost,\n" +
                        "Holy, heavenly love.",
                "2. Love is kind, and suffers long ;\n" +
                        "Love is meek, and thinks no wrong;\n" +
                        "Love, than death itself more strong;\n" +
                        "Give us heavenly love.",
                "3. Prophecy will fade away,\n" +
                        "Melting in the light of day ;\n" +
                        "Love will ever with us stay :\n" +
                        "Give us heavenly love.",
                "4. Faith will vanish into sight ;\n" +
                        "Hope be emptied in delight ;\n" +
                        "Love in heaven will shine more bright;\n" +
                        "Give us heavenly love.",
                "5. Faith and hope and love we see\n" +
                        "Joining hand in hand agree ;\n" +
                        "But the greatest of the three,\n" +
                        "And the best, is love.",
                "6. From the overshadowing\n" +
                        "Of Thy gold and silver wing,\n" +
                        "Shed on us, who to Thee sing,\n" +
                        "Holy, heavenly love.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("123", "WHEN upon life's billows you are",
                "1. WHEN upon life's billows you are tempest tossed,\n" +
                        "When you are discouraged, thinking all is lost,\n" +
                        "Count your many blessings, name them one by one,\n" +
                        "And it will surprise you what the Lord hath done.",
                "2. Are you ever burdened with a load of care ?\n" +
                        "Does the cross seem heavy you are called to bear ?\n" +
                        "Count your many blessings, every doubt will fly,\n" +
                        "And you will keep singing as the days go by.",
                "3. When you look at others with their lands and gold,\n" +
                        "Think that Christ has promised you His wealth untold ;\n" +
                        "Count your many blessings ;\n" +
                        "wealth can never buy\n" +
                        "Your reward in heaven, nor your home on high.",
                "4. So, amid the conflict, whether great or small,\n" +
                        "Do not be disheartened, God is over all;\n" +
                        "Count your many blessings, angels will attend,\n" +
                        "Help and comfort give you to your Journey's end.",
                "",
                "",
                "",
                "Count.. your blessings, name\n" +
                        "them one by one ;\n" +
                        "Count.. your blessings, see what\n" +
                        "God hath done !\n" +
                        "Count your blessings, name them\n" +
                        "one by one ;\n" +
                        "and it will surprise you what the\n" +
                        "Lord hath done.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("124", "SOWING in the morning, sowing seeds of kindness,",
                "1. SOWING in the morning, sowing seeds of kindness,\n" +
                        "Sowing in the noontide and the dewy eves:\n" +
                        "Waiting for the harvest, and the time of reaping,\n" +
                        "We shall come rejoicing, bringing in the sheaves !",
                "2 Sowing in the sunshine, sowing in the shadows,\n" +
                        "Fearing neither clouds nor winter's chilling breeze ;\n" +
                        "By and by the harvest, and the labour ended,\n" +
                        "We shall come rejoicing, bringing in the sheaves !",
                "3. Go then ever, weeping, sowing for the Master,\n" +
                        "Though the loss sustained our spirit often grieves :\n" +
                        "When our weeping's over, He will bid us welcome,\n" +
                        "We shall come rejoicing bringing in the sheaves !",
                "",
                "",
                "",
                "",
                "Bringing in the sheaves ! bringing in the sheaves !\n" +
                        "We shall come rejoicing, bringing in the sheaves !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("125", "WORK, for the night is coming,",
                "1. WORK, for the night is coming,\n" +
                        "Work through the morning hours;\n" +
                        "Work while the dew is sparkling,\n" +
                        "Work'mid springing flowers ;\n" +
                        "Work when the day grows brighter\n" +
                        "Work in the glowing sun ;\n" +
                        "Work, for the night is coming,\n" +
                        "When man's work is done.",
                "2. Work, for the night is coming,\n" +
                        "Work through the sunny noon ;\n" +
                        "Fill brightest hours with labour,\n" +
                        "Rest comes sure and soon.\n" +
                        "Give every flying minute\n" +
                        "Something to keep in store ;\n" +
                        "Work, for the night is coming,\n" +
                        "When man works no more.",
                "3. Work, for the night is coming,\n" +
                        "Under the sunset skies ;\n" +
                        "While their bright tints are glowing,\n" +
                        "Work, for daylight flies.\n" +
                        "Work till the last beam fadeth,\n" +
                        "Fadeth to shine no more ;\n" +
                        "Work while the night is darkening\n" +
                        "When man's work is o'er.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("126", "LORD, speak to me, that I may speak",
                "1. LORD, speak to me, that I may speak\n" +
                        "In living echoes of Thy tone ;\n" +
                        "As Thou hast sought, so let me seek\n" +
                        "Thy erring children lost and lone.",
                "2. Oh, lead me, Lord, that I may lead\n" +
                        "The wandering and the wavering feet!\n" +
                        "Oh, feed me, Lord, that I may feed\n" +
                        "Thy hungering ones with manna sweet!",
                "3. Oh, strengthen me that while I stand\n" +
                        "Firm on the Rock, and strong in Thee,\n" +
                        "I may stretch out a loving hand\n" +
                        "To wrestlers with the troubled sea !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));


        allItems.add( new ListNumero("127", "WHO is on the Lord's side ? who will serve the king ?",
                "1. WHO is on the Lord's side ? who will serve the king ?\n" +
                        "Who will be His helpers, other lives to bring ?\n" +
                        "Who will leave the world's side ? who will face the foe ? \n" +
                        "Who is on the Lord's side ? who for Him will go ?",
                "2. Not for weight of glory, not for crown and palm,\n" +
                        "Enter we the army, raise the warrior- psalm ;\n" +
                        "But for love that claimeth, lives for whom He died :\n" +
                        "He whom Jesus nameth must be on His side !",
                "3. Jesus, Thou hast bought us, not with gold or gem,\n" +
                        "But with Thine own life-blood, for Thy diadem ;\n" +
                        "With Thy blessing filling all who come to Thee,\n" +
                        "Thou hast made us willing, Thou hast made us free.",
                "4. Fierce may be the conflict, strong may be the foe ;\n" +
                        "But the King's own army none can overthrow ;\n" +
                        "Round His standard ranging, victory\n" +
                        "is secure, for His truth unchanging makes the triumph sure.",
                "",
                "",
                "",
                "By Thy grand redemption,\n" +
                        "By Thy grace divine,\n" +
                        "We are on the Lord's side ;\n" +
                        "Saviour, we are Thine !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("128", "HARK the voice of Jesus crying ",
                "1. HARK the voice of Jesus crying\n" +
                        "\"Who will go and work to-day ?\n" +
                        "Fields are white, and harvest waiting:\n" +
                        "Who will bear the sheaves away ?" +
                        "Loud and strong the Master calleth\n" +
                        "Rich reward He offers thee :\n" +
                        "Who will answer, gladly saying ?\n" +
                        "\"Here am I ; send me, send me !\"",
                "2. If you cannot cross the ocean,\n" +
                        "And the heathen lands explore,\n" +
                        "You can find the heathen nearer,\n" +
                        "You can help them at your door.\n" +
                        "If you cannot give your thousands,\n" +
                        "You can give the widow's mite ;\n" +
                        "And the least you do for Jesus\n" +
                        "Will be precious in His sight.",
                "3. If you cannot speak like angels,\n" +
                        "If you cannot preach like Paul,\n" +
                        "You can tell the love of Jesus,\n" +
                        "You can say He died for all.\n" +
                        "If you cannot rouse the wicked\n" +
                        "With the Judgment's dread alarms,\n" +
                        "You can lead the little children\n" +
                        "To the Saviour's waiting arms.",
                "4. If you cannot be the watchman,\n" +
                        "Standing high on Zion's wall,\n" +
                        "Pointing out the path to heaven,\n" +
                        "Offering life and peace to all ;\n" +
                        "With your prayers and with your bounties\n" +
                        "You can do what Heaven demands;\n" +
                        "You can be like faithful Aaron,\n" +
                        "Holding up the prophet's hands.",
                "5. If among the older people\n" +
                        "You may not be apt to teach :\n" +
                        "\"Feed My lambs,\" said Christ our Shepherd,\n" +
                        "\"Place the food within their reach.\"\n" +
                        "And it may be that the children\n" +
                        "You have led with trembling hand\n" +
                        "Will be found among your Jewels,\n" +
                        "When you reach the better land.",
                "6. Let none hear you idly saying,\n" +
                        "While the souls of men are dying,\n" +
                        "And the Master calls for you.\n" +
                        "Take the task He gives you gladly,\n" +
                        "Let His work your pleasure be ;\n" +
                        "Answer quickly when He calleth :\n" +
                        "\"Here am I ; send me, send me !\"",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("129", "BLESSÈD assurance Jesus is mine!",
                "1. BLESSÈD assurance Jesus is mine!\n" +
                        "Oh, what a foretaste of glory divine!\n" +
                        "Heir of salvation, purchase of God ;\n" +
                        "Born of His Spirit, washed in His blood.",
                "2. Perfect submission, perfect delight\n" +
                        "Visions of rapture burst on my sight\n" +
                        "Angels descending, bring from above\n" +
                        "Echoes of mercy, whispers of love",
                "3. Perfect submission, all is at rest,\n" +
                        "I in my Saviour am happy and blest;\n" +
                        "Watching and waiting, looking above,\n" +
                        "Filled with His goodness, lost in His love",
                "",
                "",
                "",
                "",
                "This is my story, this is my song,\n" +
                        "Praising my Saviour all the day long;\n" +
                        "This is my story, this is my song,\n" +
                        "Praising my Saviour all the day long.\n" +
                        "",
                "",
                "",
                "",
                "",
                ""));


        allItems.add( new ListNumero("130", "WHAT can wash away my stain ?",
                "1. WHAT can wash away my stain ?\n" +
                        "Nothing but the blood of Jesus !\n" +
                        "What can make me whole again ?\n" +
                        "Nothing but the blood of Jesus !",
                "2. For my cleansing this I see __\n" +
                        "Nothing but the blood of Jesus !\n" +
                        "For my pardon this my plea __\n" +
                        "Nothing but the blood of Jesus !",
                "3. Nothing can for sin atone\n" +
                        "Nothing but the blood of Jesus !\n" +
                        "Naught of good that I have done __\n" +
                        "Nothing but the blood of Jesus !",
                "4. This is all my hope and peace __\n" +
                        "Nothing but the blood of Jesus !\n" +
                        "This is all my righteousness __\n" +
                        "Nothing but the blood of Jesus !",
                "",
                "",
                "",
                "Oh, precious is the flow,\n" +
                        "That makes me white as snow !\n" +
                        "No other fount I know,\n" +
                        "Nothing but the blood of Jesus !",
                "",
                "",
                "",
                "",
                ""));


        allItems.add( new ListNumero("131", "STANDING on the promises of Christ my King,",
                "1. STANDING on the promises of Christ my King,\n" +
                        "Through eternal ages let His praises ring;\n" +
                        "Glory in the highest, I will shout and sing,\n" +
                        "Standing on the promises of God.",
                "2. Standing on the promises that cannot fail,\n" +
                        "When the howling storms of doubt and fear assail,\n" +
                        "By the living word of God I shall prevail,\n" +
                        "Standing on the promises of God.",
                "3. Standing on the promises I now can see\n" +
                        "Perfect, present cleansing in the blood for me ;\n" +
                        "Standing in the liberty where Christ makes free,\n" +
                        "Standing on the promises of God.",
                "4. Standing on the promises of Christ the Lord,\n" +
                        "Bound to Him eternally by love's strong cord,\n" +
                        "Overcoming daily with the Spirit's sword,\n" +
                        "Standing on the promises of God.",
                "5. Standing on the promises I cannot fall,\n" +
                        "Listening every moment to the Spirit's call,\n" +
                        "Resting in my Saviour as my All in all,\n" +
                        "Standing on the promises of God.",
                "",
                "",
                "Standing,.. standing,..\n" +
                        "Standing on the promises of God\n" +
                        "my Saviour ;\n" +
                        "Standing,.. standing,..\n" +
                        "I'm standing on the promises of God.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("132", "AMAZING grace ! how sweet the sound",
                "1. AMAZING grace ! how sweet the sound\n" +
                        "That saved a wretch like me ;\n" +
                        "I once was lost, but now am found;\n" +
                        "Was blind, but now I see.",
                "2. 'Twas grace that taught my heart to fear,\n" +
                        "And grace my fears relieved ;\n" +
                        "How precious did that grace appear\n" +
                        "The hour I first believed !",
                "3. Through many dangers, toils, and snares,\n" +
                        "I have already come :\n" +
                        "'Tis grace that brought me safe thus far,\n" +
                        "And grace will lead me home.",
                "4. Yes, when this heart and flesh shall fail,\n" +
                        "And mortal life shall cease, \n" +
                        "I shall possess within the vail\n" +
                        "A life of Joy and peace.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("133", "I WILL sing of my Redeemer,",
                "1. I WILL sing of my Redeemer,\n" +
                        "And His wondrous love to me ;\n" +
                        "On the cruel cross He suffered,\n" +
                        "From the curse to set me free.",
                "2. I will tell the wondrous story,\n" +
                        "How my lost estate to save,\n" +
                        "In His boundless love and mercy,\n" +
                        "He the ransom freely gave.",
                "3. I will praise my dear Redeemer,\n" +
                        "His triumphant power I'll tell ;\n" +
                        "How the victory He giveth\n" +
                        "Over sin, and death, and hell.",
                "4 I will sing of my Redeemer,\n" +
                        "And His heavenly love to me ;\n" +
                        "He from death to life hath brought me,\n" +
                        "Son of God, with Him to be.",
                "",
                "",
                "",
                "Sing, oh sing... of my Redeemer !\n" +
                        "With His blood... He purchased me!\n" +
                        "On the cross. He sealed my pardon,\n" +
                        "Paid the debt,... and made me free..",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("134", "WHEN peace, like a river, Attendeth my way,",
                "1. WHEN peace, like a river,\n" +
                        "Attendeth my way,\n" +
                        "When sorrows, like sea-billows, roll;\n" +
                        "Whatever my lot, Thou hast taught me to know,\n" +
                        "\"It is well, it is well with my soul.\"",
                "2. Though Satan should buffet,\n" +
                        "Though trials should come,\n" +
                        "Let this blest assurance control,\n" +
                        "That Christ hath regarded my helpless estate,\n" +
                        "And hath shed His own blood for my soul.",
                "3. My sin __ oh, the bliss\n" +
                        "Of this glorious thought !\n" +
                        "My sin __ not in part, but the whole,\n" +
                        "Is nailed to His cross ; and I bear it no more :\n" +
                        "Praise the Lord, praise the Lord, O my soul !",
                "4. For me, be it Christ,\n" +
                        "Be it Christ hence to live !\n" +
                        "If Jordan above me shall roll,\n" +
                        "No pang shall be mine, for in death as in life\n" +
                        "Thou wilt whisper Thy peace to my soul.",
                "5. But, Lord, 'tis for Thee,\n" +
                        "For Thy coming, we wait ;\n" +
                        "The sky, not the grave, is our goal :\n" +
                        "Oh, trump of the Angel ! oh, voice of the Lord !\n" +
                        "Blessed hope ! blessed rest of my soul",
                "",
                "",
                "It is well... With my soul,...\n" +
                        "It is well, it is well with my soul.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("135", "I'VE reached the land of corn and wine,",
                "1. I'VE reached the land of corn and wine,\n" +
                        "And all its riches freely mine ;\n" +
                        "Here shines undimmed one blissful day,\n" +
                        "For all my night has passed away.",
                "2. My Saviour comes and walks with me\n" +
                        "And sweet communion here have we;\n" +
                        "He gently leads me by His hand,\n" +
                        "For this is heaven's borderland.",
                "3. A sweet perfume upon the breeze\n" +
                        "Is borne from ever-vernal trees ;\n" +
                        "And flowers that, never fading, grow\n" +
                        "Where streams of life for ever flow.",
                "4. The zephyrs seem to float to me\n" +
                        "Sweet sounds of heaven's melody,\n" +
                        "As angels with the white-robed throng\n" +
                        "Join in the sweet redemption song.",
                "",
                "",
                "",
                "O Beulah Land, sweet Beulah Land\n" +
                        "As on thy highest mount I stand,\n" +
                        "I look away across the sea,\n" +
                        "Where mansions are prepared for me,\n" +
                        "And view the shining glory shore :\n" +
                        "My heaven, my home for evermore !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("136", "WHEN all my labours and trials are o'er,",
                "1 WHEN all my labours and trials are o'er,\n" +
                        "And I am safe on that beautiful shore,\n" +
                        "Just to be near the dear Lord I adore,\n" +
                        "Will through the ages be glory for me.",
                "2. When by the gift of His infinite grace\n" +
                        "I am accorded in heaven a place,\n" +
                        "Just to be there, and to look on His face,\n" +
                        "Will through the ages be glory for ",
                "3. Friends will be there I have loved long ago ;\n" +
                        "Joy like a river around me will flow;\n" +
                        "Yet, Just a smile from my Saviour, I know,\n" +
                        "Will through the ages be glory for me.",
                "",
                "",
                "",
                "",
                "Oh, that will be.. glory for me,..\n" +
                        "Glory for me,.. glory for me,..\n" +
                        "When by His grace I shall look on His face,\n" +
                        "That will be glory, be glory for me !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("137", "THERE's a land that is fairer than day",
                "1. THERE's a land that is fairer than day\n" +
                        "And by faith we can see it afar,\n" +
                        "For the Father waits over the way,\n" +
                        "To prepare us a dwelling-place there.",
                "2. We shall sing on that beautiful shore\n" +
                        "The melodious songs of the blest ;\n" +
                        "And our spirits shall sorrow no more\n" +
                        "Not a sigh for the blessing of rest.",
                "3. To our bountiful Father above\n" +
                        "We will offer the tribute of praise,\n" +
                        "For the glorious gift of His love,\n" +
                        "And the blessings that hallow our days.",
                "",
                "",
                "",
                "",
                "In the sweet... by-and-by,...\n" +
                        "We shall meet on that beautiful shore.\n" +
                        "In the sweet... by-and-by,...\n" +
                        "We shall meet on that beautiful shore.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("138", "FADE, fade, each earthly Joy ;",
                "1. FADE, fade, each earthly Joy ;\n" +
                        "Jesus is mine !\n" +
                        "Break every tender tie ;\n" +
                        "Jesus is mine !\n" +
                        "Dark is the wilderness,\n" +
                        "Earth has no resting-place,\n" +
                        "Jesus alone can bless,\n" +
                        "Jesus is mine!",
                "2 Tempt not my soul away ;\n" +
                        "Jesus is mine!\n" +
                        "Here would I ever stay ;\n" +
                        "Jesus is mine!\n" +
                        "Perishing things of clay,\n" +
                        "born but for one brief day,\n" +
                        "Pass from my heart away !\n" +
                        "Jesus is mine!",
                "3. Farewell, ye dreams of night ;\n" +
                        "Jesus is mine !\n" +
                        "Lost in this dawning light ;\n" +
                        "Jesus is mine!\n" +
                        "All that my soul has tried\n" +
                        "Left but a dismal void,\n" +
                        "Jesus has satisfied ;\n" +
                        "Jesus is mine !",
                "4. Farewell, mortality ; Jesus is mine!\n" +
                        "Welcome, eternity ; Jesus is mine !\n" +
                        "Welcome, O loved and blest ;\n" +
                        "Welcome, sweet scenes of rest ;\n" +
                        "Welcome, my Saviour's breast ;\n" +
                        "Jesus is mine !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("139", "WE plough the fields, and scatter",
                "1. WE plough the fields, and scatter\n" +
                        "The good seed on the land ;\n" +
                        "But it is fed and watered\n" +
                        "By God's almighty hand :\n" +
                        "He sends the snow in winter,\n" +
                        "The warmth to swell the grain ;\n" +
                        "The breezes, and the sunshine,\n" +
                        "And soft refreshing rain.",
                "2. He only is the Maker\n" +
                        "Of all things near and far :\n" +
                        "He paints the wayside flower ;\n" +
                        "He lights the evening star ;\n" +
                        "The winds and waves obey Him ;\n" +
                        "By Him the birds are fed ;\n" +
                        "Much more to us, His children,\n" +
                        "He gives our daily bread.",
                "3 We thank Thee, then, O Father,\n" +
                        "For all things bright and good :\n" +
                        "The seed-time and the harvest,\n" +
                        "Our life, our health, our food.\n" +
                        "Accept the gifts we offer\n" +
                        "For all Thy love imparts ;\n" +
                        "And  what Thou most desirest \n" +
                        "Our humble, thankful hearts.",
                "",
                "",
                "",
                "",
                "All good gifts around us\n" +
                        "Are sent from heaven above :\n" +
                        "Then thank the Lord, oh, thank the\n" +
                        "Lord, For all His love !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("140", "AT GETHSEMANE, Great transaction done,",
                "1. AT GETHSEMANE,\n" +
                        "Great transaction done,\n" +
                        "He willingly took the cup to drink.\n" +
                        "This He did for me,\n" +
                        "My soul to redeem,\n" +
                        "To rest in His everlasting love.",
                "2. O at Gabbatha, He stood rejected,\n" +
                        "He came to save men who knew Him not.\n" +
                        "Humbly He suffered,\n" +
                        "All He surrendered,\n" +
                        "Dead to the world the cross He took !",
                "3. O at Golgotha, He hung crucified,\n" +
                        "In agony and pain for me.\n" +
                        "His blood was shed forth,\n" +
                        "My soul to set free,\n" +
                        "Washed in the blood of Jesus Christ!",
                "4. O how great a price, Gladly He paid for me !\n" +
                        "What can I offer for such a price ?\n" +
                        "Lord possess my all :\n" +
                        "Body, soul, spirit ;\n" +
                        "Every vain thing I sacrifice !",
                "5. O what can I do,\n" +
                        "To so great a love,\n" +
                        "But to serve Thee with all my heart\n" +
                        "Whom else should I serve,\n" +
                        "But Thee Blessed Lord,\n" +
                        "Till soon I meet Thee in the air.",
                "",
                "",
                "I'm Glad  I'm washed\n" +
                        "Washed in the blood of\n" +
                        "Jesus Christ.\n" +
                        "(2x)",
                "",
                "",
                "I'm standing standing\n" +
                        "Standing to serve Thee forever.\n" +
                        "( x2 )",
                "",
                ""));

        allItems.add( new ListNumero("141", "O GOD Thou art my God, I seek",
                "1. O GOD, Thou art my God, I seek Thee\n" +
                        "My soul thirsts for The Lord\n" +
                        "I'm burning in my heart for Thee\n" +
                        "Satisfy my longing soul !",
                "2. As a hart longs for the flowing streams,\n" +
                        "So longs my soul for Thee.\n" +
                        "My soul thirsts for God, the Living God\n" +
                        "When shall I behold my God ?",
                "3. Sometimes I have yearned with tears of love,\n" +
                        "So longs my soul for Thee.\n" +
                        "I've thirsts with sorrows for Thee Lord,\n" +
                        "Lord comfort my soul with Thee.",
                "4. Upon my bed, Lord, I think of Thee,\n" +
                        "On Thee all night I muse.\n" +
                        "My soul yearns to cling always to Thee.\n" +
                        "O God it's Thee I love !",
                "5. I'll bless Thee Lord as long as I live,\n" +
                        "I'll call upon Thy name.\n" +
                        "My soul is feasted with marrow ;\n" +
                        "I bless Thee with Joyful lips !",
                "6 I gaze upon Thee in the sanctuary\n" +
                        "To behold Thy glory.\n" +
                        "Thy steadfast love is better than life\n" +
                        "My lips will ever praise Thee.\n" +
                        "\n" +
                        "7 O Lord let my sorrows be unceasing.\n" +
                        "My yearnings day and night,\n" +
                        "For the pov'ty of my heart to love You,\n" +
                        "As it should be in Thy sight !\n" +
                        "\n" +
                        "8 O God let me mourn for Christ's absence,\n" +
                        "With growing inward groans,\n" +
                        "And sighs and tears and anguishof heart:\n" +
                        "\"Lord come back ! Come quickly ! Come!\"\n.",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("142", "I SEEK Thee, O my God !",
                "1. I SEEK Thee, O my God !\n" +
                        "I want to love You more.\n" +
                        "Possess my heart with love,\n" +
                        "For You and You alone !",
                "2. O Lord, my strength is Yours !\n" +
                        "I must, Lord Jesus, do\n" +
                        "Only that which will help\n" +
                        "Me to love You the more.",
                "3. My mouth, O Lord, is Yours !\n" +
                        "I must, Lord Jesus, say\n" +
                        "Only that which will help\n" +
                        "Me to love You the more.",
                "4. My heart I yield to Thee !\n" +
                        "I must, Lord Jesus, think\n" +
                        "Only that which will help\n" +
                        "Me in Your glory dwell.",
                "5. My life, O Lord, is Thine !\n" +
                        "I must, Lord, motivate\n" +
                        "Only that which will help\n" +
                        "Me by Thee to possess.",
                "6. My dwelling is on high !\n" +
                        "Grant me to daily dream,\n" +
                        "Of that great glorious home\n" +
                        "Where I'll forever dwell.",
                "",
                "O Lord, I love You !\n" +
                        "O yes, Jesus, I do.\n" +
                        "Set my heart burning,\n" +
                        "Yes Lord, burning for You !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("143", "HOLY, Holy, Holy is God !",
                "1. HOLY, Holy, Holy is God !\n" +
                        "His glory fills the heavens above !\n" +
                        "Glory and pow'r belong to God.\n" +
                        "He's glorious in holiness !\n" +
                        "Praise Him ! Praise Him ! ye\n" +
                        "heavenly host,\n" +
                        "He is the Great King of ages !",
                "2. Holy, Holy, Holy is God !\n" +
                        "His glory fills the earth below !\n" +
                        "He's seated on the throne above,\n" +
                        "His train fills His glorious temple.\n" +
                        "He reigns ! He reigns ! in the\n" +
                        "highest,\n" +
                        "And on earth peace towards all His\n" +
                        "host!",
                "3. Wisdom and honour to our King,\n" +
                        "The Alpha and the Omega !\n" +
                        "Blessing to God the Father,\n" +
                        "And pow'r to the Blessed Jesus.\n" +
                        "His Spirit reigns ! our God is One.\n" +
                        "Th' eternal Blessed Trinity !",
                "4. We give Thee thanks our Lord and\n" +
                        "God,\n" +
                        "Who is, who was, and is to come !\n" +
                        "To Thee belongs salvation.\n" +
                        "Come Lord ! and reign in Thy\n" +
                        "Kingdom\n" +
                        "Come soon ! Come quickly for Thy\n" +
                        "Bride.\n" +
                        "Come Lord ! that we might reign\n" +
                        "with Thee.",
                "5 And then we shall sing for ever :\n" +
                        "Holy, Holy, Holy is God !\n" +
                        "Glory and pow'r belong to God.\n" +
                        "His Kingdom is for ever !\n" +
                        "Praise Him ! Praise Him ! ye\n" +
                        "Kingdom host.\n" +
                        "He is the Great King of ages !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("144", "O THAT I may know deep",
                "1. O THAT I may know deep\n" +
                        "communion with You !\n" +
                        "For Your love is better than life.\n" +
                        "Your anointing oils are fragrant, O\n" +
                        "Lord!\n" +
                        "Your name is oil poured forth !",
                "2. I will exult and rejoice in You.\n" +
                        "Your love to extol more than life.\n" +
                        "Thou art worthy to be loved, O Lord !\n" +
                        "Draw me, draw me after Thee !",
                "3. As an apple tree among many trees,\n" +
                        "So is my Beloved among young men!\n" +
                        "With great delight I dwell in You.\n" +
                        "And Your fruit is sweet to my taste!",
                "4 You've brought me into Your\n" +
                        "banqueting house !\n" +
                        "With Your banner of love over me.\n" +
                        "Sustain me with love, refresh me,\n" +
                        "O Lord!\n" +
                        "O for more love for You my Lord !",
                "5 Draw me into th' \"everest\" of union\n" +
                        "Intimate union with Thee my God !\n" +
                        "For this Thou purposed Thy\n" +
                        "salvation!\n" +
                        "Draw me, draw me after Thee !",
                "",
                "",
                "Draw me (Lord) ! draw me (Lord) !\n" +
                        "Draw me, let us make haste.\n" +
                        "O King, draw me into Your inner\n" +
                        "chamber!\n" +
                        "Draw me, draw me after You !",
                "",
                "",
                "",
                "I'm seeking ! I'm longing (Lord) !\n" +
                        "Draw me, let us make haste.\n" +
                        "O Lord I yearn to walk with You !\n" +
                        "Draw me, draw me after You !",
                ""));

        allItems.add( new ListNumero("145", "Glorious in holiness,",
                "1. Glorious in holiness,\n" +
                        "On Thy throne exalted.\n" +
                        "In splendour and majesty !\n" +
                        "Glory to Thee Most High.",
                "2. God is love, He is Lord !\n" +
                        "He is the sovereign King,\n" +
                        "Self-existent and Immortal,\n" +
                        "Glory to God All-wise.",
                "3. Glory to God - Infinite,\n" +
                        "Self-sufficient in might ;\n" +
                        "Faithfulness belongs to God,\n" +
                        "The All-sufficient God !",
                "4. God of love and covenants,\n" +
                        "Infinite in power,\n" +
                        "God of Justice and of peace,\n" +
                        "Glory to the Creator !",
                "5. Our Lord is One God :\n" +
                        "The Blessed Trinity.\n" +
                        "Glory to God the Father,\n" +
                        "To the Son and Holy Ghost !",
                "6. Holy Father of mercies,\n" +
                        "Holy Son full of grace\n" +
                        "Holy Spirit Blessed Guide,\n" +
                        "Glory to Thee Most High !\n" +
                        "\n" +
                        "7. We thank Thee God and Father !\n" +
                        "We thank Thee Jesus Christ !\n" +
                        "For Thy eternal salvation\n" +
                        "Worked in us by the Spirit.\n" +
                        "\n" +
                        "8. Glory be to God on high,\n" +
                        "And on earth to the Spirit,\n" +
                        "Preparing a Blessed Bride\n" +
                        "For the Son of Glory !\n" +
                        "\n" +
                        "9 We wait for Thy coming Lord,\n" +
                        "Bridegroom of the Bride !\n" +
                        "Lord, come soon ! Come quickly,\n" +
                        "Lord\n" +
                        "That we might reign on high \n!",
                "WE BLESS Thee, we praise Thee Lord,\n" +
                        "Holy God is glory !\n" +
                        "We worship Thee Eternal King\n" +
                        "Glory to Thee Most High !",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("146", "PRAY ON ! Pray on ! The Lord commands",
                "1. PRAY ON ! Pray on ! The Lord commands\n" +
                        "Pray on and faint not child of God\n" +
                        "His promise stands His word is true\n" +
                        "The Lord commands, His church to pray\n" +
                        "Pray in the morning, Pray at noon,\n" +
                        "Pray in the evening, pray all night\n" +
                        "Pray when you're tired, and feel alone\n" +
                        "Pray for the Lord commands us pray!",
                "2. Pray when you're weak, pray\n" +
                        "when you're strong\n" +
                        "Pray when you're failed ! all hope is gone\n" +
                        "Pray when the storm is raging high\n" +
                        "Pray when like Pe'er you're sinking fast\n" +
                        "Pray ! for to God, your prayers are made\n" +
                        "In Jesus Name ! you stand to pray\n" +
                        "The Spirit's there to help you pray\n" +
                        "The Tri-une God will answer prayer.",
                "3. Pray for the Lord depends on you\n" +
                        "Pray till His will be done on earth\n" +
                        "Put on God's armour ! Watch and pray\n" +
                        "Pray for the Lord has bid you pray\n" +
                        "Pray for the Church ! Pray for the Lost\n" +
                        "Pray till His harvest is brought in\n" +
                        "Pray for yourself ! Pray for your friend,\n" +
                        "The Lord commands, Unceasing prayer.",
                "4. Pray even as the Master prayed\n" +
                        "Pray even as Abraham prayed\n" +
                        "Stand in the gap as Moses did\n" +
                        "Then pray as Daniel and Anna did\n" +
                        "Pray till all hallow His Great Name\n" +
                        "His kingdom come ! His reign begins\n" +
                        "Pray till the trumpet sound you hear\n" +
                        "The sky gives way THE LORD APPEARS.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("147", "YOU are the Sovereign Lord who keeps His promises",
                "YOU are the Sovereign Lord who keeps His promises\n" +
                        "You are the Great God who never fails\n" +
                        "I will trust in You for now and ever\n" +
                        "And I believe You for You are true.",
                "2. You turn my handicaps into great blessings\n" +
                        "And turn my sorrows to songs of praise\n" +
                        "I will trust in You for now and ever\n" +
                        "And I believe You for You are true.",
                "3. The shame of failure, the pain of labour\n" +
                        "Upon Your promise I cast them all\n" +
                        "And I count on You for now and ever\n" +
                        "And I believe You for You are True",
                "4. Measureless goodness, Infinite mercy\n" +
                        "Your loving kindness shall never fail\n" +
                        "My sufficiency for now and ever \n" +
                        "And I believe You for You are true.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("148", "CHRISTIAN, seek not yet repose",
                "1 CHRISTIAN, seek not yet repose ;\n" +
                        "Cast thy dreams of ease away,\n" +
                        "Thou art in the midst of foes :\n" +
                        "“Watch and pray.”",
                "2 Principalities and powers,\n" +
                        "Mustering their unseen array,\n" +
                        "Wait for thine unguarded hours :\n" +
                        "“ Watch and pray.”",
                "3. Gird thy heavenly amour on,\n" +
                        "Wear it ever night and day;\n" +
                        "Ambushed lies the evil one:\n" +
                        "“Watch and pray.”",
                "4. Hear the victors who o‟ercame;\n" +
                        "Still they mark each warrior‟s way ;\n" +
                        "All with one sweet voice exclaim,\n" +
                        "“Watch and pray.”",
                "5. Hear, above all, hear thy Lord,\n" +
                        "Him thou lovest to obey;\n" +
                        "Hide within thy heart His word,\n" +
                        "“Watch and pray.”",
                "6. Watch, as if on that alone\n" +
                        "Hung the issue of the day;\n" +
                        "Pray that help may be sent down:\n" +
                        "“Watch and pray.”",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("149", "J‟ESUS, keep me near the cross",
                "1. J‟ESUS, keep me near the cross:\n" +
                        "There a precious fountain,\n" +
                        "Free to all - a healing stream-\n" +
                        "Flows from Calvary‟s mountain.",
                "2. Near the cross, a trembling soul,\n" +
                        "Love and mercy found me;\n" +
                        "There the Bright and Morning Star\n" +
                        "Shed its beams around me.",
                "3. Near the cross! O Lamb of God,\n" +
                        "Bring its scenes before me;\n" +
                        "Help me walk from day to day,\n" +
                        "With its shadow o‟er me",
                "4. Near the cross, I‟ll watch and wait,\n" +
                        "Hoping, trusting ever,\n" +
                        "Till I reach the golden strand,\n" +
                        "Just beyond the river.",
                "",
                "",
                "",
                "In the cross, in the cross,\n" +
                        "be my glory ever;\n" +
                        "Till my raptured soul shall find\n" +
                        "Rest beyond the river.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("150", "YIELD not to temptation,",
                "1. YIELD not to temptation,\n" +
                        "For yielding is sin,\n" +
                        "Each victory will help you\n" +
                        "Some other to win ;\n" +
                        "Fight manfully onward, dark\n" +
                        "passions subdue,\n" +
                        "Look ever to Jesus,\n" +
                        "He‟ll carry you through.",
                "2. Shun evil companions,\n" +
                        "Bad language disdain,\n" +
                        "God‟s name hold in reverence,\n" +
                        "Nor take it in vain :\n" +
                        "Be thoughtful and earnest,\n" +
                        "kindhearted and true ;\n" +
                        "Look ever to Jesus,\n" +
                        "He‟ll carry you through.",
                "3. To him that o‟ercometh\n" +
                        "God giveth a crown ;\n" +
                        "Through faith we shall conquer,\n" +
                        "Though rarely cast down ;\n" +
                        "He who is our Saviour\n" +
                        "Our strength will renew;\n" +
                        "Look ever to Jesus,\n" +
                        "He‟ll carry you through.",
                "",
                "",
                "",
                "",
                "Ask the Saviour to help you,\n" +
                        "Comfort, strengthen, and keep you\n" +
                        "He is willing to aid you,\n" +
                        "He will carry you through.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("151", "THERE‟S not a friend like the lowly Jesus,",
                "1. THERE‟S not a friend like the lowly Jesus,\n" +
                        "No, not one ! No, not one !\n" +
                        "None else could heal all our soul‟s diseases,\n" +
                        "No, not one ! No, not one !",
                "2. No friend like Him is so high and holy,\n" +
                        "No, not one ! No, not one !\n" +
                        "And yet no friend is so meek and lowly,\n" +
                        "No, not one ! No, not one !",
                "3. There‟s not an hour that He is not near us,\n" +
                        "No, not one ! No, not one !\n" +
                        "No night so dark but His love can cheer us,\n" +
                        "No, not one ! No, not one !",
                "4. Did ever saint find this Friend forsake him ?\n" +
                        "No, not one ! No not one !\n" +
                        "Or sinner find that He would not take him ?\n" +
                        "No, not one ! No, not one !",
                "5. Was e‟er a gift like the Saviour given?\n" +
                        "No, not one ! No, not one !\n" +
                        "Will He refuse us a home in heaven?\n" +
                        "No, not one ! No, not one !",
                "",
                "",
                "Jesus knows all about our struggles,\n" +
                        "He will guide till the day is done ;\n" +
                        "There’s not a friend like the lowly Jesus,\n" +
                        "No, not one ! No, not one !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("152", "My hope is built on nothing less",
                "1. My hope is built on nothing less\n" +
                        "Than Jesus‟ blood and righteousness;\n" +
                        "I dare not trust the sweetest frame,\n" +
                        "But wholly lean on Jesus‟ name.",
                "2. When darkness hides His lovely face,\n" +
                        "I rest on His unchanging grace ;\n" +
                        "In every high and stormy gale,\n" +
                        "My anchor holds within the vail.",
                "3 His oath, His covenant, His blood,\n" +
                        "Support me in the‟ whelming flood;\n" +
                        "When all around my soul gives way,\n" +
                        "He then is all my hope and stay.",
                "4. When He shall come with trumpet sound,\n" +
                        "Oh, may I then in Him be found,\n" +
                        "Clothed in His righteousness alone,\n" +
                        "Faultless to stand before the throne!",
                "",
                "",
                "",
                "On Christ, the solid Rock, I stand ;\n" +
                        "All other ground is sinking sand,\n" +
                        "All other ground is sinking sand.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("153", "I AM thine, O lord, I have heard Thy voice,",
                "1. I AM thine, O lord, I have heard Thy voice,\n" +
                        "And it told Thy love to me ;\n" +
                        "But I long to rise in the arms of faith,\n" +
                        "And be closer drawn to thee.\n" +
                        "",
                "2. Consecrate me now to Thy service, Lord.\n" +
                        "By the power of grace divine ;\n" +
                        "Let my soul look up with a Steadfast hope,\n" +
                        "And my will be lost in Thine.",
                "3. Oh, The pure delight of a single hour\n" +
                        "That before Thy throne I spend,\n" +
                        "When I kneel in prayer, and with Thee, my God,\n" +
                        "I commune as friend with friend.",
                "4. There are depths of love that I cannot know\n" +
                        "Till I cross the narrow sea ;\n" +
                        "There are heights of Joy that I may not reach\n" +
                        "Till I rest in peace with Thee.",
                "",
                "",
                "",
                "Draw me nearer, nearer, blessed Lord.\n" +
                        "To the cross where Thou hast died\n" +
                        "Draw me nearer, nearer, blessed Lord,\n" +
                        "To thy precious, bleeding side.",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("154", "THERE‟S a call comes ringing",
                "1. THERE‟S a call comes ringing o‟er the restless wave,\n" +
                        "“Send the light, ...send the light !...”\n" +
                        "There are souls to rescue, there are souls to save,\n" +
                        "“Send the light, ...send the light! ...”",
                "2 We have heard the\n" +
                        "2 We have heard the\n" +
                        "“Send the light, ... send the light!...”\n" +
                        "And our grateful offerings at the cross we lay,\n" +
                        "“Send the light, send the light ! ..”",
                "3 May the grace of Jesus unto all abound,\n" +
                        "“Send the light, ... send the light!...”\n" +
                        "And the Christlike spirit everywhere be found.\n" +
                        "“Send the light, ...send the light!...”",
                "4 Let us not grow weary in the work or love,\n" +
                        "“Send the light, ...send the light!...”\n" +
                        "While we gather Jewels for our crown above,\n" +
                        "“Send the light, ...send the light !...”",
                "",
                "",
                "",
                "Send the light, the blessed gospel light!\n" +
                        "Let it shine from shore to shore !\n" +
                        "Send the light, the blessed gospel light!\n" +
                        "Let it shine for evermore !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("155", "Triumphing into Jerusalem",
                "1 Triumphing into Jerusalem\n" +
                        "To be crucified there.\n" +
                        "Christ was crucified,\n" +
                        "He died for me.\n" +
                        "I know that Jesus is mine\n" +
                        "I know !",
                "2 He arose from death He is alive,\n" +
                        "Conquering the power of death,\n" +
                        "He was seen by men.\n" +
                        "Who loved Him so\n" +
                        "That they should tell the world.\n" +
                        "I know !",
                "3 He's already gone up to heaven,\n" +
                        "To prepare a place for us.\n" +
                        "He is coming back\n" +
                        "To take us home.\n" +
                        "I know that Jesus is mine.\n" +
                        "I know !",
                "4 He has laid a burden on our hearts,\n" +
                        "To win more souls for Him.\n" +
                        "And this is our task in Cameroon,\n" +
                        "Until His coming again.\n" +
                        "I know !",
                "",
                "",
                "I KNOW ! I know\n" +
                        "I know that Jesus is mine.\n" +
                        " (x2)",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("156", "IF YOU believe and I believe",
                "1. IF YOU believe and I believe\n" +
                        "And we together pray.\n" +
                        "The Holy Spirit will come down\n" +
                        "And Yaounde will be saved.\n" +
                        "And Yaounde will be saved   (2x)\n" +
                        "Holy Spirit will come down\n" +
                        "And Yaounde will be saved.",
                "2. Cameroon",
                "3. Africa",
                "4 The whole world.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("157", "ONE step more.",
                "1. ONE step more.\n" +
                        "O ! one step more.\n" +
                        "Give me grace for one step more.\n" +
                        "One step more my Saviour,\n" +
                        "One step more,\n" +
                        "Grace for one step more.",
                "2. Love",
                "3. Hope",
                "4. Peace",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("158", "Jesus walks with me every day",
                "1. Jesus walks with me every day\n" +
                        "Even as He promised\n" +
                        "Lo ! I am with you\n" +
                        "Even unto the end of the world\n" +
                        "I will never leave you\n" +
                        "Neither will I forsake you\n" +
                        "So He walks with me\n" +
                        "Every day of my life.",
                "2. Cast your burden on the Lord\n" +
                        "And He will sustain you\n" +
                        "All Godliness exalted a nation\n" +
                        "Brother cast your burden on the Lord\n" +
                        "And He will sustain you\n" +
                        "He will walk with you\n" +
                        "Every day of your life.",
                "",
                "",
                "",
                "",
                "I BELIEVE, I believe that Jesus\n" +
                        "Walks with me every day\n" +
                        "He talks with me every hour\n" +
                        "He walks with me every\n" +
                        "day of my life         ( 2x )",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("159", "GLORIFIED, risen and ascended",
                "1. GLORIFIED, risen and ascended\n" +
                        "Glorified risen Lord\n" +
                        "Glorified, risen and ascended\n" +
                        "Glorified risen Lord.",
                "2 He is the King of kings,\n" +
                        "He is the Lord of lords,\n" +
                        "He is the King of kings\n" +
                        "And Lord of lords.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("160", "BLESSÈD is every one that feareth the Lord",
                "1. BLESSÈD is every one that,\n" +
                        " feareth the Lord         (2x)\n\n" +
                        "Blessed is every one that walketh in His ways\n" +
                        "Blessed is every one that feareth the Lord",
                "2 They that trust in the Lord\n" +
                        "Shall be like mount Zion     (2x)\n\n" +
                        "Which cannot be removed\n" +
                        "But abideth for ever\n" +
                        "They that trust in the Lord\n" +
                        "Shall be like mount Zion.\n" +
                        "Blessed...",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("161", "JESUS, you're my Redeemer",
                "1. JESUS, you're my Redeemer\n" +
                        "Thank you, Lord You saved my soul.\n" +
                        "Jesus You're my Redeemer\n" +
                        "Thank you Lord\n" +
                        "You saved me from my sin.",
                "2. Jesus went to prepare us a place\n" +
                        "At the right hand of the Father Hallelujah !\n" +
                        "He will come again to take us to be with Him\n" +
                        "Our own Joy in Jesus is that we are saved\n" +
                        "Hallelujah !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("162", "I AM on the Rock,",
                "1. I AM on the Rock,\n" +
                        "The Rock at last\n" +
                        "I am on the Rock at last,\n" +
                        "My soul has found\n" +
                        "A resting place,\n" +
                        "I am on the Rock at last.",
                "2 Jesus is the Rock,\n" +
                        "The Rock indeed,\n" +
                        "Jesus is the Rock indeed,\n" +
                        "My soul has found\n" +
                        "A resting place,\n" +
                        "Jesus is the Rock indeed.",
                "3 Are you on the Rock ?\n" +
                        "The Rock at last,\n" +
                        "Are you on the Rock at last ?\n" +
                        "Has your soul found\n" +
                        "A resting place ?\n" +
                        "Are you on the Rock at last ?",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("163", "WHO is like unto Thee ? O ! Lord",
                "WHO is like unto Thee ? O ! Lord\n" +
                        "Who is like unto Thee ? O ! Lord\n" +
                        "Among the gods\n" +
                        "Who is like Thee ?\n" +
                        "Glorious in holiness\n" +
                        "Fearful in praises\n" +
                        "Doing wonders Hallelujah !",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("164", "I HAVE seen ! seen !",
                "1. WHEN I look at the front.\n" +
                        "I see Jesus victorious.\n" +
                        "When I look at my back,\n" +
                        "I see Jesus victorious.\n" +
                        "When I look at my left,\n" +
                        "I see Jesus victorious.\n" +
                        "When I look at my right,\n" +
                        "I see Jesus victorious. Ch1",
                "2. When I look at the front,\n" +
                        "I see Satan has fallen.\n" +
                        "When I look at my back,\n" +
                        "I see Satan has fallen.\n" +
                        "When I look at my right,\n" +
                        "I see Satan has fallen\n" +
                        "When I look at my left,\n" +
                        "I see Satan has fallen. Ch2",
                "",
                "",
                "",
                "",
                "I HAVE seen ! seen !\n" +
                        "The victory of Jesus,\n" +
                        "Glory be to God,\n" +
                        "Glory be to Jesus,\n" +
                        "I have seen ! seen !\n" +
                        "The victory of Jesus,\n" +
                        "Glory be to God Amen",
                "I have seen ! seen !\n" +
                        "The downfall of Satan,\n" +
                        "Glory be to God.\n" +
                        "Glory be to Jesus,\n" +
                        "I have seen ! seen !\n" +
                        "The downfall of Satan\n" +
                        "Glory be to God Amen !",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("165", "YOU love the world !",
                "1. YOU love the world !\n" +
                        "And the things of the world You love\n" +
                        "You love the world ! And the things\n" +
                        "of the world You love.",
                "2.. Your neighbour is in need !\n" +
                        "And you're able to help him in his need\n" +
                        "You let him go ! and you ask him to pray about it.",
                "3. You live at ease,\n" +
                        "With abundance of food, and clothes\n" +
                        "You close your eyes to the plight \n" +
                        "of lost souls around you. Ch.",
                "4. The Lord commands !\n" +
                        "You preach His great gospel in this world!\n" +
                        "To love the Lord ! is to live for \n" +
                        "salvation of souls  Ch.",
                "5. The Lord commands !\n" +
                        "To watch and to pray each night\n" +
                        "You're burdened with sleep !\n" +
                        "There's no fire for prayer in Your life ! Ch.",
                "6. To love the Lord !\n" +
                        "Is to live for salvation of lost souls\n" +
                        "Is to live for salvation of lost souls\n" +
                        "To watch and pray, to fast and to, give till it hurts",
                "",
                "Where is the love of God ?     (5 times)\n" +
                        "In Your heart.",
                "",
                "",
                "",
                "",
                "This is the love of God\n" +
                        "This is the love of God\n" +
                        "This is the love of God\n" +
                        "You will be close to Him\n" +
                        "You will receive a crown !\n" +
                        "When He comes !!"));

        allItems.add( new ListNumero("166", "There was no crown for Him of silver of gold",
                "1. There was no crown for Him of silver of gold.\n" +
                        "There was no diadem for Him to hold\n" +
                        "But blood adorned His brow and\n" +
                        "proud its stain He bore,\n" +
                        "And sinners gave to Him the crown He wore.",
                "2. He did not reign upon a throne of ivory,\n" +
                        "But He died upon the cross of Calvary.\n" +
                        "For sinners there He counted all He owned but loss,\n" +
                        "And He surveyed His kingdom from a cross.",
                "3 No purple robe He wore His bleeding wounds to hide,\n" +
                        "But stripes up-on His back He wore with pride.\n" +
                        "And from the wounds there flowed\n" +
                        "a crimson, cleansing stream,\n" +
                        "That was a cover for the soul unclean.",
                "",
                "",
                "",
                "",
                "",
                "A rugged cross, became His throne.\n" +
                        "His kingdom was in hearts alone.\n" +
                        "He wore His love in crimson red,\n" +
                        "And wore the thorns up-on His head.",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("167", "Pure and Holy Son of God",
                "1. Pure and Holy Son of God\n" +
                        "Taking on the form of man\n" +
                        "Leaving Heaven blest above\n" +
                        "Came to bring salvation down",
                "2. Righteous Father, Holy One\n" +
                        "Looking down on us with love\n" +
                        "Gave to us His only Son\n" +
                        "Sent with blessings from above",
                "3. Peace on earth goodwill to men,\n" +
                        "At his birth the angels sang\n" +
                        "Love and mercy from the throne\n" +
                        "through the earth this message rang.",
                "4. He came in love to bring us\n" +
                        "light in our darkness\n" +
                        "He came with peace to bring\n" +
                        "relief from our pain\n" +
                        "He came in Joy to bring us\n" +
                        "rest in our weariness\n" +
                        "He came with Love to bring us\n" +
                        "beauty again.",
                "",
                "",
                "",
                "",
                "But we took him and we nailed him\n" +
                        "To the cross made of wood,\n" +
                        "And we raised it high and dropped it\n" +
                        "In the ground were it stood,\n" +
                        "And the blood that flowed to the earth below ,\n" +
                        "Brought forgiveness to the world\n" +
                        "That had treated him so.",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("168", "Who can battle with the Lord",
                "",
                "",
                "",
                "",
                "",
                "",
                "Who can battle with the Lord\n" +
                        "Who can battle with the Lord\n" +
                        "Who can battle with the Lord    (x2)\n\n" +
                        "I say nobody, in heaven\n" +
                        "I say nobody, on the earth\n" +
                        "I say nobody, under the sea\n" +
                        "I say nobody , I say nobody\n\n" +
                        "Jesus Christ the only rock of ages (2x)\n" +
                        "Other rocks are sinking sand\n" +
                        "Who will battle for the Lord (3x)\n" +
                        "I say His Body (2x)\n\n" +
                        "I say His Body in heaven\n" +
                        "I say His Body on the earth\n" +
                        "I say His Body, His body to come\n" +
                        "I say His body, I say His body.\n\n" +
                        "We will go for God in our city\n" +
                        "We will go for Him in our nation\n" +
                        "We will go for Him in Africa\n" +
                        "We will go in the power of our God.\n\n" +
                        "(We will go for Him to planet earth)",
                "",
                "",
                "",
                "",
                "",
                ""));

        allItems.add( new ListNumero("169", "O Lord we are very very grateful",
                "1. I have a Father who will never ever fail me.\n" +
                        "I have a Father who will never ever fail me.\n" +
                        "Jesus is my Saviour who will never ever fail me.\n" +
                        "Rock of ages never ever fail.",
                "2. Your money, is sinking sand\n" +
                        "Your beauty, is sinking sand\n" +
                        "Even your family, is sinking sand\n" +
                        "Other rocks are sinking sand.",
                "3. He‟s the rock, the only rock of ages\n" +
                        "Other “rocks” are sinking sand\n" +
                        "Jesus Christ the only Rock of ages\n" +
                        "Other “rocks” are sinking sand.",
                "",
                "",
                "",
                "O Lord we are very very grateful\n" +
                        "For all You have done for us\n" +
                        "O Lord we are very very grateful\n" +
                        "And we say thank You our Lord",
                "",
                "",
                "",
                "",
                "",
                ""));






        //allItems.add( new ListNumero());
        // allItems.add( new ListNumero());
        // allItems.add( new ListNumero());

        return allItems;




    }


    private void initListeners() {

        listener = new BaseListener() {
            @Override
            public void onClick(int position) {

                Log.d( "", "" );
            }

            @Override
            public void onLongClick(int position) {

                Log.d( "", "" );

            }
        };
    }


}