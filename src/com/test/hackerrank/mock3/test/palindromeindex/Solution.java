package com.test.hackerrank.mock3.test.palindromeindex;

import java.io.IOException;

class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        // Write your code here

        System.out.println(s);
        if (checkPalindrome(s)) return -1;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            String temp = sb.deleteCharAt(i).toString();
            System.out.println(temp);
            if (checkPalindrome(temp)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean checkPalindrome(String text) {
        StringBuilder sb = new StringBuilder(text);
        String reverse = sb.reverse().toString();
        return text.equals(reverse);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.palindromeIndex("madama");
//        Result.palindromeIndex("aaab");
//        Result.palindromeIndex("quyjjdcgsvvsgcdjjyq");
//        Result.palindromeIndex("lcpsklryvmcpjnbpbwllsrehfmxrkecwitrsglrexvtjmxypunbqfgxmuvgfajclfvenhyuhuorjosamibdnjdbeyhkbsombltouujdrbwcrrcgbflqpottpegrwvgajcrgwdlpgitydvhedtusippyvxsuvbvfenodqasajoyomgsqcpjlhbmdahyviuemkssdsldebesnnngpesdntrrvysuipywatpfoelthrowhfexlwdysvspwlkfblfdfultbwpiqhiymmyalcyeasvxggfitknygyvjxnspubqjppjbrlhugesmmxwjjlkrmgbnwvftyveolprfdcajiuywtvgfjrwwaakwyprxnxpypjgtlhfteetxbafkrejsfvrenlebjtccgjvrsdowiixlidxdiixpervseavnwypdinwdrlacvanhelkovkedcaxgctwysocddagwnjbkjorpceeyokeskcanvyornrustephpqtbhlrkrxlgjpavrcjpbyhosfimlavbtqcdevpwubfgshcmlofmpmektoyfquimnnqujgrgkymfjrsuixixmoihdhoveajsnanyihgsiuyrotnwtxwgmhprqhpvhyqwbgvmpefxagqqcgovenfsvummecklebihjhtylcalksfnytlfjqafoosssfhwhrfsybsldsyonecmantkhtrvkmqdsxdaqksrlnfpifevlikoxebfasdkguoyurbncvgpklfuslrhvevujwcjpiwxfnwafxojwwyhkheesxlpdjmmiqxxywwekvhpwvbtsbddihjdgwujijxqbxpcvojgkqyjoadjdgonobrwxmghwgaaepeagnhtggduihgmpvaewrbwhjggphiuymwibecjmhhvqnkhlklkfpiobquradoaplkssmdhvkfnapumdiwiahwcbtvbykdoxnkscpbycgmcyhqcrqksxjubfqdedisdwfwyuaawimchvsjojvjkhelmwqqcamhyrexpgbopnqwmmjdvfmgpqucpltrlibmagnrooheeaeqmntlugtkyopobliotkcvspojgxokxucnixyffssgkixlvicpuglpxaaeaoryjtottnbbitiseggaqlrmrecsgcyhsqicmwxhmaiwvsqdbyfskxffejxkmytfqckfbiopixnhsgkufpnqnuvrevfsuyynelthtkxfinmetyyboorflpyplgljimwmxstretyojnsdmtfeiyjtpkmdtamcmmokfkelhedqrvwfselddwauhmyboldbxtlghrrovufqtexmijrmgrjpgituuwvutjbbcvpaswqocqdmavyinlyutspqromnxpocngdhevvinaupvwbjiagcuwvolidlarqoytvfrtnhtkarhbepdkuxhqmubpjbiarjvponkexgoxbybfoeplcaeqwhjgltgddcttsgxsmosnntufxlscnxukferqxawddqwxwwqlmjcadwhdkbhxyelgjdajdwnipkgokwawieynejqokaplfbrqetcjqpuidbwnbamlenaiwqahtpubsptyjvidmdlrhjhkjtvpjvyhpbqlsmmlcgkneuqsydkimruvnqlapmjhpasioftsnehtaxnbbxlpsgniyckootvhwqplxmhlsoguovvsvjiorwarykiphhyexprweykwpssfoqaldkcuhemipvbwfcddtucxunvkiqrxhrlkdnimsuxksbjxdmexhgxevtrfmjfweqjjgrxbnvniywjflpfvxdauarcmehjiatrilpkboxmpxvujnahleiigcksgtdqvyifkbporpbhnyfamhhxlrhtwtndosukrfreihsaavknuppjwailtrfqnuuenrrfwjkitfitcujwmahkcrxvlfpybmgoexwdhhnbmwuotfohhxtlprjdyyealkrrioxqvltkkpcfwqogoirgablydpcqbtljilcgywqkourllircqlksmvtrmvjpruyagcifbarpwlbjtunkgbfuwanlvybotdqchahiccxypbkkvywecdyydonbnqpjtjlbjvjnajopkaagbamddoeidtjtlcfhlrjwpukphyhrbibcknhncoviifethjcubnrskekrgsmhdnmndvbgkyqtgupoetlihebuiomohbykonxsjbbuatqgogwubjdkphfxxupfvqrnepipslksfbbtkbqnkwxaggaebrjykbooswflirgpvjlikdvwatygaakdtvffytvrtdfevlutuicilxfntfvwhiadehidehwakceipbclkgvxebmbikxrtavaiggmndmbisjxuolhwhheltfthdmbdkdlqjahpoixitxfkkoitvmfsraauodaygmrqoyiejioegtqskyngnsyfubcledmlrfeieomowdufylyjlosbjrhhvlsaqgnklttrkiihmdpnroxffqgoknxgcrjuaygnvcfgkqoytgnlunqcexsqnrarjjnlkvygxgnkwemtkchhpblvyeoovojhawslstrsbhdanptatcjjfuhgawuvngeodyaxttswewwrotsjxeudafjaegxrncgseitxdmuhltbdpvonblqbqcdwjbpyexrihnimbftobwrrtgfwsyxldbjmcbniyisgvduyioomogekpjhkkhvoifdmirxiasqvymvjdmvrsackmluwsrldyrqijqsjljhkvfucrqvnryxgktdgnrjojcyssrefenrctmelgbbxcaeovjulbfcmhchdvlkaccdvphjxklxmneclnyyrebeodoraccceefavpktaxrpnvtymsaexbkmhyejcilgmrjljvfjtabhxuikoioolcdsbhcfrqmeivrtrafnahwxchjsrahdckwgtbllrxscvkvpmefmlennlyjdyqjecikvjxkeydiuphndlsrwafmlgvrinbmrjypuwcbvhktxrhddcwcefoqlnktdniuwjmthpvfwgywaicdnafrfvkqlunoixlhibcpqaupiwnihplupspwqaqdxeticiqkjucawapfyfngvyenttlmvertimdmuvaeqegnevsfeimahspdmdpkhifrwkhtghxyleoschxgpmiyfbetgvfogmidwpwfwweldsgicgqttcubdbxjwfaetjjqyjxygckmwqubylusprwsswfrehvxqiosrmraqempwjqvxnrnfohanorrvqppygiquaqnegdbptwnjqcqhlquakoxbencmvshxmuesahkvfyfxdxgoobqcqofwfikbbtcppgirotovuvtxuaolefnuvttbceffyhvqngiecyayvwwqwlcbsqxpmsqqyvvxftqvbcafbdfwaenwssbllbbxtuovsmvyhnukpwrsawsaeiawbdimemmbhbwcqsbaixmaxetxembiwdfyinlocbpjeomukpusqhvooposerdbwicfxqwbromvebtqtojkyfbpwridmnhlvltvcqyvfmslpmcjdovevwtvreygrirpwlmyclviaqvqfyaknwpjvlfpqhvkrobocpqfdopeflwmmwwavokubrkryjetaficuyjynyfunchabhbxvnuwhhqjqvdqdnvbnfcdhhbuliumrxmonhnxphhidmciaxjpdlvkuwhghfvadiotserklbuqnwanulgbxcnuyxegdagikwefcvppwnhmkhbishlsjbokysqcuxnfwrnyqfppsydeggobpawbbnlbicfdcskalxbcgsryrwdxdrcstbtvofywkecmaoolpqpvjjuchbckuggphanvimusqyhqqwegnveygbbpcgcamipulfsvrqokrxeiuiqkhwmpynfdvjdjuugiabetrufmsjwqtoddnpsmgaqcmvnhrtptvtopovcjfaabqgfevaredkhpgwwarounildyhgioilryrydpawwfhguqdrquinkqyoriwcwhnrghqlasjwxsfujiodewqopsfhbekblautklgmhrlhkqdwyrafpswfleppjaswcnrmyxbipmqcdvbfndkfwjlkodcafuwhiowkmxselljohktvqhdnqqahtdhyafhjtgtjeoppbbhimdgdkksebulvatubbemukggpuyhxaqhouprhamnekcakvwnyeavogdgeeqcehltecnoedeingkaekodooadxfmejdinmujtyxiddmoqvysajhexyeewjqduvliiiuchumnxccqxdjanrensktrvmuqigctpwxyrnmppogpurpilwxehuvehswscyotvospciftynjticetydyixwohsmaunqomgjcirkfraqlisqdtvedvdrfveissyjhftjqntvhwotfimkekohiuanqgvmbvvidrutgqrnnjjttxgxixgqsihlqdxsbudfmxbupvjdfuyytiwcgfvyndkhilakidpweqstmeytybsujsarxvqobdvjqxtydlwjdpdrvfowihstcsldqerrhpdypxaujwfookjkpxkahdtkvhnmlhgtyjuqjulvuqmlcvytvjugmqqkygympfgqqdhbbswxmljokikgthmiyfsanrmdyvtqbdtewscjeoaoykxtsmctuvvipkorgkikoeonwrydgysflsbgfecccaltlcltmtebxtqwnpbvqvdfoflvlqynqmheovybpffqbvpomqmdoqifxwclpdbipinegohwtmpvjhmvbabpsmvslaeddflspbywpgvktngfusdvueonskigkmjprviiwjhnpdajqioldtkyyyotjxbvkklfivpgfwvwaxjsgagjuqktpapbaqykcmrmihspeqngowyuyghtwrpprgsrwsfbfwoqhjgldvurutpucwocofrjlkdkfkolkfcrokfrjamewcbybqbrxublihvnrmberfvhqcbcengbrkdsdglbeommvkcqaeurjrycvdeaqnelxhebnperfsgdfjtfprxbjyghckjvanhxunblgffnxmqexnjpfhqqjwxlkjjkxsluhminsobsdtybjjsosjhcjhqtrcgpvrmfhvsckvupruqcglsbubegkwccyltwdhcmfwopumfnjxrpjmqgpwpbvrfvfasjjxxoungqcnglnadymvhdtwerrlnwljiwhhnewtubjdmwdrvqnevjbccunrscddykkprjjokvsysxqpqhvmsyquufpphssiggxxrkodghcygvqydomxodvlklbrgvdoebowlectlgttcmthcigsnceyphsvfxlkaajnelisteoyskgwsopjstikbdjjcwveyfteseymkplebubtlrfhnprrtdbxawcacxgwdflnuxrvuvsipapdqkumnxkouoqymwvpckgykaxfvsplsgrlsoxiniyiypkomieqsmsdnqkjlbxgjpsceqkrcmdbcnppxwgrjyuyrijfjjmsyhwfxjacvfgyuxqswwkhyigsqrycbnwcutkudkacpgdmetfcssltdtnvooxreuubqfxvrxxjebvlwdpqvdkyyawnougsrdvikuhcsflajjngmdylikmhkkvchewcjtmtotxhclhluutjatuieisquoscuqeemrablxipjsbepxpsrldxtvqomkshdxnprnsfndvwvydowthohmobjgrvsmgxmtpekimankxkjdbhykxgwpjgxddqqlqdhgktqwuehuqsxtaxebecsqkqtphkbaojibdbxxhhsyatsdtagaeyqoplfyviymtjnxknxrutsxpmdjojjskbhcmobkxcxtllrxaspwojwexapmlyhvcoxqgbcgfaasnuqppjpesmkspafbbmxgdxwlcyrhbubrpthfdylxmxqcaxfdmdjqehcgiwpkrscjplqslcraakecjjfvppovytehqtrkpvtfkkaxorxqfcsonxkdpcbovfwmaqwrpswadwxtrxkwcfnpdavvcwkxdhmfblwqevqjuqdoopnqubgbeewgchhhrtosgljkjcwesathshxnlgqplnvpxdwpanigbtskvpqoskxluvbiesxpgvhecgvctgkuadfxtyoolmagkdopvohflrlnxirsqcprfxrbwjpivrrjvibtxkyjclybvqvoslixlbcikrtimlritucrgedirclpuhenvnohoqsbkmjyaehtymofqtqkycatmekkrytirmjebvebanxbamjsgadfedcqkmbclxnfkwlouppugnwicgcjihqmnsexfhcshpaspohkgygmpfvrnabvhukupqsxbvsilvbdkkoqmweccatraxpjuafkraisvebkafnkrebebhidjdxwldmvxnbkfdvxaabmagcmbhpfixqohtltyyrymujtxftahumhervfymmjkdxtympxnhwccjvborbymqisifxjrnseqtxqgqqtxqxdatgqnjpaayvkevtxjpcbjctrskntdlwdhduummwplsarrwpbmtexwarrnflqskuaprwdetuqpwihvbkkupitramfhawaltcblygptdilbtsyudkpuuknvwufyrgmnkqykwrgdcrgvmfqpphnlrdjqxorswfgkviuucbxeuebhmrwcbmpupbnqsgjplrahcweeadjujmcvecbiqsdhuranxjfldiugfymgevdokimpkpabjdkewkruvwicfdinduvjtyxehnvtdvxocisyvmwtmfvtjehocdxxfyeombjryhhbrcdppakcfgvqngfrlgpsftitwtnwduawadnrfxtngretakloqdhxxprwlfvodwmfcawkasxgmcdnoqchulfucyrphofmnrrrtqcvjacxfhltypetcjoglivuwdhmwbfsthodktbpbplchpvlcmtnvskuvtivupoqwetjxwbbonewdckhpfwnxhkvburxkhoklktlkvoylsxqxjynqvdognkhjfitmwgakbnuycvkxubxgalwyqnfgaorfwotwuvhvjeuoahowjmfjaeisrpyufraciwbdsicfoytrhkoqwwcybnrvdqqkksnspowlabqqamihwaatwdsaqkvvdmhogwjxnijpjchkortlruhqxcrqoposdvjlusljcxbnaixpbsbunjonngedvuvbtfooadaebcsdmssplwlbiaoviuygsukmcbbfeelhieluaelldyplbgilejtwhejlimqosdwbjiwjokxulpgovqccbvbkdmvlapcuuywejvqbgqvtgeievkhyiijlvhyxwcsrdrwnnpqtgmpoqxsokcptlbhjjhjglcbowackpshxhwmbxhrikiexlohuvqejufxrfddwxmugjjjjqbubjyyvngslyyuwevqlyviwiffsoocgqwhcyjaorvdruaqavhnweyumechvrmcijlmkuncpjfhefagehwblvxycbgxusafforrlhtbsykahkglsfogbnfeqocnjfsqvkjhudlnfvnojwaecqkegqkyhomqtfkpstanyldghrusqwwsqiywblwibjburlnmhnajyfriyncpmbjdjkdkwauxlwufkiruxtgwaxiynmpbnbgxnjkklgkafgfrqxmptumttwvhjnkxorxcdippoartgwmxwbptwcnsclalynlnhjsmskejkvgtvstsvjoundnpoqeqepenayaujfewbkqwfmsevhylmncegiumxbaadcuohallmeksqfwopxbenfitnfgnjioonjdulpiyvvtnbsessfxhmidcqmqaufoiqtgfjqegmavquajnihuwqyahlsjiaatqtcxgscogemwymgnwqiujjwswpcgpecixehgwlufqjerwnfveqspcpiafmiwqkiqqrapfwvxhaqgpxcvovltltttgesyodsfusudrsbyvrflsiijgtdrqwnydjbrmvykqwniroinjncexmneirybqobuxeolaqvqnlyhchxlxapvogdwxebqsclrgddgtbwjoxqqgofgqwehdhhdliufmiyslebffaqvximgytmsrrcwyjbnrxuegtysxcafcrbbcpjdkwxeobbpkeffcaljtnerpgysaavcqfideghuhinunscrvnbrbhktolmomktfrciwkptuahrpdtiyjlqntdhkpvbegujaytwkjthlbycesmfeawrtcbgrwivffhgfbfrmyyybadhsrnyrmroosujqfhxlpesskkgllholmwgemfvyympskylphldyqvrdixovhejtdrxpxwqylgrvgfoprrokqgpbheaqkjlpclfckxbwfvsndjdwerjuayxjgxbqkmhoaoqlntispdivnlstfdohcorkpuccjlqjajwpdfkvlsrbemulrltwcnhrijtrwkdxvbpaibvttpwbermwfitivbaenwxkjekgfbgncekxvhyacmwhusprwsxkpywydkhknpapvkprupuwcrgynyskrtujstkxesiriijfvawqptptoxscwomqijabflbkejeototpqtiinaccywgxlsptepwkdxuhhbwepstimfqdfuhgsofgjubomayqyvaiwympsjxhqrmxmufhjkoshrjtrimsgncgmqvfcvpunctdwykilycsqlolwcedpilcchkggacvcvyawkkilmbfbpqatufjgroibyohyqgdofflrqtgfwlgpcijyovhgkphjhrkxxppfvbaoxgturdmvlywcufifwsqekdfksupqxrhvxetrhgpufnxaughtbxyndgxydqrbiaxherbnxrighigerqxsoyhuhftkxnmhpkqterjclskubryuiaoyyvvjdrtegglvseswxcckwmfbehvohkqiimrofmslugjomclkfnwebffhmcytopexcyohljuipfwcjloqymvcrbkeflaubgudfjnsskckryoemdumpqqhudnaopwpwtvcdlvxvxkqyyumfpbujrfgxuimlgdiabkgmigkitbiuxwaqxxarfgpaofnwkxalliatokdiongokgfkefelnumfcccmbcxmkxgcklmbysqlcvvieburxjyalcomgmytmixwtmytirfknesthnohwnjlrxxykauyiuvehwapogcfmvytlndlemwvkwwwwrvhotmytooiurpjprfbhimlulihjfeiacsowfpqvfbrytdoljrurfhpspwcwelwieohlexhlcbmxfblqvgidnxvfvyfcmeksssgaspnwrbuyegpcpaffyclwbqbpuliqgqsagiyaluysdquutbbsdorghuxegiupyppfbogmlhfrbdmueppjehplcnqkxnawgrchjkvuucovfeqltguypmmtcdeathwaybhimfghjwfqbvcvewwtjjnlntnjbkjdmslbxtkirpysleqpdnlnxybnspwwciaobnrbiclcrlufrowucikcjmrfeociyeaarrecwpeqdcwuqvquhbxsppxvhcfggfjbwndvdknhmmcdksxrwxlmoljxooewvnxuberhofobrsgcogwlfkavvjtkaxkvoirrmlydqpeklmoatnnyxnwuaqhcqrbhbuapgytwrajdnadhosimifhkxpnqhoyklydrawqryawmactoueegllqjdebnucagbdadcqxcsuotxlkupqbcfsniyqxwsyfvcgafyxhsuxoujbqcstgxotiolhngisdmbfrbfbtackvllonekteaqpqewekhyptbuocarxdtibgvrvdcshejwupvbaddqaenoiqiitdsuloohrqcavnysdxwebawdgmtoddyygrvrgkbycgbatcuxatcetbhcncqtfrsnjphqckreqsgluejxxncsqjwgnoauivisnrjpdbwvvfhsjsqiisdyfagsqioaeysrrekwhhsfmdxwvrhfmkgrmmlevcgcdywufhtmqprdsrcqjjxwvfqlteppgxukyrhebesrtkumeadqlepkjgvdlnvtlqgkkoqlsjdovabaagsmkiytruadkvyvogiywykringenjgqpafdieyayyflwhhlnrkmqugbkofyxlrplwswbuyctfnrowdeoqqfnygynnanbrdpoymrvntpujjjgnnuggctfkssauiboosdpfwlvqbqalbibqfjxjddtyyv");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                int result = Result.palindromeIndex(s);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}