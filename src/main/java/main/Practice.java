package main;

/**
 * A technológia fejlődésének hála az emberiség képessé vált az űr meghódítására
 * - és meg is tette azt: számtalan bolygót fedezett fel, és gyarmatosított.
 * Ám míg a Föld-lakók élete felvirágzott,
 * a gyarmatosított bolygókon élők napjai kemény munkával és küzdelmekkel teltek
 * - mert majdnem minden, amiért ők dolgoztak, a Föld kincseit gyarapította.
 * Ezért egyre nőtt a feszültség a Föld és a Gyarmatok között,
 * míg ki nem robbant az elkerülhetetlen háború...
 * A Gyarmatok Szövetsége fellázadt a Bolygóközi Köztársaság nyerészkedése és elnyomása ellen.
 * A Bolygóközi Köztársaság pedig a Föld vezetésével ellentámadásba lendült.
 * A háború már évek óta tart, az összecsapások kegyetlenek és véresek.
 * Ki tudja, mikor lesz vége a pusztításnak - ha vége lesz egyáltalán valamikor...
 */
public class Practice {

    /**
     * 1. feladat - 2p
     *
     * A különböző osztályú űrhajókat a csatákra úgy készítik fel, hogy pajzzsal látják el őket.
     *
     * Az űrhajó-osztályok és a pajzsuk ereje:
     *      Intrepid: 100
     *      Nova: 200
     *      Raven: 300
     *      Galaxy: 500
     *      Dreadnought: 800
     *
     * Más osztályú űrhajók nem kapnak pajzsot.
     *
     * Valósítsd meg a "getShieldPower" nevű metódust!
     * A metódus adja vissza, hogy az adott osztályú űrhajó milyen erős pajzzsal rendelkezik.
     *
     * @param shipClass az űrhajó osztálya
     * @return a pajzs ereje
     */
    public static int getShieldPower(String shipClass) {

        switch (shipClass) {
            case "Intrepid":
                return 100;
            case "Nova":
                return 200;
            case "Raven":
                return 300;
            case "Galaxy":
                return 500;
            case "Dreadnought":
                return 800;
            default:
                return 0;
        }
    }

    /**
     * 2. feladat - 2p
     *
     * A Bolygóközi Köztársaság katonai akadémiáján a túlélési gyakorlaton elvárt szintet úgy határozzák meg,
     * hogy az előző évi első és utolsó próbálkozó eredményét átlagolják.
     * (Nem a legkisebbet és a legnagyobbat, hanem sorrendben az elsőt és a legutolsót!)
     *
     * Valósítsd meg a "countRequirement" nevű metódust!
     * A metódus bemeneti paraméterként kapja az előző évi eredményeket (sorrendben),
     * és visszaadja az első és az utolsó eredmény átlagát.
     *
     * (Biztos lehetsz benne, hogy a bemeneti paraméterként kapott tömb legalább 2 elemet tartalmaz.)
     *
     * @param scores az előző évi eredmények
     * @return az elvárt szint
     */
    public static double countRequirement(int[] scores) {

        return (double) (scores[0] + scores[scores.length - 1]) / 2;
    }

    /**
     * 3. feladat - 3p
     *
     * Az űrhajók harcképességét mindig felmérik, mielőtt csatába indulnak velük.
     * Egy hajót akkor minősítenek harcképesnek, ha az alábbi feltételek mind teljesülnek:
     *      a pajzs töltöttsége meghaladja a 20 egységet
     *      a fegyverzet töltöttsége meghaladja a 20 egységet
     *      a pajzs és fegyverzet töltöttsége átlagosan meghaladja az 50 egységet
     *
     * Valósítsd meg az "isShipAbleToFight" nevű metódust!
     * A metódus bemeneti paraméterként kapja a pajzs és a fegyverzet töltöttségét,
     * és megállapítja, hogy a fenti feltételek mind teljesülnek-e vagy sem.
     *
     * @param shieldCharge a pajzs töltötsége
     * @param weaponCharge a fegyverzet töltöttsége
     * @return a hajó harcképes-e
     */
    public static boolean isShipAbleToFight(int shieldCharge, int weaponCharge) {
        return false;
    }

    /**
     * 4. feladat - 3p
     *
     * Noha a hadviselésnek vannak szabályai, egy titkos gyarmati különítmény úgy döntött, hogy beveti a legveszedelmesebb
     * fegyvert, amelynek használatát az egész Univerzumban régen betiltottak már: a vérengző űrnyulakat.
     * Ezért megbíztak egy tenyésztőt, hogy szaporítson adott számú űrnyulat.
     * A megrendeléskor kérdezték a tenyésztőt, hogy hány napig kell várniuk a szállítmány teljesítésére.
     *
     * A tenyésztő tudta, hogy az űrnyulak szaporák, és a populációjuk naponta megduplázódik. Azonban a pontos számítással
     * problémái akadtak.
     *
     * Segíts a tenyésztőnek kiszámítani, hogy hány nap alatt tudja kitenyészteni a kívánt mennyiséget,
     * ha az űrnyulak száma naponta megduplázódik!
     *
     * Valósítsd meg a "getSpaceRabbitDays" nevű metódust!
     * A metódus bemeneti paraméterként kapja, hogy hány űrnyúllal kezdi a tenyésztő a szaporítást,
     * valamint hogy a megrendelők hány nyulat rendeltek.
     * A metódus adja vissza, hogy hányadik napon tudja teljesíteni a tenyésztő a megrendelést!
     *
     * Ügyelj arra, hogy ha a tenyésztőnek már van annyi űrnyula, amennyit a megrendelő kért,
     * akkor is 1 nap a megrendelés teljesítésének időtartama.
     *
     * Biztos lehetsz benne, hogy a "startRabbitValue" értéke legalább 1.
     *
     * @param startRabbitValue az űrnyulak száma a tenyésztés megkezdésekor
     * @param requiredRabbits a megrendelt űrnyulak száma
     * @return a megrendelés teljesítéséhez szükséges napok száma
     */
    public static int getSpaceRabbitDays(int startRabbitValue, int requiredRabbits) {
        return -1;
    }

    /**
     * 5. feladat - 3p
     *
     * A Gyarmatok Szövetségének hadvezetése összeírta, hogy bolygónként hány ember hajlandó harcba vonulni,
     * és szeretnék megtudni, hogy összesen mekkora seregük lesz így.
     *
     * Valósítsd meg a "sumArmy" nevű metódust!
     * A metódus bemeneti paraméterként kapja, hogy bolygónként hány ember csatlakozik a sereghez,
     * és összegzi az emberek számát.
     *
     * Biztos lehets benne, hogy az "armyOfPlanets" nevű tömb legalább egy elemet tartalmaz.
     *
     * @param armyOfPlanets a sereghez csatlakozó emberek számai
     * @return a teljes sereg száma
     */
    public static int sumArmy(int[] armyOfPlanets) {
        return -1;
    }

    /**
     * 6. feladat - 3p
     *
     * A Bolygóközi Szövetség hadvezetése jegyzéket készít a csaták kimeneteléről az alábbiak szerint:
     *      ha elveszítettek egy csatát, akkor azt negatív számmal jelölik
     *      ha megnyertek egy csatát, akkor azt pozitív számmal jelölik
     *      ha a csata döntetlen volt, akkor azt 0-val (nullával) jelölik
     *
     * Valósítsd meg a "countVictories" nevű metódust!
     * A metódus bemeneti paraméterként kapja a csatákról készített jegyzéket,
     * és megszámolja, hogy hány csatát nyertek meg.
     *
     * @param battles a csaták kimenetelét tartalmazó tömb
     * @return a megnyert csaták darabszáma
     */
    public static int countVictories(int[] battles) {
        return -1;
    }

    /**
     * 7. feladat - 4p
     *
     * A Bolygóközi Köztársaság akadémiáján záróünnepséget tartanak a végzett katonák számára.
     * A díszszemlén a kadétok magasság szerint növekvő sorrendben állnak fel.
     *
     * Valósítsd meg az "isInAscendingOrder" nevű metódust!
     * A metódus ellenőrzi, hogy a kadétok valóban növekvő sorrendben állnak-e.
     *
     * Biztos lehetsz benne, hogy a "heights" nevű tömb legalább egy elemet tartalmaz.
     *
     * @param heights a kadétok magassága
     */
    public static boolean isInAscendingOrder(int[] heights) {
        return false;
    }

    /**
     * 8. feladat - 4p
     *
     * A Földi Hírszerzőközpont rejtélyes üzeneteket hallgat le.
     * Az üzenetek mindig érelmetlen karaktersorozatból állnak.
     * Az egyik kódfejtő azzal az ötlettel áll elő, hogy az üzeneteket
     * meg lehetne fejteni, ha megfordítják őket - azaz hátulról visszafelé olvassák el.
     *
     * Valósítsd meg a "reverseMessage" nevű metódust!
     * A metódus fordítsa meg az üzenet karaktereit: az eredeti üzenet utolsó karaktere
     * legyen az első, az utolsó előtti a második stb.
     *
     * Például:
     *      eredeti üzenet: ['a', 'b', 'c', 'd', 'e']
     *      megfordítva:    ['e', 'd', 'c', 'b', 'a']
     *
     * Ügyelj arra, hogy az eredeti üzenet ne módosuljon!
     *
     * @param message az eredeti karaktersorozat
     * @return az eredeti üzenet karakterei fordított sorrendben
     */
    public static char[] reverseMessage(char[] message) {
        return null;
    }

    /**
     * 9. feladat - 5p
     *
     * A Bolygóközi Szövetség hadvezetése összegyűjtötte az utóbbi néhány hónap összes csatáját, hónaponként rendszerezve.
     * Szeretnék tudni, hogy melyik hónapban volt a legtöbb veszteségűk.
     *
     * Valósítsd meg a "getWorstMonthIndex" nevű metódust!
     * A metódus bemeneti paraméterként egy kétdimenziós tömböt kap, amely tartalmazza az utóbbi hónapok csatáinak veszteségeit.
     * A kétdimenziós tömbön belül az egydimenziós tömbök egy-egy hónap adatait tárolják.
     *
     * A metódus számítsa ki, hogy mely hónapban volt a legtöbb veszteség,
     * és térjen vissza a hónap (azaz az egydimenziós tömb) index-számával!
     *
     * Például:
     *      {
     *          {1},        // 0. indexű hónap
     *          {1, 2},     // 1. indexű hónap
     *          {11},       // 2. indexű hónap
     *          {3, 1, 4}   // 3. indexű hónap
     *      }
     *    megoldás: 2
     *      mert abban a hónapban volt a legtöbb veszteség, amelynek adatait ezen az index-számon tárolják
     *
     * Biztos lehetsz benne, hogy a hónapok veszteségei nem egyenlőek - tehát nem lehet holtverseny.
     *
     * @param lossesPerMonths a veszteségek hónaponként összegyűjtve
     * @return a legtöbb veszteséget tartalmazó hónap index-száma
     */
    public static int getWorstMonthIndex(int[][] lossesPerMonths) {
        return -1;
    }

    /**
     * 10. feladat - 5p
     *
     * A harctéren az űrhajók felsorakoznak, méghozzá úgy, hogy a legerősebb hajó áll legelőre, a leggyengébb pedig leghátra.
     * Tehát az erejük szerint csökkenő sorrendben állnak fel.
     *
     * A hajók nevét és a hajók erejét külön tömbök tartalmazzák. A két tömbben az azonos indexen lévő adatok összetartoznak.
     * Például:
     *      String[] shipNames = {"Rio Grande", "Odyssey", "Wave Rider"};
     *      int[] shipPowers = {5432, 6817, 8888};
     *          tehát...
     *              Rio Grande ereje 5432
     *              Odyssey ereje 6817
     *              Wave Rider ereje 8888
     *
     * Valósítsd meg a "sortShipsByPower" nevű metódust!
     * A metódus rendezze az űrhajókat az erősségük szerint csökkenő sorrendbe.
     * A rendezés során a hajók neve és az erejük együtt mozogjon, és a metódus helyben rendezzen.
     * (Nincs szükség a tömbök clone-ozására.)
     *
     * @param shipNames az űrhajók neve
     * @param shipPowers az űrhajók ereje
     */
    public static void sortShipsByPower(String[] shipNames, int[] shipPowers) {

    }

    // --------------------------------------------------------------------------------------

    /**
     * Bónusz feladat - 5p
     *
     * A háború közben felfedeztek egy rejtélyes űrfolyosót, amely egy fekete lyuktól indul, és a végtelenbe fut.
     * Ez az űrfolyosó szakaszokból áll, amelyek között lehet teleportálni, de mindig csak előre (tehát hátrafelé nem),
     * és mindig ugyannyi szakaszt lehet átteleportálni.
     * (Tehát ha egy űrhajó belép az űrfolyosóra, és egyszer átteleportál 3 szakaszon, akkor a következő teleportálása is
     * 3 szakaszon fogja átrepíteni.)
     *
     * Két ellenséges hajó belép erre az űrfolyosóra, és elkezdenek teleportálni a szakaszokon át.
     * Szeretnének harcolni egymással. De ez csak akkor lehetséges, ha...
     *      ...ugyanazon a ponton léptek be az űrfolyosóra, vagy
     *      ...előfordul az, hogy ugyanarra a szakaszra teleportálnak.
     *
     * Például:
     *  az első hajó belépési pontja 0, és 3 szakaszt ugrik át egy teleportálással
     *  a második hajó belépési pontja 3, és 2 szakaszt ugrik át egy teleportálással
     *      - az első hajó teleportálásai:     0 3 6 9
     *      - a második hajó teleportálásai:   3 5 7 9
     *  tehát fognak harcolni, mert mindketten a harmadik teleportálásra ugyanoda érkeznek
     *
     * Másik példa:
     *  az első hajó belépési pontja 0, és 2 szakaszt ugrik át egy teleportálással
     *  a második hajó belépési pontja 1, és 4 szakaszt ugrik át egy teleportálással
     *      - az első hajó teleportálásai:     0 2 4
     *      - a második hajó teleportálásai:   1 5 9
     *  látható, hogy az első hajó hátrább indul, és kisebbet is ugrik egy teleportálással, mint a második
     *  tehát biztosan nem fognak harcolni egymással
     *
     * Valósítsd meg a "willTheyFight" metódust, amely megválaszolja, hogy fog-e harcolni a két hajó egymással vagy sem!
     *
     * Biztos lehetsz benne, hogy a belépési pontok és a teleportálások távolsága egész számok.
     *
     * @param s1 az első hajó belépési pontja
     * @param t1 az első hajó teleportálási távolsága egy teleportálásból
     * @param s2 a második hajó belépési pontja
     * @param t2 a második hajó teleportálási távolsága egy teleportálásból
     * @return fognak-e harcolni
     */
    public static boolean willTheyFight(int s1, int t1, int s2, int t2) {
        return false;
    }

}
