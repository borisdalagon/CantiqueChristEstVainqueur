package com.cmfi.cantique.ui.numero;

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

import java.util.ArrayList;
import java.util.List;

public class NumeroFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    GridLayoutManager lLayout;
    private BaseListener listener;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate( R.layout.fragment_numero, container, false );

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



            allItems.add( new ListNumero( "1", "Grand Dieu, nous te bénissons",
                    "1. Grand Dieu, nous te\n" +
                            "bénissons,\n" +
                            "Nous célébrons tes louanges ;\n" +
                            "Eternel, nous t’exaltons\n" +
                            "De concert avec les anges,\n" +
                            "Et prosternés devant toi,\n" +
                            "nous t’adorons, Ô Grand Roi\n" +
                            "(bis",
                    "2. Puisse ton règne de paix\n" +
                            "S’étendre par tout le monde;\n" +
                            "Dès maintenant à jamais,\n" +
                            "Que sur la terre et sur l’onde\n" +
                            "Tous genoux soient abattus\n" +
                            "Au nom du Seigneur Jésus.\n" +
                            "(bis)",
                    "3. Gloire soit au Saint-Esprit !\n" +
                            "Gloire soit à Dieu le Père !\n" +
                            "Gloire soit à Jésus-Christ\n" +
                            "Notre sauveur, notre frère;\n" +
                            "Son immense charité\n" +
                            "dure à perpétuité.  (bis)", "", "", "", "", "", "", "", "", "", "" ));

            allItems.add( new ListNumero( "2", "Christ est Vainqueur,",
                    "1. Christ est Vainqueur,\n" +
                            "Nous chantons sa victoire,\n" +
                            "Christ est vainqueur !\n" +
                            "Il a défait l’ennemi des élus,\n" +
                            "Pour toujours l’agneau règnera;\n" +
                            "Sa victoire dure à toujours\n" +
                            "Sa puissance dure à jamais ;\n" +
                            "A celui qui est assis sur le trône,\n" +
                            "l’honneur la louange, la gloire\n" +
                            "(bis)",
                    "2. Satan vaincu ,\n" +
                            "Nous chantons ta défaite;\n" +
                            "Tu es vaincu !\n" +
                            "Tu es tombé devant le Roi des\n" +
                            "rois,\n" +
                            "Pour toujours tu es renversé;\n" +
                            "Ta défaite dure à toujours\n" +
                            "Ta faiblesse dure à jamais;\n" +
                            "À celui qui accusait les élus,\n" +
                            "la confusion la honte.\n" +
                            "(bis)\n" +
                            "(bis)",
                    "3. Esprits méchants,\n" +
                            "Démons et dominations,\n" +
                            "Vous êtes confus !\n" +
                            "Votre royaume est jugé anéanti,\n" +
                            "Pour toujours Satan est vaincu ;\n" +
                            "Sa défaite dure à toujours\n" +
                            "Sa faiblesse dure à jamais ;\n" +
                            "A celui qui accusait les élus,\n" +
                            "la confusion la honte.\n" +
                            "(bis)",
                    "4. Tous les élus, de tout cœur,\n" +
                            "De toute âme, se sont unis !\n" +
                            "Soumis au Roi qui les a rachetés;\n" +
                            "C’est là le chemin de la gloire ;\n" +
                            "Leur victoire est assurée ;\n" +
                            "Leur puissance est en Jésus ;\n" +
                            "A celui qui est assis sur le trône,\n" +
                            "l’honneur la louange, la gloire.\n" +
                            "(bis)", "", "",
                    "",
                    "",
                    "", "", "", "", "" ));
            allItems.add( new ListNumero( "3",
                    "SAINT , saint, saint est l’Eternel",
                    "1. SAINT , saint, saint est\n" +
                            "l’Eternel\n" +
                            "le Seigneur Dieu des armées,\n" +
                            "son pouvoir est immortel,\n" +
                            "ses œuvres partout semées,\n" +
                            "font éclater sa grandeur\n" +
                            "sa majesté , sa splendeur !\n" +
                            "(bis)",
                    "2. Les Saints et les bienheureux\n" +
                            "les trônes et les puissances,\n" +
                            "toutes les vertus des cieux\n" +
                            "disent ses magnificences\n" +
                            "proclamant dans leurs concerts\n" +
                            "le GRAND DIEU de l’univers.\n" +
                            "(bis",
                    "3. L’illustre et glorieux chœur\n" +
                            "des apôtres, des prophètes,\n" +
                            "célèbre le Dieu Sauveur\n" +
                            "dont ils sont les interprètes;\n" +
                            "tous les martyrs couronnés\n" +
                            "chantent ses fidélités.\n" +
                            "(bis)",
                    "4. Sauve ton peuple, Seigneur,\n" +
                            "et bénis ton héritage,\n" +
                            "que ta gloire et ta splendeur\n" +
                            "soient à jamais ton partage\n" +
                            "conduis-le par ton amour\n" +
                            "jusqu’au céleste séjour.",
                    "", "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "4",
                    "Dans les cieux et sur la terre",
                    "1.Dans les cieux et sur la terre,\n" +
                            "il n’est aucun nom plus doux,\n" +
                            "aucun que mon cœur préfère\n" +
                            "au nom du CHRIST mort pour nous",
                    "2.Quelque grand que soit un homme," +
                            "qu’il soit prince ou qu’il soit roi,\n" +
                            "de quelque nom qu’on le nomme,\n" +
                            "JESUS est plus grand pour moi.",
                    "3.Les séraphins, les archanges\n" +
                            "portent des noms glorieux,\n" +
                            "mais le plus beau nom des anges\n" +
                            "pourrait-il me rendre heureux?\n" +
                            "Ch",
                    "4.dans les maux, Jésus\n" +
                            "soulage\n" +
                            "il guérit l’esprit froissé,\n" +
                            "il ranime le courage\n" +
                            "du cœur le plus oppressé.\n" +
                            "Ch.", "", "", "",
                    "Quel beau nom (bis)\n" +
                            "Porte l’oint de l’Eternel !\n" +
                            "Quel beau nom (bis)\n" +
                            "Que celui d’EMMANUEL !", "", "", "", "", "" ));
            allItems.add( new ListNumero( "5",
                    "Jésus est le nom du grand roi,",
                    "1..Jésus est le nom du grand roi,\n" +
                            "c’est le nom de mon amour,\n" +
                            "il me fait trembler de joie\n" +
                            "quand je pense à son retour.",
                    "2.Le Seigneur Jésus vient bientôt\n" +
                            "chercher les saints dispersés,\n" +
                            "quiconque est marqué de son sceau\n" +
                            "sera par lui appelé.\n" +
                            "Ch.",
                    "3.quand il descendra des cieux,\n" +
                            "resplendissant sur les nuées\n" +
                            "tous les élus bienheureux\n" +
                            "seront par lui rassemblés.\n" +
                            "Ch.",
                    "4.et la loi de la pesanteur\n" +
                            "sera pour de bon casée,\n" +
                            "quand les saints et leur rédempteur\n" +
                            "seront au ciel enlevés\n" +
                            "Ch.", "", "","",
                    "Quel beau jour (bis)\n" +
                            "Quand Jésus Christ reviendra\n" +
                            "Quel beau jour (bis)\n" +
                            "Que celui de son retour.",  "", "", "", "", "" ));
            allItems.add( new ListNumero( "6", "O Nom divin, nom rédempteur",
                    "1. O Nom divin, nom rédempteur\n" +
                            "Jésus, puissant Sauveur !\n" +
                            "(bis)\n" +
                            "nous prosternant tous devant toi",
                    "2. Avec les anges dans les cieux,\n" +
                            "les martyrs glorieux, (bis)\n" +
                            "qui jadis ont souffert pour toi . CH",
                    "3. Rachetés au prix de son sang,\n" +
                            "o sauveur tout puissant (bis)\n" +
                            "sauvés par grâce, et par la foi.\n" +
                            "Ch.",
                    "4. Bientôt nous te verront au ciel\n" +
                            "sur ton trône éternel (bis)\n" +
                            "Mais ne vivant déjà qu’en toi. Ch.", "", "",
                    "",
                    "Nous te couronnons, (bis)\n" +
                            "C’est toi Jésus, c’est toi que\n" +
                            "nous couronnons Roi .", "", "", "", "", "" ));
            allItems.add( new ListNumero( "7",
                    "Gloire ! Il est ressuscité",
                    "1. Gloire! Dieu l’a ressuscité\n" +
                            "Ah ! Il l’a délivré\n" +
                            "des liens de la mort ;\n" +
                            "Ah ! Jésus plus fort que Satan !\n" +
                            "Il a vécu sans pécher. Ch",
                    "2. Gloire ! Il a bravé la mort !\n" +
                            "Ah ! Il est ma victoire\n" +
                            "je n’ai peur de rien ;\n" +
                            "Ah ! Mon sauveur est tout puissant.\n" +
                            "Et c ’est lui qui est ma force .\n" +
                            " Ch.",
                    "3. Gloire ! Jésus-Christ est ma vie\n" +
                            "Ah !Il vit en moi et moi\n" +
                            "je vis pour lui ;\n" +
                            "Ah! il reviendra me chercher\n" +
                            "pour m’amener dans son ciel. Ch",
                    "4. Christ, t’appelle aujourd’hui;\n" +
                            "Viens, repens-toi\n" +
                            "Et n’endurcis pas ton cœur;\n" +
                            "Et, quand il viendra nous chercher\n" +
                            "Tu ne sera pas laisser.\n" +
                            "Ch.", "", "",
                    "Gloire ! Il est ressuscité\n" +
                            "Ah! Jésus est vivant nous vous l’annonçons;\n" +
                            "Ah ! Alléluia gloire à Dieu,\n" +
                            "Jésus a vaincu la mort", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "8",
                    "Alléluia ! Alléluia ! Alléluia! Alléluia!",
                    "1. Tu es le Berger,\n" +
                            "Nous ne manquerons de rien,\n" +
                            "Qui nous séparera de l’amour de Jésus\n" +
                            "Qui accusera les élus de Dieu ?\n" +
                            "Car le Seigneur est mort,\n" +
                            "Bien plus ressuscité. Ch.",
                    "2. Tu es le Berger,\n" +
                            "nous ne manquerons de rien,\n" +
                            "nous t’exaltons Seigneur\n" +
                            "et nous te célébrons (bis)\n" +
                            "nous prosternant devant ton trône ô Dieu\n" +
                            "car les cieux sont à toi,\n" +
                            "la terre ton marche pied.\n" +
                            "Ch.",
                    "", "", "", "",
                    "Alléluia ! Alléluia ! Alléluia! Alléluia!\n" +
                            "Alléluia ! Alléluia ! Alléluia ! Amen", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "9", "Esprit de Dieu, de vérité",
                    "1. Esprit de Dieu, de vérité,\n" +
                            "source de vie, de sainteté,\n" +
                            "c’est un grand honneur pour l’Eglise\n" +
                            "qui est sur le Roc assise\n" +
                            "de te chanter ses louanges, (bis)\n" +
                            "comme au ciel le font les anges.",
                    "2. Lorsque Jésus notre Seigneur\n" +
                            "nous promit un consolateur,\n" +
                            "l’Eglise chérie était sans force,\n" +
                            "saisie de crainte et tremblante\n" +
                            "sous la menace de l’épée (bis)\n" +
                            "les siens s’étaient enfermés",
                    "3. monté et près du Père assis,\n" +
                            "Jésus à qui tu t’es soumis,\n" +
                            "Auprès des siens t’as envoyé,\n" +
                            "plein de zèle tu es allé\n" +
                            "comme le feu est descendu (bis)\n" +
                            "sur chacun tu es venu.",
                    "4. l’enfer et le monde enragés,\n" +
                            "pour le combat, se sont rangés,\n" +
                            "mais ta puissance s’est déployée:\n" +
                            "le salut est proclamé\n" +
                            "et les pécheurs sont sauvés (bis)\n" +
                            "les captifs sont libérés.",
                    "5. Si l’Eglise est restée debout,\n" +
                            "a persévéré jusqu’au bout,\n" +
                            "c’est grâce à ton soutien Seigneur.\n" +
                            "Dans les temps de la douleur\n" +
                            "tu es resté son ami (bis)\n" +
                            "et tu as pris son parti.",
                    "6. nous te louons et t’adorons,\n" +
                            "nous te louons Te bénissons,\n" +
                            "Esprit de vie, de vérité,\n" +
                            "source de sainteté\n" +
                            "nous t’offrons nos vies, nos cœurs (bis)\n" +
                            "de Toi vient notre bonheur.", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "10",
                    "SAINT des saints ! Tout mon cœur",
                    "1. SAINT des saints !\n" +
                            "Tout mon cœur\n" +
                            "veut s’élever à toi (bis)\n" +
                            "tu me dit de chercher\n" +
                            "le regard de ta face,\n" +
                            "fais moi sentir\n" +
                            "ta Puissance efficace,\n" +
                            "Esprit de Dieu, vient soutenir ma foi. (bis)",
                    "2. Eternel , ton amour\n" +
                            "Te fit mon créateur :\n" +
                            "(bis)\n" +
                            "L’univers tout entier,\n" +
                            "Seigneur est ton ouvrage ;\n" +
                            "Mais tu formas\n" +
                            "Notre âme à ton image,\n" +
                            "Et pour t’aimer tu nous donna un cœur.",
                    "3. Ta bonté m’accueillit.\n" +
                            "Au matin de mes jours (bis)\n" +
                            "Tu veillas au berceau\n" +
                            "De ma fragile vie ;\n" +
                            "Par ta faveur ma route fut choisie,\n" +
                            "Mille bienfaits en marquèrent le cours. (bis)",
                    "4. Mais bientôt j’oubliai,\n" +
                            "Seigneur ! Ce tendre soin ; (bis)\n" +
                            "Trop souvent en mon cœur\n" +
                            "Je méconnus ta grâce.\n" +
                            "Que de mépris,\n" +
                            "Que d’orgueil et d’audace !\n" +
                            "Que de détours dont tu fus le témoin ! (bis)",
                    "5. Devant toi je rougis\n" +
                            "Et demeure confus (bis)\n" +
                            "Mais, Seigneur ! Ta pitié relève\n" +
                            "ma misère\n" +
                            "N’as-tu pas mis\n" +
                            "Entre elle et ta colère\n" +
                            "L’amour, la croix et le sang de Jésus ? (bis)",
                    "6. Oui Seigneur ! Tu m’entends\n" +
                            "Tu m’ôtes ma douleur,\n" +
                            "(bis)\n" +
                            "Je me sens ton enfant ;\n" +
                            "Mon Père je t’appelle,\n" +
                            "De ton secours\n" +
                            "La promesse est fidèle;\n" +
                            "Béni sois-tu ! Ta paix rentre en mon cœur.(bis)", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "11", "Jésus est le libérateur",
                    "1. Jésus est le libérateur\n" +
                            "Dont le salut m’inonde,\n" +
                            "Jésus le Tout-Puissant Sauveur\n" +
                            "Qui m’affranchit du monde.",
                    "2. Je me souviens de mon passé\n" +
                            "Baigné dans la misère,\n" +
                            "Quand le Seigneur m’a visité\n" +
                            "Et m’a conduit au Père.",
                    "3. Peux-tu nous dire ce qui t’arrive ?\n" +
                            "Me demande mes amis ;\n" +
                            "O ! Tout ce que je puis vous dire:\n" +
                            "J’ai rencontré le Messie.",
                    "",
                    "",
                    "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "12",
                    "Jésus, Jésus, Jésus, Jésus",
                    "1. Jésus, Jésus, Jésus, Jésus\n" +
                            "Seul Nom que mon cœur aime,\n" +
                            "Je voudrais ne prononcer plus\n" +
                            "Qu’un seul mot ce Nom même.",
                    "2. Jésus, Jésus, ce Nom si\n" +
                            "beau,\n" +
                            "C’est celui dont les anges,\n" +
                            "Prosternés autour de l’agneau\n" +
                            "Remplissent leurs louanges.",
                    "3. Jésus, c’est le Nom de celui\n" +
                            "Qui descendit du Père,\n" +
                            "Dont l’amour sur la croix à lui,\n" +
                            "En qui la terre espère.",
                    "4. Jésus, Jésus, Jésus, Jésus,\n" +
                            "Bientôt mon cœur qui t’aime,\n" +
                            "Auprès de toi ne dira plus\n" +
                            "Qu’un seul mot, ton Nom même.", "", "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "13",
                    "Mon Jésus , je t’aime",
                    "1. Mon Jésus , je t’aime\n" +
                            "Je te sais à moi.\n" +
                            "Oh ! Quel charme extrême\n" +
                            "me retiens à toi !\n" +
                            "Les plaisirs du monde\n" +
                            "ne m’attirent plus,\n" +
                            "Ton amour m’inonde\n" +
                            "Je t’aime, Ô Jésus !",
                    "2. Mon Jésus, je t’aime,\n" +
                            "Car tu m’as sauvé.\n" +
                            "En t’offrant toi-même,\n" +
                            "ton sang m’a lavé !\n" +
                            "Sur la croix bénie,\n" +
                            "pour moi, tu mourus\n" +
                            "Ta mort est ma vie,\n" +
                            "je t’aime, Ô Jésus !",
                    "3. Qu’ici bas je t’aime\n" +
                            "Jusque dans la gloire\n" +
                            "À l’heure suprême\n" +
                            "de l’enlèvement\n" +
                            "Ma voix triomphante\n" +
                            "se fera entendre\n" +
                            "Sachez que je chante,\n" +
                            "je t’aime, Ô Jésus !",
                    "4. Je verrai ta face,\n" +
                            "Quel ravissement !\n" +
                            "Je louerai ta grâce éternellement,\n" +
                            "Et dirai sans cesse avec les élus,\n" +
                            "L’hymne d’allégresse\n" +
                            "je t’aime, Ô Jésus !", "", "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "14",
                    "Jésus est notre ami suprême",
                    "1. Jésus est notre ami suprême\n" +
                            "Oh ! Quel Amour !\n" +
                            "Mieux qu’un tendre Frère tu nous\n" +
                            "aime;\n" +
                            "Oh ! Quel Amour !\n" +
                            "Ici parents, amis, tout passe;\n" +
                            "le bonheur parait et s’efface;\n" +
                            "son cœur seul jamais ne se lasse\n" +
                            "...\n" +
                            "Oh ! Quel Amour !",
                    "2. il est notre vie éternelle;\n" +
                            "oh ! Quel amour !\n" +
                            "Célébrons son œuvre immortelle;\n" +
                            "Oh ! Quel amour !\n" +
                            "Par son sang notre âme est\n" +
                            "lavée;\n" +
                            "au désert il l’avait trouvée,\n" +
                            "dans son bercail il l’a sauvée;\n" +
                            "Oh ! Quel amour !",
                    "3. Seigneur Jésus ! Fais nous comprendre\n" +
                            "tout ton Amour !\n" +
                            "Dans nos cœurs, tu as daigné\n" +
                            "répandre\n" +
                            "Tout ton Amour !\n" +
                            "Que cet Amour soit notre vie !\n" +
                            "Qu’à jamais notre âme ravie !\n" +
                            "Savoure une joie infinie en ton Amour !",
                    "",
                    "", "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "15",
                    "Quel ami fidèle et tendre",
                    "1. Quel ami fidèle et tendre\n" +
                            "nous avons en Jésus-Christ,\n" +
                            "toujours prêt à nous entendre\n" +
                            "à répondre à notre cri !\n" +
                            "Il connait nos défaillances,\n" +
                            "nos chutes de chaque jour.\n" +
                            "Sévère en ses exigences,\n" +
                            "il est riche en son Amour.",
                    "2. quel ami fidèle et tendre,\n" +
                            "nous avons en Jésus Christ\n" +
                            "toujours prêt à nous comprendre\n" +
                            "quand nous sommes en souci !\n" +
                            "Disons lui toute nos craintes,\n" +
                            "ouvrons lui tout notre cœur,\n" +
                            "Bientôt ses paroles saintes\n" +
                            "nous rendront le vrai bonheur.",
                    "3. quel ami fidèle et tendre,\n" +
                            "nous avons en Jésus Christ\n" +
                            "toujours prêt à nous défendre\n" +
                            "quand nous presse l’ennemi !\n" +
                            "Il nous suit dans la mêlée,\n" +
                            "nous entoure de ses bras,\n" +
                            "et c’est lui qui tient l’épée\n" +
                            "qui décide des combats.",
                    "4. quel ami fidèle et tendre,\n" +
                            "nous avons en jésus Christ\n" +
                            "toujours prêt à nous apprendre\n" +
                            "à vaincre en comptant sur lui !\n" +
                            "S’il nous voit vrais et sincères\n" +
                            "à chercher la sainteté, il écoute\n" +
                            "nos prières, et nous met en liberté.",
                    "5. quel ami fidèle et tendre,\n" +
                            "nous avons en jésus Christ\n" +
                            "Bientôt il viendra nous prendre\n" +
                            "pour être au ciel avec lui !\n" +
                            "Suivons donc l’étroite voie\n" +
                            "en comptant sur son secours;\n" +
                            "Bientôt nous aurons la joie\n" +
                            "de vivre avec lui toujours.", "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "16",
                    "Je l’ai trouvé, je l’ai trouvé,",
                    "1. Je l’ai trouvé, je l’ai trouvé,\n" +
                            "le bonheur ineffable !\n" +
                            "Je suis sauvé, je suis sauvé,\n" +
                            "O joie inexprimable !\n" +
                            "Tous mes péchés sont effacés;\n" +
                            "le sang de Christ me lave;\n" +
                            "les jours de larmes sont passés\n" +
                            "je ne suis plus esclave !",
                    "2.Oh! Quel bonheur ! Oh ! Bonheur\n" +
                            "d’avoir Jésus pour maitre !\n" +
                            "O mon Sauveur, mon seul sauveur,\n" +
                            "A toi seul je veux être !\n" +
                            "Tu vins briser,\n" +
                            "puissant vainqueur,\n" +
                            "du mal la tyrannie,\n" +
                            "affranchissant mon pauvre cœur\n" +
                            "et me donnant ta vie.",
                    "3. Dans ton amour tu m’as\n" +
                            "cherché,\n" +
                            "Errant bien loin du Père;\n" +
                            "Tu m’as sauvé de mon péché,\n" +
                            "Tu fis de moi ton frère ;\n" +
                            "Et maintenant et pour jamais,\n" +
                            "Sous ton joug je me plie.\n" +
                            "Je ne puis vivre désormais\n" +
                            "Jésus que de ta vie !",
                    "4.Ah ! Laisse moi , chanter mon Roi\n" +
                            "Oui, qu’à genoux je chante !\n" +
                            "Jésus n’est il pas tout pour moi ?\n" +
                            "Gloire à sa croix sanglante !\n" +
                            "Sans se lasser, jour après jour ,\n" +
                            "Il m’aime, il m’aime encore ...\n" +
                            "Comment répondre à tant d’amour ?\n" +
                            "Je crois , j’aime et j’adore !",
                    "",
                    "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "17",
                    "Je ne sais pourquoi dans sa grâce,",
                    "1.Je ne sais pourquoi dans sa grâce,\n" +
                            "Jésus m’a tant aimé;\n" +
                            "Pourquoi, par son sang il efface\n" +
                            "Ma dette mon péché.",
                    "2. Je ne sais comment la lumière\n" +
                            "Éclaire tout mon cœur,\n" +
                            "Comment je compris ma misère\n" +
                            "Et reçus mon sauveur ! Ch.",
                    "3. Je ne sais quelle est la mesure\n" +
                            "De joie et de douleur\n" +
                            "Que pour moi faible créature\n" +
                            "Réserve mon sauveur. Ch.",
                    "4.Je ne sais quand de la victoire\n" +
                            "L’heure enfin sonnera,\n" +
                            "Quand l’agneau, l’Epoux, dans sa gloire\n" +
                            "Avec lui me prendra. Ch.",
                    "", "", "",
                    "Mais je sais qu’en lui j’ai la vie,\n" +
                            "Il m’a sauvé dans son amour\n" +
                            "Et gardé par sa main meurtrie,\n" +
                            "J’attends l’heure de son retour.", "", "", "", "", "" ));
            allItems.add( new ListNumero( "18",
                    "Nous étions tous errants",
                    "1.Nous étions tous errants\n" +
                            "Comme des brebis perdues,\n" +
                            "Chacun suivait sa propre voie;\n" +
                            "Il plut à celui que nous avions rejeté\n" +
                            "De nous sauver, de nous laver\n" +
                            "Et nous sommes enfant de Dieu.",
                    "2. A cause de toi le monde pour moi est crucifié\n" +
                            "Et tout ce qu’il m’offre de plus beau\n" +
                            "J’ai regardé tout cela comme de la boue\n" +
                            "A cause de toi mon sauveur,\n" +
                            "J’ai bien tout abandonné. Ch.",
                    "3.Et maintenant nous souffrons pour le Roi des rois,\n" +
                            "Notre royaume n’est point ici bas\n" +
                            "En attendant la gloire de la cité céleste.\n" +
                            "Allons mes frères portons la croix,\n" +
                            "et suivons notre Seigneur. Ch.",
                    "", "", "",
                    "Personne ne m’avait jamais aimé\n" +
                            "Jésus c’est toi qui m’a aimé\n" +
                            "De mon cœur cette belle\n" +
                            "mélodie s’élève à toi .", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "19",
                    "Le Nom de Jésus est si doux\n",
                    "1. Le Nom de Jésus est si doux\n" +
                            "De Dieu désarment le courroux,\n" +
                            "Ils nous appelle au rendez vous,",
                    "2. j’aime ce Nom dans le chagrin,\n" +
                            "Il me soutien sur le chemin,\n" +
                            "Sa musique est un son divin,\n" +
                            "Précieux Nom de Jésus ! CH",
                    "3. j’aime le Nom de mon sauveur,\n" +
                            "Car lui seul connait tout mon cœur,\n" +
                            "Lui seul me rend plus que vainqueur.\n" +
                            "Précieux nom de Jésus ! Ch.",
                    "4. et si parfois j’ai succombé\n" +
                            "Si dans le mal je suis tombé\n" +
                            "Son Nom puissant m’a relevé\n" +
                            "Précieux Nom de jésus ! Ch.",
                    "5. Et lorsqu’avec lui je serai,\n" +
                            "Et lorsqu’enfin je le verrai,\n" +
                            "Alors sans fin je redirai :\n" +
                            "Précieux nom de Jésus ! Ch.", "", "",
                    "Jésus ! Bénie soit ton Nom !\n" +
                            "Jésus ! Oh ! Merveilleux don !\n" +
                            "Jésus ! Suprême rançon,\n" +
                            "Sois adoré pour toujours.", "", "", "", "", "" ));
            allItems.add( new ListNumero( "20",
                    "REDEMPTEUR adorable,",
                    "1.REDEMPTEUR adorable,\n" +
                            "sur la croix attaché,\n" +
                            "Traité comme un coupable,\n" +
                            "brisé pour mon péché,\n" +
                            "Ton angoisse Suprême,\n" +
                            "ta douleur, ton tourment\n" +
                            "Me disent : vois je t’aime,\n" +
                            " j’ai pris ton châtiment",
                    "2. Abandonné du Père\n" +
                            "dans mon âme troublé,\n" +
                            "Buvant la coupe amère\n" +
                            "pour ton iniquité,\n" +
                            "De l’éternelle flamme,\n" +
                            "mon amour te sauva,\n" +
                            "Je mourus pour ton âme,\n" +
                            "pécheur à Golgotha !",
                    "3. Le sang de mes blessures,\n" +
                            "ma couronne de Roi,\n" +
                            "Toutes ces meurtrissures,\n" +
                            "comprends le c’est pour toi !\n" +
                            "J’ai subi ta souffrance,\n" +
                            "j’ai porté ta langueur :\n" +
                            "Contemple en assurance, ton\n" +
                            "Grand libérateur !",
                    "4. Ton amour me réclame,\n" +
                            "me voici, cher Sauveur ;\n" +
                            "Prend mon corps et mon âme\n" +
                            "pour prix de ta douleur.\n" +
                            "Oui, mon âme ravie\n" +
                            "désormais ne veut plus\n" +
                            "Que vivre de ta vie,\n" +
                            "A ta gloire, Jésus ! Ô Jésus.",
                    "", "", "",
                    "A toi la gloire, ô ressuscité !\n" +
                            "A toi la victoire, pour l’Eternité !", "", "", "", "", "" ));
            allItems.add( new ListNumero( "21",
                    "A Toi la gloire,",
                    "1. A Toi la gloire,\n" +
                            "O ressuscité !\n" +
                            "A toi la victoire\n" +
                            "Pour l’éternité !\n" +
                            "Brillant de lumière,\n" +
                            "L’ange est descendu,\n" +
                            "Il roule la pierre du tombeau vaincu.",
                    "2. Vois le paraitre !" +
                            " C’est lui c’est Jésus,\n" +
                            "Ton Sauveur, ton Maitre,\n" +
                            "Oh ! Ne doute plus !\n" +
                            "Sois dans l’allégresse, peuple du Seigneur,\n" +
                            "Et redis sans cesse que\n" +
                            "CHRIST est VAINQUEUR. Ch.",
                    "3.Craindrais je encore ?\n" +
                            "Il vit à jamais,\n" +
                            "Celui que j’adore, le Prince de Paix.\n" +
                            "Il est ma victoire," +
                            "Mon puissant soutien,\n" +
                            "Ma vie et ma Gloire, \n" +
                            "non je ne crains rien ! Ch.",
                    "",
                    "", "", "", "", "", "", "", "", "" ));
            allItems.add( new ListNumero( "22",
                    "O pourquoi, pourquoi suis je né ?",
                    "1.O pourquoi, pourquoi suis je né ?\n" +
                            "A quoi bon , à quoi bon vivre et mourir ?\n" +
                            "A quoi bon, à quoi bon ce monde\n" +
                            "Où tout passe, ou tout s’en va ?",
                    "2. c’est l’impasse, le noir autour de moi,\n" +
                            "Le chagrin et la peur, là au-dedans,\n" +
                            "Des questions, des questions sans réponses\n" +
                            "Tout au fond de mon cœur.",
                    "3. Il y a bien environ deux mille ans,\n" +
                            "Un beau jour, un jour, à Golgotha\n" +
                            "Jésus Christ, Jésus Christ a donné\n" +
                            "À la croix sa vie pour toi.",
                    "",
                    "", "", "",
                    "Dites moi ! O qui me dira\n" +
                            "D’où je viens, où je vais ?\n" +
                            "Je n’en peux plus !\n" +
                            "O ! Je sais, oui que je mourrai,\n" +
                            "Mais j’ignore où me conduit la mort !",
                    "O ton cœur est plein de péchés,\n" +
                            "Et Dieu dit : point de paix pour le méchant\n" +
                            "Mais ce Dieu, est le Dieu d’amour,\n" +
                            "Mon ami, repens toi, repens toi",
                    "Fils de Dieu il s’est abaissé\n" +
                            "Une histoire, une histoire\n" +
                            "Jamais contée.\n" +
                            "Innocent, il s »est humilié\n" +
                            "Jésus Christ, Jésus Christ, Fils de DIEU.", "", "", "" ));
            allItems.add( new ListNumero( "23",
                    "Tous les Saints Qui sont partis avant nous",
                    "1.Le Seigneur Jésus après avoir souffert,\n" +
                            "Est monté au ciel nous préparer une place,\n" +
                            "Il en reviendra comme il nous l’a promis,\n" +
                            "Pour amener ceux qui l’auront aimé.\n" +
                            "(Ch. 1)",
                    "2. Oui tous les apôtres ainsi que les prophètes\n" +
                            "Et tous les martyrs dont le sang a coulé,\n" +
                            "Oui tous les témoins qui furent méprisés,\n" +
                            "Se lèveront au son de la trompette.\n" +
                            "(Ch. 1)",
                    "3. Et nous le verrons pas comme dans un miroir,\n" +
                            "Nous le toucherons pas au travers d’un voile,\n" +
                            "Eh oui tel qu’il est, tel aussi nous serons,\n" +
                            "En toutes choses nous lui ressemblerons.",
                    "4. A Jérusalem il nous amènera,\n" +
                            "Dans la cité d’or préparée pour l’épouse,\n" +
                            "La salle du festin, les tables seront prêtes,\n" +
                            "Et avec nous, il boira à nouveau.\n" +
                            "(Ch. 2)",
                    "5. En ce jour là, il n y aura plus de mystère\n" +
                            "Nous le connaitrons comme il nous a connus,\n" +
                            "Et nous chanterons le cantique de l’agneau,\n" +
                            "Nous jetterons nos couronnes devant lui.\n" +
                            "(Ch. 2)", "",
                    "Tous les Saints Qui sont\n" +
                            "partis avant nous\n" +
                            "Se lèveront. Tous les Saints\n" +
                            "Qui nous avaient devancés\n" +
                            "Du tombeau surgiront (bis)", "", "",
                    "Au Grand Roi seront rendus\n" +
                            "Le royaume, le règne, la gloire\n" +
                            "Au grand Roi Seront rendus\n" +
                            "les hommages pour l’éternité.\n" +
                            "(bis)", "", "", "" ));
            allItems.add( new ListNumero( "24",
                    "Le Seigneur Nous a donné la victoire sur le péché",
                    "1.A Gethsémani où il fut arrêté,\n" +
                            "Comme à Golgotha, où il fut crucifié,\n" +
                            "Il a obéi à tous ses ennemis,\n" +
                            "Jusqu’à la mort et la mort de la croix.",
                    "2. Au troisième jour de ces temps difficiles,\n" +
                            "Marie Magdala se rendit au sépulcre ;\n" +
                            "Elle ne vit personne, personne comme Jésus,\n" +
                            "Rien que ce froid, ce vide, ce silence.",
                    "3. Marie Magdala s’était mise à pleurer,\n" +
                            "Quand soudains derrière, elle entendit : Marie !\n" +
                            "S’étant retournée elle reconnut le Roi,\n" +
                            "Se prosterna et elle l’adora.\n" +
                            "Ch.2",
                    "4.A Jérusalem ou se trouvaient les siens,\n" +
                            "Marie Magdala apporta la nouvelle;\n" +
                            "Mais personne ne crut à ce qu’elle annonçait,\n" +
                            "C’était trop beau, comme vérité.\n" +
                            "Ch.2", "", "",
                    "Le Seigneur\n" +
                            "Nous a donné la victoire sur le " +
                            "péché\n" +
                            "Le Seigneur nous a donné la\n" +
                            "Victoire\n" +
                            "Même sur la mort. (bis)", "",
                    "Le Seigneur était sorti du\n" +
                            "tombeau\n" +
                            "Au grand matin ;\n" +
                            "Le Seigneur avait déjà\n" +
                            "triomphé\n" +
                            "Du dernier ennemi. (bis)", "", "", "", "" ));
            allItems.add( new ListNumero( "25",
                    "Oh ! quel bonheur de le connaitre",
                    "1.Oh ! quel bonheur de le\n" +
                            "connaitre\n" +
                            "L’ami qui ne saurait changer,\n" +
                            "De l’avoir ici bas pour maitre,\n" +
                            "Pour défenseur et pour Berger !",
                    "2.Dans la misère et l’ignorance\n" +
                            "Nous nous débattions sans espoir,\n" +
                            "La mort au cœur, l’âme en souffrance\n" +
                            "Quand à nos yeux il se fit voir.\n" +
                            "Ch.",
                    "3. Il nous apporta la lumière,\n" +
                            "La victoire et la liberté;\n" +
                            "L’ennemi mordit la poussière,\n" +
                            "Pour toujours Satan fut dompté.\n" +
                            "Ch.",
                    "4. Vers l’avenir , marchons sans crainte\n" +
                            "Et sans souci du lendemain,\n" +
                            "Pas à pas nos pieds dans l’empreinte\n" +
                            "De ses pieds sur notre chemin.\n" +
                            "Ch.", "", "", "",
                    "Chantons, chantons d’un cœur joyeux\n" +
                            "Le grand amour du Rédempteur,\n" +
                            "Qui vint à nous du haut des cieux\n" +
                            "Et nous sauva du destructeur.\n"
                    , "", "", "", "", "" ));



        allItems.add( new ListNumero( "26", "Venez au sauveur qui vous aime,",
                "1.Venez au sauveur qui vous aime,\n" +
                        "Venez, il a brisé vos fers;\n" +
                        "Il veut vous recevoir lui-même,\n" +
                        "Ses bras vous sont ouverts.",
                "2. Venez, pécheurs, il vous appelle,\n" +
                        "Le bonheur est dans son amour !\n" +
                        "Ah ! Donnez lui ce cœur rebelle,\n" +
                        "Donnez sans retour. Ch.",
                "3. Le temps s’enfuit, l’heure s’écoule,\n" +
                        "Qui sait si nous vivrons demain ?\n" +
                        "Jésus est ici dans la foule ;\n" +
                        "Ah ! Saisissez sa main ! Ch.", "", "", "", "",
                "Oh ! Quel beau jour, sauveur fidèle,\n" +
                        "Quand nous appuyant sur ton bras,\n" +
                        "Dans la demeure paternelle\n" +
                        "nous porterons nos pas !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "27", "Qui me relève dans mes chutes ?",
                "1.Qui me relève dans mes chutes ?\n" +
                        "C’est Jésus-Christ !\n" +
                        "Qui combat pour moi dans mes luttes ?\n" +
                        "C’est Jésus-Christ !\n" +
                        "Jésus a parlé , je veux croire,\n" +
                        "que je puis lutter pour sa gloire\n" +
                        "Car mon bouclier, ma victoire,\n" +
                        "C’est Jésus-Christ !",
                "2. Je vais à mon Père, et ma voie\n" +
                        "C’est Jésus-Christ !\n" +
                        "Je suis bienheureux et ma joie\n" +
                        "C’est Jésus-Christ !\n" +
                        "Et, si même dans la souffrance,\n" +
                        "Mon cœur me parle d’espérance,\n" +
                        "C’est que j’ai mis ma confiance\n" +
                        "En Jésus-Christ.",
                "3. Sauvé, je ne me glorifie\n" +
                        "Qu’en Jésus-Christ ;\n" +
                        "Pour la terre et le ciel ma vie\n" +
                        "C’est Jésus-Christ .\n" +
                        "Bientôt adieu, choses mortelles !\n" +
                        "Loin de vous je prendrais des ailles\n" +
                        "Vers les demeures éternelles,\n" +
                        "Vers Jésus-Christ !", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "28", "Au pied de la croix sanglante",
                "1.Au pied de la croix sanglante,\n" +
                        "Où tu t’es donné pour moi,\n" +
                        "Mon âme émue et tremblante,\n" +
                        "O Jésus se livre à toi.",
                "2. Me voici pour ton service,\n" +
                        "Je ne garde rien pour moi,\n" +
                        "Sur l’autel du sacrifice,\n" +
                        "Je me place par la foi.\n" +
                        "Ch.",
                "3. Oui tu pris ma vie entière,\n" +
                        "Mis sur moi ton divin sceau;\n" +
                        "Tu fis d’un fils de poussière,\n" +
                        "Un enfant du Dieu Très-Haut.\n" +
                        "Ch.",
                "4.A la gloire, aux biens dumonde,\n" +
                        "Je renonce pour jamais.\n" +
                        "Que le Saint Esprit m’inonde,\n" +
                        "De ta joie et de ta paix !\n" +
                        "Ch.",
                "5.Si ma faiblesse est bien grande,\n" +
                        "Ta force est plus grande encore,\n" +
                        "O Jésus, qu’elle me rende\n" +
                        "fidèle jusqu’à la mort. Ch.",
                "6. O félicité suprême !\n" +
                        "Ta grâce est mon bouclier,\n" +
                        "Et je t’appartient, je t’aime,\n" +
                        "Toi qui m’aima le premier. Ch.", "",
                "Le parfait bonheur, (bis)\n" +
                        "C’est de mettre tout mon être à\n" +
                        "tes pieds, Seigneur !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "29", "MISÉRICORDE insondable !",
                "1.MISÉRICORDE insondable !\n" +
                        "Dieu peut-il tout pardonner .\n" +
                        "Absoudre un si grand coupable,\n" +
                        "Et mes péchés oublier ?",
                "2. Longtemps j’ai, loin de sa face,\n" +
                        "Provoqué son saint courroux,\n" +
                        "Fermé mon cœur à sa grâce,\n" +
                        "Blessé le sien devant tous. Ch.",
                "3. O jésus, à toi je cède,\n" +
                        "Je veux être libéré;\n" +
                        "De tout péché qui m’obsède\n" +
                        "Être à jamais délivré; Ch.",
                "4. Alléluia ! Plus de doute,\n" +
                        "Mon fardeau m’est enlevé;\n" +
                        "Pour le ciel, je suis en route;\n" +
                        "Heureux pour l’éternité. Ch.", "", "", "",
                "Jésus , je viens ! Je viens à Toi !\n" +
                        "Tel que je suis, Je viens à Toi !\n" +
                        "Jésus , je viens ! Je viens à Toi !\n" +
                        "Tel que je suis, prend-moi", "", "", "", "", "" ));
        allItems.add( new ListNumero( "30", "Tel que je suis, sans rien à moi,",
                "1.Tel que je suis, sans rien à moi,\n" +
                        "Sinon ton sang versé, pour moi,\n" +
                        "Et ta voix qui m’appelle à toi ;\n" +
                        "Agneau de Dieu, je viens ! Je viens !",
                "2. Tel que je suis, bien vacillant,\n" +
                        "En proie au doute, à chaque instant,\n" +
                        "Lutte au dehors, crainte au-dedans,\n" +
                        "Agneau de Dieu, je viens ! Je viens !",
                "3. Tel que je suis, ton cœur est prêt,\n" +
                        "À prendre le mien tel qu’il est,\n" +
                        "Pour tout changer, sauveur parfait:\n" +
                        "Agneau de Dieu, je viens ! Je viens !",
                "4. Tel que je suis, ton grand amour,\n" +
                        "À tout pardonné sans retour,\n" +
                        "Je veux être à toi dès ce jour,\n" +
                        "Agneau de Dieu, je viens ! Je viens !", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "31", "Jésus, par ton sang précieux,",
                "1.Jésus, par ton sang précieux,\n" +
                        "Enlève mon iniquité,\n" +
                        "Regarde-moi du haut des cieux,\n" +
                        "Dis-moi que tu m’as pardonné ...\n" +
                        "J’ai longtemps erré, cœur rebelle;\n" +
                        "Mais j’entend ta voix qui m’appelle,\n" +
                        "Au pied de ta croix maintenant,\n" +
                        "Tout confus, brisé, je me rends.",
                "2. Oh ! Le fardeau de mon péché,\n" +
                        "Dieu très saint, est trop grand pour moi,\n" +
                        "Je veux en être délivré,\n" +
                        "À cette heure, oh ! Révèle-toi\n" +
                        "Jésus, viens, sois ma délivrance,\n" +
                        "Seul tu peux calmer ma souffrance !\n" +
                        "Au pied de ta croix maintenant,\n" +
                        "Tout confus, brisé, je me rends.\n" +
                        "Ch.",
                "3. O Jésus, ton sang, précieux,\n" +
                        "A lavé mon iniquité ;\n" +
                        "Oui, tu m’as répondu des cieux,\n" +
                        "Ton amour m’as tout pardonné.\n" +
                        "Je te contemple et je puis croire\n" +
                        "Qu’en toi j’ai complète victoire ...\n" +
                        "Au pied de ta croix maintenant\n" +
                        "Je me relève triomphant !", "", "", "", "",
                "Blanc, plus blanc que neige (bis)\n" +
                        "Lavé dans le sang de l’agneau,\n" +
                        "Je serai plus blanc que la neige!", "",
                "Blanc, plus blanc que neige, (bis)\n" +
                        "Lavé dans le sang de l’Agneau,\n" +
                        "Mon cœur est plus blanc que la neige.", "", "", "" ));
        allItems.add( new ListNumero( "32", "Ne crains rein, je t’aime !",
                "1.Ne crains rein, je t’aime !\n" +
                        "Je suis avec toi !\n" +
                        "Promesse suprême qui soutient ma foi.\n" +
                        "La sombre vallée n’as plus de terreur,\n" +
                        "L’âme consolée, je marche avec mon sauveur.",
                "2. l’aube matinière\n" +
                        "Ne luit qu’au beau jour\n" +
                        "Jésus, ma lumière, m’éclaire toujours !\n" +
                        "Quand je perd de vue l’astre\n" +
                        "radieux,\n" +
                        "A travers la nue,\n" +
                        "Jésus me montre les cieux !\n" +
                        "Ch.",
                "3. Les dangers accourent,\n" +
                        "Subtils, inconnus:\n" +
                        "de près ils m’entourent,\n" +
                        "Plus près est Jésus,\n" +
                        "qui dans le voyage, me\n" +
                        "redit:c’est moi !\n" +
                        "Ne crains rien courage : je suis\n" +
                        "toujours avec toi.", "", "", "", "",
                "Non jamais tout seul (bis)\n" +
                        "Jésus mon sauveur me garde\n" +
                        "Jamais ne me laisse seul\n" +
                        "Non, jamais tout seul (bis)\n" +
                        "Jésus mon sauveur me garde\n" +
                        "Je ne suis jamais tout seul.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "33", "Oh ! C’est la croix notre chemin",
                "1.Oh ! C’est la croix notre chemin,\n" +
                        "Sur ce chemin il faut quitter\n" +
                        "et le monde et le moi Et tous\n" +
                        "ceux qui nous sont chers.\n" +
                        "Oui pour la gloire du Seigneur,\n" +
                        "nous ne faillirons pas\n" +
                        "S’il faut perdre la vie, oui nous mourrons.",
                "2.Très difficile d’avancer,\n" +
                        "De tous côtés toujours pressés,\n" +
                        "le courant contre nous, Mais à\n" +
                        "Jésus, nous regardons.\n" +
                        "Oui nous ne faillirons pas Notre\n" +
                        "Dieu est vivant,\n" +
                        "par la force de son bras, nous\n" +
                        "sommes vainqueurs.",
                "3. Adieu papa, adieu maman,\n" +
                        "A nous revoir les chers amis,\n" +
                        "Sur le champ du combat\n" +
                        "j’entends une voix qui m’appelle.\n" +
                        "Oui, c’est la voix du Seigneur,\n" +
                        "Qui m’appelle, qui m’appelle,\n" +
                        "Me voici mon Jésus je te suivrai", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "34", "Entre tes mains j’abandonne",
                "1.Entre tes mains j’abandonne\n" +
                        "Tout ce que j’appelle mien\n" +
                        "Oh ! Ne permet à personne,\n" +
                        "Seigneur d’en reprendre rien !",
                "2. Je n’ai pas peur de te suivre\n" +
                        "Sur le chemin de la croix;\n" +
                        "C’est pour toi que je veux vivre,\n" +
                        "je connais j’aime ta voix.",
                "3. tu connais mieux que moi-même\n" +
                        "Tous les besoins de mon cœur\n" +
                        "Et, pour mon bonheur suprême,\n" +
                        "Tu peux me rendre vainqueur:",
                "4. Prends mon corps et prends mon âme\n" +
                        "que tout en moi soit à toi;\n" +
                        "Que par ta divine flamme,\n" +
                        "tout mal soit détruit en moi !", "", "", "",
                "Oui, prends tout Seigneur ! (bis)\n" +
                        "Entre tes mains j’abandonne tout\n" +
                        "avec bonheur.",
                "Oui, prends tout Seigneur ! (bis)\n" +
                        "Sans rien garder je te livre tout\n" +
                        "avec bonheur.",
                "Oui, prends tout, Seigneur ! (bis)\n" +
                        "Je ne vis plus pour moi-même,\n" +
                        "mais pour mon sauveur.",
                "Oui, prends tout Seigneur ! (bis)\n" +
                        "Prends mon corps et prends mon âme;\n" +
                        "Règne sur mon cœur!", "", "" ));
        allItems.add( new ListNumero( "35", "L’heure approche, la nuit vient",
                "1.l’heure approche, la nuit vient\n" +
                        "Où je n’pourrais plus\n" +
                        "Me lever, travailler ; il sera trop tard.",
                "2. Le temps s’envole, il s’enfuit,\n" +
                        "Que n’puis-je l’arrêter ?\n" +
                        "Mais il court, mais il court,\n" +
                        "Qui peut le servir ?\n" +
                        "Ch.",
                "3. La souffrance, et la douleur,\n" +
                        "Tout cela , passera\n" +
                        "Quand le Roi, reviendra,\n" +
                        "je verrai le bonheur.\n" +
                        "Ch.",
                "4. La couronne, de la vie,\n" +
                        "Me sera donné ; quand le Roi,\n" +
                        "Reviendra, je serai couronné.\n" +
                        "Ch.", "", "", "",
                "Le repos (bis)\n" +
                        "Ne se trouve qu’en lui,\n" +
                        "A présent, mon repos, c’est de\n" +
                        "le servir.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "36", "Dis-moi quel est le but de ta vie ?",
                "1.Dis-moi quel est le but de ta vie ?\n" +
                        "Ce que tu fais sur la terre.\n" +
                        "Sais-tu quel est le but de ma vie ?\n" +
                        "Gagner le monde pour Jésus.",
                "2. Nous devons l’évangile de Jésus,\n" +
                        "A tous les six continents.\n" +
                        "En Libye, en Russie, au Yémen.\n" +
                        "Jésus sera proclamé.\n" +
                        "Ch.",
                "3.Nous dirons que c’est pour nos péché,\n" +
                        "Qu’il fut cloué sur la croix.\n" +
                        "Nous irons annoncé qu’il est mort,\n" +
                        "Pour tous les hommes de la terre. Ch.",
                "4. Nous allons proclamés sa victoire,\n" +
                        "A toute la création,\n" +
                        "Nous devons exaltés sa grandeur,\n" +
                        "Et tout genoux fléchira.\n" +
                        "Ch.",
                "5. Nous ne trahirons pas le grand Roi,\n" +
                        "Il est l’Agneau immolé.\n" +
                        "Son sang n’a-t-il pas coulé pour nous ?\n" +
                        "Nous devons le couronner.\n" +
                        "Ch.", "", "",
                "Nous devons (bis)\n" +
                        "Faire de toutes les nations des disciples\n" +
                        "Le seigneur (bis)\n" +
                        "Ne nous l’a-t-il pas commandé ?", "", "", "", "", "" ));
        allItems.add( new ListNumero( "37", "Le monde m’a cloué sur cette croix infâme",
                "1.le monde m’a cloué sur cette\n" +
                        "croix infâme\n" +
                        "M’accablant sous les coups de\n" +
                        "sa brutalité\n" +
                        "Mais Dieu, pour te sauver versa\n" +
                        "sur mon âme\n" +
                        "Tout le bourbier fangeux de ton\n" +
                        "péché.",
                "2. Ne crains pas, ne crains pas,\n" +
                        "Ma brebis retrouvée\n" +
                        "Je saurai te défendre, ô toi que\n" +
                        "j’ai trouvée\n" +
                        "Comment guidée par moi,\n" +
                        "perdrais-tu ton chemin ?\n" +
                        "Quel ennemi pourrait te ravir de\n" +
                        "ma main ?",
                "3. Et serré contre lui, je sentais\n" +
                        "son cœur battre\n" +
                        "d’un rythme égale et fort, paisible\n" +
                        "et triomphant.\n" +
                        "Et le mien aussitôt cessa de se battre,\n" +
                        "Comme l’oiseau captif dans la\n" +
                        "main d’un enfant.", "", "", "", "",
                "Ne crains pas désormais,\n" +
                        "Pauvre brebis errante\n" +
                        "Tu ne connaitra plus\n" +
                        "l’angoisse ou l’épouvante\n" +
                        "Tout péché m’atteignit et j’en\n" +
                        "porta le poids\n" +
                        "Qui te condamnerait une\n" +
                        "seconde fois ?",
                "Aucun fardeau ne pèse à ma\n" +
                        "puissante épaule.\n" +
                        "De mes travaux sans fin, ton\n" +
                        "salut me console.\n" +
                        "Au prix dont je t’acquis,\n" +
                        "j’estime ta valeur.\n" +
                        "Maintenant, pose en paix ta\n" +
                        "tête sur mon cœur !\n",
                "Oh! Comme du berger je\n" +
                        "partageais la joie\n" +
                        "En trouvant ce repos cherché\n" +
                        "jadis en vain !\n" +
                        "L’amour à l’adversaire avait\n" +
                        "ravi sa proie\n" +
                        "Et me portait, paisible, au\n" +
                        "grand repos, le repos divin.", "", "", "" ));
        allItems.add( new ListNumero( "38", "MERVEILLEUX amour, Mystérieux amour",
                "1.Il m’a donné la vie\n" +
                        "C’est pourquoi je chante aujourd'hui\n" +
                        "Il m’a donné la vie\n" +
                        "Je veux être pour lui . Ch.",
                "2. Tu me dis mon enfant\n" +
                        "ma puissance est dans ta faiblesse\n" +
                        "Tu me dis mon enfant\n" +
                        "Ma grâce te suffit.\n" +
                        "Ch.", "", "", "", "",
                "MERVEILLEUX amour,\n" +
                        "Mystérieux amour\n" +
                        "De Jésus pour moi sur une croix\n" +
                        "Merveilleux amour\n" +
                        "Mystérieux amour\n" +
                        "De Jésus pour moi à Golgotha !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "39", "Toi égaré, connais-tu ton lendemain ?",
                "1.Toi égaré, connais-tu ton lendemain ?\n" +
                        "Dans tes chemins tu te sent heureux\n" +
                        "Mais souviens -toi ton long chemin obscur\n" +
                        "Te conduira droit vers la mort.",
                "2. Le crucifié t’appelle aujourd'hui\n" +
                        "Ses meurtrissures te donne la vie\n" +
                        "Son sang versé, sur la croix t’appelle\n" +
                        "Oui crois en lui, il est sauveur",
                "3. Qui donc perdrait, ami si tu refusais ?\n" +
                        "Serais-ce lui le fils de Dieu?\n" +
                        "Non ! Jésus-Christ\n" +
                        "Voudrait bien te sauver pour toi il a donné sa vie.", "", "", "", "",
                "Il frappe (Jésus-Christ) (Bis)\n" +
                        "L’agneau de Dieu\n" +
                        "Oui ! A ta porte\n" +
                        "Il frappe (Jésus-Christ) (Bis)\n" +
                        "Ouvre lui donc, car il t’implore.", "",
                "Il frappe (Jésus-Christ) (Bis)\n" +
                        "L’agneau de Dieu,\n" +
                        "Ton Rédempteur\n" +
                        "Il frappe (Jésus-Christ) (Bis)\n" +
                        "Après ce jour, il s’en irait\n" +
                        "Après ce jour, il sera trop tard.", "", "", "" ));
        allItems.add( new ListNumero( "40", "O ! DIEU merci, merci pour ton ESPRIT",
                "1.Toi mon ami, que fais-tu ici bas ?\n" +
                        "As-tu pensé à ton créateur ?\n" +
                        "Ne sais-tu pas qu’il t’a donné\n" +
                        "Un libérateur qui est Jésus ?",
                "2. Ecoute sa douce voix, au fond de ton cœur,\n" +
                        "Qui te dit : viens, viens mon enfant !\n" +
                        "Ne doute plus, crois en Jésus et\n" +
                        "tu auras le vrai bonheur. Ch.",
                "3.N’hésite pas, mais crois seulement !\n" +
                        "Au sang versé par Jésus, sur la croix\n" +
                        "Car bientôt, il reviendra pour\n" +
                        "chercher ceux qui auront cru. Ch.", "", "", "",
                "O ! DIEU merci, merci pour ton ESPRIT\n" +
                        "Merci pour ton fils Jésus-Christ\n" +
                        "Chantons à Dieu, chantons à notre Roi\n" +
                        "Celui qui nous donne la victoire.",
                "Reviens mon ami, reviens à Jésus !\n" +
                        "Car c’est toi qu’il cherche à sauver.\n" +
                        "Reviens, et crois, reviens et repens-toi\n" +
                        "Car il veut te donner son ESPRIT.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "41", "Toi qui dispose, de toutes choses,",
                "1.Toi qui dispose, de toutes choses,\n" +
                        "Et nous les donnent chaque jour,\n" +
                        "Reçois, ô Père ! Notre prière de\n" +
                        "reconnaissance et d’amour.",
                "2. Le don suprême, que ta main sème\n" +
                        "C’est notre pardon, c’est ta paix;\n" +
                        "Et ta clémence, trésor immense,\n" +
                        "Est le plus grand de tes bienfaits.",
                "3.que, par ta grâce, l’instant qui passe\n" +
                        "Serve à nous rapprocher de toi !\n" +
                        "Et qu’à chaque heure, vers ta demeure\n" +
                        "Nos cœur s’élève par la foi.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "42", "A JESUS je m’abandonne Ce qui me dit, je le crois,",
                "1.A JESUS je m’abandonne\n" +
                        "Ce qui me dit, je le crois,\n" +
                        "Et je prends, ce qu’il me donne,\n" +
                        "La couronne avec la croix.",
                "2. Que si l’ennemi se montre,\n" +
                        "Mon cœur n’en est point troublé;\n" +
                        "Avec CHRIST à sa rencontre\n" +
                        "Je puis aller sans trembler.",
                "3. Suis je en paix ? Vers la lumière\n" +
                        "Mon chant s’élève, attendri,\n" +
                        "Pour se changer, en prière\n" +
                        "Si l’horizon s’assombrit. Ch.",
                "4. Qu’on m’approuve ou qu’on me blâme,\n" +
                        "Et demain, comme aujourd’hui\n" +
                        "Je ne veux quoi qu’on réclame\n" +
                        "Jamais compter que sur lui. Ch.", "", "", "",
                "Compter sur lui d’heure en heure,\n" +
                        "Tant que dure le combat ;\n" +
                        "Que l’on vive ou que l’on meure\n" +
                        "Compter sur lui tout est là.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "43", "Qu’il fait bon à ton service, Jésus, mon sauveur !",
                "1.Qu’il fait bon à ton service,\n" +
                        "Jésus, mon sauveur !\n" +
                        "Qu’il est doux le sacrifice,\n" +
                        "Que t’offre mon cœur !",
                "2. Mon désir, mon vœu suprême\n" +
                        "C’est la sainteté !\n" +
                        "Rien je ne veux et je n’aime,\n" +
                        "Que ta volonté.\n" +
                        "Ch.",
                "3. comme l’ange au vol rapide\n" +
                        "Je veux te servir,\n" +
                        "Les yeux fixés sur mon guide,\n" +
                        "toujours obéir.\n" +
                        "Ch.",
                "4. travail, douleur et souffrance,\n" +
                        "Non, je ne crains rien !\n" +
                        "Toi, Jésus mon espérance,\n" +
                        "Voilà, mon seul bien !\n" +
                        "Ch.",
                "5. Ensemble donc vers la gloire,\n" +
                        "Marchons en avant !\n" +
                        "Chantant l’hymne de victoire\n" +
                        "toujours triomphant.\n" +
                        "Ch.", "", "",
                "Prends, ô Jésus prends ma vie,\n" +
                        "Elle est toute à toi !\n" +
                        "Et dans ta grâce infinie,\n" +
                        "Du mal garde-moi !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "44", "JESUS dit: je suis le chemin, La vérité, la vie.",
                "1.Si vous demeurez en moi et que mes paroles,\n" +
                        "Demeurent en vous,\n" +
                        "Demandez ce que vous voudrez.\n" +
                        "Et cela vous sera accordé.\n" +
                        "Ch.",
                "2. Jésus dit : je suis le pain de vie\n" +
                        "Celui qui viens à moi,\n" +
                        "N’aura jamais, jamais faim, Ch.",
                "3. Celui qui demeure en moi\n" +
                        "Et en qui je demeure,\n" +
                        "Porte beaucoup de fruit\n" +
                        "Car sans moi vous ne pouvez rien. Ch.",
                "4. Vous êtes la lumière du monde\n" +
                        "Et le se de la terre,\n" +
                        "Je suis avec vous chaque jour\n" +
                        "Jusqu’à la fin du monde. Ch.", "", "",
                "JESUS dit: je suis le chemin,\n" +
                        "La vérité, la vie. Demeurez tous en moi\n" +
                        "Et comme le Père m’a aimé\n" +
                        "Je vous ai aussi aimé,\n" +
                        "Demeurez dans son amour !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "45", "Roc séculaire, frappé pour moi",
                "1.Roc séculaire, frappé pour moi\n" +
                        "Sur le calvaire, je viens à toi\n" +
                        "Tu sais mes chutes,\n" +
                        "O mon sauveur !\n" +
                        "Tu vois mes luttes et ma douleur.",
                "2. Oh ! Purifie, lave, Seigneur,\n" +
                        "Et sanctifie, mon pauvre cœur,\n" +
                        "Ma main tremblante, ne t’offre rien,\n" +
                        "Ta croix sanglante, est mon seul bien. Ch.",
                "3.Dans la détresse, soit mon berger,\n" +
                        "Ma forteresse, dans le danger,\n" +
                        "Et qu’à tout heure, que chaque jour,\n" +
                        "Mon cœur demeure, en ton amour. Ch.", "", "", "", "",
                "Roc séculaire, frappé pour moi\n" +
                        "Sur le calvaire, je viens à toi", "", "", "", "", "" ));
        allItems.add( new ListNumero( "46", "Jésus est un trésor immense;",
                "1. Jésus est un trésor immense;\n" +
                        "O ! Quel trésor !\n" +
                        "Mieux que tous les biens il satisfait\n" +
                        "O ! Quel trésor !\n" +
                        "Ici argent, amour tout passe\n" +
                        "Les plaisirs viennent et s’envolent\n" +
                        "Jésus seul me rempli de joie,\n" +
                        "O ! Quel trésor !",
                "2. Je n’ai jamais manqué de rien;\n" +
                        "O ! Quel trésor !\n" +
                        "Il cherche à combler tous mes désirs\n" +
                        "O ! Quel trésor !\n" +
                        "Bien des fois, j’ai eu des besoins;\n" +
                        "En tout temps il m’a secouru;\n" +
                        "En lui j’ai connu l’abondance;\n" +
                        "O ! Quel trésor !",
                "3. Je sais que tu sera fidèle;\n" +
                        "Dans ton amour !\n" +
                        "Et que chaque jour de ma vie;\n" +
                        "Tu pourvoiras.\n" +
                        "Que tout ce monde tombe en faillite\n" +
                        "Que la crise fasse ses ravages,\n" +
                        "Je sais que tu tiendra tes promesses\n" +
                        "Dans ton amour.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "47", "O ! Toi qui dit que Jésus-Christ n’est pas vivant",
                "1.Et toi qui te livre aux plaisirs de la terre,\n" +
                        "ne sais-tu pas que c’est contre son esprit ?\n" +
                        "Jésus est venu te libérer de tout cela\n" +
                        "Pour que ta joie soit parfaite e lui.\n" +
                        "Ch.",
                "2. O toi qui te fit à ton intelligence,\n" +
                        "Ne sais-tu pas que c’est contre son Esprit ?\n" +
                        "Jésus est venu te libérer de tout cela\n" +
                        "Pour que ta joie soit parfaite e lui.\n" +
                        "Ch.",
                "3. O toi qui cherche à plaire\n" +
                        "aux hommes de la terre,\n" +
                        "Ne sais-tu pas qu’il te veut à lui tout seul ?\n" +
                        "Jésus est venu te libérer de tout cela\n" +
                        "Pour que ta joie soit parfaite e lui.\n" +
                        "Ch.",
                "4. O toi qui cherche à te sauver par ta force,\n" +
                        "Ne sais-tu pas que tu ne le pourras pas ?\n" +
                        "Jésus est venu te libérer de tout cela\n" +
                        "Pour que ta joie soit parfaite e lui.\n" +
                        "Ch", "", "",
                "O ! Toi qui dit que Jésus-Christ n’est pas vivant\n" +
                        "Viens donc goûter à la joie qu’il donne.\n" +
                        "Et toi qui aime ce qui ne te nourrit pas,\n" +
                        "Viens à Jésus et tu n’auras plus faim", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "48", "J’ai soif de ta présence,",
                "1.j’ai soif de ta présence,\n" +
                        "Divin chef de ma foi,\n" +
                        "Dans ma faiblesse immense\n" +
                        "Que ferais-je sans toi ?",
                "2. Des ennemis dans l’ombre,\n" +
                        "Rôdent autour de moi ;\n" +
                        "Accablé par le nombre,\n" +
                        "Que ferais-je sans toi ?",
                "3. Pendant les nuits d’orage,\n" +
                        "D’obscurité, d’éffroi,\n" +
                        "Quand faiblit mon courage,\n" +
                        "Que ferais-je sans toi ?",
                "4. O Jésus, ta présence,\n" +
                        "C’est la vie et la paix,\n" +
                        "La paix dans la souffrance,\n" +
                        "Et la vie à jamais .", "", "", "",
                "Chaque jour, à chaque heure,\n" +
                        "Oh ! Besoin de toi,\n" +
                        "Viens, Jésus, et demeure\n" +
                        "Auprès de moi.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "49", "C’est mon joyeux service",
                "1.C’est mon joyeux service\n" +
                        "D’offrir à Jésus-Christ,\n" +
                        "Un vivant sacrifice, mon corps et\n" +
                        "mon esprit.",
                "2. J’abandonne ma vie,\n" +
                        "Sans regret ni frayeur,\n" +
                        "A ta grâce infinie, O mon\n" +
                        "libérateur .",
                "3. Qu’un feu nouveau s’allume\n" +
                        "Par ton amour en moi,\n" +
                        "Et dans mon cœur consume ce\n" +
                        "qui n’est pas à toi !",
                "4. Viens, Jésus soit mon maitre;\n" +
                        "Par ton sang racheté,\n" +
                        "A toi seul, je veux être,\n" +
                        "Et pour l’éternité.", "", "", "",
                "Accepte mon offrande,\n" +
                        "Bien-aimé fils de Dieu,\n" +
                        "Et que sur moi descende la\n" +
                        "flamme du saint lieu !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "50", "Mon corps, mon cœur, mon âme ;",
                "1.Mon corps, mon cœur, mon\n" +
                        "âme ;\n" +
                        "Ne m’appartiennent plus ;\n" +
                        "Ton amour les réclame ;\n" +
                        "Ils sont à toi, Jésus !",
                "2. En toi je me confie,\n" +
                        "Je m’abandonne à toi ;\n" +
                        "Ton sang me purifie et ta grâce\n" +
                        "est ma loi.Ch",
                "3. Consacre mon offrande,\n" +
                        "Mets ton sceau sur mon cœur !\n" +
                        "Le sceau que je demande c’est\n" +
                        "ton Esprit Seigneur. Ch.",
                "", "", "", "", "", "", "", "", "", "" ));


        allItems.add( new ListNumero( "51", "Mon cœur joyeux, plein d’espérance,",
                "1.Mon cœur joyeux, plein d’espérance,\n" +
                        "S’élève à toi, mon rédempteur !\n" +
                        "Daigner écouté, avec clémence,\n" +
                        "Un pauvre humain, faible pécheur.\n" +
                        "En toi seul est ma confiance,\n" +
                        "En toi seul est tout mon bonheur.",
                "2. c’est vers ton ciel, que dans ma course,\n" +
                        "Je vois aboutir tout mes pas;\n" +
                        "De ton Esprit, la vive source\n" +
                        "Me rafraichit quand je suis las;\n" +
                        "Et dans le danger, ma ressource\n" +
                        "Est dans la force de ton bras.",
                "3. Le jour, je marche à ta lumière ;\n" +
                        "La nuit, je repose en ton sein;\n" +
                        "Dès le matin à ma prière,\n" +
                        "Tu viens éclairé mon chemin,\n" +
                        "Et chaque soir, ô mon bon Père,\n" +
                        "Tu prépare, mon lendemain.",
                "4. Je vois ainsi, venir le terme,\n" +
                        "De mon voyage en ces bas lieux,\n" +
                        "Et j’ai l’attente, vive et ferme,\n" +
                        "Du saint héritage des cieux ;\n" +
                        "Quand la trompette retentira,\n" +
                        "Je m’en irai victorieux !", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "52", "Toujours joyeux, telle est notre devise,",
                "1.Toujours joyeux, telle est notre devise,\n" +
                        "Joyeux d’avoir Jésus-Christ pour sauveur\n" +
                        "Oui joyeux même alors qu’on méprise,\n" +
                        "Rien ne saurait assombrir notre cœur.\n" +
                        "N’ayons pas peur, de l’adversaire !\n" +
                        "Marchons en chantant vers les cieux.\n" +
                        "Triomphant déjà sur la terre\n" +
                        "Toujours joyeux, toujours joyeux.",
                "2. Joyeux encore au fort de la bataille\n" +
                        "Nous combattrons pour lui toute la vie.\n" +
                        "Ah pourrions-nous pour plaire à qui raille\n" +
                        "Trahir jamais de Jésus le drapeau !\n" +
                        "Que nul de nous ne le renie !\n" +
                        "N’est-il pas un Roi glorieux ?\n" +
                        "Bravons pour lui la moquerie,\n" +
                        "Toujours joyeux, toujours joyeux !",
                "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "53", "Où iras-tu quand Jésus reviendra,",
                "1.Il y aura bientôt deux mille ans.\n" +
                        "Qu’il est venu mourir sur une croix\n" +
                        "À cause de toi, Jésus-Christ fut crucifié !\n" +
                        "Où iras-tu quand Jésus reviendra ? Ch.",
                "2. lorsqu’il était cloué sur ce bois,\n" +
                        "Voici ce qu’il a dit à son Père :\n" +
                        "Père pardonne-leur car ils ne\n" +
                        "savent ce qu’ils font\n" +
                        "Où iras-tu quand Jésus reviendra ? Ch.",
                "3. Viens avec nous viens te préparer !\n" +
                        "Tourne-toi aujourd’hui vers Jésus,\n" +
                        "Ouvre-lui ton cœur et donne-lui ta vie :\n" +
                        "Alors tu partiras avec Jésus.", "", "", "",
                "Où iras-tu quand Jésus reviendra,\n" +
                        "Quand il viendra chercher ses élus ?\n" +
                        "En un clin d’œil ils seront tous enlevés\n" +
                        "Où iras-tu quand Jésus reviendra ?", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "54", "Mon cœur voudrait t’aimer",
                "1. Mon cœur voudrait t’aimer\n" +
                        "Assez t’aimer,\n" +
                        "Pour pouvoir supporter\n" +
                        "Tout supporter:\n" +
                        "La souffrance et la peine,\n" +
                        "L’injustice et la haine.\n" +
                        "Je veux assez t’aimer\n" +
                        "Pour tout supporter.",
                "2. Mon cœur voudrait t’aimer\n" +
                        "Assez t’aimer,\n" +
                        "Pour pouvoir supporter\n" +
                        "Tout accepter,\n" +
                        "Quand je ne puis t’entende\n" +
                        "Accepter sans comprendre\n" +
                        "Je veux assez t’aimer\n" +
                        "Pour tout accepter.",
                "3. Mon cœur voudrais t’aimer\n" +
                        "Assez t’aimer,\n" +
                        "Pour pouvoir espérer,\n" +
                        "Tout espérer :\n" +
                        "La fin de la souffrance,\n" +
                        "La pleine délivrance.\n" +
                        "Je veux assez t’aimer\n" +
                        "Pour tout espérer.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "55", "Mon Dieu, plus près de toi Plus près de toi !",
                "1.Mon Dieu, plus près de toi,\n" +
                        "Plus près de toi !\n" +
                        "C’est le mot de ma foi :\n" +
                        "Plus près de toi .\n" +
                        "Dans les jours où l’épreuve\n" +
                        "Déborde comme un fleuve,\n" +
                        "Garde moi près de toi,\n" +
                        "Tout près de toi.",
                "2. Plus près de toi, Seigneur !\n" +
                        "Plus près de toi !\n" +
                        "Tiens-moi dans ma douleur\n" +
                        "tout près de toi.\n" +
                        "Alors que la souffrance\n" +
                        "Fait son œuvre en silence\n" +
                        "Toujours plus près de toi,\n" +
                        "Seigneur, Tiens-moi !",
                "3. Plus près de toi, toujours\n" +
                        "Plus près de toi !\n" +
                        "Donne-moi ton secours,\n" +
                        "Soutiens ma foi.\n" +
                        "Que Satan se déchaine,\n" +
                        "Ton amour me ramène\n" +
                        "Toujours plus près de toi,\n" +
                        "Plus près de toi.",
                "4. Mon Dieu plus près de toi !\n" +
                        "Dans le désert,\n" +
                        "J’ai vu plus près de toi,\n" +
                        "Ton ciel ouvert.\n" +
                        "Pèlerin bon courage !\n" +
                        "Ton chant brave l’orage ...\n" +
                        "Mon Dieu plus près de toi\n" +
                        "Plus près de toi.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "56", "Par la croix, oui ! J’entrerai au ciel",
                "1.Par la croix, oui ! J’entrerai au ciel\n" +
                        "Par la croix de mon Seigneur Jésus\n" +
                        "Par la croix, oui ! J’entrerai\n" +
                        "Dans les saints lieux de mon Dieu.",
                "2. Sur la croix, oui ! Mon Seigneur cria\n" +
                        "Oui ! Quand la souffrance excéda,\n" +
                        "Il souffrit pour moi pécheur,\n" +
                        "Moi objet sans valeur. Ch.",
                "3. Par la crois Jésus me délivra\n" +
                        "Car il vint mourir, oui ! À ma\n" +
                        "place il accepta l’outrage\n" +
                        "Et fit de moi son frère.", "", "", "", "",
                "Par la croix,\n" +
                        "Jésus mon Seigneur me sauva\n" +
                        "En mourant sur le calvaire\n" +
                        "Oui pour tous mes péchés.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "57", "JESUS est le Roc, le roc de mon salut.",
                "1.Il n y a pas longtemps\n" +
                        "J’étais égaré dans mon péché\n" +
                        "Mais Jésus est venu vers moi,\n" +
                        "Lui le bon berger pour me sauver.\n" +
                        "Il est l’agneau de Dieu qui ôte\n" +
                        "Le péché du monde !\n" +
                        "(bis)\n" +
                        "ère\n" +
                        "1 voix : Jésus\n" +
                        "2 ème voix : Jésus\n" +
                        "3 ème voix : Jésus\n" +
                        "4 ème voix : Jésus\n" +
                        "Jésus, Jésus est le Roc ! Ch.",
                "2. Oh quel changement\n" +
                        "Il a apporté dans toute ma vie\n" +
                        "Maintenant je suis son enfant.\n" +
                        "Oui, je le sais car il vit en moi.\n" +
                        "Jésus-Christ est le libérateur\n" +
                        "C’est lui qui transforme ! (bis)\n" +
                        "Jésus, Jésus, Jésus,\n" +
                        "Jésus, Jésus, Jésus est le Roc !\n" +
                        "Ch.",
                "3. Tout mon avenir\n" +
                        "Est bien assurer entre ses mains\n" +
                        "Ici bas, je vis pour lui seul\n" +
                        "Et bientôt il revient me chercher !\n" +
                        "Jésus a dit: je reviens bientôt,\n" +
                        "Oui ! Je reviens bientôt\n" +
                        "Oui ! Je viens bientôt.\n" +
                        "Jésus, Jésus, Jésus,\n" +
                        "Jésus, Jésus, Jésus est le Roc !\n" +
                        "Ch.", "", "", "",
                "JESUS est le Roc, le roc de mon salut.\n" +
                        "Si tu crois en lui, il te ressuscitera\n" +
                        "Au dernier jour pour la vie avec lui.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "58", "Le Seigneur Jésus il nous a aimé, il nous a choisis",
                "1.Nous étions errants comme des brebis\n" +
                        "Et chacun suivait sa voie\n" +
                        "Mais Jésus est venu vers nous,\n" +
                        "Plein de zèle et plein d’amour ;\n" +
                        "Il nous offrit gratuit le salut\n" +
                        "Et fit de nous ses élus ;\n" +
                        "C’est pourquoi nous proclamons son nom ! Ch.",
                "2. Il nous a envoyés dans le monde\n" +
                        "Pour annoncer l’évangile\n" +
                        "Qui délivre du péché\n" +
                        "Et guérit les cœurs brisés.\n" +
                        "Si tu te détourne de tes voies\n" +
                        "Jésus te pardonnera\n" +
                        "Comme nous, tu pourras aussi\n" +
                        "chanter.",
                "3. Quand la trompette retentira\n" +
                        "Jésus-Christ apparaitra ;\n" +
                        "Ceux qui l’auront rejeté\n" +
                        "Resteront et souffriront,\n" +
                        "Mais ceux qui l’auront toujours aimé\n" +
                        "Tous les morts et les vivants,\n" +
                        "Le rencontreront tous dans les airs.", "", "", "",
                "Le Seigneur Jésus,\n" +
                        "Il nous a aimé, il nous a choisis\n" +
                        "Pour être la lumière du monde ;\n" +
                        "Et c’est lui que nous attendons\n" +
                        "Car il revient très bientôt\n" +
                        "Pour chercher tous ceux qui auront cru.\n"
                , "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "59", "Entends-tu l’appel du maitre ?",
                "1.Entends-tu l’appel du maitre ?\n" +
                        "Il te veut pour moissonneur ;\n" +
                        "Réponds-lui : oui, je veux être,\n" +
                        "O Jésus ton serviteur !\n" +
                        "La moisson est déjà mûre,\n" +
                        "Les épis dorés sont pleins ;\n" +
                        "C’est l’instant où la nature\n" +
                        "Aime à nous livrer ses biens. Ch.",
                "2. Sous le soleil de l’Afrique\n" +
                        "Le païen meurt dans la nuit ;\n" +
                        "Jésus, ton Roi pacifique,\n" +
                        "A pourtant souffert pour lui.\n" +
                        "Quitte, ô Chrétien, ta patrie\n" +
                        "Pour servir au loin ton Roi.\n" +
                        "Va dire, au prix de ta vie\n" +
                        "Ce que Jésus fit pour toi. Ch.",
                "3. Main dans la mission lointaine\n" +
                        "Tous ne peuvent s’engager\n" +
                        "Ceux qui vont semer la graine,\n" +
                        "Tu dois les encourager ;\n" +
                        "Ils ont besoin d’argent : donne,\n" +
                        "De soutien : prie avec eux,\n" +
                        "Pour que l’ouvrier moissonne\n" +
                        "D’un cœur vaillant et joyeux.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "60", "Comme un fleuve immense est la paix de Dieu",
                "1.Comme un fleuve immense\n" +
                        "Est la paix de Dieu\n" +
                        "Parfaite elle avance,\n" +
                        "Vainqueur en tout lieu ;\n" +
                        "Parfaite elle augmente\n" +
                        "Constamment son cours ;\n" +
                        "Parfaite sa pente, s’abaisse toujours;",
                "2. Sous ta main meurtrie se\n" +
                        "brise ô mon Roi,\n" +
                        "Toute arme ennemie Faite contre moi !\n" +
                        "Rien ne peut me nuire,\n" +
                        "ni troubler mon cœur,\n" +
                        "Tu veux me conduire,\n" +
                        "Tu sera vainqueur. Ch.",
                "3. Tu traces ma voie,\n" +
                        "J’y marche avec foi\n" +
                        "L’épreuve et la joie,\n" +
                        "Me viennent de toi !\n" +
                        "Cadran de nos vies,\n" +
                        "Marque, chaque jour\n" +
                        "Les heures bénies,\n " +
                        "Du soleil d’amour .",
                "4. Océan de gloire, " +
                        "Paix de mon sauveur\n" +
                        "Gage de victoire ! " +
                        "Trésor de bonheur !\n" +
                        "Ta grâce infinie, " +
                        "Coulant nuit et jour\n" +
                        "Inonde ma vie," +
                        "De vague d’amour !", "", "", "",
                "Fondés sur Dieu même,\n" +
                        "Nos cœurs à jamais\n" +
                        "Ont pour bien suprême sa parfaite PAIX.", "", "",
                "Selon ta promesse\n" +
                        "O Jésus mon Roi !\n" +
                        "Je trouve sans cesse\n" +
                        "Paix parfaite en toi !", "", "" ));
        allItems.add( new ListNumero( "61", "Si je suis dans l’obscurité",
                "1.Si je suis dans l’obscurité\n" +
                        "Je ne pourrais avancer\n" +
                        "J’aurais besoin de lumière!\n" +
                        "Pour ne point m’égarer.",
                "2. Si je demeure en toi\n" +
                        "Je ne trébucherai point\n" +
                        "Je serai éclairé.\n" +
                        "Loin de moi les ténèbres ! Ch.",
                "3. Je garde ma vie en Christ\n" +
                        "Serre sa parole dans mon cœur\n" +
                        "Elle est du pétrole\n" +
                        "Pour la lampe de mon esprit\n" +
                        "Elle est du pétrole pour mon âme.", "", "", "", "",
                "Gare à l’insensé qui éteint sa lampe !\n" +
                        "Qui le guidera (bis)\n" +
                        "Au dehors noir ?\n" +
                        "Merveilleuse lumière\n" +
                        "Je ne m’éloignerai de toi.\n" +
                        "Merveilleuse lumière, tu me guidera.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "62", "Moment si doux de la prière où Dieu, m’élevant jusqu’à lui,",
                "1.Moment si doux de la prière\n" +
                        "où Dieu, m’élevant jusqu’à lui,\n" +
                        "Se révèle à moi comme un Père,\n" +
                        "Comme un sauveur, comme un appui.",
                "2. Oh ! Oui, je t’aime heure\n" +
                        "bénie,\n" +
                        "Je te désir avec ardeur,\n" +
                        "Car déjà souvent dans la vie,\n" +
                        "Tu m’as sauvé du tentateur.",
                "3. c’est toi, doux moment de prière\n" +
                        "Qui me transporte jusqu’aux cieux,\n" +
                        "Où Jésus, mon ami, mon frère\n" +
                        "Lui-même présente mes vœux",
                "4. Déjà souvent dans la tristesse\n" +
                        "Tu fus ma force et mon espoir;\n" +
                        "Pour qui te cherche sans cesse\n" +
                        "Jamais il n’est de ciel trop noir.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "63", "Seigneur, Seigneur, Que ton Esprit descende sur nous,",
                "1.Seigneur, Seigneur,\n" +
                        "Que ton Esprit descende sur nous,\n" +
                        "selon ta parole\n" +
                        "Que ton Esprit descende sur nous,\n" +
                        "selon ta promesse",
                "2. Seigneur, Seigneur,\n" +
                        "Que ta Puissance descende sur nous,\n" +
                        "selon ta parole.\n" +
                        "Que ta Puissance descende sur nous,\n" +
                        "selon ta promesse.",
                "3. Seigneur, Seigneur,\n" +
                        "Que ton Onction descende sur nous,\n" +
                        "selon ta parole.\n" +
                        "Que ton Onction descende sur nous;\n" +
                        "selon ta promesse.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "64", "Oh ! Que ton joug est facile ! Oh ! Combien j’aime ta loi",
                "1.Oh ! Que ton joug est facile !\n" +
                        "Oh ! Combien j’aime ta loi\n" +
                        "Dieu saint, Dieu de l’évangile,\n" +
                        "Elle est toujours devant moi\n" +
                        "De mes pas c’est la lumière\n" +
                        "c(‘est le repos de mon cœur;\n" +
                        "Mais pour la voir tout entière\n" +
                        "Ouvre mes yeux bon sauveur !",
                "2. Non, la loi n’est pas pénible,\n" +
                        "Pour quiconque est né de toi ;\n" +
                        "Toute victoire est possible,\n" +
                        "À qui combat avec foi.\n" +
                        "Seigneur , dans ta forteresse,\n" +
                        "Aucun mal ne m’atteindra ;\n" +
                        "Si je tremble en ma faiblesse,\n" +
                        "Ta droite me soutiendra.",
                "3. d’un triste et rude esclavage\n" +
                        "Affranchit par Jésus-Christ,\n" +
                        "J’ai part à ton héritage,\n" +
                        "Au secours de ton Esprit.\n" +
                        "Au lieu d’un maitre sévère,\n" +
                        "Prêt à juger, à punir,\n" +
                        "Je sers le plus tendre Père,\n" +
                        "Toujours prêt à me bénir.",
                "4. Dieu qui guide, qui console,\n" +
                        "J’ai connu que le bonheur,\n" +
                        "C’est de garder tes paroles,\n" +
                        "Et je les serre en mon cœur\n" +
                        "Fais-moi marcher dans ta voie,\n" +
                        "Et me plaire en tes statuts.\n" +
                        "Si je cherche en toi ma joie.\n" +
                        "Je ne serai pas confus.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "65", "Toujours ta divine présence Jette un rayon sur mon chemin",
                "1.Toujours ta divine présence\n" +
                        "Jette un rayon sur mon chemin ;\n" +
                        "Et le cœur joyeux, je m’avance\n" +
                        "Je n’ai pas peur du lendemain.",
                "2. Oh ! Que jamais rien ne me voile\n" +
                        "Ton doux regard, bien-aimé Roi !\n" +
                        "Dans le danger, brillante étoile,\n" +
                        "Garde mes yeux fixés sur toi. Ch.",
                "3. Auprès de toi la vie est belle\n" +
                        "C’est le bonheur, la liberté\n" +
                        "C’est une jeunesse éternelle,\n" +
                        "C’est le ciel, la félicité !", "", "", "", "",
                "Où tu voudras, je veux te suivre\n" +
                        "Agneau de Dieu, conduis mes pas\n" +
                        "Vivre sans toi ce n’est pas vivre\n" +
                        "Je ne puis être où tu n’es pas.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "66", "Je suis heureux je chante ! C’est pour toi !",
                "1. Je suis heureux je chante !\n" +
                        "C’est pour toi !\n" +
                        "Ma douce mélodie\n" +
                        "C’est pour toi\n" +
                        "Autour de moi égaye\n" +
                        "C’est pour toi\n" +
                        "Je t’aime, je t’adore O Jésus (bis)",
                "2. c’est pour TOI que je veux vivre\n" +
                        "O Seigneur !\n" +
                        "Mon cœur je te le donne\n" +
                        "O Seigneur !\n" +
                        "Et dans ma vie entière\n" +
                        "O Seigneur !\n" +
                        "Parle, commande, règne TU ES ROI (bis)",
                "3. Et quand viendra l’épreuve\n" +
                        "O Seigneur !\n" +
                        "A toi je saurai crier\n" +
                        "O Seigneur !\n" +
                        "Je sais tu es fidèle\n" +
                        "O Seigneur !\n" +
                        "Sur toi je me repose à jamais\n" +
                        "(bis)",
                "4. Que se dressent les montagnes\n" +
                        "Pour ta gloire\n" +
                        "Que brillent tous les astres\n" +
                        "Pour ta gloire\n" +
                        "Que chantent les cigales\n" +
                        "Pour ta gloire\n" +
                        "Et tous les saints te disent\n" +
                        "Alléluia !", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "67", "Me voici Seigneur Jésus Prends le trône de mon cœur,",
                "1.Me voici Seigneur Jésus\n" +
                        "Prends le trône de mon cœur,\n" +
                        "Règne sur moi, tu es Roi.\n" +
                        "Gloire soit à toi Seigneur !",
                "2. Jésus viens oh ! Viens mon Dieu,\n" +
                        "Libère mon esprit, mon Dieu\n" +
                        "Je veux t’adorer Seigneur\n" +
                        "En esprit, en vérité.",
                "3. Je bannis ma volonté :\n" +
                        "Donne-moi ta volonté\n" +
                        "Fais-moi marcher sur tes voies\n" +
                        "Dans tout détails de ma vie.",
                "4. Seigneur circoncis mon cœur ;\n" +
                        "Je te donne tout mon cœur ;\n" +
                        "Je te livre toute mon âme ;\n" +
                        "Toute la force de mon cœur.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "68", "Il est le Dieu qui accomplit ses promesses ;",
                "1. Ce que je suis ici aujourd’hui,\n" +
                        "Dieu l’avait déjà appelé à\n" +
                        "l’existence hier ;\n" +
                        "Ce que je serai demain, il\n" +
                        "l’appelle à l’existence à\n" +
                        "l’existence aujourd’hui.\n" +
                        "Ch.",
                "2. Ce que je dois donc faire aujourd’hui\n" +
                        "C’est de connaitre ce qu’il\n" +
                        "appelle à l’existence\n" +
                        "Ce que je ferai demain, de le\n" +
                        "confesser et de l’accomplir.", "", "", "", "",
                "Il est le Dieu qui accomplit ses promesses ;\n" +
                        "Il appelle ce qui n’est pas\n" +
                        "comme si c’était déjà.\n" +
                        "Il est le Dieu qui accomplit ses promesses\n" +
                        "Il amène toutes choses à l’existence.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "69", "J’ ai été crucifié avec Christ",
                "Gal 2:20\n" +
                        "J’ ai été crucifié avec Christ\n" +
                        "(bis)\n" +
                        "Et si je vis, et si je vis,\n" +
                        "Ce n’est plus moi qui vis\n" +
                        "C’est Christ qui vit en moi.", "", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "70", "O vous qui n’avez pas la paix,",
                "1.O vous qui n’avez pas la paix,\n" +
                        "Venez, Jésus la donne\n" +
                        "Pur et profonde et pour jamais,\n" +
                        "Venez, Jésus pardonne.\n" +
                        "Quand Jésus remplit un cœur,\n" +
                        "Il déborde de bonheur,\n" +
                        "Et l’effroi ne l’atteint plus,\n" +
                        "Gloire, Gloire à Jésus !",
                "2. Vous qui tombez à chaque pas\n" +
                        "Venez, Jésus délivre,\n" +
                        "Celui qui se jette en ces bras,\n" +
                        "Peut à toujours le suivre.\n" +
                        "Quand Jésus remplit un cœur,\n" +
                        "Il déborde de bonheur,\n" +
                        "Car il ne chancelle plus,\n" +
                        "Gloire, Gloire à Jésus !",
                "3. Vous qui tremblez sous la terreur\n" +
                        "Que la mort vous inspire,\n" +
                        "Venez, votre libérateur,\n" +
                        "À détruit son empire\n" +
                        "Avec lui nous revivrons,\n" +
                        "Avec lui nous règnerons,\n" +
                        "Et la mort ne sera plus,\n" +
                        "Gloire, gloire à Jésus !", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "71", "Quel repos céleste Jésus, D’être à toi !",
                "1.Quel repos céleste Jésus,d’être à toi !\n" +
                        "A toi pour la mort et la vie,\n" +
                        "Dans les jours mauvais de\n" +
                        "chanter avec foi:\n" +
                        "Tout est bien, ma paix est infinie !",
                "2. Quel repos céleste !" +
                        "Mon fardeau n’est plus\n" +
                        "Libre par le sang du calvaire,\n" +
                        "Tous mes ennemis, Jésus les a vaincus,\n" +
                        "Gloire et louange à Dieu notre Père. Ch.",
                "3. Quel repos céleste ! " +
                        "Tu conduis mes pas,\n" +
                        "Tu me combles de tes richesses,\n" +
                        "Dans ton grand amour, chaque jour tu sauras\n" +
                        "Déployer envers moi tes",
                "4. Quel repos céleste ! " +
                        "Quand enfin, Seigneur !\n" +
                        "Auprès de toi, j’aurai ma place,\n" +
                        "Après les travaux, les combats, la douleur,\n" +
                        "A jamais je pourrai voir ta face !\n" +
                        "Ch.", "", "", "",
                "Quel repos (ter)\n" +
                        "Quel céleste repos !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "72", "Proclamons de Dieu les bienfaits",
                "1. Proclamons de Dieu les bienfaits\n" +
                        "En chœur, chantons sa grandeur .\n" +
                        "Il est notre ferme rocher;\n" +
                        "Tout ce qu’il fait est Parfait.",
                "2. Il fit de nous ses bienheureux\n" +
                        "En sacrifiant son fils;\n" +
                        "Oh ! Quel ineffable bonheur\n" +
                        "D’être à jamais ses enfants !",
                "3. Nous avons du prix à ses yeux\n" +
                        "Nous sommes ses rachetés.\n" +
                        "Il veille sur nous nuit et jour,\n" +
                        "Nous conduit avec son amour.",
                "4. Il nous accorde sa grâce ;\n" +
                        "Son amour ne peut changer.\n" +
                        "Il est un Père Merveilleux ;\n" +
                        "Que son NOM glorifié.", "", "", "",
                "Nous avons un Dieu fidèle\n" +
                        "En lui, point d’iniquité ;\n" +
                        "Il est la bonté suprême,\n" +
                        "Que son nom exalté !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "73", "Tout joyeux, bénissons le Seigneur !",
                "1.Tout joyeux, bénissons le Seigneur !\n" +
                        "chantons et célébrons ses louanges,\n" +
                        "Adorons avec foi le sauveur,\n" +
                        "Nous joignant aux céleste phalanges.",
                "2. Dieu dans son incomparable amour,\n" +
                        "du ciel envoya son fils unique,\n" +
                        "Et la terre et les cieux, dans ce jour,\n" +
                        "S’unissent pour chanter ce cantique. Ch.",
                "3. Le châtiment qui produit la paix,\n" +
                        "Jésus-Christ la subi pour mon âme;\n" +
                        "Il voulu expier nos forfaits,\n" +
                        "En mourant, lui sur le bois infâme.\n" +
                        "Ch.",
                "4. Nous voulons, en retour bon sauveur\n" +
                        "T’aimer par-dessus tout autre chose\n" +
                        "Forme ton amour dans notre cœur,\n" +
                        "Et puis de chacun de nous dispose. Ch.\n", "", "", "",
                "Gloire à Dieu, Gloire à Dieu !\n" +
                        "Que ce chant retentisse en tout lieu.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "74", "Ta main se déploya Pour leur donné un même cœur",
                "1. Ta main se déploya\n" +
                        "Pour leur donné un même cœur\n" +
                        "Pour leur faire exécuter\n" +
                        "L’ordre du Roi (bis)\n" +
                        "L’ordre de ses chefs.",
                "2. qu’elle se déploie, (oui nous te prions)\n" +
                        "Qu’elle se déploie\n" +
                        "Pour nous donner Seigneur,\n" +
                        "Ce même cœur.\n" +
                        "Qu’elle se déploie (bis)\n" +
                        "Pour nous donner Seigneur, un même cœur.", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "75", "Oh ! Que ta main paternelle me bénisse à mon coucher !",
                "1. Oh ! Que ta main paternelle\n" +
                        "Me bénisse à mon coucher !\n" +
                        "Et que ce soit sous ton aile\n" +
                        "Que je dorme, ô mon Berger !\n" +
                        "(bis)",
                "2. Veuille effacer, par ta grâce,\n" +
                        "Les péchés que j’ai commis,\n" +
                        "Et que ton Esprit ma fasse\n" +
                        "Obéissant et soumis !\n" +
                        "(bis)",
                "3. Fais reposer sous ta garde\n" +
                        "Mes amis et mes parents,\n" +
                        "Et que ton œil les regarde\n" +
                        "De ton ciel petits et grands !\n" +
                        "(bis)",
                "4. Que ta faveur se déploie\n" +
                        "Pour consoler l’affligé;\n" +
                        "Donne au pauvre un peu de joie,\n" +
                        "Au malade la santé.",
                "5. Seigneur, j’ai fait ma prière ;\n" +
                        "Sous ton aille, je m’endors,\n" +
                        "Heureux de savoir qu’un Père\n" +
                        "Plein d’amour veille au dehors.\n" +
                        "(bis)", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "76", "Même si on m’accule,Même si je souffre,",
                "1. Même si on m’accule,\n" +
                        "Même si je souffre,\n" +
                        "Je sais que Dieu ne ment jamais;\n" +
                        "Certainement il reviendra. (bis)",
                "2. j’avancerai, et j’avance." +
                        "La persécution ?\n" +
                        "Le Seigneur l’a subie ;\n" +
                        "Aucun disciple n’est plus son maitre. Ch.",
                "3. Je vais travailler\n" +
                        "Tant que j’aurai ce souffle\n" +
                        "Et publier ce grand message,\n" +
                        "À tous ceux qui ne l’ont ouï. Ch.", "", "", "", "",
                "Au fond de moi, j’ai cette conviction ;\n" +
                        "Au-dedans de moi\n" +
                        "Cela me presse (bis)\n" +
                        "Même si quelque fois\n" +
                        "J’ai été troublé, je sais une chose :\n" +
                        "Ce n’est plus loin. (bis)", "", "", "", "", "" ));
        allItems.add( new ListNumero( "77", "Semons dès l’aurore,",
                "1. Semons dès l’aurore, (bis)\n" +
                        "Quand le soleil luit ; (bis)\n" +
                        "Et semons encore\n" +
                        "Lorsque vient la nuit\n" +
                        "Dieu peut faire éclore\n" +
                        "La fleur et le fruit.",
                "2. Semons pour le maitre, (bis)\n" +
                        "Parlons du sauveur; (bis)\n" +
                        "Semons, car peut être\n" +
                        "Un pauvre pécheur\n" +
                        "Par nous pourra naitre\n" +
                        "Au seul vrai bonheur. Ch.",
                "3. La tâche est immense (bis)\n" +
                        "Et les cœurs sont prêts (bis)\n" +
                        "Donc bonne espérance\n" +
                        "Tout travail n‘est vain :\n" +
                        "De Dieu la puissance fait germer le grain. Ch.", "", "", "", "",
                "Bon courage, amis !\n" +
                        "Bon courage, amis !\n" +
                        "Nous irons joyeux cueillir les épis", "", "", "", "", "" ));
        allItems.add( new ListNumero( "78", "Oui ! Mon cœur est plein d’espérance",
                "1. Oui ! Mon cœur est plein d’espérance\n" +
                        "De douceur, de paix, de joie\n" +
                        "Oui ! Mon cœur est plein d’espérance,\n" +
                        "D’amour et de vie.",
                "2. c’est une histoire qui nait un jour\n" +
                        "Je ne comment ni pourquoi\n" +
                        "Une merveilleuse histoire\n" +
                        "d’amour Jésus m’a sauvé.",
                "3.Et les épreuves ne manquent pas\n" +
                        "Je connais bien la douleur ;\n" +
                        "Mais du secours mon sauveur\n" +
                        "Je ne manque pas.",
                "4. Et puis un jour viendra la fin\n" +
                        "La fin des pleurs, du chagrin.\n" +
                        "Il a promis il vient bientôt\n" +
                        "Il me prendra là-haut.  Ref",
                "5. veux-tu avec moi espérer,\n" +
                        "Que bientôt tout passera ?\n" +
                        "Le monde et toute sa vanité\n" +
                        "Seront balayés.",
                "6. Veux-tu au festin de l’agneau\n" +
                        "De bonheur être comblé ?\n" +
                        "Viens à Jésus, viens maintenant\n" +
                        "Oh ! Il t’aime tant.  Ref", "", "",
                "Oui il vit en moi, Jésus-Christ\n" +
                        "Le merveilleux, l’admirable ;\n" +
                        "Oui, il vit en moi Jésus-Christ,\n" +
                        "Il m’aime et je l’aime.", "", "", "", "" ));
        allItems.add( new ListNumero( "79", "O Jésus dans la passion De ton amour pour moi",
                "1. O Jésus dans la passion\n" +
                        "De ton amour pour moi\n" +
                        "Acceptant condamnation\n" +
                        "Par tes sujets O Roi,\n" +
                        "À la pire des trahisons\n" +
                        "Tu offris ton pardon\n " +
                        "Subissant tout abandon\n" +
                        "Pour prix de ma rançon.",
                "2. Ton corps subit la souffrance\n" +
                        "Ton âme le tourment\n " +
                        "Afin que j’aie l’espérance\n" +
                        "Oh ! Quel amour clément\n " +
                        "Ta grâce salutaire\n" +
                        "Ta bonté sans pareille\n " +
                        "Sur la croix du calvaire\n" +
                        "Proclame tes merveilles.",
                "3. Quel est ce don suprême\n" +
                        "Quel en est le secret ?\n" +
                        "Un sacrifice extrême,\n" +
                        "Total et sans regret ;\n" +
                        "L’obéissance au Père,\n" +
                        "Ta soumission à lui " +
                        "Défient mon cœur austère\n" +
                        "Et j’en suis fort éblouie.",
                "4. Ton amour m’humilie,\n " +
                        "Me presse et me contraint\n" +
                        "Prends le don de ma vie\n" +
                        "Elle est en toi étreinte\n" +
                        "Ton amour me réclame\n " +
                        "Ta passion, ta douleur\n" +
                        "Exigent que je t’aime \n" +
                        "Pour prix de ta langueur.",
                "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "80", "Veux-tu briser du péché le pouvoir ?",
                "1. Veux-tu briser du péché le pouvoir ?\n" +
                        "La force est en CHRIST ? (bis)\n" +
                        "Si dans ton cœur tu veux le recevoir :\n" +
                        "La force est dans le sang de CHRIST !",
                "2. veux-tu braver et la mort et l’enfer ?\n" +
                        "La force est en CHRIST ? (bis)\n" +
                        "Jésus, d’un mot fait tomber tous les fers:\n" +
                        "La force est dans le sang de Christ. Ch.",
                "3. veux-tu marcher toujours pur, triomphant ?\n" +
                        "La force est en CHRIST ? (bis)\n" +
                        "Pour te garder Jésus est Tout-puissant :\n" +
                        "La force est dans le sang de Christ. Ch.",
                "4. veux-tu du ciel t’approcher chaque jour ?\n" +
                        "La force est en CHRIST ? (bis)\n" +
                        "Avec Jésus demeurer pour toujours ?\n" +
                        "La force est dans le sang de CHRIST. Ch.", "", "", "",
                "Je suis fort, fort ! " +
                        "Oui , plus que vainqueur,\n" +
                        "Par le sang de Jésus !\n" +
                        "Je suis fort, fort !" +
                        "Oui , plus que vainqueur,\n" +
                        "Par le sang de Jésus mon sauveur !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "81", "Moi j’ai décidé de suivre Jésus",
                "1. Oh quel bonheur, oh quelle joie\n" +
                        "D’appartenir à Jésus\n" +
                        "Oh quel mystère, Jésus en moi,\n" +
                        "L’espérance de la gloire !\n" +
                        "Oui, car sur la croix,\n" +
                        "Jésus à pris ma place,\n" +
                        "Et le châtiment qui me donne la paix (bis)\n" +
                        "Est tombé sur lui.  Ch.",
                "2. Je me réjouirai en l’Eternel,\n" +
                        "Ravi d’allégresse\n" +
                        "Car il m’a vêtu de son salut\n" +
                        "Et m’a couvert de sa délivrance.\n" +
                        "Oui car sur la croix,\n" +
                        "Jésus a pris ma place ;\n" +
                        "Et le châtiment qui me donne la paix (bis)\n" +
                        "Est tombé sur lui. Ch.",
                "3. Je me réjouirai en l’Eternel,\n" +
                        "Ravi d’allégresse ;\n" +
                        "Car il m’a vêtu de son salut\n" +
                        "Et m’a couvert de sa délivrance.\n" +
                        "C’est pour toi aussi\n" +
                        "Qu’il est mort sur la croix,\n" +
                        "Et le châtiment qui te donne la paix (bis)\n" +
                        "Est tombé sur lui.", "", "", "",
                "Moi j’ai décidé de suivre Jésus, (ter)\n" +
                        "Je sais qu’il revient très bientôt,\n" +
                        "Oui très bientôt.", "", "",
                "Veux-tu décider de suivre Jésus (bis)\n" +
                        "Tu sais, il revient très bientôt,\n" +
                        "Oui très bientôt.", "", "", "" ));
        allItems.add( new ListNumero( "82", "Travaillons et luttons, nous sommes au Seigneur.",
                "1.Travaillons et luttons, nous sommes au Seigneur.\n" +
                        "Suivons l’étroit sentier qui conduit à la vie\n" +
                        "Jésus marche avec nous, avançons sans frayeur,\n" +
                        "Il nous garde et son bras toujours nous fortifie.\n",
                "2. Travaillons et luttons ! Que les cœurs affligés\n" +
                        "Les perdus loin de Dieu retrouvent l’espérance\n" +
                        "Vers la croix dirigeons leurs regards angoissés\n" +
                        "Pressons-les d’accepter Jésus,leur délivrance.",
                "3. Travaillons et luttons !\n " +
                        "Il nous appelle tous,\n" +
                        "Le champ nous est ouvert et la moisson est grande\n" +
                        "Pour servir notre chef ne pensons plus à nous.",
                "4. Travaillons et luttons ! Sans jamais nous lasser,\n" +
                        "De notre Rédempteur élevons la bannière,\n" +
                        "Fidèle jusqu’au bout, sachons persévérer,\n" +
                        "Le repos nous attend dans sa pleine lumière.", "", "", "",
                "Travaillons et luttons, (bis)\n" +
                        "Soyons prêts et prions,\n" +
                        "Bientôt le maitre va venir !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "83", "Je lève les yeux vers Toi Seigneur",
                "1. Je lève les yeux vers Toi Seigneur\n" +
                        "Pour te contempler dans ta splendeur ;\n" +
                        "Et ma voix est l’écho de mon cœur\n" +
                        "Pour te dire mon amour.",
                "2. Au petit matin, de louange éclate\n" +
                        "Toute l’œuvre de tes mains.\n" +
                        "À ce chant de gloire je mêle mon chœur\n" +
                        "Pour te dire : Alléluia !",
                "3. Je lève mes yeux vers toi Seigneur !\n" +
                        "Pour te contempler dans ta splendeur ;\n" +
                        "Et ma voix est l’écho de mon cœur\n" +
                        "Pour te dire mon amour.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "84", "PSAUMES 138\n" +
                        "Je te célèbre de tout mon cœur",
                "1. Je te célèbre de tout mon cœur,\n" +
                        "Je chante tes louanges en la présence de Dieu\n" +
                        "Je me prosterne dans ton saint temple\n" +
                        "Je célèbre ton nom, ô mon Dieu !\n" +
                        "À cause de ta bonté et de ta fidélité\n" +
                        "Car ta renommée s’est accrue\n" +
                        "Par l’accomplissement de tes promesses.",
                "2. Le jour où je t’ai invoqué,\n" +
                        "Tu m’as exaucé, tu m’as rassuré,\n" +
                        "Tu as fortifié mon âme Dieu de bonté\n" +
                        "Tous les rois de la terre te loueront\n" +
                        "Eternel en entendant les paroles de ta bouche ;\n" +
                        "Ils célèbreront tes voies,\n" +
                        "Car la gloire de l’Eternel est grande.",
                "3. l’Eternel est élevé : il voit les humbles,\n" +
                        "Il reconnait de loin les orgueilleux.\n" +
                        "Quand je marche au milieu de la détresse,\n" +
                        "Tu me rends la vie, Ô mon Dieu !\n" +
                        "Tu étends ta main sur la colère de mes ennemis,\n" +
                        "Et ta droite me sauve, Ô Eternel !\n" +
                        "L’Eternel agira en ma faveur.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "85", "Nous voici Seigneur Jésus !",
                "1. Nous voici Seigneur Jésus !\n" +
                        "Nous sommes reconnaissants ;\n" +
                        "Merci pour ce rendez-vous\n" +
                        "De ton grand amour.\n" +
                        "Oui ; Seigneur !\n" +
                        "Merci pour ce rendez-vous\n" +
                        "De ton grand amour.",
                "2. Nous voici Seigneur Jésus !\n" +
                        "Nous sommes reconnaissants ;\n" +
                        "Nous venons te rendre grâce\n" +
                        "Pour ton grand amour\n" +
                        "Oui Seigneur !\n" +
                        "Nous venons te rendre grâce\n" +
                        "pour ton grand amour.",
                "3. Nous voici Seigneur Jésus !\n" +
                        "Membre de ton Eglise\n" +
                        "Daigne nous rendre soumis,\n" +
                        "Comme toi Seigneur\n" +
                        "Oui, Seigneur !\n" +
                        "Daigne nous rendre soumis\n" +
                        "comme toi Seigneur.",
                "4. Nous voici Seigneur Jésus,\n" +
                        "Enrôlés dans ton armée !\n" +
                        "Daigne nous rendre vaillants\n" +
                        "De vaillants soldats\n" +
                        "Oui, Seigneur !\n" +
                        "Daigne nous rendre vaillants\n" +
                        "Comme toi Seigneur.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "86", "Quelle gloire \n" +
                        "Quel bonheur d’être pour",
                "1.Le grand jour de notre Seigneur\n" +
                        "Oui le grand jour de la gloire\n" +
                        "Quand je m’assiérai aux noces de l’agneau\n" +
                        "Avec tous les saints en chœur\n" +
                        "Je chanterai dans sa gloire\n" +
                        "J’entonnerai le saint cantique nouveau",
                "2. Tu es digne notre Seigneur\n" +
                        "Toi l’agneau immolé\n" +
                        "De prendre le livre et d’en ouvrir les sceaux\n" +
                        "Car tu es le Rédempteur\n" +
                        "Qui nous a tous rassemblés\n" +
                        "Nous chantons à la gloire de l’agneau",
                "3 . Sois exalté, Ô mon Jésus\n" +
                        "De la mort tu es vainqueur\n" +
                        "Et tu fais de nous un sacerdoce royal\n" +
                        "Pour Dieu un peuple élu.\n" +
                        "Oui un peuple élu.\n" +
                        "Oui un peuple de vainqueurs\n" +
                        "Qui désormais serviront d’un\n" +
                        "cœur loyal.", "", "", "",
                "Quelle gloire (bis)\n" +
                        "Quel bonheur d’être pour toujours\n" +
                        "près du trône de la gloire\n" +
                        "Quel gloire (bis)\n" +
                        "Quand j’entrerai dans le céleste séjour.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "87", "A de nouveaux combats, Jésus, tu nous appelles,",
                "1.A de nouveaux combats,\n" +
                        "Jésus, tu nous appelles,\n" +
                        "Et nous voici fidèles,\n" +
                        "Prêts à suivre tes pas,\n" +
                        "Conduits-nous au combat :\n" +
                        "Nous sommes tes soldats.",
                "2. arme-nous, Ô Seigneur !\n" +
                        "de foi, de hardiesse,\n" +
                        "De force, de sagesse,\n" +
                        "D’amour et de ferveur ;\n" +
                        "Embrasse-nous, Seigneur,\n" +
                        "D’une invincible ardeur.\n" +
                        "Ch.",
                "3. Nous tiendrons ferme et\n" +
                        "haut\n" +
                        "La croix, notre bannière,\n" +
                        "Pour vaincre l’adversaire,\n" +
                        "Par le sang de l’agneau.\n" +
                        "Oui, nous tiendrons bien haut\n" +
                        "Ta croix, notre drapeau. Ch.",
                "4. luttons, prions, souffrons,\n" +
                        "Nous aurons la victoire;\n" +
                        "La couronne de gloire\n" +
                        "Un jour ceindra nos fronts.\n" +
                        "Luttons, prions, souffrons,\n" +
                        "Bientôt nous règnerons ! Ch.", "", "", "",
                "Arme nos bras, arme nos cœur,\n" +
                        "Et nous seront plus que\n" +
                        "vainqueurs ! (bis)\n" +
                        "Arme nos bras, arme nos cœurs.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "88", "Celui qui met en Jésus Une pleine confiance,",
                "1. Celui qui met en Jésus\n" +
                        "Une pleine confiance,\n" +
                        "Jamais ne chancelle plus,\n" +
                        "Complète est sa délivrance.",
                "2. Dans les jours d’adversités,\n" +
                        "Quand tu sens gronder l’orage,\n" +
                        "Regarde en sécurité\n" +
                        "À CHRIST, et reprends courage ! Ch.",
                "3. Quand Satan veut te troubler,\n" +
                        "Enlever ton espérance,\n" +
                        "Ton passé te reprocher,\n" +
                        "Que Christ soit ton assurance ! Ch.",
                "4. Par la foi, je marcherai,\n" +
                        "En comptant sur ces promesses,\n" +
                        "Par lui je triompherai\n" +
                        "En tout temps de mes détresses ! Ch.", "", "", "",
                "Par la foi nous marcherons,\n" +
                        "Par la foi nous triomphons,\n" +
                        "Par la foi mon Rédempteur\n" +
                        "Me rendra plus que vainqueur !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "89", "Dieu a un plan pour ma vie J’irai partout dans le monde",
                "1. Je ne suis plus comme ces vagabonds\n" +
                        "Qui tournent et errent sur la terre\n" +
                        "Hanter par la peur de l’inconnu\n" +
                        "Comme des bergers sans troupeau. Ch.",
                "2. Il y a de cela pas très longtemps\n" +
                        "J’étais comme tous mes amis\n" +
                        "Lassé, dégouté de mes péchés\n" +
                        "Je n’étais pas dans ma peau. Ch.",
                "3. j’ai entendu parler de Jésus\n" +
                        "L’agneau qui mourut pour moi\n" +
                        "Qui a préparé le chemin\n" +
                        "Qui m’a ramené à Dieu. Ch.", "", "", "",
                "Dieu a un plan pour ma vie\n" +
                        "J’irai partout dans le monde\n" +
                        "Prêcher la bonne nouvelle.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "90", "Nous n’avons pas , Ici bas de cité permanente",
                "1. Nous n’avons pas ( 3 fois)\n" +
                        "Ici bas de cité permanente\n" +
                        "Nous en cherchons une meilleure\n" +
                        "Différente de celle d’où nous sommes sortis.",
                "2. Seigneur Jésus (3 fois)\n" +
                        "O Seigneur écoute nos prières\n" +
                        "Et montre-nous le chemin\n" +
                        "Qui conduira dans ce pays de géants.",
                "3. Renonce à toi (3 fois)\n" +
                        "Et suit-moi sans détour, ni regret.\n" +
                        "Sanctifie-toi, travaille dur\n" +
                        "Sois soumis et marche dans l’intégrité. Ch.",
                "4. Renonce à toi (3 fois)\n" +
                        "Persévère dans le jeûne, la prière\n" +
                        "Souviens-toi de mes promesses ;\n" +
                        "Et crois en mes prophètes, tu verras ma gloire. Ch.",
                "5. Seigneur Jésus (3 fois)\n" +
                        "Je te donne mon cœur et mon bras.\n" +
                        "Prends ma vie et mon trésor ;\n" +
                        "Je les mets sur l’autel, bénis-moi Seigneur .", "", "",
                "Car nous cherchons uns patrie\n" +
                        "Nous attendons une cité ;\n" +
                        "Celle que notre Dieu nous a promise\n" +
                        "Le pays au-delà du Jourdain.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "91", "Mon fils, mon cher enfant m’aimes-tu assez ?",
                "1. Mon fils, mon cher enfant\n" +
                        "M’aimes-tu assez ? O si tu m’aimes assez,\n" +
                        "Pour tout risquer ; Je t’enverrai au loin\n" +
                        "En inde ou en Irak ; Tu iras me servir\n" +
                        "Au prix de ta vie.",
                "2. Mon fils, mon cher enfant\n" +
                        "M’aimes-tu assez?\n" +
                        "Ce que tu dois souffrir Je te montrerai :\n" +
                        "L’opposition des hommes, La haine de l’ennemi.\n" +
                        "Mais alors souviens-toi Je suis avec toi.",
                "3. Mon fils, mon cher enfant\n" +
                        "M’aimes-tu assez ?\n" +
                        "Pour aller pour toujours Loin de ta patrie.\n" +
                        "Missionnaire lève-toi, Jésus est avec toi.\n" +
                        "Sur le chemin étroit Il te soutiendra.",
                "4. Si tu traverses les eaux,\n" +
                        "Donne-lui ta main\n" +
                        "Si tu passes par le feu Caches-toi sous lui\n" +
                        "Si l’enfer se déchaine Souviens-toi qu’il a dit :\n" +
                        "Je serai avec toi Jusqu’au dernier jour.",
                "5. Si ta vie est rançon pour ce pays ;\n" +
                        "La cause de l’évangile Ne la trahis pas\n" +
                        "Bon soldat prends courage\n" +
                        "souviens-toi qu’il a dit\n" +
                        "À celui qui vaincra la couronne de vie.", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "92", "Nous ne travaillons pas pour manger",
                "1.Nous ne travaillons pas pour manger\n" +
                        "Nous mangeons pour travailler\n" +
                        "S’il nous faut sur la terre dominer\n" +
                        "Il nous faut bien travailler.",
                "2. Si tu ne peux tenir un rabot\n" +
                        "Tu peux porter une houe.\n" +
                        "Si tu ne peux être charpentier\n" +
                        "Tu peux la terre cultiver. Ch.",
                "3. Les traités qu’il faudra envoyer\n" +
                        "Seront le fruit d’un dur labeur .\n" +
                        "Nous allons travailler sans relâche\n" +
                        "Que Dieu bénisse nos efforts. Ch.",
                "4. Si tu n’es pas un grand millionnaire\n" +
                        "Donne le peu que tu as\n" +
                        "Pourvu que tu le donnes de bon cœur\n" +
                        "Dieu le fera prospérer. Ch.", "", "", "",
                "Nous devons (bis)\n" +
                        "Assujettir toute la terre\n" +
                        "Le Seigneur (bis)\n" +
                        "Ne nous l’a-t-il pas commandé ?", "", "", "", "", "" ));
        allItems.add( new ListNumero( "93", "Fanez-vous voies terrestres",
                "1. fanez-vous voies terrestres ;\n" +
                        "Jésus est mien Brisez tout tendre lien ;\n" +
                        "Jésus est mien La terre est un désert\n" +
                        "Obscur et sans repos Jésus seul peut bénir ;\n" +
                        "Jésus est mien.",
                "2. Ne tentez point mon âme\n" +
                        "Jésus est mien De lui j’ai fait mon choix ;\n" +
                        "Jésus est mien Choses éphémères d’argile,\n" +
                        "O vanité qui passe fuyez loin de mon cœur ;\n" +
                        "Jésus est mien.",
                "3. Adieu, rêves de nuit ;\n" +
                        "Jésus est mien Voici le jour qui luit ;\n" +
                        "Jésus est mien Mon cœur a tant cherché\n" +
                        "Mais n’a trouvé que vide Jésus m’a satisfait ;\n" +
                        "Jésus est mien.",
                "4. Adieu mortalité ;\n" +
                        "Jésus est mien A moi l’éternité !\n" +
                        "Jésus est mien Venez O bien-aimés, viens, doux repos des saints,\n" +
                        "Viens, sauveur, viens à moi,\n" +
                        "Jésus est mien", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "94", "Il pourvoira à nos besoins Selon ses richesses en Jésus",
                "1. Il pourvoira à nos besoins\n" +
                        "Selon ses richesses en Jésus\n" +
                        "Nous remplira de tendres soins\n" +
                        "Telle est sa promesse aux élus.",
                "2. A-t-on jamais à lui crié\n" +
                        "Sans recevoir un prompt secours ?\n" +
                        "Non, tous, nous pouvons attester\n" +
                        "Que vrai, fidèle est son amour.",
                "3. A qui le comparerons-nous\n" +
                        "Pour le faire l’égale du Seigneur ?\n" +
                        "Il est unique ! Frères à genoux,\n" +
                        "Adorons le Seigneur.",
                "4. Frères croyons à la vision\n" +
                        "Du Seigneur pour notre pays\n" +
                        "Et de tout cœur investissons\n" +
                        "Oui avant la nuit.", "", "", "",
                "Il pourvoira, il pourvoira\n" +
                        "Nos cœurs peuvent en être assurés\n" +
                        "Et demeurer en lui fondés\n" +
                        "Car notre Seigneur pourvoira.", "", "",
                "Du Cameroun (de toutes nations) ils partiront\n" +
                        "Les missionnaires de Jésus-Christ\n" +
                        "Ils partiront et rempliront\n" +
                        "Le monde entier de ses disciples.", "", "" ));
        allItems.add( new ListNumero( "95", "Lève-toi, vaillante armée Pour les combats du Seigneur",
                "1. Lève-toi, vaillante armée\n" +
                        "Pour les combats du Seigneur;\n" +
                        "C’est ton Dieu qui t’a formée,\n" +
                        "C’est lui seul qui rends vainqueur\n" +
                        "Soldat à la sainte guerre,\n" +
                        "Préparez-vous en ce jour !\n" +
                        "Il faut soumettre la terre Au Roi\n" +
                        "de Paix et d’Amour.(bis)",
                "2. Allez révélé au monde\n" +
                        "L’amour du Dieu Tout-puissant ;\n" +
                        "Dans l’obscurité profonde\n" +
                        "Annonce le jour naissant\n" +
                        "Aux peuples sans espérance\n" +
                        "Dite que Christ est venu,\n" +
                        "Apportant la délivrance\n" +
                        "au cœur coupable et perdu. (bis)",
                "3. Sur le plus lointain rivage\n" +
                        "Portez l’éternelle croix\n" +
                        "Avec un nouveau courage\n" +
                        "Partout élevez la voix\n" +
                        "Qu’ainsi l’Eglise s’étende\n" +
                        "Ici-bas sous tous les cieux\n" +
                        "Et que partout l’on entende :\n" +
                        "O Christ ! Ton Nom glorieux. (bis)",
                "4. Heureux ceux qui pour leur maitre\n" +
                        "Auront voulut tout souffrir !\n" +
                        "Le grand jour fera connaitre\n" +
                        "L’honneur qui les doit couvrir.\n" +
                        "Dans l’immortelle victoire\n" +
                        "De Jésus le Roi des rois,\n" +
                        "Ils auront part à sa gloire,\n" +
                        "ayant eu part à sa croix. (bis)", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "96", "Lève-toi armée de gloire De ton Roi tiens le drapeau",
                "1. lève-toi armée de gloire\n" +
                        "De ton Roi tiens le drapeau\n" +
                        "De Jésus ton Capitaine,\n" +
                        "Tu dois le porter très haut\n" +
                        "Fais de Jésus ta passion\n" +
                        "De vivre ta seule raison,\n" +
                        "Ton amour, ton style de vie,\n" +
                        "fais de Jésus ton seul but. (bis)",
                "2.Mais avant de nous lancer\n" +
                        "Avant d’aller conquérir ;\n" +
                        "Offrons-lui donc tous nos cœurs\n" +
                        "Offrons-lui toutes nos vies,\n" +
                        "À ses pieds sachons nous tenir,\n" +
                        "De la croix, contemplons l’œuvre,\n" +
                        "C’est d’ici que jaillit,\n" +
                        "le flot d’amour pour tout le monde. (bis)",
                "3. Nous irons au bout du monde\n" +
                        "Des disciples nous ferons\n" +
                        "C’est l’ordre de notre maitre\n" +
                        "Nous ne le trahirons point.\n" +
                        "En avant portons nos armes\n" +
                        "Ceignons-nous de vérité,\n" +
                        "Prenons sur nous la droiture\n" +
                        "Faisons tout dans la prière\n" +
                        "Avec foi, vivons la Bible.\n" +
                        "Avec zèle oui travaillons. (bis)",
                "4. Gens de destinée nous sommes\n" +
                        "Serviteurs, sujet du Roi ;\n" +
                        "Jésus est le chef, le Berger,\n" +
                        "Nous ne manquerons de rien.\n" +
                        "À lui seul offrons nos vies,\n" +
                        "Et entrons dans son service,\n" +
                        "Quant aux affaires de la vie,\n" +
                        "nous ne nous embarrassons point. (bis)",
                "5. Nous irons dire à tout pécheur ,\n" +
                        "à tous les désespérés; " +
                        "Il y a eux de l’espoir,\n" +
                        "Il n’y a plus de condamnation\n" +
                        "Christ s ’est donné en rançon\n" +
                        "Pour que tous avec le Père,\n" +
                        "Par lui soient réconciliés. (bis)",
                "6. En avant toujours fidèles,\n" +
                        "Dirigés par le fidèle ;\n" +
                        "Nous irons partout le monde,\n" +
                        "La moisson est déjà prête.\n" +
                        "En Europe, en Amérique,\n" +
                        "En Asie comme en Afrique,\n" +
                        "Dans toute l’Océanie Jésus sera\n" +
                        "proclamé. (bis)", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "97", "La moisson est grande mais il y a peu d’ouvriers",
                "1.Voyant la foule Jésus fut ému\n" +
                        "de compassion pour elle\n" +
                        "Une foule languissante et abattue\n" +
                        "Comme des brebis qui n’ont point de berger.",
                "2. Voyant la France Jésus est\n" +
                        "ému de compassion pour elle\n" +
                        "Une France trempée dans les\n" +
                        "œuvres des ténèbres.\n" +
                        "Comme des brebis qui n’ont point de berger.",
                "3. Voyant la Chine Jésus est ému\n" +
                        "de compassion pour elle\n" +
                        "Une Chine si peuplée mais\n" +
                        "égarée par des faux dieux\n" +
                        "Comme des brebis qui n’ont point de berger.",
                "4. La moisson est mûre, parmi les nations,\n" +
                        "Déjà les champs blanchissent\n" +
                        "Frères levons les yeux, hâtons-\n" +
                        "nous donc d’obéir\n" +
                        "La nuit vient où personne ne peut travailler.", "", "",
                "La moisson est grande mais il\n" +
                        "y a peu d’ouvriers\n" +
                        "Priez donc le maitre de la moisson\n" +
                        "D’envoyer des ouvriers, des ouvriers " +
                        "dans sa moisson. (bis)", "", "", "",
                "", "", "" ));
        allItems.add( new ListNumero( "98", "Toi fils de l’homme je t’établis sentinelle",
                "1. Quand je dis au méchant,\n" +
                        "méchant tu mourras\n" +
                        "Si tu ne parles pas pour détourner\n" +
                        "le méchant de sa voie\n" +
                        "Ce méchant mourras dans son iniquité\n" +
                        "Et je te redemanderai son sang.",
                "2. dis-leur: je suis vivant, dit le Seigneur\n" +
                        "L’Eternel, ce que je désire ce n’est\n" +
                        "pas que le méchant meure\n" +
                        "Mais c’est qu’il change de\n" +
                        "conduite et qu’il vive\n" +
                        "Revenez de votre mauvaise voie.",
                "3. Quand je dis au Français,\n" +
                        "Français tu mourras\n" +
                        "Si tu ne parles pas pour détourner\n" +
                        "le Français de sa voie\n" +
                        "Ce français mourras dans son iniquité\n" +
                        "Et je te redemanderai son sang.",
                "", "", "",
                "Toi fils de l’homme\n" +
                        "Je t’établis sentinelle\n" +
                        "Sur la maison d’Israël (2 fois)\n" +
                        "Tu dois écouter la parole de ma bouche\n" +
                        "Les avertir de ma part (2 fois)", "", "",
                "Toi fils de l’homme\n" +
                        "Je t’envoie comme missionnaire\n" +
                        "Vers le pays de la France (2 fois)\n" +
                        "Tu dois écouter la parole de ma bouche\n" +
                        "Les avertir de ma part (2 fois)",
                "Toi fils de l’homme\n" +
                        "Je t’envoie comme missionnaire\n" +
                        "Vers le peuple éthiopien (2 fois)", "", "" ));
        allItems.add( new ListNumero( "99", "L’Eglise est fondée, Sur Jésus son Seigneur",
                "1. l’Eglise est fondée, Sur Jésus son Seigneur\n" +
                        "Il l’a lui-même créée Par la parole et l’eau\n" +
                        "Des cieux il vint, la chercha En fit sa sainte Epouse\n" +
                        "Par son sang il l’acheta Pour sa vie il mourut.",
                "2. De toutes nations élue Mais une sur la terre\n" +
                        "La charte de son salut Un Seigneur, une foi\n" +
                        "Une seul naissance, Et un seul nom béni\n" +
                        "Une seule espérance En lui la tient unie.",
                "3. Et bien qu’on la méprise La voyant opprimée\n" +
                        "Déchirée par des schismes Et par des hérésies\n" +
                        "Les saints sans cesse attendent Leur cri : jusques à quand ?\n" +
                        "Bientôt la nuit de larmes Sera le jour des chants.",
                "4. En dépit des souffrances du bruit de la mêlée,\n" +
                        "Elle attend patiente Qu’enfin soit consommée\n" +
                        "La gloire éternelle Jusqu’au jour où, ravie,\n" +
                        "L’Eglise, pure et belle De paix sera bénie.",
                "5. Elle est unie sur terre Au Dieu Père,\n" +
                        "fils, Esprit Et par un saint mystère,\n" +
                        "Aux saints déjà partis O Seigneur par ta grâce,\n" +
                        "Avec ces bienheureux Puissions-nous voir ta face T’adorer dans les cieux.", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "100", "Viendra-t-il ? Il viendra le réveil attendu",
                "1.Viendra-t-il ? Il viendra le réveil attendu\n" +
                        "l’Esprit – Saint descendra sur les saints attendant ;\n" +
                        "Et la puissance du péché sera par lui brisée ;\n" +
                        "Dieu dans son grand amour nous enverra sa pluie .",
                "2. Notre Dieu notre Père reçoit notre prière\n" +
                        "Souviens-toi de Jésus, souviens-toi de la croix\n" +
                        "N’entends-tu pas cette voie criant à Golgotha\n" +
                        "Pardonne-leur, pardonne-leur ils ne savent ce qu’ils font",
                "3. rappelle-toi, rappelle-toi l’agonie de la croix\n" +
                        "Et le sang du Seigneur sur le côté percé\n" +
                        "Et le mot de victoire ce tout est accompli\n" +
                        "Que l’œuvre du calvaire porte des fruits nouveaux",
                "4. Les vieillards comme les jeunes seront tous affranchis\n" +
                        "Les sorciers, les voleurs, seront aussi sauvés.\n"+
                        "Et la puissance de Mammon sera enfin brisée\n" +
                        "Un seul Dieu, un seul Roi règnera dans les cœurs.", "", "", "", "", "", "", "", "", "" ));


        allItems.add( new ListNumero( "101", "Tout est à toi Seigneur Le don le plus grand",
                "1. Tu créas la terre, tout était bon\n" +
                        "Tu nous l’as confiée\n" +
                        "Mais notre réponse ne fut que rébellion\n" +
                        "Dieu aies pitié de nous !",
                "2. Tu immolas ton saint fils\n" +
                        "Sur cette horrible croix\n" +
                        "Tu l’as condamné pour nous justifier\n" +
                        "O Eternel tu es bon !",
                "3. Et tu répandis ton Saint-Esprit\n" +
                        "Pour nous fortifier\n" +
                        "Et pour faire de nous des témoins du Dieu vivant\n" +
                        "O Eternel tu es grand !",
                "4. Tu nous a donné notre leader\n" +
                        "Pour nous servir de modèle\n" +
                        "O dieu aide-nous a suivre ce modèle\n" +
                        "Pour satisfaire ton cœur.",
                "5. Tu nous as donné tes enfants\n" +
                        "Pour que nous les servions\n" +
                        "O Dieu donne-nous des cœurs de serviteurs\n" +
                        "Pour satisfaire ton cœur.",
                "6. Tu nous as promis de revenir\n" +
                        "Nous amener là-haut\n" +
                        "Seigneur notre joie est dans ton avènement\n" +
                        "Viens Seigneur viens bientôt !",
                "Tout est à toi Seigneur\n" +
                        "Le don le plus grand\n" +
                        "Que tu as donné\n" +
                        "C’est la lumière\n" +
                        "Qui est venue sur notre terre\n" +
                        "Pour sauver tous ceux qui croient", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "102", "Ici nous nous sommes",
                "1.Ici nous nous sommes\n" +
                        "rencontrés pour nous engager\n" +
                        "Afin de servir dans le Seigneur.\n" +
                        "Tous les hommes du monde entier . Ch.",
                "2. Car nous avons reçu du\n" +
                        "grand Roi, cette commission\n" +
                        "D’aller partout dans le monde\n" +
                        "entier Annoncer la bonne\n" +
                        "nouvelle.   Ch.",
                "3. Le monde avec toutes sorte\n" +
                        "d’appâts, ne nous séduira Car\n" +
                        "nous savons il est vanité Le vrai\n" +
                        "trésor est en Jésus. Ch.",
                "4. Aussi loin que nous pourrons\n" +
                        "Trouver la malédiction Nous irons\n" +
                        "de la part de Jésus car le\n" +
                        "Seigneur est mort pour tous ! Ch.", "", "",
                "Eh oui ! Pour vous,\n" +
                        "Pour le Seigneur, pour,\n" +
                        "Le prochain nous voulons (bis)\n" +
                        "Être des serviteurs.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "103", "Ecoute la voix qui crie à ton cœur",
                "1. Ecoute la voix qui crie à ton cœur\n" +
                        "Ouvre-moi, ouvre-moi\n" +
                        "Et c’est encore cette voix qui supplie\n" +
                        "Ouvre-moi, ouvre-moi.",
                "2. Toi qui cherches le chemin dans le noir\n" +
                        "Ouvre-moi, ouvre-moi\n" +
                        "Car je suis le vrai chemin de la vie\n" +
                        "Ouvre-moi, ouvre-moi",
                "3. c’est pour toi que j’ai souffert à la croix\n" +
                        "Ouvre-moi, ouvre-moi\n" +
                        "J’ai porté tous les péchés au calvaire\n" +
                        "Ouvre-moi, ouvre-moi",
                "4. N’aies pas peur, je ne te condamne pas\n" +
                        "Ouvre-moi, ouvre-moi\n" +
                        "Je suis celui qui donne la paix\n" +
                        "Ouvre-moi, ouvre-moi",
                "5. Mon cher ami, n’endurcis pas ton cœur\n" +
                        "Ouvre-moi, ouvre-moi\n" +
                        "C’est peut être la dernière fois qu’il t’appelle\n" +
                        "Ouvre-moi, ouvre-moi.", "", "",
                "C’est le Seigneur qui frappe à ta porte\n" +
                        "Si tu entends, ouvre-lui ton cœur\n" +
                        "Il apporte l’eau de vie à ton cœur assoiffé\n" +
                        "Ouvre-moi, ouvre-moi.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "104", "Dans les cieux règne le Dieu vivant",
                "1. Dans les cieux règne le Dieu vivant\n" +
                        "Celui qui par son verbe puissant\n" +
                        "Fit la terre et le grand firmament\n" +
                        "Louez-le, louez-le.",
                "2. Qui comme lui du rocher fait jaillir\n" +
                        "Une eau qui jamais ne peut tarir\n" +
                        "Quiconque en boit ne saurait périr\n" +
                        "Louez-le, louez-le.",
                "3. A ses yeux, mille ans sont comme un jour\n" +
                        "Sur terre, l’homme a un si bref séjour\n" +
                        "Mais, lui, l’Eternel, sera toujours.\n" +
                        "Louez-le, louez-le",
                "4. plions-nous sous son bras souverain\n" +
                        "Car lui-même trace notre chemin\n" +
                        "L’avenir, en lui, reste certain\n" +
                        "Louez-le, louez-le.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "105", "Je ne vivrai pas comme une poule sur la terre",
                "1. Tu as besoin d’être aimé\n" +
                        "Tu as besoin d’être écouté\n" +
                        "Besoin d’un ami, besoin de paix\n" +
                        "Et tu as cherché, cherché.",
                "2. Pendant plusieurs années\n" +
                        "J’ai été enseignée\n" +
                        "J’ai été exhortée\n" +
                        "À faire de grandes choses pour Dieu\n" +
                        "Maintenant, je me lève pour un avenir glorieux. Ref.",
                "3. Je laisserai, Dieu aidant,\n" +
                        "Sur le sable du temps\n" +
                        "Des marques permanentes\n" +
                        "Pour la plus grande gloire de Dieu\n" +
                        "Et j’aurai investi tout mon être pour bâtir le royaume de Dieu.",
                "4. En ce qui me concerne\n" +
                        "je ne serai pas une poule\n" +
                        "Je serai un aigle car Dieu m’a donné des ailles\n" +
                        "Oui je m’envolerai vers les hauteurs\n" +
                        "Et je connaitrai mon Seigneur.   Ref 2.",
                "5. Je donnerai ma vie\n" +
                        "Mon corps sera assujetti\n" +
                        "Je paierai le prix\n" +
                        "Pour une vie de destinée\n" +
                        "Qui aura des conséquences au ciel, sur terre et en enfer.", "",
                "Je ne vivrai pas comme\n" +
                        "une poule sur la terre\n" +
                        "Mon nom n’ira pas dans\n" +
                        "la foule des humains.", "", "",
                "Mon frère vivras-tu comme\n" +
                        "une poule sur la terre ?\n" +
                        "Mon nom ira-t-il dans la foule\n" +
                        "des humains ?", "",
                "Oui ma vie aura sur la terre\n" +
                        "Un impact\n" +
                        "J’amènerai par la prière Christ\n" +
                        "le Roi.", "" ));
        allItems.add( new ListNumero( "106", "Le monde vit dans le péché",
                "1. Le monde vit dans le péché\n" +
                        "les cœurs brisés, les foyers brisés\n" +
                        "Les suicides, les divorces\n" +
                        "En sont les conséquences.",
                "2. Tu es séparé de Dieu\n" +
                        "Voué au châtiment (éternel)\n" +
                        "À moins que tu ne te repentes\n" +
                        "L’enfer est ton salaire.",
                "3. Il te donne dans son amour\n" +
                        "Un don merveilleuse\n" +
                        "Jésus son fils, c’est la vie\n" +
                        "Reçois-le dans ton cœur.",
                "4. Tes œuvres sont inutiles\n" +
                        "Jésus seul suffira\n" +
                        "Pour apaiser la colère\n" +
                        "Du Dieu juste et saint.", "", "",
                "Le péché d’Adam entraina la mort\n" +
                        "Dieu ne le toléra pas\n" +
                        "Il ne toléra pas le tien   (bis)\n" +
                        "Il donnera à chacun ce qu’il mérite.", "", "", "",
                "Il te tend la main ce Jésus\n" +
                        "Il te tend la main, sa main d’amour\n" +
                        "Il insiste pour te sauver\n" +
                        "Ouvre-lui, ouvre-lui, ouvre-lui ton cœur !", "", "" ));
        allItems.add( new ListNumero( "107", "Ta gloire est grande sur toute la terre",
                "1. Quand je vois le ciel ouvrage de tes mains\n" +
                        "la lune les étoiles que tu as placées\n" +
                        "Je me demande : qui est l’homme ?\n" +
                        "Pour que tu penses tant à lui !  Ch.",
                "2. Ta majesté surpasse celle du ciel\n" +
                        "Mais c’est la voix des tous petits enfants\n" +
                        "Que tu opposes à tes adversaires\n" +
                        "Elle est comme un rempart que tu dresses. Ch.",
                "3. Tu m’as fait presque l’égal de Dieu\n" +
                        "Tu m’as fait régner sur ta création\n" +
                        "Tu as tout mis tout mis à mes pieds\n" +
                        "Mérité-je vraiment cette honneur ? Ch.", "", "", "",
                "Ta gloire est grande sur toute la terre\n" +
                        "Ta majesté surpasse le ciel\n" +
                        "Nous te louons, nous t’adorons\n" +
                        "Ô Eternel Roi des rois notre maitre.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "108", "Que cherches-tu ? Quand tu ne cesse de courir",
                "1.Pourtant tu veux bien être\n" +
                        "heureux espérer vivre mieux\n" +
                        "Âme angoissée, le cœur ravagé tu reste insatisfait\n" +
                        "En vain tu as marché en vain tu as couru. Ch. 1",
                "2. autour de toi des amis, des\n" +
                        "frères ne sont plus\n" +
                        "ils ont couru sans rien emporter ils sont partis !\n" +
                        "Oh ! Vanité de la course sans Jésus.  Ch. 1",
                "3. La course après les\n" +
                        "richesses les plaisirs éphémères\n" +
                        "La course après les bulles de savon, la course !\n" +
                        "Tu peux l’arrêter, tu peux être heureux.",
                "4. Viens tel que tu es adultère, voleur, qu’importe\n" +
                        "Âme lassée, viens te reposer sur moi\n" +
                        "Viens tu es pardonné, ton péché j’ai effacé\n" +
                        "Je te veut maintenant et pour l’éternité. (bis)", "", "",
                "Que cherches-tu ?\n" +
                        " Quand tu ne cesse de courir\n" +
                        "Le matin à peine levé, tu cours !\n" +
                        "Le soir lassé,\n" +
                        "Tu t’écries je n’ai pas eu le temps, pas le temps\n" +
                        "Je n’ai pas le temps, pas le temps est ton refrain.", "", "",
                "Prends donc le temps d’écouter ce\n" +
                        "que dit Jésus : Je t’aime !\n" +
                        "J’ai payé le prix pour ta satisfaction\n" +
                        "Sur cette croix j’ai tout accompli pour toi\n" +
                        "Je suis ton sauveur, ton\n" +
                        "sauveur qui t’aime.", "", "", "" ));

        allItems.add( new ListNumero( "109", "Combien de chemins as-tu parcouru",
                "1. Tu as besoin d’être aimé\n" +
                        "Tu as besoin d’être écouté\n" +
                        "Besoin d’un ami, besoin de paix\n" +
                        "Et tu as cherché, cherché.   Ch 1",
                "2. Après les hommes tu courus\n" +
                        "Et vers les dieux, tu t’es tourné\n" +
                        "Aujourd’hui Mahomet, demain\n" +
                        "Bouddha\n" +
                        "Marie et les saints, c’est pareil.    Ch 1",
                "3. ton avenir est incertain\n" +
                        "La paix du cœur tu ne connais pas\n" +
                        "La véritable joie, tu ne connait pas\n" +
                        "Et tu restes triste, désespéré. Ch 1",
                "4. laisse-moi te dire, te confier\n" +
                        "Il y a un seul chemin, oui un seul\n" +
                        "Pour arriver à ce bonheur\n" +
                        "À ce paradis cherché.",
                "(paroles) :\n" +
                        "Oui c’est Jésus, Jésus le fils de Dieu,\n" +
                        "le Sauveur du monde ...\n" +
                        "Viens à Jésus, viens à lui et ton âme,\n" +
                        "il la sauvera.\n" +
                        "Ch. 2", "",
                "Combien de chemins as-tu parcouru\n" +
                        "Combien de fois, tu as hésité\n" +
                        "Combien de fois tu as été déçu\n" +
                        "Combien de fois tu as été trompé.", "", "", "",
                "Un seul chemin pour les angoissés\n" +
                        "Un seul chemin pour les damnés\n" +
                        "Un seul chemin pour les ratés\n" +
                        "Un seul chemin pour les délaissés.", "", "" ));
        allItems.add( new ListNumero( "110", "Si à lui tu t’es vraiment confié",
                "1. Si à lui tu t’es vraiment confié\n" +
                        "Et tes voies tu as abandonné\n" +
                        "N’écoute pas cette voie trompeuse\n" +
                        "Crois à la sainte Parole. Ch.",
                "2. Pour toi commence la vraie vie\n" +
                        "Avec joie va servir Jésus\n" +
                        "Son joug est doux, il est léger\n" +
                        "Ouvre-lui tout ton cœur . Ch.",
                "3. Tu connaitras des difficultés\n" +
                        "Ton maitre a fait le même chemin\n" +
                        "Il te conduira, t’instruira\n" +
                        "Il ne t’oubliera pas. Ch.",
                "4. Pour le combat, tu as des armes\n" +
                        "Demeure en lui, sois vrai et Zélé\n" +
                        "Pour annoncer la bonne nouvelle\n" +
                        "Prie, lis la Bible, agis. Ch.", "", "",
                "O quel bonheur d’être sauvé\n" +
                        "D’avoir ses péchés pardonnés\n" +
                        "D’avancer chaque jour qui passe\n" +
                        "Vers la maison du Père.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "111", "O tendre Père, donne-moi",
                "1. Ô tendre Père, donne-moi\n" +
                        "Un cœur contrit et brisé\n" +
                        "Oh un cœur qui sans murmure\n" +
                        "Reconnait sa pauvreté\n" +
                        "Donne-moi (bis)\n" +
                        "Un cœur contrit et brisé.",
                "2. Que ta vue sur moi provoque\n" +
                        "La réaction que tu veux\n" +
                        "Ce regard qu’un jour tu posas\n" +
                        "Sur Pierre quand il te renia.\n" +
                        "Ce regard, ton regard\n" +
                        "Brise en moi la dureté.",
                "3. Souvent je me suis demandé\n" +
                        "Comment tu l’a regardé\n" +
                        "Le regard d’un cœur brisé\n" +
                        "D’un ami qui aime encore\n" +
                        "Oui sur moi, ton regard\n" +
                        "Me fasse fondre en chaudes larmes.",
                "4. l’œil de mon Seigneur en peine\n" +
                        "Qui tait la justification\n" +
                        "Mais fait fondre le cœur en larmes\n" +
                        "Ne cherche aucune raison\n" +
                        "Donne-moi (bis)\n" +
                        "Un cœur contrit et brisé.",
                "5. Bien que souffrant pose sur moi\n" +
                        "Ta vue pleine de déception\n" +
                        "Oh que je ressente avec toi.\n" +
                        "Ta douleur causée par moi.\n" +
                        "Donne-moi   (bis)\n" +
                        "Un cœur contrit et brisé.",
                "6. Je veux connaitre la haine\n" +
                        "Du péché que tu connait\n" +
                        "Cesser de me justifier\n" +
                        "L’œuvre de la croix accepter\n" +
                        "Donne-moi  (bis)\n" +
                        "Un cœur contrit et brisé.", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "112", "Toi mon ami c’est pour toi que je chante",
                "1.Ta route est-elle sombre, longue et triste\n" +
                        "Tu ne sais pas où elle te mène\n" +
                        "Tes lendemains sont bien incertains\n" +
                        "Tu ne sais pas où te conduira demain",
                "2. Je sais où je vais et je suis rayonnant\n" +
                        "Mais cela n’a pas toujours été comm’c’la\n" +
                        "Mon histoire commence avec une rencontre\n" +
                        "Celle avec Jésus qui es devenu mon Maitre.",
                "3. Jésus, c’est lui la raison de ma joie\n" +
                        "J’étais sous la malédiction divine\n" +
                        "Je trainais sans assurance de la vie\n" +
                        "Quand un jour il es venu sur mon chemin.",
                "4. Il a pris sur lui notre malédiction\n" +
                        "Il a pris sur lui notre sanction\n" +
                        "Toi aussi tu peux être libéré\n" +
                        "Et comme moi tu pourras aussi chanter.", "", "",
                "Toi mon ami c’est pour toi que je chante\n" +
                        "Mon cœur est plein, plein d’amour et de zèle\n" +
                        "J’ai l’évangile de paix à t’annoncer\n" +
                        "Oui j’ai l’amour, l’amour de\n" +
                        "CHRIST à te donner.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "113", "A moi les cœurs braves ! A dit le Vainqueur",
                "1. A moi les cœurs braves ! A dit le Vainqueur\n" +
                        "Qui rompt les entraves Du pauvre pécheur\n" +
                        "Noble est la carrière : " +
                        "Qui veut y courir,\n" +
                        "Et, sous ma bannière Combattre et vivre ?",
                "2. l’ennemi fait rage !je sens ses fureurs ;\n" +
                        "Comme un bruit d’orage J’entends des clameurs\n" +
                        "Quand Satan déchaine tous ses ailes :\n" +
                        "Mais ce flot de haine expire à tes pieds.",
                "3. Ma couronne est prête\n" +
                        "Tu m’as racheté !\n" +
                        "Ma justice est faite de ta sainteté\n" +
                        "Ta grâce infinie couvre mes péchés ;\n" +
                        "A ta croix bénie ils sont attachés.   Ch.",
                "4. Après tant de luttes,\n" +
                        "Lassés, mais vainqueurs,\n" +
                        "Relevés des chutes, Guéris des douleurs,\n" +
                        "Gardé sous ton aile, nous aurons toujours\n" +
                        "La paix éternelle, et pourrons chanter :", "", "", "",
                "A toi, Divin Maitre,\n" +
                        "Mon cœur et mon bras :\n" +
                        "Jésus, je veux être\n" +
                        "Un de tes soldats !", "", "",
                "« A toi les couronnes\n" +
                        "de tous les élus !\n" +
                        "c’est toi qui leur\n" +
                        "donnes ton ciel, Ô Jésus ! »", "", "" ));
        allItems.add( new ListNumero( "114", "Jésus-Christ est ma sagesse Il éclaire mon chemin",
                "1.Jésus-Christ est ma sagesse\n" +
                        "Il éclaire mon chemin, Et je\n" +
                        "marche en ma faiblesse\n" +
                        "Conduit par sa sûre main.\n" +
                        "Il éclaire mon chemin (bis)\n" +
                        "Et je marche en ma faiblesse\n" +
                        "conduit par sa sûre main.",
                "2. Jésus-Christ est ma justice\n" +
                        "Son sang a coulé pour moi;\n" +
                        "Je trouve en son sacrifice Paix et\n" +
                        "pardon par la foi.\n" +
                        "Son sang a coulé pour moi (bis)\n" +
                        "Je trouve en son sacrifice paix et\n" +
                        "pardon par la foi.",
                "3. Jésus-Christ me sanctifie ;\n" +
                        "Au Divin cep attaché,\n" +
                        "Je reçois de lui la vie\n" +
                        "Qui m’affranchit du péché.\n" +
                        "À toi, Jésus, attaché,c(bis)\n" +
                        "Je reçois de toi la vie qui\n" +
                        "m’affranchit du péché.",
                "4. Jésus en payant ma dette\n" +
                        "À grand prix m’a racheté\n" +
                        "Près de lui ma place est rprête\n" +
                        "Au ciel pour l’éternité,\n" +
                        "Jésus tu m’a racheté (bis)\n" +
                        "Et déjà ma place est prête au ciel\n" +
                        "pour l’éternité.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "115", "Au combat de la vie Conscrits et vétérans,",
                "1. Au combat de la vie Conscrits et vétérans,\n" +
                        "Le Seigneur nous convie :\n" +
                        "Soldats ! Serrons nos rangs !\n" +
                        "Qu’au Divin capitaine Notre cœur soit uni :\n" +
                        "La victoire est certaine Sous son drapeau béni.",
                "2. La croix est une bannière\n" +
                        "Son beau nom est Jésus\n" +
                        "Des armes de lumières il revêt ses élus.\n" +
                        "Son Esprit les enflamme au plus fort des combats ;\n" +
                        "Son âme est dans leur âme, sa force est dans leur bras.",
                "3. Jeunesse ardente et fière, jeunesse au cœur vaillant,\n" +
                        "Donne-toi toute entière au\n" +
                        "Sauveur Tout-Puissant !\n" +
                        "Soumise à sa loi pure, tu mettras sous ses pieds,\n" +
                        "Tes péchés, ta souillure, par a mort expiés.",
                "4. Par sa grâce infinie il guérit tes maux ;\n" +
                        "Et, la lutte finie, après bien des travaux,\n" +
                        "Sur ton front qui rayonne,\n" +
                        "d’espoir et de clarté,\n" +
                        "Il mettra la couronne de l’immortalité", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "116", "Jésus guérit, il pardonne, il délivre, il libère",
                "1.Es-tu déjà découragé\n" +
                        "Es-tu lassé par ton péché\n" +
                        "Ne t’en fais pas viens à lui\n" +
                        "Ne t’en fais pas viens à Jésus.",
                "2. La maladie t’a-t-elle lassé\n" +
                        "Et tu souffres, souffres, vraiment\n" +
                        "Ne t’en fais pas viens à lui\n" +
                        "Ne t’en fais pas viens à Jésus.",
                "3. Que de fardeaux tu as sur toi\n" +
                        "Et tu misères sous leur poids\n" +
                        "Ne t’en fais pas viens à lui\n" +
                        "Ne t’en fais pas viens à Jésus.",
                "4. Que de marabouts tu as visité\n" +
                        "Que de remèdes tu as pris\n" +
                        "Ne t’en fais pas viens à lui\n" +
                        "Ne t’en fais pas viens à Jésus.",
                "5. Que de démons t’ont tourmenté\n" +
                        "Et tu cherches la délivrance\n" +
                        "Ne t’en fais pas viens à lui\n" +
                        "Ne t’en fais pas Jésus délivre.", "",
                "Jésus guérit, il pardonne,\n" +
                        "il délivre, il libère (bis)", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "117", "Viens avec tous tes fardeaux mon ami",
                "1.Es-tu fatigué, es-tu lassé\n" +
                        "Il te donnera le repos du cœur.\n" +
                        "Es-tu déçu, as-tu été trompé ?\n" +
                        "Ne t’en fais pas, Ô viens à lui.   Ch.",
                "2. Tu as trompé, tu as fait souffrir\n" +
                        "Il te pardonnera, viens à lui.\n" +
                        "Es-tu abandonné, es-tu raté\n" +
                        "Ô viens à lui, viens à Jésus.  Ch.",
                "3. Tu es voleur ou même menteur\n" +
                        "Son sang a coulé pour toi à Golgotha\n" +
                        "Ne t’en va pas, ne t’endurcis pas\n" +
                        "Tu pourrais avoir à le regretter.  Ch.",
                "4.Oui c’est pour toi, pour toi qu’il a souffert\n" +
                        "Oui c’est pour toi qu’il a tout accompli.\n" +
                        "Il a vaincu le monde, il a vaincu Satan.\n" +
                        "Il a rompu toutes tes chaines. Ch.",
                "5. Oui c’est pour toi, pour toi ce Golgotha\n" +
                        "Oh ! C’est pour toi ce flot d’amour.\n" +
                        "L’ami des pécheurs, le Roi des rois\n" +
                        "Frappe à ta porte, veux-tu ouvrir ? Ch.", "",
                "Viens avec tous tes fardeaux mon ami\n" +
                        "Viens les déposer aux pieds de Jésus", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "118", "Un nom si doux réjouit mon cœur,",
                "1.Un nom si doux réjouit mon cœur,\n" +
                        "Me fait chanter ses louanges,\n" +
                        "Brille d’une auguste splendeur :\n" +
                        "Le plus beau nom Jésus.",
                "2.Ce nom parle d’amour suprême\n" +
                        "de lui qui m’a sauvé,\n" +
                        "Qui a versé son sang précieux\n" +
                        "Pour ôter mes péchés.  Ch.",
                "3. Et il me parle de ce que\n" +
                        "Le Père à pour l’enfant,\n" +
                        "De sa grâce, son fort Esprit\n" +
                        "Pour vaincre à chaque instant. Ch.",
                "4. Et il affirme qu’un ami\n" +
                        "M’assiste à chaque épreuve\n" +
                        "Qu’il me soutien dans mon chagrin\n" +
                        "De la peine m’enlève. Ch.", "", "", "",
                "Oui j’aime Jésus, (ter)\n" +
                        "Qui m’aima le premier.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "119", "Sur la place du village ils sont accourus,",
                "1. Sur la place du village\n" +
                        "Ils sont accourus,\n" +
                        "Les malheureux de tout âge\n" +
                        "Criant à Jésus :",
                "2. qu’il vous soit fait, dit le maitre,\n" +
                        "Selon votre foi.\n" +
                        "Sa parole les pénètre,\n" +
                        "Bannit leur effroi.   Ch.",
                "3. Il pose ses mains bénies,\n" +
                        "Sur leurs fronts brûlants\n" +
                        "Et chasse la maladie\n" +
                        "De leurs corps souffrants. Ch.",
                "4. Et soudain la vie divine\n" +
                        "Restaure leurs corps ;\n" +
                        "Comme hier en Palestine, il\n" +
                        "guérit encore. Ch.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "120", "Comme une terre altérée soupire après l’eau du ciel",
                "1.Comme une terre altérée\n" +
                        "Soupire après l’eau du ciel\n" +
                        "Nous appelons la rosée\n" +
                        "De ta grâce, Emmanuel !",
                "2. Descends, Ô pluie abondante\n" +
                        "Coule à flots dans notre cœur\n" +
                        "Donne à l’âme languissante,\n" +
                        "Une nouvelle fraîcheur.  Ch.",
                "3. Ne laisse en nous rien d’aride\n" +
                        "Qui ne soit fertilisé\n" +
                        "Que le cœur le plus avide,\n" +
                        "Soit pleinement arrosé. Ch.",
                "4. Oui que les déserts fleurissent\n" +
                        "Sous tes bienfaisantes eaux,\n" +
                        "Que les lieux secs reverdissent\n" +
                        "Et portent des fruits nouveaux.  Ch.",
                "5. Viens, Ô salutaire pluie,\n" +
                        "Esprit de grâce et de paix !\n" +
                        "Répand en nous une vie\n" +
                        "Qui ne tarissent jamais.  Ch.", "", "",
                "Fraîches rosées\n" +
                        "Descendez sur nous tous\n" +
                        "O divine ondées,\n" +
                        "Venez arrosez-nous", "", "", "", "", "" ));
        allItems.add( new ListNumero( "121", "Quand la trompette céleste Annoncera les temps nouveaux",
                "1. Quand la trompette céleste\n" +
                        "Annoncera les temps nouveaux\n" +
                        "Quand poindra l’aurore de l’éternité\n" +
                        "Et que s’ouvrira le grand livre de vie de l’agneau,\n" +
                        "Pourrons-nous répondre à l’appel: je suis prêt ?",
                "2. Oh ! Quel glorieux réveil :\n" +
                        "Les morts en Christ se lèveront\n" +
                        "Avec eux nous les vivants serons changés\n" +
                        "Tous ensemble sur la nue en un clin d’œil nous monterons\n" +
                        "Pour être avec lui toujours seras-tu Prêt ? Ch.",
                "3. Travaillons pour notre Maitre\n" +
                        "Tandis qu’il fait encore jour,\n" +
                        "Moissonnons les âmes pour l’éternité !\n" +
                        "S’il nous trouves à notre poste pleins de zèle et pleins d’amour\n" +
                        "Quand il viendra nous chercher,nous serons prêts ! Ch.", "", "", "", "",
                "A l’appel de la trompette, (ter)\n" +
                        "Quand Jésus-Christ\n" +
                        "Reviendra, je serai prêt.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "122", "Divin Rocher, refuge sûre",
                "1. Divin Rocher, refuge sûre :\n" +
                        "L’abri pour nous dans la tempête !\n" +
                        "Notre défense en combat dur :\n" +
                        "L’abri pour nous dans la tempête !",
                "2. Une ombre au jour, un mur la nuit :\n" +
                        "L’abri pour nous dans la tempête !\n" +
                        "nulle peur donc de l’ennemi :\n" +
                        "L’abri pour nous dans la tempête !  Ch.",
                "3. Si l’orage éclate alentour :\n" +
                        "L’abri pour nous dans la tempête !\n" +
                        "Nous restons forts par son secours :\n" +
                        "L’abri pour nous dans la tempête !  Ch.",
                "4. Divin Rocher, Refuge aimé :\n" +
                        "L’abri pour nous dans la tempête !\n" +
                        "Sois notre aide à tout jamais ;\n" +
                        "L’abri pour nous dans la tempête !  Ch.", "", "", "",
                "Jésus est un Roc dans un pays troublé\n" +
                        "Un pays troublé (bis)\n" +
                        "Oui, Jésus est le Roc dans un pays troublé :\n" +
                        "L’abri pour nous dans la tempête !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "123", "Roi de ma vie, reçois l’hommage,",
                "1. Roi de ma vie, reçois l’hommage,\n" +
                        "Sois adoré, exalté !\n" +
                        "De ma misère, mon esclavage,\n" +
                        "Mourant tu m’as sauvé.",
                "2. Agonisant sur le calvaire\n" +
                        "Je vois souffrir pour moi\n" +
                        "Buvant la coupe, si pleine, amère\n" +
                        "Toi, Sauveur, à la croix. Ch.",
                "3. Déposé dans un froid tombeau,\n" +
                        "Ayant rendu ton âme,\n" +
                        "Ton corps brisé reçu le repos\n" +
                        "Après une mort infâme. Ch.",
                "4. Sauveur, je te prie aide-moi\n" +
                        "À suivre ton modèle\n" +
                        "Portant à chaque instant ma croix\n" +
                        "Restant toujours fidèle. Ch.",
                "5. Et chauffe en moi un feu vivant,\n" +
                        "Allumé au calvaire,\n" +
                        "Pour annoncer le cœur errant\n" +
                        "Ton amour salutaire.  Ch.", "", "",
                "Que jamais je n’oublie, Ô Dieu\n" +
                        "Ton grand Amour si merveilleux !\n" +
                        "Garde toujours devant mes yeux\n" +
                        "Le Christ mourant en CROIX !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "124", "Quand la Bible ici bas ! Illumine nos pas,",
                "1. Quand la Bible ici bas !\n" +
                        "Illumine nos pas,\n" +
                        "De sa gloire Dieu vient nous remplir.\n" +
                        "Quand je veux ce qu’il veut,\n" +
                        "En son nom je le peux\n" +
                        "Simplement il faut croire obéir.",
                "2. veux-tu la liberté,\n" +
                        "Le bonheur, la santé ?\n" +
                        "Que ton seul but soit de le servir !\n" +
                        "Car l’Esprit n’est donné avec la joie, la paix,\n" +
                        "Qu’à celui qui veut croire obéir. Ch.",
                "3. Les fardeaux, les labeurs,\n" +
                        "Le chagrin et les pleures,\n" +
                        "A mon bien Dieu les fait concourir .\n" +
                        "Ils deviendront au ciel, des trésors éternels,\n" +
                        "Simplement, il faut croire, obéir. Ch.",
                "4. Nous pouvons dépasser,nos incapacités,\n" +
                        "Aux desseins éternels nous ouvrir\n" +
                        "De nouveaux horizons, une vaste\n " +
                        "moisson ...\n" +
                        "Simplement il faut croire, obéir.  Ch.",
                "5. A ses ordres soumis\n" +
                        "Sans aucun compromis :\n" +
                        "Alors le Tout-Puissant peut agir.\n" +
                        "Il nous ouvre les flots, fait tombé Jéricho.\n" +
                        "Simplement, il faut croire, obéir. Ch.", "", "",
                "Croire, obéir : Pour que Dieu puisse ouvrir\n" +
                        "Les écluses célestes,\n" +
                        "Il faut croire, obéir.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "125", "Debout, sainte cohorte",
                "1. Debout, sainte cohorte,\n" +
                        "Soldat du Roi des rois !\n" +
                        "Tenez d’une main forte\n" +
                        "L’étendard de la croix !\n" +
                        "Au sentier de la Gloire,\n" +
                        "Jésus-Christ nous conduit.\n" +
                        "De victoire en victoire\n" +
                        "Il mène qui le suit.",
                "2. La trompette résonne :\n" +
                        "Debout ! vaillant soldat !\n" +
                        "L’immortelle couronne\n" +
                        "Est le prix des combats.\n" +
                        "Si l’ennemi fait rage, soyons\n" +
                        "fermes et forts !\n" +
                        "Redoublons de courage, s’ils\n" +
                        "redoublent d’efforts.",
                "3. Debout pour la bataille,\n" +
                        "partons n’hésitons plus !\n" +
                        "Pour que nul ne défaille,\n" +
                        "regardons à Jésus !\n" +
                        "De l’armure invincible, soldat\n" +
                        "revêtons-nous !\n" +
                        "Le triomphe est possible,\n" +
                        "pour qui lutte à genoux.",
                "4. Debout, debout encore !\n" +
                        "Luttons jusqu’au matin,\n" +
                        "Déjà brille l’aurore, à l’horizon lointain.\n" +
                        "Bientôt jetant nos armes, aux\n" +
                        "pieds du Roi des rois ! Les\n" +
                        "chants après les larmes,\n" +
                        "le trône après la croix !",
                "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "126", "Frères , en avant Dans la sainte guerre !",
                "1.Frères , en avant\n" +
                        "Dans la sainte guerre !\n" +
                        "Suivons l’étendard de la croix !\n" +
                        "Luttons sans crainte !\n" +
                        "Notre chef demeure\n" +
                        "Avec nous dans chaque combat",
                "2. Prenons les armes !\n" +
                        "L’Esprit nous fortifie,\n" +
                        "Nous fait triompher de Satan.\n" +
                        "Toujours en avant !\n" +
                        "Jamais en arrière !\n" +
                        "Voilà la devise des vaillants.",
                "3. Christ nous dirige,\n" +
                        "Jamais ne nous délaisse\n" +
                        "Même dans le plus fort combat.\n" +
                        "Donc, nous le suivons,\n" +
                        "L’étendard ne se baisse.\n" +
                        "Bientôt il sera Roi des rois.", "", "", "", "",
                "Christ notre Roi,\n" +
                        "A toi nous rendons la gloire\n" +
                        "Christ notre Roi,\n" +
                        "A toi appartient notre vie", "", "", "", "", "" ));
        allItems.add( new ListNumero( "127", "La lutte suprême\n" +
                        "Nous appelle tous, Et Jésus lui-même",
                "1. La lutte suprême\n" +
                        "Nous appelle tous, Et Jésus lui-même\n" +
                        "Marche devant nous.\n" +
                        "Que a vue enflamme tous ses combattants\n" +
                        "Et soutiennent l’âme des plus hésitants.",
                "2. l’ennemi redoute Le nom seul du Roi\n" +
                        "Il fuit en déroute au cri de la foi\n" +
                        "Acclamons ensemble Jésus d’un seul cœur\n" +
                        "Et que l’enfer tremble à ce nom\n " +
                        "VAINQUEUR.",
                "3. Nous suivons la trace Des saints d’autrefois :\n" +
                        "Par la même grâce sous les même lois,\n" +
                        "Vivant de miracles, l’Eglise de Dieu,\n" +
                        "De tous les obstacles, triomphe\n" +
                        "en tous lieux. Ch.",
                "4. Que les ans s’écoulent\n " +
                        "Que de toutes parts,\n" +
                        "À grand bruit s’écroulent trône et remparts :\n" +
                        "Notre citadelle, ferme contre tout,\n" +
                        "L’Eglise fidèle restera debout.  Ch.",
                "5. En avant jeunesse !\n" +
                        "Que ta noble ardeur\n" +
                        "Jamais ne connaisse ni honte ni peur !\n" +
                        "Ton chef invincible marche devant toi\n" +
                        "Et tout est possible aux hommes de foi. Ch.",
                "6. Reçois, chef suprême\n" +
                        "Monarque éternel,\n" +
                        "D’un peuple qui t’aime, le vœu solennel\n" +
                        "Gloire, Amour , Hommage au ressuscité !\n" +
                        "Qu’il soit d’âge en âge partout exalté.  Ch." +
                        "", "",
                "Du Christ, la bannière\n" +
                        "Se déploie au vent,\n" +
                        "Pour la sainte guerre,\n" +
                        "Soldats en avant !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "128", "CHRIST est ressuscité\n" +
                        "Qu’en des chants glorieux,",
                "1. CHRIST est ressuscité\n" +
                        "Qu’en des chants glorieux,\n" +
                        "Son triomphe en tous lieux soit\n" +
                        "exalté !",
                "2. Christ est ressuscité\n" +
                        "Cherche en lui toujours,\n" +
                        "O peuple racheté, force et\n" +
                        "secours. Ch.",
                "", "", "", "", "",
                "A toi la gloire et l’honneur,\n" +
                        "Ô sauveur, Ô puissant\n" +
                        "Rédempteur !\n" +
                        "Du sépulcre tu sortis vainqueur\n" +
                        "Prince de Vie et Prince de Paix.\n" +
                        "Gloire à toi, gloire à toi,\n" +
                        "Gloire à toi, gloire à jamais !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "129", "Chantons du Seigneur la bonté",
                "1. Chantons du Seigneur la bonté\n" +
                        "Pour tout son peuple racheté\n" +
                        "Sauveur Divin sauveur parfait,\n" +
                        "Jésus fait bien tout ce qu’il fait.",
                "2. Tout l’univers dit son pouvoir,\n" +
                        "mais son amour qui sait le voir,\n" +
                        "C’est à la croix qu’il apparait,\n" +
                        "Jésus fait bien tout ce qu’il fait.  Ch.",
                "3. Pour me sauver pécheur perdu,\n" +
                        "Dans l’abîme il est descendu,\n" +
                        "Quand déjà Satan m’entrainait.\n" +
                        "Jésus fait bien tout ce qu’il fait. Ch.",
                "4. c’est en vain que le tentateur\n" +
                        "Veut me ravir à mon sauveur :\n" +
                        "De ses bras qui m’arracherait ?\n" +
                        "Jésus fait bien tout ce qu’il fait.  Ch.", "", "",
                "",
                "Toute ma vie je chanterai,\n" +
                        "Je chanterai, je chanterai,\n" +
                        "Toute ma vie je chanterai :\n" +
                        "Jésus fait bien tout ce qu’il fait.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "130", "Seigneur, attire mon cœur à toi,",
                "1. Seigneur, attire\n" +
                        "Mon cœur à toi,\n" +
                        "Je te désire\n" +
                        "Tout près de moi,\n" +
                        "Ma délivrance\n" +
                        "Dans le danger,\n" +
                        "C’est ta présence Divin berger. (bis)",
                "2. Par ta puissance,\n" +
                        "Brise, soumets\n" +
                        "ma résistance\n" +
                        "À tout jamais,\n" +
                        "Courbe mon être\n" +
                        "Ma volonté\n" +
                        "Sois en le Maître incontesté. (bis)",
                "3. Quand je contemple\n" +
                        "Près de ta croix\n" +
                        "Ton grand exemple\n" +
                        "Jésus mon Roi\n" +
                        "Ah ! Je n’aspire\n" +
                        "Qu’à m’immoler,\n" +
                        "Tant je désire te ressembler ! (bis)",
                "4. prompt, je m’élance,\n" +
                        "Pour t’obéir,\n" +
                        "Prompt, je m’avance\n" +
                        "Pour te servir;\n" +
                        "Mais sous ton aile,\n" +
                        "Loin du péché,\n" +
                        "Sauveur fidèle, tiens-moi caché. (bis)", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "131", "La voix du Seigneur m’appelle",
                "1. La voix du Seigneur m’appelle :\n" +
                        "Prends ta croix et viens, suis-moi !\n" +
                        "Je réponds : Sauveur fidèle,\n" +
                        "Me voici, je viens à toi",
                "2. Mais le chemin du calvaire\n" +
                        "Est étroit et périlleux,\n" +
                        "C’est un chemin solitaire\n" +
                        "Difficile et ténébreux.  Ch.",
                "3. Il faut quitter ceux qu’on aime,\n" +
                        "Savoir être mal jugé,\n" +
                        "Endurer l’injure même,\n" +
                        "Du monde être méprisé.  Ch.",
                "4. Oui, perdre sa propre vie,\n" +
                        "Consentir à n’être rien,\n" +
                        "N’avoir qu’une seule envie :\n" +
                        "Aimer Jésus, le seul bien ! Ch.",
                "5. Jésus donne grâce et gloire\n" +
                        "Pour le suivre pas à pas,\n" +
                        "Avec lui, joie et victoire\n" +
                        "Paix et bonheur ici-bas.  Ch.", "", "",
                "Jusqu’au bout je veux te suivre,\n" +
                        "Dans les bons, les mauvais jours,\n" +
                        "À toi pour mourir et vivre,\n" +
                        "À toi Jésus, pour toujours.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "132", "Quand le vol de la tempête",
                "1. Quand le vol de la\n" +
                        "tempête\n" +
                        "Vient assombrir ton ciel bleu,\n" +
                        "Au lieu de baisser la tête,\n" +
                        "Compte les bienfaits de Dieu.",
                "2. Quand, sur la route glissante,\n" +
                        "Tu chancelles sous ta croix,\n" +
                        "Pense à cette main puissante\n" +
                        "Qui a béni tant de fois. Ch.",
                "3. Si tu perds dans le voyage\n" +
                        "Plus d’un cher et doux trésor,\n" +
                        "Pense au divin héritage\n" +
                        "Qui là-haut te reste encore. Ch.",
                "4. Bénis donc, bénis sans cesse\n" +
                        "Ce Père qui, chaque jour,\n" +
                        "Répand sur toi la richesse\n" +
                        "De son merveilleux amour. Ch.", "", "", "",
                "Compte les bienfaits de Dieu\n" +
                        "Mets-les tous devant tes yeux,\n" +
                        "Tu verras, en adorant,\n" +
                        "Combien le nombre en est grand.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "133", "Espere en DIEU quand la nuit sombre",
                "1. ESPERE EN DIEU quand la nuit sombre\n" +
                        "Voile le ciel et l’horizon\n" +
                        "Jamais là-haut ne règne l’ombre\n" +
                        "Là-haut t’attend une maison\n" +
                        "Espère en Dieu quand la tempête\n" +
                        "Contre la nef jette ses flots\n" +
                        "Un mot vainqueur Déjà s’apprête\n" +
                        "À commander paix et repos.",
                "2. Espère en Dieu quand la souffrance\n" +
                        "Brisant ton corps, trouble ton cœur\n" +
                        "Chez lui jamais l’indifférence\n" +
                        "Ne le distrait de ton malheur\n" +
                        "Espère en Dieu quand sonne l’heure\n" +
                        "D’abandonner les biens d’en bas\n" +
                        "Crois aux trésors de sa demeure\n" +
                        "Car Son amour t’ouvre ses bras.",
                "3. Espère en Dieu quand on t’oublie\n" +
                        "Ou qu’on te raille avec dédain\n" +
                        "Pour te sauver, jamais ne plie !\n" +
                        "Va plutôt seul sur ton chemin\n" +
                        "Espère en Dieu quand ton pied glisse\n" +
                        "Sous les efforts du tentateur\n" +
                        "Saisis la main libératrice\n" +
                        "Qui te rendra toujours Vainqueur.", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "134", "Qu’on batte des mains ! Que tous les humains,",
                "1. Qu’on batte des mains !\n" +
                        "Que tous les humains,\n" +
                        "En cet heureux jour,\n" +
                        "Viennent tour à tour\n" +
                        "D’un chant solennel\n" +
                        "Louer l’Eternel.\n" +
                        "Peuple il vous faut\n" +
                        "Craindre le Très-Haut\n" +
                        "Le Grand Roi qui peut\n" +
                        "Faire quand il veut\n" +
                        "Trembler à sa voix\n" +
                        "Les plus puissants rois.",
                "2. Par son grand pouvoir,\n" +
                        "Il nous fera voir\n" +
                        "les peuples soumis ;\n" +
                        "Et nos ennemis\n" +
                        "par lui châtiés\n" +
                        "Seront sous nos pieds\n" +
                        "Ce Maitre si doux\n" +
                        "a choisi pour nous\n" +
                        "La meilleure part,\n" +
                        "et sous son regard,\n" +
                        "Israël en paix\n" +
                        "triomphe à jamais.\n" +
                        "ses grandes bontés ;\n" +
                        "un cœur plein de foi\n" +
                        "chanter notre Roi,\n" +
                        "Le vrai, le seul DIEU,\n" +
                        "qui règne en tout lieu.", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "135", "Près du trône de la grâce et de la Paix,",
                "1.Près du trône de la grâce et de la Paix,\n" +
                        "J’ai reçu la promesse d’un Dieu Parfait.\n" +
                        "En Jésus j’ai la victoire par sa mort expiatoire\n" +
                        "Près du trône de la grâce et de la Paix.",
                "2.Fuis le monde, vanité des vanités :\n" +
                        "Point de paix pour l’âme en ses frivolités.\n" +
                        "Par lui Satan nous opprime,\n" +
                        "Nous conduisant à l’abîme.\n" +
                        "Fuis le monde, vanité des vanités ! Ch.",
                "3.Je veux être un vaillant\n" +
                        "soldat du Seigneur,\n" +
                        "Lutter, combattre toujours avec ferveur.\n" +
                        "Et, rempli de confiance.\n" +
                        "J’acceptera la souffrance.\n" +
                        "Je veux être un vaillant soldat du Seigneur. Ch.",
                "4.Quand devant moi\n" +
                        "s’ouvriront les portes d’or\n" +
                        "Et qu’enfin j’atteindrai le céleste port,\n" +
                        "Un bonheur pur et sans ombre\n" +
                        "Remplacera la nuit sombre,\n" +
                        "Quand devant moi s’ouvriront les portes d‘or.", "", "", "",
                "Viens, oh ! Viens, Viens avec moi\n" +
                        "Viens, oh ! Viens, Viens à la croix !\n" +
                        "A la croix, viens et sois !\n" +
                        "Viens, mon frère, viens ma sœur,\n" +
                        "Viens à la croix !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "136", "Seigneur, ta mort à Golgotha\n" +
                        "Me fait t’aimer sans cesse",
                "1.Seigneur, ta mort à Golgotha\n" +
                        "Me fait t’aimer sans cesse\n" +
                        "Et ne permet mon grand Roi\n" +
                        "Que jamais je te laisse.",
                "2.Du châtiment de mes péchés,\n" +
                        "Qui était mon mérite,\n" +
                        "Ton sacrifice m’a sauvé\n" +
                        "Dans ta plus forte lutte Ch.",
                "3.Ton sang versé me purifie\n" +
                        "De toutes mes souillures.\n" +
                        "Ton corps brisé pour moi acquis\n" +
                        "Pardon par ses blessures Ch.",
                "4.Y a-t-il comme toi un autre ami\n" +
                        "Qui sans réserve m’aime,\n" +
                        "Qui m’aide dans toute ma vie\n" +
                        "Donnant ses biens suprêmes ? Ch.",
                "5. Beaucoup peuvent t’abandonner\n" +
                        "Je t’aimerai sans cesse.\n" +
                        "Pour ton amour et ta bonté\n" +
                        "A jamais je t’embrasse. Ch.", "", "",
                "Je t’aimerai sans cesse,\n" +
                        "Mon sauveur, mon sauveur\n" +
                        "Je t’aimerai sans cesse\n" +
                        "Pur tous tes grands bienfaits.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "137", "Réveille-nous, Seigneur",
                "1.Réveille-nous, Seigneur\n" +
                        "Fais monter ta présence !\n" +
                        "A ta parole ouvre nos cœurs\n" +
                        "Et parle avec puissance !",
                "2.Réveille-nous Seigneur !\n" +
                        "Pour exalter ton Nom\n" +
                        "Mets ton amour dans chaque cœur\n" +
                        "Fais de nous des flambeaux. Ch.",
                "3. Réveille-nous Seigneur !\n" +
                        "Et bénis Ta Parole,\n" +
                        "Que, par sa force et vérité,\n" +
                        "Elle nos vies contrôle.  Ch.",
                "5. Réveille-nous Seigneur !\n" +
                        "Envoie ton Saint-Esprit\n" +
                        "Qu’il nous remplisse de ferveur\n" +
                        "De chercher les perdus.   Ch.",
                "", "", "",
                "Réveille-nous Seigneur !\n" +
                        "Pendant que nous prions\n" +
                        "Descends, Seigneur, descends vers nous !\n" +
                        "Viens glorifier ton NOM !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "138", "Seigneur, ce que mon cœur réclame",
                "1.Seigneur, ce que mon cœur réclame\n" +
                        "C’est le feu (ter)\n" +
                        "Que sur moi descende la flamme\n" +
                        "De ton feu (ter)\n" +
                        "Que ce soit une chambre haute,\n" +
                        "Qu’une nouvelle pentecôte\n" +
                        "Fasse de nous de vrais apôtres\n" +
                        "Pleins de feu (ter)",
                "2.Le seul secret de la victoire,\n" +
                        "C’est le feu (ter)\n" +
                        "Nous voulons refléter ta gloire\n" +
                        "Par le feu (ter)\n" +
                        "O Dieu Tout-Puissant, qui nous aime\n" +
                        "Viens nous, affranchir de nous-même\n" +
                        "Remplis-nous d’un amour suprême\n" +
                        "Par le feu (ter)",
                "3.Nous voulons porter\n" +
                        "l’espérance\n" +
                        "Par le feu (ter)\n" +
                        "Et proclamer la délivrance\n" +
                        "Par le feu (ter)\n" +
                        "Ton règne vienne sur la terre\n" +
                        "Ta volonté soit faite Ô Père\n" +
                        "Exauce enfin notre prière\n" +
                        "Par le feu (ter)", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "139", "JESUS m’a dit Mets ta main dans ma main et viens",
                "1. Je connais l’eau vive\n" +
                        "Qui nous désaltère\n" +
                        "Je l’ai découverte à Golgotha;\n" +
                        "Il y a d’innombrables fleuves sur la terre\n" +
                        "Mais Jésus seul est source de joie",
                "2. Tout autour de moi\n" +
                        "Je vois tant de souffrances\n" +
                        "Tant de cœurs qui sont si malheureux\n" +
                        "Que l’Esprit me pousse\n" +
                        "À rompre mon silence\n" +
                        "Pour crier partout la paix de Dieu.", "", "", "", "",
                "JESUS m’a dit\n" +
                        "Mets ta main dans ma main et viens\n" +
                        "Toute ta vie tu seras mon témoin:\n" +
                        "Et quand j’ai mis\n" +
                        "Ma main dans sa forte main,\n" +
                        "J’ai reçu de lui\n" +
                        "La puissance de l’Esprit Saint.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "140", "En CHRIST seul est mon espérance",
                "1. En CHRIST seul est mon espérance\n" +
                        "Sa justice est mon assurance\n" +
                        "Il est devant Dieu mon appui\n" +
                        "Je n’en veux point d’autre que lui.",
                "2. Tout autre asile est périssable\n" +
                        "Tout autre appui n’est que du sable\n" +
                        "Qui n’a posé ce fondement\n" +
                        "Travail et souffre vainement. Ch.",
                "3. Lorsque sur moi s’abat l’orage,\n" +
                        "Sa croix ranime mon courage,\n" +
                        "Quand tout faiblit autour de moi,\n" +
                        "Sa présence soutien ma foi. Ch.",
                "4. Quand la trompette retentira\n" +
                        "Que je sois prêt pour son appel\n" +
                        "Revêtu de sa sainteté\n" +
                        "Pur à ses yeux devant le trône. Ch.", "", "", "",
                "Jésus est ma retraite sûre\n" +
                        "Le rocher en qui je m’assure.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "141", "Viens mon âme te réclame,",
                "1. Viens mon âme te réclame,\n" +
                        "Car c’est toi qui m’as cherché.\n" +
                        "Pour te suivre, je te livre\n" +
                        "Mon cœur avec son péché.",
                "2. Oui, ta grâce seul efface\n" +
                        "Toutes mes iniquités\n" +
                        "Tu pardonnes, tu me donnes\n" +
                        "La Paix de tes rachetés. Ch.",
                "3. Quand je doute, quand ma route\n" +
                        "Passe auprès du tentateur,\n" +
                        "Ta main sûre me rassure\n" +
                        "Et me rend, plus que Vainqueur. Ch.",
                "4. Ah ! Demeure, à chaque heure\n" +
                        "Mon rempart, mon défenseur,\n" +
                        "Ma victoire, et ma gloire,\n" +
                        "Mon Jésus, mon seul sauveur! Ch.", "", "", "",
                "Viens ! Mon âme te réclame;\n" +
                        "Mon bonheur est tout en toi.\n" +
                        "Je t’adore, je t’implore;\n" +
                        "O Jésus ! demeure en moi !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "142", "O SEIGNEUR tu es le Roi ! Tu règnes à toujours.",
                "1. O SEIGNEUR tu es le Roi !\n" +
                        "Tu règnes à toujours.\n" +
                        "O Seigneur ! Tu es pour moi le secours\n" +
                        "Tu me dis : va, ne crains rien\n" +
                        "Tu es mon gardien.\n" +
                        "O Seigneur par toi je suis Vainqueur !",
                "2. Que je sois dans l’allégresse,\n" +
                        "Ou dans le malheur,\n" +
                        "Que mon cœur chante sans\n" +
                        "cesse sa douleur.\n" +
                        "Tu es là, Oui à tout heure,\n" +
                        "Tu sèches mes pleurs.\n" +
                        "Tu guéris et redonnes la vie !",
                "3. O Jésus, tu es venu dans l’humanité\n" +
                        "O Jésus, tu es venu, nous\n" +
                        "sauver,\n" +
                        "Par ton sang, tu as lavé nos\n" +
                        "iniquités.\n" +
                        "O Seigneur, nous voulons\n" +
                        "t’acclamer !", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "143", "Seigneur, tu donnes ta grâce",
                "1. Seigneur, tu donnes ta grâce\n" +
                        "Au cœur qui regarde à toi.\n" +
                        "Ah ! Que sa douce efficace\n" +
                        "Se répande aussi sur moi\n" +
                        "OUI sur moi (bis)\n" +
                        "Se répande aussi sur moi!",
                "2. Père tendre et secourable,\n" +
                        "Je fus rebelle à ta loi\n" +
                        "Quoique impur et misérable,\n" +
                        "Oh ! Pardonne et bénis-moi !\n" +
                        "Bénis-moi (bis)\n" +
                        "Oh ! Pardonne et bénis-moi !",
                "3. Rédempteur toujours propice\n" +
                        "Je veux m’attacher à toi\n" +
                        "J’ai faim, j’ai soif de justice,\n" +
                        "Je t’appelle, réponds-moi\n" +
                        "Réponds-moi (bis)\n" +
                        "Je t’appelle, réponds-moi !",
                "4. Saint-Esprit, souffle de vie\n" +
                        "Viens en mon cœur par la foi !\n" +
                        "Dans le sang qui purifie\n" +
                        "De tout péché lave moi !\n" +
                        "Lave moi (bis)\n" +
                        "De tout péché lave moi !",
                "5. Par ton amour, Ô bon Père,\n" +
                        "Par le sang versé pour moi,\n" +
                        "Par l’Esprit qui seul opère,\n" +
                        "Dieu trois fois saint, sauve-moi !\n" +
                        "Sauve-moi (bis)\n" +
                        "Dieu trois fois Saint sauve-moi !", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "144", "C’est toi Jésus, que recherche mon âme",
                "1. c’est toi Jésus, que recherche mon âme\n" +
                        "A te trouver se bornent mes souhaits\n" +
                        "C’est ton regard que sur moi je réclame\n" +
                        "Rends-moi, Seigneur, rends-moi ta douce paix",
                "2. Longtemps j’errai dans les sentiers du monde\n" +
                        "Ne connaissant ni ton Nom, ni ta loi;\n" +
                        "Tu me cherchas dans cette nuit profonde\n" +
                        "Et pour toujours, m’es tiras par le foi.",
                "3. De ton amour la voix se fit entendre\n" +
                        "J’appris alors que tu m’as racheté\n" +
                        "Et ton Esprit à mon cœur fit comprendre\n" +
                        "Ce qu’est pour nous, Ô Dieu ! Ta Charité.",
                "4. Prends donc pitié de ma grande misère :\n" +
                        "Soumets mon cœur, brise sa dureté;\n" +
                        "A Golgotha, mon âme te fut chère\n" +
                        "Je compte, Ô Dieu ! Sur ta fidélité.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "145", "Il me conduit, douce pensée !",
                "1. Il me conduit, douce pensée !\n" +
                        "Repos pour mon âme lassée !\n" +
                        "En tout lieu, son regard me suit,\n" +
                        "Et par la main, il me conduit.",
                "2. Jésus sur moi, veille sans cesse:\n" +
                        "Dans la joie et dans la tristesse,\n" +
                        "Dans le jour comme dans la nuit,\n" +
                        "Pas à pas sa main me conduit.  Ch.",
                "3. Comme un rempart, il me protège,\n" +
                        "Il me préserve de tout piège;\n" +
                        "Loin de moi , l’ennemi s’enfuit,\n" +
                        "Quand par la main, CHRIST me conduit. Ch.",
                "4. Quand la trompette aura sonné,\n" +
                        "Mon œuvre ici-bas terminée,\n" +
                        "Je dirai au travers des nuées :\n" +
                        "Alléluia ! CHRIST m’a conduit ! Ch.", "", "", "",
                "Il me conduit (bis)\n" +
                        "Désormais pour lui je veux vivre;\n" +
                        "Brebis fidèle , je veux suivre\n" +
                        "Le bon berger qui me conduit", "", "", "", "", "" ));
        allItems.add( new ListNumero( "146", "J’entrerai dans ses parvis avec joie dans mon cœur,",
                "1. j’entrerai dans ses parvis\n" +
                        "avec joie dans mon cœur,\n" +
                        "J’entrerai dans ses parvis\n" +
                        "Avec louange je dirai voici le jour\n" +
                        "Le grand jour du Seigneur\n" +
                        "Je chanterai, car il m’a délivré\n" +
                        "Il m’a délivré, il m’a délivré\n" +
                        "Je chanterai car il m’a délivré",
                "2. Je chanterai car il est mon\n" +
                        "Sauveur.",
                "3. Je chanterai car il est mon\n" +
                        "Seigneur.",
                "4. Je chanterai car il est Roi\n" +
                        "des rois.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "147", "Que ferai-je pour toi Tu as tout fait pour moi",
                "1. Tu es venu dans ce monde perdu\n" +
                        "Me délivrer du joug des ténèbres.",
                "2. Je suis faible, mais je compte sur toi\n" +
                        "Pour accomplir la tâche que tu veux",
                "3.j’irai partout appeler les pécheurs\n" +
                        "J’annoncerai Ta Parole surtout.",
                "4. Venez amis, chantons pour louer Dieu,\n" +
                        "Qui dans sa grâce fait de nous ses enfants.",
                "5. oui, je te loue, de tout ce que tu fais,\n" +
                        "Merci beaucoup de m’avoir tant aimé.", "",
                "Que ferai-je pour toi\n" +
                        "Tu as tout fait pour moi\n" +
                        "Que ferai-je pour toi\n" +
                        "Tu as tout fait pour moi.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "148", "Je suis dans la joie Quand on me dis",
                "1. Un jour dans ses parvis\n" +
                        "Vaux mieux que mille ailleurs\n" +
                        "(bis)",
                "2. Entrons dans ses parvis\n" +
                        "Avec des actions de grâces\n" +
                        "(bis)",
                "3. Si Dieu est avec nous\n" +
                        "Qui sera contre nous ?\n" +
                        "(bis)",
                "4. Jésus est Roi des rois\n" +
                        "Et Seigneur des seigneurs.", "", "",
                "Je suis dans la joie\n" +
                        "Quand on me dis\n" +
                        "Allons dans la maison de\n" +
                        "l’Eternel.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "149", "Quel sort merveilleux d’être sauvé",
                "1. Quel sort merveilleux d’être sauvé\n" +
                        "Sauvé par le sang de l’agneau,\n" +
                        "Sauvé par sa grâce infinie,\n" +
                        "À jamais un enfant de Dieu.",
                "2. sauvé, quelle joie ineffable !\n" +
                        "Des mots ne peuvent l’exprimer,\n" +
                        "Je sais que sa douce présence\n" +
                        "M’accompagnera à jamais. Ch.",
                "3. Je pense à mon Sauveur sublime\n" +
                        "Le louant d’un cœur enchanté,\n" +
                        "Je chante, je ne peux pas me taire,\n" +
                        "Son amour m’a rendu heureux.",
                "4. Au ciel réservé par le maître,\n" +
                        "M’attend la couronne de vie\n" +
                        "Et j’oint aux rangs des fidèles\n" +
                        "Je demeurerai près de lui.",
                "5. Je sais, je verrai dans sa gloire\n" +
                        "Le Roi qui règne sur moi\n" +
                        "Et qui par sa pleine Victoire\n" +
                        "Me rend fort de garder ses lois.  Ch.", "", "",
                "Sauvé, Sauvé.\n" +
                        "Sauvé par le sang de l’agneau\n" +
                        "Sauvé, Sauvé.\n" +
                        "À jamais un enfant de Dieu.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "150", "Entends-tu le chant joyeux?",
                "1. Entends-tu le chant joyeux?\n" +
                        "Jésus sauve aujourd’hui!\n" +
                        "Il retentit en tous les lieux:\n" +
                        "Jésus sauve aujourd’hui!\n" +
                        "C’est un cri de délivrance.\n" +
                        "Un cantique d’espérance,\n" +
                        "Qui remplit l’espace immense:\n" +
                        "Jésus sauve aujourd’hui!",
                "2. Partout élève la voix:\n" +
                        "Jésus sauve aujourd’hui!\n" +
                        "Vaillant héraut de la croix,\n" +
                        "Jésus sauve aujourd’hui!\n" +
                        "A parler, Jésus t’appelle,\n" +
                        "Répands au loin la nouvelle,\n" +
                        "En connais-tu de plus belle?\n" +
                        "Jésus sauve aujourd’hui!",
                "3. Répète au pécheur contrit;\n" +
                        "Jésus sauve aujourd’hui!\n" +
                        "Ceux que le mal asservit\n" +
                        "Va jusqu’à l’ile lointaine,\n" +
                        "Briser du captif la chaine,\n" +
                        "Redire au cœur dans la peine\n" +
                        "Jésus sauve aujourd’hui!",
                "4. jusqu’au confins des déserts\n" +
                        "Jésus Sauve aujourd'hui !\n" +
                        "Jusque par delà les mers.\n" +
                        "Jésus sauve aujourd'hui !\n" +
                        "Que d’un pôle à l’autre pôle\n" +
                        "Coure la Sainte Parole\n" +
                        "Qui relève, instruit, console :\n" +
                        "Jésus Sauve aujourd'hui !", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "151", "Il est vivant, il est vivant",
                "1 Avec l’ange au sépulcre\n" +
                        "Devant Marie étonnée;\n" +
                        "Les pèlerins d’Emmaus\n" +
                        "A toujours consolés\n" +
                        "Avec tous les apôtres\n" +
                        "Par l’Esprit transformés\n" +
                        "Il nous faut crier,\n" +
                        "Crier, la vérité... Ch.",
                "2. Avec les premiers martyrs\n" +
                        "Par les lions déchirés;\n" +
                        "Avec tous les chrétiens\n" +
                        "Des siècles passées\n" +
                        "Et puis tous les témoins.\n" +
                        "Par le monde dispersés\n" +
                        "Il nous faut crier,\n" +
                        "Crier la vérité... Ch.", "", "", "", "",
                "Il est vivant, il est vivant\n" +
                        "Même s’il y a deux mille ans}\n" +
                        "Qu’il est mort pour nous.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "152", "Source de grâce, source efficace,",
                "Source de grâce, source efficace,\n" +
                        "Qui du mont Golgotha jaillit!\n" +
                        "La mort subie par Christ, la vie,\n" +
                        "Nous dit : ? Tout est accompli ?",
                "2. Source de vie: Nos maladies,\n" +
                        "Jésus nous nous en a délivrés!\n" +
                        "Je sens renaitre dans tout mon être\n" +
                        "La vigueur et la santé.",
                "3. Jésus envoie l’esprit de joie\n" +
                        "Dans les cœurs lavés par le sang:\n" +
                        "L’Esprit de gloire et de victoire\n" +
                        "Sur les rachetés descend!",
                "4. Pour récompense de ses souffrances\n" +
                        "Devant son trône Jésus voit\n" +
                        "La sainte église qu’il s’est acquise\n" +
                        "Au prix du sang de la croix.", "", "", "",
                "Oui, je veux croire, Oui, je puis croire\n" +
                        "Que Jésus-Christ est mort\n" +
                        "pour moi!\n" +
                        "Sa mort sanglante et\n" +
                        "triomphante\n" +
                        "Me rend libre par la foi.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "153", "Dieu tu es bon, Dieu tu es doux,",
                "Dieu tu es bon,\n" +
                        "Dieu tu es doux, (bis)\n" +
                        "Dieu tu es merveilleux,\n" +
                        "Mon Dieu tu es excellent.",
                "2. Excellent est ton Nom,\n" +
                        "Excellent est ta force\n" +
                        "Dieu tu es merveilleux,\n" +
                        "Mon Dieu tu es excellent.", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "154", "Je chanterais ton amour En union avec les anges",
                "1. Je te loue et je t’adore\n" +
                        "De concert avec les anges\n" +
                        "Je chanterai ton saint nom à Jamais Ch.",
                "2. Tu m’as sorti des ténèbres\n" +
                        "Tu m’as sorti de l’enfer\n" +
                        "Me voici à la lumière de la vie. Ch.",
                "3. Je suis délivré maintenant\n" +
                        "Du fardeau de mes péchés\n" +
                        "Je marche avec l’Eternel chaque jour. Ch.",
                "4. Tu m’as donné de l’espoir\n" +
                        "Et je vis dans la victoire\n" +
                        "Que tu as conquise pour moi À la croix. Ch.",
                "5. Merci Dieu pour ton Esprit\n" +
                        "Merci Dieu pour Jésus-Christ\n" +
                        "Merci Dieu pour la vie que tu m’as donnée. Ch.", "",
                "JE CHANTERAI ton amour\n" +
                        "En union avec les anges (bis)\n" +
                        "Je chanterai ton amour à jamais.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "155", "Le zèle de ta maison",
                "1. Même si mes frères me disent tous « NON »\n" +
                        "Même si mon père me chasse de la maison,\n" +
                        "Je ne dirai jamais non à ton amour,\n" +
                        "OUI ! À grand JAMAIS, je ne te dirai non. Ch.",
                "2. Même si je perds tout ce qui m’appartient\n" +
                        "Même si je n’ai plus un seul bien,\n" +
                        "Je ne dirai jamais non à ta croix,\n" +
                        "NON ! À grand JAMAIS, je ne te dirai non. Ch.",
                "3. Même si je perds tout mes amis,\n" +
                        "Même si je n’ai plus un seul abri,\n" +
                        "Je ne pourrai jamais m’ne aller loin de toi,\n" +
                        "OUI ! À grand JAMAIS , je ne te quitterai. Ch.",
                "4. mêm’si je dois partir très loin de cette ville\n" +
                        "Mêm’si je dois quitter tous ceux qui sont mes frères\n" +
                        "Je ne dirai jamais non à ma foi,\n" +
                        "Oui, à grand JAMAIS, je ne t’oublierai. Ch.", "", "",
                "LE zèle de ta maison, (bis)\n" +
                        "Me dévore comme un feu", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "156", "Si seulement tu crois et je crois",
                "1. Si seulement tu crois et je crois\n" +
                        "si nous prions ensemble\n" +
                        "Alors le Saint-Esprit viendra\n" +
                        "Yaoundé sera sauvé.\n" +
                        "Yaoundé sera sauvé (bis)\n" +
                        "Oui le Saint-Esprit descendra,\n" +
                        "Yaoundé sera sauvé.",
                "2. Cameroun sera sauvé",
                "3. l'Afrique sera sauvé.",
                "4. Le monde sera sauvé. Etc.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "157", "Oui j’ai vu ! Vu ! La victoire de Jésus.",
                "1. Quand je regarde devant,\n" +
                        "Je vois Jésus Victorieux ;\n" +
                        "En regardant derrière\n" +
                        "Je vois Jésus Victorieux ;\n" +
                        "Regardant à ma droite,\n" +
                        "Je vois Jésus Victorieux ;\n" +
                        "Quand je me tourne à gauche,\n" +
                        "Je vois Jésus Victorieux. Ch.",
                "2. Quand je regarde devant,\n" +
                        "Je vois Satan à terre ;\n" +
                        "En regardant derrière,\n" +
                        "Je vois Satan à terre ;\n" +
                        "Regardant à ma droite,\n" +
                        "Je vois Satan à terre ;\n" +
                        "Quand je me tourne à gauche,\n" +
                        "Je vois Satan à terre ;", "", "", "", "",
                "Oui j’ai vu ! Vu !\n" +
                        "La victoire de Jésus.\n" +
                        "Gloire soit à Dieu !\n" +
                        "Gloire soit à Jésus\n" +
                        "Oui j’ai vu ! Vu !\n" +
                        "La victoire de Jésus.\n" +
                        "Gloire soit à Dieu ! Amen.",
                "Oui j’ai vu ! Vu !\n" +
                        "La défaite de Satan.\n" +
                        "Gloire soit à Dieu !\n" +
                        "Gloire soit à Jésus !\n" +
                        "Oui j’ai vu ! Vu !\n" +
                        "La défaite de satan\n" +
                        "Gloire soit à Dieu ! Amen.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "158", "J’aime le Seigneur",
                "1. j’aime le Seigneur (ter)\n" +
                        "De tout mon cœur.",
                "2. Il a souffert  (ter)\n" +
                        "A Golgotha.",
                "3. Son sang coula (ter)\n" +
                        "Pour mes péchés.",
                "4. Il m’a sauvé (ter)\n" +
                        "Du lac de feu.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "159", "Bénis Dieu, Ô mon âme\n" +
                        "Et tout ce qui est en moi",
                "1. Il m’a donné plus que la vie,\n" +
                        "Il a béni tous mes pas,\n" +
                        "Il m’a gardé dans son amour,\n" +
                        "N’oublie aucun de ses bienfaits.\n" +
                        "(bénis-le) etc.",
                "",
                "", "", "", "",
                "Bénis Dieu, Ô mon âme\n" +
                        "Et tout ce qui est en moi ;\n" +
                        "Bénis Dieu, Ô mon âme ;\n" +
                        "N’oubli aucun de tes bienfaits.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "160", "Seigneur, tu es sûrement bon\n" +
                        "Seigneur, tu es sûrement",
                "1. Tu m’as donné ton fils, (ter)\n" +
                        "Tu es sûrement, tellement bon pour moi,\n" +
                        "Tu as fait ce que nul ne peut faire. Ch.",
                "2. Tu m’as donne ton Esprit, (bis)\n" +
                        "Tu es sûrement, tellement bon pour moi,\n" +
                        "Tu as fait ce que nul ne peut faire. Ch",
                "3. Etc.", "", "", "",
                "Seigneur, tu es sûrement bon, (bis)\n" +
                        "Seigneur, tu es sûrement,\n" +
                        "Tellement bon pour moi,\n" +
                        "Tu as fait ce que nul ne peut faire.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "161", "Jéhovah jiré, l’Eternel pourvoit",
                "1. Seigneur Jésus, que tu es merveilleux\n" +
                        "Ta bonne main se déploie en tous lieux\n" +
                        "Non seulement pour protéger les tiens\n" +
                        "Mais aussi pour répondre à leurs besoins\n" +
                        "Voilà ce que tu fais de tes enfants,\n" +
                        "Ceux-là qui T’estiment plus que l’argent.",
                "2. Ta majesté, Ô Seigneur est immense,\n" +
                        "Ta création étale ta Puissance.\n" +
                        "Et a-t-on jamais entendu parler\n" +
                        "D’un Dieu qui soit riche comme Yahvé ?\n" +
                        "Car tu possèdes la terre et les cieux.\n" +
                        "Qui s’égalera à toi, Ô mon Dieu ?",
                "3. s’il advenait des temps difficiles,\n" +
                        "C’est en toi que nous trouverons asile.\n" +
                        "Car toutes les générations passées\n" +
                        "Proclament tout haut ta fidélité.\n" +
                        "Seigneur nous sauront nous saisir de toi\n" +
                        "Mettrons toute notre espérance en toi,\n" +
                        "Ô mon Dieu !", "", "", "",
                "Jéhovah jiré, l’Eternel pourvoit :\n" +
                        "Tu nous a comblé de tes bienfaits,\n" +
                        "Et nous vivons en toi sans regret.\n" +
                        "Nous voulons crier\n" +
                        "Que c’est toi le Roi.\n" +
                        "Toi seul est digne d’être adoré,\n" +
                        "Dès maintenant, et pour l’Eternité", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "162", "Qui est comme toi, Ô Seigneur",
                "Qui est comme toi,\n" +
                        "Ô Seigneur\n" +
                        "Qui est comme toi, (bis)\n" +
                        "Ô seigneur !\n" +
                        "Parmi les dieux,\n" +
                        "Qui est comme toi :\n" +
                        "Magnifique en sainteté,\n" +
                        "Digne de louange,\n" +
                        "Opérant des prodiges ?", "", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "163", "Nul n’est saint comme l’Eternel,",
                "1. Nul n’est saint comme l’Eternel,\n" +
                        "Il n’y a point d’autre dieux que toi,\n" +
                        "Il n’y a point de rocher comme notre Dieu,\n" +
                        "Nul n’est saint comme l’Eternel.", "", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "164", "Viens, oui viens !\n" +
                        "Viens dans sa maison",
                "1. Il veut t’ouvrir toute grande\n" +
                        "La porte de sa maison. Ch.",
                "2. Il veut t’offrir la plus belle\n" +
                        "Place dans sa maison.  Ch.",
                "3. Il veut que tu restes toujours\n" +
                        "À la table dans sa maison Ch.", "", "", "",
                "Viens, oui viens !\n" +
                        "Viens dans sa maison\n" +
                        "Viens manger à sa table\n" +
                        "Viens, oui viens !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "165", "Il est Roi, il est Roi, Il est ressuscité, il est Roi",
                "Il est Roi, il est Roi,\n" +
                        "Il est ressuscité, il est Roi,\n" +
                        "Tout genou fléchira,\n" +
                        "Toute langue confessera\n" +
                        "Que Jésus-Christ est Roi.", "", "", "", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "166", "Il règne dans mon cœur,Il règne au Cameroun",
                "1. Il règne dans mon cœur,\n" +
                        "Il règne au Cameroun,\n" +
                        "Il règne en Afrique,\n" +
                        "Je sais que Jésus règne. Ch.",
                "2. Il règne dans ton cœur,\n" +
                        "Il au Canada,\n" +
                        "Il règne en Amérique,\n" +
                        "Je sais que Jésus règne. Ch.",
                "3. Il règne sur les rois,\n" +
                        "Il règne sur les royaumes,\n" +
                        "Il règne sur les nations,\n" +
                        "Je sais que Jésus règne. Ch.", "", "", "",
                "Je sais que JÉSUS règne, (ter)\n" +
                        "Il règne pour toujours.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "167", "Criez sur les monts des oliviers ! Oliviers !",
                "1. Criez sur les monts des\n" +
                        "oliviers ! Oliviers !",
                "2. Criez dans les rues de\n" +
                        "Yaoundé ! Yaoundé !",
                "3. Criez dans les rues de\n" +
                        "Washington! Washington (bis)",
                "4. Criez dans les rues de\n" +
                        "New-Delhi ! New-Delhi ! (bis)",
                "5. Criez dans les rues de\n" +
                        "Paris ! Paris ! (bis)", "",
                "Criez, criez, criez sur les montagnes\n" +
                        "Criez, criez que Jésus-Christ est Roi.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "168", "Chantons, chantons sans cesse",
                "1. chantons, chantons sans cesse\n" +
                        "La bonté du Seigneur !\n" +
                        "Qu’une sainte allégresse\n" +
                        "remplisse notre cœur.\n" +
                        "Un salut éternel, est descendu du ciel,\n" +
                        "Nous avons un sauveur. (bis)",
                "2. O bonheur ineffable! dieu\n" +
                        "n’est plus irrité !\n" +
                        "Il pardonne au coupable contre lui révolté.\n" +
                        "Pour porter nos forfaits,\n" +
                        "Pour sceller notre paix,\n" +
                        "Jésus s’est présenté. (bis)",
                "3. Vers le trône de grâce, si nous\n" +
                        "levons les yeux,\n" +
                        "Nous rencontrons la face d’un\n" +
                        "Sauveur glorieux,\n" +
                        "Il est notre Avocat,\n" +
                        "Pour les siens il combat,\n" +
                        "Toujours victorieux.\n" +
                        "(bis)",
                "4. Pour diriger la voie, De tous ses rachetés\n" +
                        "Dans leur cœur il envoie ses\n" +
                        "célestes clartés !\n" +
                        "Son Esprit nous conduit,\n" +
                        "Sa grâce nous instruit,\n" +
                        "Des saintes vérités. (bis)",
                "5. Bientôt, vêtu de gloire, du\n" +
                        "ciel il reviendra !\n" +
                        "Consommant sa victoire, il nous affranchira.\n" +
                        "Et son heureux enfant,\n" +
                        "Avec lui triomphant,\n" +
                        "Tel qu il est le vera (bis)", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "169", "Par tous les saints glorifié,",
                "1. Par tous les saints glorifié,\n" +
                        "Jésus inspire leurs louanges,\n" +
                        "Plus belles que le chant des anges :\n" +
                        "Gloire à l’agneau (ter) sacrifié !",
                "2. c’est par lui qu’est justifié\n" +
                        "Tout pécheur qui demande grâce\n" +
                        "Prêtres et rois devant sa face,\n" +
                        "Chantons l’agneau (ter) sacrifié !",
                "3. Par le Père magnifié\n" +
                        "Tout l’univers lui rend hommage.\n" +
                        "L’agneau règnera d’âge en âge,\n" +
                        "Gloire à l’agneau (ter) sacrifié !",
                "4. Par son esprit vivifié\n" +
                        "Je veux jusqu’à ma dernière heure,\n" +
                        "Chanter l’amour qui seul demeure,\n" +
                        "Gloire à l’agneau (ter) sacrifié !",
                "5. Pour nous il fut crucifié ;\n" +
                        "Son sang a racheté notre âme ;\n" +
                        "C’est pour quoi notre amour l’acclame:\n" +
                        "Gloire à l’agneau (ter) sacrifié !", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "170", "Sans attendre, je veux tendre,",
                "1. Sans attendre, je veux tendre,\n" +
                        "Au bonheur promis ;\n" +
                        "Qui s’élance, qui s’avance,\n" +
                        "Obtiendra le prix.\n" +
                        "De mon Dieu, je suis l’enfant,\n" +
                        "Et c’est lui qui me défend,\n" +
                        "Donc en route, point de doute,\n" +
                        "Le but est si grand !",
                "2.Près du trône, la couronne,\n" +
                        "Attend le Vainqueur.\n" +
                        "Nulle trêve ! Qu’on se lève\n" +
                        "A dit le Seigneur.\n" +
                        "D’obéir, soyons heureux.\n" +
                        "Point de tiède, de peureux !\n" +
                        "Qui se lasse, perd sa place,\n" +
                        "Au banquet des cieux.",
                "3. D’un pas ferme jusqu’au terme,\n" +
                        "Il faut s’avancer :\n" +
                        "Dieu m’observe, Qu’il préserve\n" +
                        "Mon pied de glisser.\n" +
                        "Que ce monde et ses attraits,\n" +
                        "Ne me séduise jamais !\n" +
                        "Si sa haine, se déchaine,\n" +
                        "Que je sois en paix.",
                "4. Dieu de grâce, que ta face,\n" +
                        "Luise en mon chemin !\n" +
                        "Père tendre, viens me prendre,\n" +
                        "Par ta forte main,\n" +
                        "Toute puissance est à toi\n" +
                        "Subviens à ma faible foi :\n" +
                        "Ma victoire, c’est ta gloire,\n" +
                        "O mon Dieu mon Roi !", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "171", "A Dieu soit la gloire !\n" +
                        "Pour son grand amour",
                "1. A Dieu soit la gloire !\n" +
                        "Pour son grand amour\n" +
                        "Dans mon âme noire s’est levé le jour\n" +
                        "Jésus à ma place, mourut sur la croix,\n" +
                        "Il m’offre sa grâce et je la reçois.",
                "2. De Jésus, la joie, Remplit notre cœur,\n" +
                        "Qu’importe, qu’on voie, Tout notre bonheur,\n" +
                        "Selon sa promesse, Jésus changera,\n" +
                        "Deuil en allégresse, quand il reviendra. Ch.", "", "", "", "",
                "",
                "Gloire à Dieu (bis)\n" +
                        "Terre écoute sa voix !\n" +
                        "Gloire à Dieu (bis)\n" +
                        "Monde, réjouis-toi !\n" +
                        "Oh ! Venez au Père !\n" +
                        "Jésus est vainqueur\n" +
                        "Que toute la terre chante en son honneur.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "172", "Dis non aux tentations :\n" +
                        "céder c’est pécher",
                "1. Dis « non » aux tentations :\n" +
                        "céder c’est pécher\n" +
                        "Toute victoire, t’aidera à vaincre d’autres,\n" +
                        "Lutte sans te lasser, soumets tes passions,\n" +
                        "Et regarde à CHRIST pour te\n" +
                        "porter tout au long.",
                "2. Aux mauvais compagnons et\n" +
                        "mots : le dédain\n" +
                        "De Dieu le nom, tu craindras de prendre en vain\n" +
                        "Sois persévérant, zélé, véridique et bon,\n" +
                        "Et regarde à CHRIST pour te\n" +
                        "porter tout au long",
                "3. Tout vainqueur connaitra le\n " +
                        "couronnement,\n" +
                        "Par la foi tu vaincras tout abattement,\n" +
                        "Le Sauveur, de sa force te fera don,\n" +
                        "Regarde à CHRIST pour te\n" +
                        "porter tout au long.", "", "", "", "",
                "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "173", "Dieu est très Saint ! Oui trois fois Saint.",
                "1. Prier c’est se préoccuper.\n" +
                        "Tout d’abord de sa Sainteté.\n" +
                        "Christ aux disciples a enseigné\n" +
                        "Que ton nom soit Sanctifié.",
                "2. Prier c’est aussi célébrer,\n" +
                        "Du Dieu vivant la Sainteté\n" +
                        "C’est exalter, c’est proclamer,\n" +
                        "C’est imposer sa Sainteté.",
                "3. La Sainteté c’est bien la clé\n" +
                        "Dans la prière, pour entrer,\n" +
                        "Tous les pécheurs doiv’ s’en aller\n" +
                        "Ou bien entrer pour l’affronter.",
                "4. Révèle-moi la Sainteté\n" +
                        "Du Dieu que je veux approcher,\n" +
                        "Afin qu’ je puiss’ me prépare,\n" +
                        "Pleurer, jeûner, ensuite prier.",
                "5. La prière c’est l’intimité\n" +
                        "Avec le Dieu de Sainteté\n" +
                        "Sur la terre, je dois proclamer,\n" +
                        "Par la prière, Sa Sainteté.",
                "6. seigneur, daigne me révéler,\n" +
                        "Ce qu’à Ton cœur fait le péché,\n" +
                        "Afin qu’ je puis’ l’abandonner,\n" +
                        "Car désormais je veux prier.",
                "Dieu est très Saint !\n" +
                        "Oui trois fois Saint.\n" +
                        "Les chérubins et séraphins,\n" +
                        "Au ciel là-haut, chantent sans fin :\n" +
                        "Dieu est très Saint !\n" +
                        "Oui trois fois Saint. (bis)\n" +
                        "Tel est des anges le refrain.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "174", "Garde –moi ô Seigneur, auprès de toi",
                "1. Garde –moi ô Seigneur,\n" +
                        "auprès de toi.(bis)\n" +
                        "J’ai mon cœur à conquérir,\n" +
                        "Tout mon être à gagner.\n" +
                        "Garde - moi ô Seigneur, auprès\n" +
                        "de toi. (bis)",
                "2. Garde - moi ô Seigneur,\n" +
                        "auprès de toi. (bis)\n" +
                        "J’ai ma ville à conquérir,\n" +
                        "Toute ma nation à gagner.\n" +
                        "Garde - moi ô Seigneur, auprès\n" +
                        "de toi. (bis)",
                "3. Garde - moi ô Seigneur,\n" +
                        "auprès de toi. (bis)\n" +
                        "J’ai un prix à remporter,\n" +
                        "Des victoires à gagner\n" +
                        "Garde - moi ô Seigneur, auprès\n" +
                        "de toi. (bis)",
                "4. Garde - moi ô Seigneur,\n" +
                        "auprès de toi. (bis)\n" +
                        "Je dois porter du fruit,\n" +
                        "Qui demeurent en abondance.\n" +
                        "Garde - moi ô Seigneur, auprès\n" +
                        "de toi. (bis)",
                "5. Garde - moi ô Seigneur,\n" +
                        "auprès de toi. (bis)\n" +
                        "Toi qui est le bon Berger,\n" +
                        "Fais de moi un vrai berger.\n" +
                        "Garde - moi ô Seigneur, auprès\n" +
                        "de toi. (bis)",
                "6. Garde - moi ô Seigneur,\n" +
                        "auprès de toi. (bis)\n" +
                        "Je dois demeurer en toi,\n" +
                        "Et toi demeurer en moi.\n" +
                        "Garde - moi ô Seigneur, auprès\n" +
                        "de toi. (bis)\n" +
                        "\n" +
                        "7. Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "J‟‟ai des âmes à gagner,\n" +
                        "Des disciples à former,\n" +
                        "Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "\n" +
                        "8. Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "Crée en moi la faim de Toi\n" +
                        "Et la faim de Ta parole.\n" +
                        "Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "\n" +
                        "9. Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "Fais-moi haïr le péché,\n" +
                        "Le monde, les choses du monde.\n" +
                        "Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "\n" +
                        "10. Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "Fais-moi haïr le péché,\n" +
                        "Le moi, l‟honneur de ce monde.\n" +
                        "Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "\n" +
                        "11. Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "J‟‟ai besoin du Saint-Esprit\n" +
                        "Pour accomplir notre but.\n" +
                        "Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "\n" +
                        "12. Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n" +
                        "J‟ai une couronne à gagner\n" +
                        "Pour la placer à Tes Pieds.\n" +
                        "Garde-moi ô Seigneur, auprès\n" +
                        "de Toi. (bis)\n", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "175", "La puissance de dieu\n" +
                "Dans sa totalité, habite en moi",
                "1. Aussi je peux prier\n" +
                        "Prier intensément\n" +
                        "Pour la libérer plus fort. Ch.",
                "2. Aussi je peux jeûner\n" +
                        "Jeûner intensément\n" +
                        "Pour la libérer plus fort. Ch.",
                "3. Je peux bien travailler\n" +
                        "Travailler et travailler\n" +
                        "Mais je ne romprai jamais. Ch.",
                "4. Je peux bien résister\n" +
                        "Devant le tentateur\n" +
                        "Pleinement Dieu vit en moi. Ch.",
                "5. j’ai l’amour dans mon cœur\n" +
                        "Oui l’amour de Jésus\n" +
                        "J’en ai assez pour aimer. Ch.",
                "6. j’ai la joie dans mon cœur\n" +
                        "Oui la joie de mon sauveur\n" +
                        "J’en ai assez pour donner. Ch.\n" +
                        "\n" +
                        "7. J‟ai la paix dans mon cœur\n" +
                        "Oui la paix de mon Sauveur\n" +
                        "J‟en ai assez pour donner Ref.\n" +
                        "\n" +
                        "8. Aussi je loue mon Dieu\n" +
                        "Toute ma vie je Le chanterai\n" +
                        "Car Il m‟a vraiment comblé !Ref.\n",
                "La puissance de dieu\n" +
                        "Dans sa totalité, habite en moi\n" +
                        "Ainsi, je peux tout faire,\n" +
                        "j’ai bien ce qu’il me faut\n" +
                        "Eh ! Eh ! Gloire à Dieu !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "176", "Oui mon cœur chante pour Jéhovah Jiré",
                "1. Il t’a donné Jésus,\n" +
                        "En lui réjouis – toi\n" +
                        "Il est ton ami,\n" +
                        "Ton Refuge, Ton Abri. Ch.",
                "2. Et sa miséricorde\n" +
                        "Est un bien quotidien\n" +
                        "Dans ta détresse\n" +
                        "Crie à lui, tu verras. Ch.",
                "3. chante, chante sans cesse\n" +
                        "Son doux et puissant NOM\n" +
                        "Accomplissant tes vœux\n" +
                        "Chaque jour pour ton Dieu. Ch.",
                "4. Il est le Roi des rois\n" +
                        "L’Eternel des armées\n" +
                        "Le Tout – Puissant Seigneur\n" +
                        "Son Nom merveilleux ! Ch.",
                "5. Venez et écoutez\n" +
                        "Et je raconterai\n" +
                        "Ce qu’il a fait pour moi\n" +
                        "L’Eternel est mon Dieu ! Ch.", "",
                "Oui mon cœur chante\n" +
                        "pour Jéhovah Jiré\n" +
                        "chante sa grâce\n" +
                        "Sa bonté, Son amour.", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "177", "Dans la joie, dans l’amour, dans la foi",
                "1. Jésus dit : que votre cœur\n" +
                        "ne se trouble point\n" +
                        "Croyez en Dieu croyez en moi\n" +
                        "Jésus dit : je vais vous préparer une place\n" +
                        "Après quoi je reviendrai vous cherchez. Ch.",
                "2. Jésus dit : tu aimeras le\n" +
                        "Seigneur ton Dieu\n" +
                        "De tout ton cœur et de toute ton âme\n" +
                        "De toute ta pensée et de toute ta force\n" +
                        "Tu aimeras ton prochain comme toi – même",
                "3. Le Seigneur insiste vraiment sur la prière :\n" +
                        "Criez à Dieu nuit et jour il répondra.\n" +
                        "Mais le fils de l’homme trouvera –t – il la foi\n" +
                        "Quand il reviendra ici sur la terre. Ch.",
                "4. Allez partout le monde\n" +
                        "Et prêchez la bonne Nouvelle\n" +
                        "Faites de toutes les nations des disciples\n" +
                        "Les baptisant au nom du Père,\n" +
                        "Du fils du Saint – Esprit.\n" +
                        "Voici je suis avec vous tous les jours\n" +
                        "Avec Toi nous prêchons (bis)\n" +
                        "Avec toi nous souffrons (bis)\n" +
                        "Avec crainte nous vivons (bis)\n" +
                        "Dans la joie, dans la joie...\n" +
                        "nous t’attendons.", "", "",
                "Dans la joie, dans l’amour,dans la foi\n" +
                        "Seigneur, nous T’attendons", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "178", "Dieu tout–Puissant, quand mon cœur considère,",
                "Dieu tout–Puissant,\n" +
                        "Quand mon cœur considère, tout l’univers\n" +
                        "Crée par ton pouvoir, le ciel d’azur, les éclaires\n" +
                        "le tonnerre le clair matin ou les ombres du soir.",
                "2. Quand par les bois, ou la forêt profonde\n" +
                        "J’erre et j’entends tous les oiseaux chanter;\n" +
                        "Quand sur les monts, la source avec son onde,\n" +
                        "Livre au Zéphyr son chant doux et léger...",
                "3. Mais quand je songe, au sublime mystère,\n" +
                        "Qu’un Dieu si grand a pu penser à moi !\n" +
                        "Que son cher fils est devenu mon FRÈRE\n" +
                        "Et que je suis héritier du grand Roi",
                "4. Quand mon Sauveur éclatant de lumière,\n" +
                        "Se lèvera de son trône éternel\n" +
                        "Et que laissant, les douleurs de la terre.\n" +
                        "Je pourrais voir les splendeurs de son ciel.", "", "", "",
                "De tout mon être, alors s’élève un chant :\n" +
                        "Dieu tout-Puissant, Que tu es Grand",
                "Mon cœur heureux s’écrie à chaque instant\n" +
                        "Ô Dieu d’Amour, Que tu es grand !",
                "Alors mon cœur redit, la nuit, le jour\n" +
                        "Que tu es bon, O Dieu d’amour.",
                "Alors mon cœur redit, la nuit, le jour\n" +
                        "Que tu es bon, O Dieu d’amour.", "", "" ));
        allItems.add( new ListNumero( "179", "Avons-nous mérité Tant d’amour",
                "1. Avons-nous mérité\n" +
                        "Tant d’amour\n" +
                        "Avons-nous mérité\n" +
                        "Dieu nous a tant aimés\n" +
                        "Qu’il a donné son fils pour nous sauver.",
                "2. Jésus-Christ a brisé\n" +
                        "Les chaines qui nous tenaient\n" +
                        "prisonnier\n" +
                        "Il nous a libérés\n" +
                        "Et a fait de nous des privilégiés. Ch.",
                "3. Satan est renversé, alléluia\n" +
                        "Le Diable est tombé\n" +
                        "Jésus est couronné, alléluia\n" +
                        "L’amour a triomphé.",
                "4. Bénissons le Seigneur, alléluia !\n" +
                        "Louons-le de tous cœur\n" +
                        "Célébrons sa grandeur.\n" +
                        "Il est digne de louange dans sa splendeur.",
                "5. Adorons notre Dieu\n" +
                        "Alléluia chantons pour l’Eternel\n" +
                        "Sur la terre dans les cieux\n" +
                        "son amour est grand sa parole fidèle.",
                "6. Rendons grâce au seigneur\n" +
                        "Il a fait des merveilles dans nos vies\n" +
                        "Nous a rendus vainqueurs\n" +
                        "Et nous sommes en route pour le paradis.", "",
                "Sois loué (4 fois)\n" +
                        "Ô seigneur Jésus", "", "", "", "", "" ));
        allItems.add( new ListNumero( "180", "As-tu faim, es-tu déprimé ?",
                "1. as-tu faim, es-tu déprimé ?\n" +
                        "Jésus est le pain de vie, prends-le\n" +
                        "Tu n’auras plus faim ( x 3)\n" +
                        "Avec Jésus.",
                "2. as-tu soif ? Es-tu desséché?\n" +
                        "Jésus est la source de vie,\n" +
                        " prends-le !\n" +
                        "Tu n’auras plus soif ( x 3)\n" +
                        "Avec Jésus.",
                "3. as-tu peur ? Es-tu\n" +
                        "tourmenté?\n" +
                        "Jésus est le prince de paix,\n" +
                        "prends-le !\n" +
                        "Tu aurais la paix\n" +
                        "Tu auras la joie\n" +
                        "Tu auras l’amour avec Jésus (bis)",
                "4. Fais comme moi: reçois Jésus-Christ\n" +
                        "Sur la croix, il a tout fait, prends-le\n" +
                        "Je suis justifié\n" +
                        "Je suis sanctifié\n" +
                        "Je suis plus que vainqueur en\n" +
                        "Jésus. (bis)", "", "", "", "", "",
                "il est ma solution\n" +
                        "en toute situation\n" +
                        "il est mon grand amour\n" +
                        "il est pour toujours mon\n" +
                        "seul maître",
                "e te rends hommage\n" +
                        "mon Dieu pour ta grâce\n" +
                        "ô toi, Jésus ! Dieu d’amour\n" +
                        "Je me languis de voir ta face\n" +
                        "Tu es ma solution\n" +
                        "Tu es mon grand amour\n" +
                        "Tu es pour toujours mon seul maitre !", "", "" ));
        allItems.add( new ListNumero( "181", "A celui qui nous aime Et qui nous a délivrés",
                "1. À celui qui nous aime\n" +
                        "Et qui nous a délivrés\n" +
                        "Par son sang de nos péchés\n" +
                        "A fait de nous un royaume.",
                "2. Voici avec les nuées,\n" +
                        "Il vient tout œil le verra\n" +
                        "Même ceux qui l’ont percé,\n" +
                        "Le verront car il revient. Ch.",
                "3. Il est l’Alpha l’Omega\n" +
                        "Le Seigneur Dieu tout – Puissant\n" +
                        "Qui était, qui est qui vient\n" +
                        "Le Seigneur Dieu Tout –Puissant. Ch.", "", "", "", "",
                "A toi la gloire et la puissance\n" +
                        "Aux siècle des siècles\n" +
                        "Seigneur, viens, viens, viens (bis)\n" +
                        "Oh ! Viens sécher nos pleurs\n" +
                        "Viens établir Ton règne\n" +
                        "Viens, viens, ô Seigneur reviens !", "", "", "", "", "" ));
        allItems.add( new ListNumero( "182", "Crie pour le Seigneur : Oh ! Oh ! Oh !",
                "1. Mes jours et mes nuits\n" +
                        "Sont à toi Seigneur,\n" +
                        "Oui prends toute ma vie.\n" +
                        "Du fond de mon cœur\n" +
                        "A toi je me livre.\n" +
                        "Pour toi je veux vivre ! Ch.",
                "2. Oui, j’élèverai\n" +
                        "Ma coupe de délivrances.\n" +
                        "Ton Nom je crierai.\n" +
                        "Tu m’as retiré\n" +
                        "Du fond de la fosse.\n" +
                        "Gloire au Dieu très haut ! Ch.",
                "3. J’entrerai au ciel,\n" +
                        "Non par mes mérites,\n" +
                        "Par le sang de Christ\n" +
                        "Il essuiera toutes les larmes de ma vie\n" +
                        "Oh ! Que vienne ce jour ! Ch.", "", "", "",
                "Crie pour le Seigneur : Oh ! Oh ! Oh !\n" +
                        "Chante à pleine voix : Oh ! Oh ! Oh !\n" +
                        "Nos plus belles chansons\n" +
                        "Et toutes nos vies\n" +
                        "Sont à toi Seigneur.\n" +
                        "Tu es notre amour !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "183", "Dire à tout le monde, Je voudrais le dire",
                "1. Dire à tout le monde,\n" +
                        "Je voudrais le dire\n" +
                        "Que Jésus m’a aimé\n" +
                        "Oh ! Oh ! Oh !\n" +
                        "Jésus m’a aimé  (ter)",
                "2. Dire à tout le monde,\n" +
                        "Je voudrais le dire\n" +
                        "Que Jésus m’a sauvé\n" +
                        "Oh ! Oh ! Oh !\n" +
                        "Jésus m’a aimé (ter)",
                "3. Dire à tout le monde,\n" +
                        "Je voudrais le dire\n" +
                        "Que Jésus m’a comblé\n" +
                        "Oh ! Oh ! Oh !\n" +
                        "Jésus m’a aimé (ter)",
                "4. Dire à tout le monde,\n" +
                        "Je voudrais le dire\n" +
                        "Que Jésus m’a satisfait\n" +
                        "Oh ! Oh ! Oh !\n" +
                        "Jésus m’a aimé (ter)",
                "5. Oh ! Oh ! Oh !\n" +
                        "Jésus donne la joie (ter) ) bis\n" +
                        "Oh ! Oh ! Oh !\n" +
                        "Jésus donne la paix (ter)\n" +
                        "Oh ! Oh ! Oh !\n" +
                        "Jésus donne la vie (ter)", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "184", "O jour heureux, jour de bonheur,",
                "1. O jour heureux, jour de bonheur,\n" +
                        "Lumière, paix, joie ineffable !\n" +
                        "Au fils de Dieu, Saint, adorable,\n" +
                        "À jésus, j’ai donné mon cœur.",
                "2. Oh ! Comprenez mon heureux sort\n" +
                        "C’est en Jésus que Dieu pardonne\n" +
                        "La vie éternelle, il l’a donne\n" +
                        "Pourquoi donc te craindrais-je ô mort ?",
                "3. Au ciel des chants ont retenti\n" +
                        "Alléluia ! Disent les anges,\n" +
                        "Entonnant de saintes louanges,\n" +
                        "Car un pécheur s’est converti.  Ch.",
                "4. c’en est fait, tout est accompli,\n" +
                        "Le fils de Dieu m’appelle frère ;\n" +
                        "Son sang coula sur le calvaire ;\n" +
                        "Il est à moi, je suis à lui. Ch.", "", "",
                "Quel beau jour ! (bis)\n" +
                        "Où d’un sauveur, j’ai su l’amour\n" +
                        "Oui dans ma nouvelle patrie,\n" +
                        "Jésus m’attend et pour moi prie\n" +
                        "Quel beau jour ! (bis)\n" +
                        "Où d’un sauveur, j’ai su l’amour !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "185", "L’amour de dieu de loin surpasse",
                "1. l’amour de dieu de loin surpasse\n" +
                        "Ce qu’en peut dire un cœur humain.\n" +
                        "Il est plus grand que les espaces\n" +
                        "Même en l’abîme, il nous atteint.\n" +
                        "Pour le péché de notre monde\n" +
                        "Dieu nous donna Jésus.\n" +
                        "Il nous pardonne, Ô paix profonde,\n" +
                        "Il sauve les perdus.",
                "2. Versez de l’encre dans les ondes,\n" +
                        "Changez le ciel en parchemin\n" +
                        "Tendez la plume à tout le monde\n" +
                        "Et que chacun soit écrivain :\n" +
                        "Vous dire tout l’amour du père\n" +
                        "Ferait tarir les eaux,\n" +
                        "Et remplirait la place entière\n" +
                        "Sur ces divins rouleau.  Ch.",
                "3. Et que le monde un jour chancelle\n" +
                        "Avec ses trônes et ses rois,\n" +
                        "Quand trembleront tous les rebelles,\n" +
                        "Soudains saisis d’un grand effroi,\n" +
                        "De Dieu l’amour que rien ne lasse\n" +
                        "Pour nous encore vivra :\n" +
                        "C’est le miracle de la grâce,\n" +
                        "Amen ! Alléluia ! Ch.", "", "", "", "",
                "L’amour de Dieu, si fort, si tendre\n" +
                        "Est un amour sans fin :\n" +
                        "Tel est le chant que font entendre,\n" +
                        "Les anges et les saints.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "186", "Jésus doux maitre, Règne sur moi,",
                "1. Jésus doux maitre, Règne sur moi,\n" +
                        "Soumets mon être, Sois – en le Roi.\n" +
                        "Je suis l’argile, Toi le potier ;\n" +
                        "Rends – moi docile, ton prisonnier;",
                "2. Jésus, lumière, Pénètre en moi,\n" +
                        "Éprouve, éclaire, ma faible foi.\n" +
                        "Plus blanc que neige, rends-moi Seigneur,\n" +
                        "Et de tout piège, garde mon cœur.",
                "3. Ô Jésus, source, de guérison\n" +
                        "Sois dans ma course, santé pardon,\n" +
                        "Par ta puissance, protège moi !\n" +
                        "Par ta présence relève-moi",
                "4. Je m’abandonne, Jésus à toi,\n" +
                        "Détruis pardonne, tout mal en moi,\n" +
                        "Remplis mon âme, de ton Esprit,\n" +
                        "Et qu’l m’enflamme et jour et nuit", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "187", "Un seul Roi règne sur la terre,",
                "1. Un seul Roi règne sur la terre,\n" +
                        "Un seul Roi règne dans les cieux,\n" +
                        "Un seul Roi règne dans l’univers,\n" +
                        "Un seul Roi règne c’est Jésus.",
                "2. Un seul est digne d’être chanté\n" +
                        "Un seul est digne d’être loué\n" +
                        "Un seul est digne d’être adoré\n" +
                        "Un seul est digne c’est Jésus.",
                "3. Un seul libère du péché,\n" +
                        "Un seul libère les enchainés,\n" +
                        "Un seul libère les prisonniers\n" +
                        "Un seul libère c’est Jésus.",
                "4. Le seul qui a vaincu la mort\n" +
                        "Le seul qui a vaincu Satan\n" +
                        "Le seul qui a vaincu pour moi,\n" +
                        "Le seul vainqueur, c’est Jésus-Christ.",
                "5. Alléluia à toi ô Seigneur !\n" +
                        "Alléluia au Roi des rois !\n" +
                        "Alléluia au Lion de Juda !\n" +
                        "Alléluia à toi Jésus", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "188", "Dans les profondeurs. Dans les lieux très hauts,",
                "1. Il fait tout ce qu’il veut (l’Eternel) !\n" +
                        "Il fait tout ce qu’il veut ( notre Dieu) !\n" +
                        "Dans les cieux sur la terre (l’Eternel) !\n" +
                        "Les mers et les abîmes (notre Dieu) !",
                "2. Il fait monter les nuages (l’Eternel) !\n" +
                        "Fait tomber la pluie (notre Dieu) !\n" +
                        "C’est lui qui crée le vent (l’Eternel) !\n" +
                        "Qui produit les éclaires ( Notre Dieu) !",
                "3. Il connait nos pensées (l’Eternel) !\n" +
                        "Il pénètre nos voies (notre Dieu) !\n" +
                        "C’est lui qui nous protège (l’Eternel) !\n" +
                        "Il est plein de bonté ( notre Dieu)",
                "4.Dans ta vie, dans ma vie (l’Eternel) !\n" +
                        "Il fait tout ce qu’il veut (notre Dieu) !\n" +
                        "Dans la vie de l’Eglise (l’Eternel) !\n" +
                        "Lui seul est souverain (notre Dieu) !",
                "5; proclamons son saint Nom (l’Eternel) !\n" +
                        "Célébrons sa grandeur (notre Dieu)!\n" +
                        "Louons-le de tout cœur (l’Eternel)\n" +
                        "Lui seul en est digne (notre Dieu)", "",
                "Dans les profondeurs.\n" +
                        "Dans les lieux très hauts, (bis)\n" +
                        "Dans tout l’univers, tu es le seul Dieu", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "189", "Qu’il entende nos mains",
                "1. Qu’il entende nos mains ! (ter)\n" +
                        "Acclamons-le encore plus fort !\n" +
                        "Acclamons-le, il est notre Dieu !  Ch.",
                "2. qu’il entende nos cris ! (ter)\n" +
                        "Poussons des cris, des cris de joie !\n" +
                        "Réjouissons-nous, il est notre Père ! Ch.",
                "3. Qu’il entende nos instruments !\n" +
                        "Qu’il entende nos percussions !\n" +
                        "Qu’il entende nos claviers ! Et nos guitares,\n" +
                        "Et nos trompettes,Et nos violons,\n" +
                        "Nos balafons,Célébrons-le il est notre Dieu.  Ch", "", "", "",
                "Acclamons Dieu, il est notre Père\n" +
                        "Louons-le de tous nos cœurs\n" +
                        "Oui, chantons en son honneur\n" +
                        "Un cantique nouveau.\n" +
                        "Jouons de tout notre art,\n" +
                        "Célébrons-le, il est notre Père !", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "190", "Dieu nous t’aimons Alléluia, Alléluia",
                "1. Dieu nous t’aimons (bis)\n" +
                        "Alléluia, Alléluia (bis)",
                "2. Nous t’adorons, Seigneur Jésus\n" +
                        "Alléluia, Alléluia (bis)",
                "3. Tu es digne, Seigneur jésus\n" +
                        "Alléluia, Alléluia (bis)",
                "4. Tu es digne d’être adoré\n" +
                        "Alléluia, Alléluia (bis)",
                "5. Nous t’adorons, nous t’exaltons\n" +
                        "Alléluia, Alléluia (bis)",
                "6. Dieu nous t’aimons, nous t’adorons\n" +
                        "Alléluia, Alléluia (bis).", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "191", "Au pied de la sainte croix Jaillit la fontaine",
                "1. Au pied de la sainte croix\n" +
                        "Jaillit la fontaine\n" +
                        "Du salut que je reçois\n" +
                        "Grâce souveraine.",
                "2. Seigneur, le sang de Ta\n" +
                        "croix\n" +
                        "Mes Péchés efface,\n" +
                        "Tu me le dis, je le crois :\n" +
                        "Du mal, plus de trace. Ch.",
                "3. Prosterné devant la croix\n" +
                        "Sur le mont calvaire\n" +
                        "De Jésus je fais mon choix\n" +
                        "En lui seul j'espère ch.",
                "4. m’asseoir au pied de la croix\n" +
                        "Est mon doux partage\n" +
                        "C’est là que j’entends ta voix\n" +
                        "Qui me dit : COURAGE ! Ch.", "", "", "",
                "oh Sauveur !\n" +
                        "Rédempteur,\n" +
                        "Par toi j’ai la vie\n" +
                        "C’est dans le sang de la croix\n" +
                        "Que je me confie.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "192", "Jésus te confie une œuvre d’amour,",
                "1. Jésus te confie une œuvre d’amour,\n" +
                        "Utile et bénie jusqu’à son retour ;\n" +
                        "Cette sainte, veux-tu l’accomplir,\n" +
                        "Pour lui, sans relâche, sans jamais faiblir ?",
                "2. Va chercher ton frère, esclave enlacé,\n" +
                        "Las de sa misère, de son noir passé\n" +
                        "Arrache son âme au plaisir trompeur,\n" +
                        "Le salut proclame, en Christ, ton sauveur. Ch.",
                "3. Va vers la jeunesse, que le tentateur\n" +
                        "Veut leurrer sans laisser loin du vrai bonheur ;\n" +
                        "Combattant le doute, parle-lui d’amour ;\n" +
                        "Montre-lui la route du ciel, saint séjour.  Ch.",
                "4. Va vers ceux qui meurent sans Dieu, sans espoir\n" +
                        "Dis à ceux qui pleurent quand tout est noir :\n" +
                        "« Jésus donne vie, Bonheur, joie et Paix\n" +
                        "A qui se confie en lui, pour jamais. » Ch.", "", "", "",
                "Prie, agis, jour après jour,\n" +
                        "Sans broncher, suis ton sauveur avec amour\n" +
                        "Sois fidèle, obéissant, et le\n" +
                        "maitre rendra ton travail puissant.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "193", "Je ne sais pas le jour où je verrai mon Roi,",
                "1. Je ne sais pas le jour où je verrai mon Roi,\n" +
                        "Mais je sais qu’il me veut dans sa sainte demeure ;\n" +
                        "La lumière vaincra les ombres à cette heure ;\n" +
                        "Ce sera la gloire pour moi ...",
                "2. Je ne sais quels seront les chants des bienheureux,\n" +
                        "les accents, les accords Des hymnes angéliques\n" +
                        "Mais je sais que, joignant ma voix\n" +
                        "Aux saints cantiques, bientôt j’adorerai comme eux...",
                "3. Je ne sais quel sera le palais éternel,\n" +
                        "Mais je sais que mon âme y sera reconnue,\n" +
                        "Un regard de Jésus sera ma bienvenue.\n" +
                        "Pour moi, pour moi s’ouvre le ciel.", "", "", "", "",
                "Ce sera la gloire pour moi (bis)\n" +
                        "La lumière vaincra les ombres à cette heure\n" +
                        "Ce sera la gloire pour moi.",
                "Bientôt j’adorerai comme eux (bis)\n" +
                        "Mais je sais que joignant ma voix\n" +
                        "Aux saints cantiques, Bientôt j’adorerai comme eux.",
                "pour moi, pour moi s’ouvre le ciel (bis)\n" +
                        "Un regard de Jésus sera ma bienvenue,\n" +
                        "Pour moi, pour moi s’ouvre le ciel.", "", "", "" ));
        allItems.add( new ListNumero( "194", "Prends ma vie, elle doit être A toi seul, Ô Divin maître !",
                "1. Prends ma vie, elle doit être\n" +
                        "A toi seul, Ô Divin maître !\n" +
                        "Que sur le flot de mes jours\n" +
                        "Ton regard brille toujours !",
                "2. Que mes mains, à ton service,\n" +
                        "S’offrent pour le sacrifice ;\n" +
                        "Qu’à te suivre pas à pas\n" +
                        "Mes pieds ne faiblissent pas !",
                "3. Prends ma voix, et qu’elle chante\n" +
                        "Ta grâce auguste et touchante\n" +
                        "Par mes lèvres que ton Nom\n" +
                        "Parle aux pécheurs de pardon !",
                "4. Que mon esprit s’illumine\n" +
                        "De ta sagesse divine ;\n" +
                        "Prends mon argent et mon or\n" +
                        "Et, toi seul, sois mon trésor !",
                "5. Que ma volonté devienne\n" +
                        "La servante de la tienne ;\n" +
                        "Fais ton trône de mon cœur ;\n" +
                        "Il t’appartient, bon sauveur !",
                "6. qu’ainsi mon amour répande\n" +
                        "À tes pieds son humble offrande ;\n" +
                        "Prends-moi, dès mes premiers jours,\n" +
                        "Tout, à toi seul, pour toujours !", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "195", "Quand je contemple cette croix",
                "1. Quand je contemple cette croix\n" +
                        "Où tu mourus, Prince de gloire\n" +
                        "Combien mon orgueil d’autrefois\n" +
                        "M’apparait vain et dérisoire !",
                "2. O mon sauveur, ne permets pas\n" +
                        "Qu’en aucun bien je me confie\n" +
                        "Sauf dans le sang que tu versas\n" +
                        "Pour que ta mort devint ma vie.",
                "3. vit-on jamais amour si grand\n" +
                        "S’unir à douleur si extrême,\n" +
                        "Et l’épine au front d’un mourant\n" +
                        "Resplendir comme un diadème ?",
                "4. Je voudrais, t’apporter Seigneur\n" +
                        "Tout l’univers en humble offrande\n" +
                        "Mais voici ma vie et mon cœur\n" +
                        "C’est ce qu’un tel amour demande.", "", "", "", "", "", "", "", "", "" ));
        allItems.add( new ListNumero( "196", "De Bethlehem à la croix De la crèche à Golgotha",
                "1. De Bethlehem à la croix\n" +
                        "De la crèche à Golgotha\n" +
                        "De ma misère à ma joie\n" +
                        "Il n’y a que Jésus.",
                "2. Cet amour qu’il m’a donné\n" +
                        "Oh je voudrais le partager\n" +
                        "Ne veut-tu pas l’accepter\n" +
                        "Et avec moi chanter.  Ch.",
                "3. De Bethlehem à la croix\n" +
                        "De la crèche à Golgota\n" +
                        "De ma misère à ma joie\n" +
                        "Il n’y a que Jésus.  Ch.", "", "", "", "",
                "O Jésus ton amour oui\n" +
                        "Ton amour pour moi est si grand\n" +
                        "Qu’il remplit tout en mon cœur\n" +
                        "O Jésus ton amour oui ton amour pour moi\n" +
                        "est si grand qu’il me remplit de bonheur.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "197", "Qui donc est dans cette table",
                "1. Qui donc est dans cette table\n" +
                        "Où les bergers se prosternent",
                "2. Qui est donc ce solitaire\n" +
                        "Qui jeûne dans le désert ?",
                "3. Qui est donc ce bienheureux\n" +
                        "Aux paroles merveilleuses",
                "4. À qui donc apporte-t-on\n" +
                        "Les malad’s et malheureux",
                "5. Qui est donc cet homm’en larme\n" +
                        "À la tombe de Lazare",
                "6. C’est lui qui est acclamé\n" +
                        "Avec des chants de triomphe\n" +
                        "\n" +
                        "7. C‟est Lui qui prie à minuit\n" +
                        "Tout seul à Gethsémané\n" +
                        "\n" +
                        "8. C‟est bien Lui qui sur ce bois\n" +
                        "A souffert dans l‟agonie\n" +
                        "\n" +
                        "9. Qui est sorti du tombeau\n" +
                        "Pour sauver et délivrer\n" +
                        "\n" +
                        "10. Qui donc est ce puissant Roi\n" +
                        "Qui domine tout l‟univers ?\n" +
                        "\n" +
                        "11. Qui soupire et qui attend\n" +
                        "L‟enlèvement de l‟Épouse ?\n" +
                        "\n" +
                        "12. Qui est-ce donc qui nous invite\n" +
                        "Au grand festin de l‟agneau\n" +
                        "\n" +
                        "13. Qui est-ce donc au pied de qui\n" +
                        "Nous placerons nos couronnes.\n",
                "",
                "C’est Jésus, glorieuse histoire\n" +
                        "Le Seigneur et Roi de gloire\n" +
                        "À ses pieds prosternons-nous\n" +
                        "Couronnons-le Roi des rois.", "", "", "", "", "" ));
        allItems.add( new ListNumero( "198", "Pur et saint fils de Dieu Laissant la gloire de son royaume",
                "1. Pur et saint fils de Dieu\n" +
                        "Laissant la gloire de son royaume\n" +
                        "Prit la forme d’un simple homme\n" +
                        "Pour nous ouvrir les portes des cieux.",
                "2. Justice du Père\n" +
                        "Dieu regardant avec amour\n" +
                        "L’humanité dans a misère\n" +
                        "Envoya Son Fils un jour.",
                "3. Parmi les hommes, paix sur la terre,\n" +
                        "C’est ce que les anges chantèrent\n" +
                        "Amour et miséricorde\n" +
                        "Du cœur de notre Dieu débordent.",
                "4. c’est par amour qu’il vient\n" +
                        "Enlever tous nos fardeaux\n" +
                        "C’est avec joie qu’il vient\n" +
                        "Pour nous libérer.",
                "5. c’est dans la paix qu’il vient\n" +
                        "Nous donner le vrai repos\n" +
                        "C’est par amour qu’il met\n" +
                        "En nous sa bonté.  Ch.", "", "", "",
                "Mais nous l’avons saisi, jugé, cloué sur la croix\n" +
                        "Et nous l’avons laissé souffrir mourir sur le bois,\n" +
                        "Son sang coula sur la croix ce jour-là,\n" +
                        "Payant la rançon du monde qui ainsi le traita.", "", "", "", "" ));



        allItems.add( new ListNumero( "199", "Sais-tu qu‟un jour tu seras",
                "1. Sais-tu qu‟un jour tu seras\n" +
                        "Au Tribunal de Christ\n" +
                        "Afin de rendre compte\n" +
                        "De ta vie de croyant\n" +
                        "Dis-moi comment sera ce jour\n" +
                        "pour toi, sera-t-il gai ou triste\n" +
                        "Tu ne feras seulement que récolter\n" +
                        "Ce que tu auras semé (2x)",
                "2. En gardant le péché\n" +
                        "En secret dans ton cœur\n" +
                        "Tu espérais en même temps\n" +
                        "Etre très près de Dieu\n" +
                        "Ne sois pas surpris lorsque ce\n" +
                        "jour-là tu te retrouveras\n" +
                        "Très loin dans les bas-fonds du ciel\n" +
                        "Avec ceux qui sont comme toi (2x)",
                "3. En aimant le monde et les choses du monde\n" +
                        "Tu espérais qu‟en même temps,\n" +
                        "tu aimerais le Père\n" +
                        "Mais la Parole de Dieu déclare :\n" +
                        "Celui qui est ami\n" +
                        "Du monde se rend ennemi de Dieu\n" +
                        "C‟est pourquoi n‟aimez pas le monde (2x)",
                "4. Sais-tu qu‟au ciel nous serons\n" +
                        "Dans des quartiers différents\n" +
                        "Et que les croyants du même\n" +
                        "genre seront placés ensemble\n" +
                        "Les amoureux intenses de Jésus\n" +
                        "seront tout près de Lui\n" +
                        "Tu seras dans le quartier qui correspond\n" +
                        "A ton amour pour Lui (2x)",
                "5. Le feu éprouvera\n" +
                        "Les œuvres de chacun\n" +
                        "Les motifs pour lesquels\n" +
                        "Il les a accomplies\n" +
                        "Si tu les as faites pour Jésus et\n" +
                        "pour toi, tu auras tout perdu\n" +
                        "Oui tu n‟obtiendras aucune récompense\n" +
                        "Ce jour-là des mains du Seigneur (2x)",
                "6. Toutes les récompenses\n" +
                        "que Jésus donnera\n" +
                        "Dépendront toutes du degré\n" +
                        "où tu as investi\n" +
                        "Ton argent, ton temps et tes\n" +
                        "forces et tout ce que tu avais\n" +
                        "C‟est cela qui fixera ta place au ciel\n" +
                        "Et ton rang éternel (2x)\n" +
                        "\n" +
                        "Maintenant, repens-toi\n" +
                        "de ton cœur divisé\n" +
                        "Maintenant, décide d‟avoir\n" +
                        "un cœur entier pour Jésus\n\n" +
                        "Maintenant, consacre-toi\n" +
                        "et sois zélé pour Lui\n" +
                        "C‟est alors que tu obtien\n" +
                        "un grand rang éternel.\n" +
                        "\n" +
                        "7. La destinée ultime\n" +
                        "des prix que nous aurons\n" +
                        "Ce sera de les poser\n" +
                        "aux pieds de Jésus-Christ\n" +
                        "La récompense du disciple,\n" +
                        "ce sera la joie\n" +
                        "D‟apporter la couronne qu‟il\n" +
                        "a gagnée\n" +
                        "Aux pieds du Roi des rois (2x)\n" +
                        "\n" +
                        "8. Le cri et la crainte que doit avoir mon cœur\n" +
                        "C‟est de pouvoir faillir à satisfaire son cœur\n" +
                        "Si ce jour-là il manque à Ses \n" +
                        "pieds certaines couronnes\n" +
                        "Parce que personne ne sera qualifié\n" +
                        "Pour les mériter. (2x)\n" +
                        "\n" +
                        "Maintenant je dois travailler\n" +
                        "sans plus me ménager\n" +
                        "C‟est alors que je gagnerai\n" +
                        "toute les couronnes pour Lui\n\n" +
                        "Maintenant, je m‟engage\n" +
                        "à investir mon tout.\n" +
                        "C‟est alors que je pourrai\n" +
                        "enfin satisfaire Son cœur.\n",
                "",
                "",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "200", "Car Dieu a tant aimé le monde",
                "1. Car Dieu a tant aimé le monde\n" +
                        "Qu‟Il a donné Son Fils Unique\n" +
                        "Afin que quiconque croit en Lui\n" +
                        "Ne périsse plus. (3x)",
                "2. Dans Ton amour Tu nous invites\n" +
                        "A donner nos biens temporels\n" +
                        "Pour gagner les biens éternels\n" +
                        "O notre Dieu. (3x)",
                "3. Donnez, il vous sera donné\n" +
                        "On versera dans votre sein\n" +
                        "Une bonne mesure serrée, secouée\n" +
                        "Et qui déborde. (3x)",
                "4. Mon enfant donne-moi ton cœur\n" +
                        "Pour habitation de ma gloire\n" +
                        "Je veux l‟avoir à moi tout seul\n" +
                        "Et pour toujours. (3x)",
                "5. Seigneur je viens à Toi ce jour\n" +
                        "Déposant mon cœur à Tes pieds\n" +
                        "Il est à Toi, Seigneur Mon Dieu\n" +
                        "Oui à Toi Seul. (3x)",
                "6. Comme nos frères de Macédoine\n" +
                        "Dans une pauvreté extrême\n" +
                        "Et dans une joie débordante\n" +
                        "Nous donnerons. (3x)\n" +
                        "\n" +
                        "7. Je ne serai plus égoïste\n" +
                        "Mais avec générosité\n" +
                        "Bien plus que mes capacités\n" +
                        "Je donnerai. (3x)\n" +
                        "\n" +
                        "8. Je ne serai plus menacé\n" +
                        "Manipulé pour Te donner\n" +
                        "Mais entièrement de moi-même\n" +
                        "Je donnerai. (3x)\n" +
                        "\n" +
                        "9. Pardonne mon aveuglement\n" +
                        "A donner si nonchalamment\n" +
                        "Je plaiderai pour Te donner\n" +
                        "Avec urgence. (3x)\n",
                "",
                "",
                "",
                "",
                "",
                "",
                "" ));




        allItems.add( new ListNumero( "201", "Où est ton trésor La sera ton cœur",
                "1. Où est ton trésor\n" +
                        "La sera ton cœur\n" +
                        "Tu peux te tromper\n" +
                        "De placement\n" +
                        "Ton avenir\n" +
                        "Compte tout autant\n" +
                        "Prends donc le temps\n" +
                        "D’y penser une heure.", "", "", "", "", "", "",
                "l’argent ne suffit", "", "", "", "", "" ));




        allItems.add( new ListNumero( "202", "Pécheur, Je voudrais te guérir ;",
                "1. Pécheur, Je voudrais te guérir ;\n" +
                        "J‟ai vu tes larmes, ta souffrance ;\n" +
                        "Mais pour avoir la délivrance,\n" +
                        "Il faut apprendre à M‟obéir.\n" +
                        "Voici, Je Me tiens à la porte,\n" +
                        "Je suis ton Maître et ton Sauveur,\n" +
                        "C‟est le bonheur que Je t‟apporte :\n" +
                        "Ne veux-tu pas M‟ouvrir ton cœur ?",
                "2. Sais-tu que Je suis né pour toi,\n" +
                        "Que pour toi J‟ai donné Ma vie ?\n" +
                        "Ton cœur est-il l‟hôtellerie\n" +
                        "Sans place, même pour ton Roi ?\n" +
                        "Souvent, année après année,\n\n" +
                        "Chez toi, J‟ai frappé, mais en vain.\n" +
                        "Voici le soir de la journée,\n" +
                        "Ne veux-tu pas M‟ouvrir enfin ?",
                "3. N‟auras-tu pas besoin de Moi,\n" +
                        "Bientôt, dans la nuit éternelle ?\n" +
                        "Dès aujourd‟hui viens sous Mon aile,\n" +
                        "Je serai tout, oui, tout pour toi !\n" +
                        "Le temps rapidement t‟emporte ;\n" +
                        "Pourquoi renvoyer à demain ?\n" +
                        "Trop tard, un jour devant Ma porte,\n" +
                        "Tu frapperas, peut être en vain",
                "4. Si tu n‟as pas besoin de Moi\n" +
                        "Ecoute, obéis sans comprendre.\n" +
                        "Jusque à quand devrai-Je attendre ?\n" +
                        "Ton Seigneur a besoin de toi.\n" +
                        "Voici, Je me tiens à la porte,\n" +
                        "Je suis ton Maître et ton Sauveur ;\n" +
                        "C‟est le bonheur que Je t‟apporte !\n" +
                        "Ne veux-tu pas M‟ouvrir ton cœur ?\n",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "203", "C‟est dans l‟Evangile qu‟on trouve",
                "1. C‟est dans l‟Evangile qu‟on trouve la vie\n" +
                        "La paix, le pardon, le bonheur.\n" +
                        "Ouvrons notre cœur à la grâce infinie\n" +
                        "Donnant tant de biens aux pécheurs.",
                "2. Il montre un endroit pour jeter la souillure\n" +
                        "Voilà, c‟est ici Golgotha.\n" +
                        "Un lieu de folie, un endroit de rupture\n" +
                        "Mais crois, le pardon est bien là.",
                "3. Suivons le chemin qui, plus loin,nous entraîne\n" +
                        "Au centre de la vérité.\n" +
                        "Pendant que l‟amour de Jésus nous enchaîne\n" +
                        "Au règne de l‟éternité.",
                "",
                "",
                "",
                "",
                "Auprès du Seigneur, avec Lui sur la route\n" +
                        "Marchons de tout cœur en chantant.\n" +
                        "Il sauve, Il guérit, puis enlève le doute\n" +
                        "Il vit, Il est là maintenant.",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "204", "Où cherchez-vous le bonheur",
                "1. Où cherchez-vous le bonheur\n" +
                        "Dans ce monde où tout passe ?\n" +
                        "Avez-vous dans votre cœur,\n" +
                        "Pour Jésus une place ?\n" +
                        "A votre porte Il se tient,\n" +
                        "Sans se lasser Il revient,\n" +
                        "Pour Jésus votre Sauveur,\n" +
                        "N‟avez-vous point de place ?",
                "2. S‟Il a souffert c‟est pour vous,\n" +
                        "Oh ! Merveilleuse grâce !\n" +
                        "Lorsqu‟Il luttait à genoux,\n" +
                        "Dieu Lui voilant sa face.\n" +
                        "Ah de Sa sublime croix,\n" +
                        "N‟entendez-vous pas la voix,\n" +
                        "Qui vous dit : * pauvre pécheur,\n" +
                        "N‟as-tu donc point de place ? +",
                "3. Si le monde a votre cœur,\n" +
                        "Croyez-vous donc qu‟il fasse\n" +
                        "Jusqu‟au bout votre bonheur ?\n" +
                        "Vous savez que tout passe.\n" +
                        "Oh ! pendant qu‟il en est temps\n" +
                        "Ecoutez les doux accents,\n" +
                        "De la voix du grand vainqueur,\n" +
                        "Et faites-Lui donc place ?",
                "",
                "",
                "",
                "",
                "N’avez-vous point de place ? (bis)\n" +
                        "Pour Jésus votre Sauveur,\n" +
                        "N’avez-vous point de place ?",
                "N’avez-vous point de place ? (bis)\n" +
                        "Ah pour l’homme de douleur\n" +
                        "N’avez-vous point de place ?",
                "N’avez-vous point de place ? (bis)\n" +
                        "Pour Jésus le grand vainqueur,\n" +
                        "N’avez-vous point de place ?",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "205", "Au loin sur la colline, se tient la",
                "1. Au loin sur la colline, se tient la vielle croix\n" +
                        "De souffrance et d‟ignominie\n" +
                        "O que j‟aime cette croix\n" +
                        "Ou Jésus, Bien-aimé\n" +
                        "Pour tous les pécheurs fut immolé",
                "2. Oui cette rude croix, par le monde méprisée\n" +
                        "Est pleine d‟attraction pour moi.\n" +
                        "Car l‟agneau préci-eux\n" +
                        "Quitta Sa gloire d‟en haut.\n" +
                        "Pour subir le sombre calvaire",
                "3.O ! cette rude croix tachée de sang divin\n" +
                        "Rayonne de beauté sublime.\n" +
                        "Sur cette vielle croix\n" +
                        "Jésus souffrit, mourut\n" +
                        "(Pour) me pardonner me sanctifier",
                "4.A la vielle rude croix, je resterai fidèle\n" +
                        "Portant avec joie son opprobre.\n" +
                        "Alors, Il me prendra dans Ses bras\n" +
                        "là au ciel\n" +
                        "Avec Lui, pour toujours glorifié.",
                "",
                "",
                "",
                "Oui je chérirai la rude croix\n" +
                        "Et un jour, mes trophées à Ses pieds\n" +
                        "Je m’accrocherai à cette croix\n" +
                        "Jusqu’au jour où je se rai couronné",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "206", "Entends-tu Jésus t‟appelle,",
                "1. Entends-tu Jésus t‟appelle,\n" +
                        "Viens ô pécheur Il t‟attend.\n" +
                        "A cette voix si fidèle,\n" +
                        "Tu résistas trop souvent.",
                "2. Pour le péché pour le monde,\n" +
                        "Tu trouves place en ton cœur,\n" +
                        "Point pour le Sauveur du monde,\n" +
                        "Rien pour l‟homme de douleur.",
                "3. Jésus frappe, Il frappe encore,\n" +
                        "Ouvre à ton libérateur,\n" +
                        "Et pour toi luira l‟aurore,\n" +
                        "Du véritable bonheur.",
                "4. Aujourd‟hui, c‟est jour de grâce,\n" +
                        "Ne compte pas sur demain.\n" +
                        "Pendant que ton Sauveur passe,\n" +
                        "Saisis sa puissante main !",
                "",
                "",
                "",
                "Laisse entrer le Roi de gloire,\n" +
                        "Ouvre ton cœur à Jésus,\n" +
                        "Laisse entrer le Roi de gloire,\n" +
                        "Hâte-toi ne tarde plus.",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "207", "Sur le chemin, va sans peur,",
                "1. Sur le chemin, va sans peur,\n" +
                        "Car Jésus est devant toi.\n" +
                        "Il veut être ton Sauveur\n" +
                        "Oh ! suis-Le, oh ! suis-Le par la foi.",
                "2. Et si tu tombes en chemin,\n" +
                        "Regarde à Jésus ton Roi.\n" +
                        "Il est dans le lieu très Saint,\n" +
                        "Et Il prie, et Il prie pour toi.",
                "3. Réjouis-toi chaque jour,\n" +
                        "Et chante à ce Dieu d‟amour.\n" +
                        "Il t‟a sauvé du péché,\n" +
                        "Et t‟a élu pour l‟éternité.",
                "4. Un jour Jésus reviendra,\n" +
                        "O quel immense bonheur.\n" +
                        "Dans Son ciel Il te prendra,\n" +
                        "Bénis-Le (2x) dans ton cœur.",
                "",
                "",
                "",
                "Et maintenant saisis la main de ton Sauveur,\n" +
                        "Car Lui seul te donne l’éternel bonheur.\n" +
                        "Il a donné sa vie sur la croix,\n" +
                        "Oh ! suis-Le, oh ! suis-Le par la foi.",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "208", "Ils ont mis le Maître sur la croix",
                "1. Ils ont mis le Maître sur la croix (2x)\n" +
                        "Oh ! Je tremble, tremble encore\n" +
                        "Quand je repense à Sa mort\n" +
                        "Ils ont mis le Maître sur la croix",
                "2. Ils ont mis des épines à Son front\n" +
                        "Et des clous à Ses poings et talons\n" +
                        "Oh ! Je tremble, tremble encore\n" +
                        "Quand je repense à Sa mort\n" +
                        "Ils ont mis le Maître sur la croix",
                "3. Il disait, je suis venu chercher\n" +
                        "Mes brebis, elles étaient égarées\n" +
                        "Oh ! Je tremble, tremble encore\n" +
                        "Quand je repense à Sa mort\n" +
                        "Ils ont mis le Maître sur la croix",
                "4. À quoi bon ces trois années d‟espoir\n" +
                        "S‟ils l‟ont mis au fond d‟un grand trou noir\n" +
                        "Oh ! Je tremble, tremble encore\n" +
                        "Quand je repense à Sa mort\n" +
                        "Ils ont mis le Maître sur la croix",
                "5 Aux lueurs de la troisième aurore\n" +
                        "Dans la tombe en vain on a\n" +
                        "cherché Son corps\n" +
                        "Il avait roulé la pierre,\n" +
                        "Il avait roulé la mort\n" +
                        "Son amour est plus précieux que l‟or.",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "209", "Il est Roi, Il est Roi",
                "1. Il est assis sur le trône et Il règne.\n" +
                        "Il intercède pour tous les saints.\n" +
                        "Que toute la terre se réjouisse en Son nom\n" +
                        "Il est Roi, Jésus-Christ est Roi !",
                "2. Dieu L‟a élevé dans les lieux célestes\n" +
                        "Au-dessus de toute domination.\n" +
                        "Que toute la terre se réjouisse en Son nom\n" +
                        "Il est Roi, Jésus-Christ est Roi !",
                "3. En Son nom nous chassons les démons.\n" +
                        "En Son nom guérissons les malades\n" +
                        "Que toute la terre se réjouisse en Son nom\n" +
                        "Il est Roi, Jésus-Christ est Roi !",
                "",
                "",
                "",
                "Il est Roi, Il est Roi\n" +
                        "Et Seigneur des seigneurs\n" +
                        "Que toute la terre se réjouisse en Son nom\n" +
                        "Il est Roi, Jésus-Christ est Roi !",
                "",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "210", "Je suis fanatique de Jésus",
                "1. Je suis fanatique de Jésus\n" +
                        "Je n‟ai pas honte de le dire \n" +
                        "Il a transformé toute ma vie\n" +
                        "C‟est Lui seul qui me suffit\n" +
                        "(x2)",
                "2. Je croupissais jour et nuit\n" +
                        "Sous le poids de mes péchés\n" +
                        "Mais quand Sa lumière a brillé dans ma vie,\n" +
                        "Son amour m‟a tout pardonné\n" +
                        "(x2)",
                "3. Ma face toujours défaite\n" +
                        "A cause de mes nombreux soucis\n" +
                        "Mais quand Sa lumière a brillé dans ma vie,\n" +
                        "Son amour m‟a donné la j‟oie",
                "4. Torturé par la souffrance\n" +
                        "A cause de mes multipl‟ maladies\n" +
                        "Mais quand Sa lumière a brillé dans ma vie,\n" +
                        "Sa puissance a tout guéri",
                "5. J‟‟ai connu des déceptions\n" +
                        "Et des échecs multipliés\n" +
                        "",
                "",
                "",
                "Ah Jésus, ah Jésus o (4 fois)\n" +
                        "Ton amour a conquis mon cœur\n" +
                        "Mais quand Sa lumière a brillé dans ma vie,\n" +
                        "J‟suis devenu succès pour Dieu",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "211", "Jésus, nous Te louons",
                "1. Nous étions égarés\n" +
                        "Comme des brebis sans berger,\n" +
                        "Et chacun de nous suivait sa\n" +
                        "propre voie\n" +
                        "Ton appel d‟amour nous est\n" +
                        "parvenu\n" +
                        "Nous avons répondu à cet\n" +
                        "amour, Seigneur\n" +
                        "Ton Nom puissant nous a libérés.",
                "2- Nous sommes plus que\n" +
                        "vainqueurs\n" +
                        "Par Toi qui nous fortifies\n" +
                        "Nous avons l‟espérance de la vie\n" +
                        "éternelle\n" +
                        "Car nous croyons en Ton Nom Seigneur\n" +
                        "Nous avons l‟espérance de la vie éternelle\n" +
                        "Car nous croyons en Ton Nom Seigneur",
                "3- En Ton Nom oh Jésus\n" +
                        "Les pécheurs sont sauvés\n" +
                        "Les démons sont chassés, les malades guéris\n" +
                        "L‟espoir renaît dans les vies\n" +
                        "Les démons sont chassés, les malades sont guéris\n" +
                        "L‟espoir renaît dans nos vies, Seigneur",
                "",
                "",
                "",
                "Jésus, nous Te louons,\n" +
                        "Emmanuel, nous Te célébrons;\n" +
                        "L’Etoile du matin, le Lion de Juda\n" +
                        "Tu as vaincu pour l’éternité,\n" +
                        "L’Etoile du matin, le Lion de Juda\n" +
                        "Tout genou fléchit en Ton nom.",
                "",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "212", "Jésus quitta le trône de Son Père",
                "1. Jésus quitta le trône de Son Père,\n" +
                        "Il descendit ici bas sur la terre\n" +
                        "Il accepta la crèche pour berceau\n" +
                        "Lui Roi des rois Le fils du Dieu très\n" +
                        "haut.",
                "2. En tout les lieux, portant la délivrance\n" +
                        "Faisant le bien, guérissant la souffrance\n" +
                        "Il pardonnait aux pêcheurs repentants\n" +
                        "Il bénissait jusqu‟aux petits enfants  Ch.",
                "3. Il fut cloué sur la croix méprisable\n" +
                        "Lui juste et saint mourut pour moi coupable\n" +
                        "Pour me sauver Son sang fut rependu\n" +
                        "C‟est pourquoi j‟aime le Seigneur Jésus ch.",
                "4. Il fut cloué sur la croix méprisable\n" +
                        "Lui juste et saint mourut pour moi coupable\n" +
                        "Pour me sauver Son sang fut rependu\n" +
                        "C‟est pourquoi j‟aime le Seigneur Jésus  Ch.",
                "5. Plus que vainqueur, Il sortit de la tombe\n" +
                        "Gloire à l‟Agneau divin sauveur du monde\n" +
                        "Il règne au ciel intercède pour moi\n" +
                        "Il vient bientôt me chercher je le crois.",
                "",
                "",
                "Ô oui c’est vrai, je sais que c’est vrai,\n" +
                        "Il est écrit, cela suffit\n" +
                        "Que Jésus m’aime oh bonheur suprême\n" +
                        "La Bible me le dit.",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "213", "Au ciel est la maison du Père",
                "1. Au ciel est la maison du Père\n" +
                        "Etincellent de beauté\n" +
                        "Tout en elle est gloire et lumière\n" +
                        "Ineffable félicité.",
                "Vers le ciel, (bis)\n" +
                        "Nous, nous marchons vers le ciel\n" +
                        "[C’est au ciel, (bis)\n" +
                        "Qu’est notre héritage éternel ] x 4",
                "3. Dans nos fatigues sur la terre\n" +
                        "Dans nos combats et nos douleurs\n" +
                        "C‟est toi douce maison du Père\n" +
                        "Que cherchent nos yeux et nos cœurs  Ch.",
                "4. Jours de peine ou jours d‟allégresse\n" +
                        "Douce brise ou vents orageux \n" +
                        "Poussez-nous, poussez-nous sans cesse\n" +
                        "Vers notre demeure des cieux  Ch.",
                "",
                "",
                "",
                "Vers le ciel, (bis)\n" +
                        "Nous, nous marchons vers le ciel\n" +
                        "[C’est au ciel, (bis)\n" +
                        "Qu’est notre héritage éternel ] x 4",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "214", "Ecoutez l‟appel du Berger !",
                "1. Ecoutez l‟appel du Berger !\n" +
                        "Il sait ses brebis en danger ;\n" +
                        "Il les appelle aves amour,\n" +
                        "Espérant toujours leur retour.",
                "2. Mourant de froid, de soif et de faim,\n" +
                        "Les brebis appellent en vain.\n" +
                        "Jésus nous veut pour les sauver :\n" +
                        "Qui va l‟aider à les trouver ? Ch.",
                "3. Ne peut-il pas compter sur nous ?\n" +
                        "Ne voulons-nous pas aller tous\n" +
                        "Dire à tous ceux qui sont perdus\n" +
                        "Que nous les voulons pour Jésus ?",
                "",
                "",
                "",
                "",
                "Cherchons-les! Cherchons-les !\n" +
                        "Savons-nous le prix d’une âme !\n" +
                        "Cherchons-les! Cherchons-les !\n" +
                        "Le Bon Berger les réclame",
                "",
                "",
                "",
                "",
                "" ));

        allItems.add( new ListNumero( "215", "Quel autre au ciel ai-je que Toi ?",
                "1. Quel autre au ciel ai-je que Toi ?\n" +
                        "Oh mon Dieu, mon Sauveur ;\n" +
                        "N‟as-tu pas ouvert à ma foi\n" +
                        "Les trésors de ton cœur ?\n" +
                        "Tu t‟es donné toi-même à moi\n" +
                        "Et vivant sous Ta douce loi\n" +
                        "Je ne prends de plaisir qu‟en Toi\n" +
                        "Oh mon Dieu. Mon Sauveur",
                "2. Que me font les biens ici bas ?\n" +
                        "Oh mon Dieu, mon Sauveur ;\n" +
                        "Ils passent, Tu ne passes pas\n" +
                        "Tu suffis à mon cœur\n" +
                        "Dans le deuil ou la pauvreté\n" +
                        "Dans l‟exil ou l‟adversité\n" +
                        "Tu reste ma félicité\n" +
                        "Oh mon Dieu. mon Sauveur",
                "3. Je serais toujours avec Toi\n" +
                        "Oh mon Dieu, mon Sauveur ;\n" +
                        "Rien ici bas, non rien ne doit\n" +
                        "M‟arracher de Ton cœur\n" +
                        "Les vents peuvent se déchaîner,\n" +
                        "Les torrents peuvent dérober\n" +
                        "Ta grâce est mon ferme rocher\n" +
                        "Oh mon Dieu. Mon Sauveur",
                "4. Par la main droite tu m‟as pris\n" +
                        "Oh mon Dieu, mon Sauveur ;\n" +
                        "Par ton conseil Tu me conduis\n" +
                        "Au repos sur Ton cœur\n" +
                        "Et quand viendra le dernier jour,\n" +
                        "Tu m‟ouvriras avec amour ;\n" +
                        "Les portes du divin séjour\n" +
                        "Oh mon Dieu, mon Sauveur ;",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "" ));



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