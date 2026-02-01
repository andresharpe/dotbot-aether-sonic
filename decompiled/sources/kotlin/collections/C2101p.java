package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Pair;
import kotlin.comparisons.g;
import kotlin.jvm.internal.C2185h;
import kotlin.jvm.internal.C2186i;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.t0;
import kotlin.x0;

@kotlin.jvm.internal.U({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24423:1\n12524#1,2:24424\n12534#1,2:24426\n1282#1,2:24428\n1290#1,2:24430\n1298#1,2:24432\n1306#1,2:24434\n1314#1,2:24436\n1322#1,2:24438\n1330#1,2:24440\n1338#1,2:24442\n1346#1,2:24444\n2298#1,5:24446\n2311#1,5:24451\n2324#1,5:24456\n2337#1,5:24461\n2350#1,5:24466\n2363#1,5:24471\n2376#1,5:24476\n2389#1,5:24481\n2402#1,5:24486\n4307#1,2:24492\n4317#1,2:24494\n4327#1,2:24496\n4337#1,2:24498\n4347#1,2:24500\n4357#1,2:24502\n4367#1,2:24504\n4377#1,2:24506\n4387#1,2:24508\n3974#1:24510\n13374#1,2:24511\n3975#1,2:24513\n13376#1:24515\n3977#1:24516\n3988#1:24517\n13384#1,2:24518\n3989#1,2:24520\n13386#1:24522\n3991#1:24523\n4002#1:24524\n13394#1,2:24525\n4003#1,2:24527\n13396#1:24529\n4005#1:24530\n4016#1:24531\n13404#1,2:24532\n4017#1,2:24534\n13406#1:24536\n4019#1:24537\n4030#1:24538\n13414#1,2:24539\n4031#1,2:24541\n13416#1:24543\n4033#1:24544\n4044#1:24545\n13424#1,2:24546\n4045#1,2:24548\n13426#1:24550\n4047#1:24551\n4058#1:24552\n13434#1,2:24553\n4059#1,2:24555\n13436#1:24557\n4061#1:24558\n4072#1:24559\n13444#1,2:24560\n4073#1,2:24562\n13446#1:24564\n4075#1:24565\n4086#1:24566\n13454#1,2:24567\n4087#1,2:24569\n13456#1:24571\n4089#1:24572\n13374#1,3:24573\n13384#1,3:24576\n13394#1,3:24579\n13404#1,3:24582\n13414#1,3:24585\n13424#1,3:24588\n13434#1,3:24591\n13444#1,3:24594\n13454#1,3:24597\n4107#1,2:24600\n4217#1,2:24602\n4227#1,2:24604\n4237#1,2:24606\n4247#1,2:24608\n4257#1,2:24610\n4267#1,2:24612\n4277#1,2:24614\n4287#1,2:24616\n4297#1,2:24618\n9088#1,4:24620\n9103#1,4:24624\n9118#1,4:24628\n9133#1,4:24632\n9148#1,4:24636\n9163#1,4:24640\n9178#1,4:24644\n9193#1,4:24648\n9208#1,4:24652\n8801#1,4:24656\n8817#1,4:24660\n8833#1,4:24664\n8849#1,4:24668\n8865#1,4:24672\n8881#1,4:24676\n8897#1,4:24680\n8913#1,4:24684\n8929#1,4:24688\n8945#1,4:24692\n8961#1,4:24696\n8977#1,4:24700\n8993#1,4:24704\n9009#1,4:24708\n9025#1,4:24712\n9041#1,4:24716\n9057#1,4:24720\n9073#1,4:24724\n9376#1,4:24728\n10394#1,5:24732\n10405#1,5:24737\n10416#1,5:24742\n10427#1,5:24747\n10438#1,5:24752\n10449#1,5:24757\n10460#1,5:24762\n10471#1,5:24767\n10482#1,5:24772\n10497#1,5:24777\n10738#1,3:24782\n10741#1,3:24792\n10755#1,3:24795\n10758#1,3:24805\n10772#1,3:24808\n10775#1,3:24818\n10789#1,3:24821\n10792#1,3:24831\n10806#1,3:24834\n10809#1,3:24844\n10823#1,3:24847\n10826#1,3:24857\n10840#1,3:24860\n10843#1,3:24870\n10857#1,3:24873\n10860#1,3:24883\n10874#1,3:24886\n10877#1,3:24896\n10892#1,3:24899\n10895#1,3:24909\n10910#1,3:24912\n10913#1,3:24922\n10928#1,3:24925\n10931#1,3:24935\n10946#1,3:24938\n10949#1,3:24948\n10964#1,3:24951\n10967#1,3:24961\n10982#1,3:24964\n10985#1,3:24974\n11000#1,3:24977\n11003#1,3:24987\n11018#1,3:24990\n11021#1,3:25000\n11036#1,3:25003\n11039#1,3:25013\n11400#1,3:25142\n11410#1,3:25145\n11420#1,3:25148\n11430#1,3:25151\n11440#1,3:25154\n11450#1,3:25157\n11460#1,3:25160\n11470#1,3:25163\n11480#1,3:25166\n11266#1,4:25169\n11279#1,4:25173\n11292#1,4:25177\n11305#1,4:25181\n11318#1,4:25185\n11331#1,4:25189\n11344#1,4:25193\n11357#1,4:25197\n11370#1,4:25201\n11255#1:25205\n13374#1,2:25206\n13376#1:25209\n11256#1:25210\n13374#1,3:25211\n11391#1:25214\n13309#1:25215\n13310#1:25217\n11392#1:25218\n13309#1,2:25219\n13374#1,3:25221\n13384#1,3:25224\n13394#1,3:25227\n13404#1,3:25230\n13414#1,3:25233\n13424#1,3:25236\n13434#1,3:25239\n13444#1,3:25242\n13454#1,3:25245\n20623#1,2:25248\n20625#1,6:25251\n20839#1,2:25257\n20841#1,6:25260\n23035#1,6:25266\n23051#1,6:25272\n23067#1,6:25278\n23083#1,6:25284\n23099#1,6:25290\n23115#1,6:25296\n23131#1,6:25302\n23147#1,6:25308\n23163#1,6:25314\n23269#1,8:25320\n23287#1,8:25328\n23305#1,8:25336\n23323#1,8:25344\n23341#1,8:25352\n23359#1,8:25360\n23377#1,8:25368\n23395#1,8:25376\n23413#1,8:25384\n23511#1,6:25392\n23527#1,6:25398\n23543#1,6:25404\n23559#1,6:25410\n23575#1,6:25416\n23591#1,6:25422\n23607#1,6:25428\n23623#1,6:25434\n1#2:24491\n1#2:25208\n1#2:25216\n1#2:25250\n1#2:25259\n372#3,7:24785\n372#3,7:24798\n372#3,7:24811\n372#3,7:24824\n372#3,7:24837\n372#3,7:24850\n372#3,7:24863\n372#3,7:24876\n372#3,7:24889\n372#3,7:24902\n372#3,7:24915\n372#3,7:24928\n372#3,7:24941\n372#3,7:24954\n372#3,7:24967\n372#3,7:24980\n372#3,7:24993\n372#3,7:25006\n372#3,7:25016\n372#3,7:25023\n372#3,7:25030\n372#3,7:25037\n372#3,7:25044\n372#3,7:25051\n372#3,7:25058\n372#3,7:25065\n372#3,7:25072\n372#3,7:25079\n372#3,7:25086\n372#3,7:25093\n372#3,7:25100\n372#3,7:25107\n372#3,7:25114\n372#3,7:25121\n372#3,7:25128\n372#3,7:25135\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n556#1:24424,2\n565#1:24426,2\n832#1:24428,2\n842#1:24430,2\n852#1:24432,2\n862#1:24434,2\n872#1:24436,2\n882#1:24438,2\n892#1:24440,2\n902#1:24442,2\n912#1:24444,2\n922#1:24446,5\n932#1:24451,5\n942#1:24456,5\n952#1:24461,5\n962#1:24466,5\n972#1:24471,5\n982#1:24476,5\n992#1:24481,5\n1002#1:24486,5\n3792#1:24492,2\n3801#1:24494,2\n3810#1:24496,2\n3819#1:24498,2\n3828#1:24500,2\n3837#1:24502,2\n3846#1:24504,2\n3855#1:24506,2\n3864#1:24508,2\n3875#1:24510\n3875#1:24511,2\n3875#1:24513,2\n3875#1:24515\n3875#1:24516\n3886#1:24517\n3886#1:24518,2\n3886#1:24520,2\n3886#1:24522\n3886#1:24523\n3897#1:24524\n3897#1:24525,2\n3897#1:24527,2\n3897#1:24529\n3897#1:24530\n3908#1:24531\n3908#1:24532,2\n3908#1:24534,2\n3908#1:24536\n3908#1:24537\n3919#1:24538\n3919#1:24539,2\n3919#1:24541,2\n3919#1:24543\n3919#1:24544\n3930#1:24545\n3930#1:24546,2\n3930#1:24548,2\n3930#1:24550\n3930#1:24551\n3941#1:24552\n3941#1:24553,2\n3941#1:24555,2\n3941#1:24557\n3941#1:24558\n3952#1:24559\n3952#1:24560,2\n3952#1:24562,2\n3952#1:24564\n3952#1:24565\n3963#1:24566\n3963#1:24567,2\n3963#1:24569,2\n3963#1:24571\n3963#1:24572\n3974#1:24573,3\n3988#1:24576,3\n4002#1:24579,3\n4016#1:24582,3\n4030#1:24585,3\n4044#1:24588,3\n4058#1:24591,3\n4072#1:24594,3\n4086#1:24597,3\n4098#1:24600,2\n4117#1:24602,2\n4126#1:24604,2\n4135#1:24606,2\n4144#1:24608,2\n4153#1:24610,2\n4162#1:24612,2\n4171#1:24614,2\n4180#1:24616,2\n4189#1:24618,2\n8407#1:24620,4\n8422#1:24624,4\n8437#1:24628,4\n8452#1:24632,4\n8467#1:24636,4\n8482#1:24640,4\n8497#1:24644,4\n8512#1:24648,4\n8527#1:24652,4\n8542#1:24656,4\n8557#1:24660,4\n8572#1:24664,4\n8587#1:24668,4\n8602#1:24672,4\n8617#1:24676,4\n8632#1:24680,4\n8647#1:24684,4\n8662#1:24688,4\n8676#1:24692,4\n8690#1:24696,4\n8704#1:24700,4\n8718#1:24704,4\n8732#1:24708,4\n8746#1:24712,4\n8760#1:24716,4\n8774#1:24720,4\n8788#1:24724,4\n9227#1:24728,4\n9972#1:24732,5\n9981#1:24737,5\n9990#1:24742,5\n9999#1:24747,5\n10008#1:24752,5\n10017#1:24757,5\n10026#1:24762,5\n10035#1:24767,5\n10044#1:24772,5\n10057#1:24777,5\n10513#1:24782,3\n10513#1:24792,3\n10525#1:24795,3\n10525#1:24805,3\n10537#1:24808,3\n10537#1:24818,3\n10549#1:24821,3\n10549#1:24831,3\n10561#1:24834,3\n10561#1:24844,3\n10573#1:24847,3\n10573#1:24857,3\n10585#1:24860,3\n10585#1:24870,3\n10597#1:24873,3\n10597#1:24883,3\n10609#1:24886,3\n10609#1:24896,3\n10622#1:24899,3\n10622#1:24909,3\n10635#1:24912,3\n10635#1:24922,3\n10648#1:24925,3\n10648#1:24935,3\n10661#1:24938,3\n10661#1:24948,3\n10674#1:24951,3\n10674#1:24961,3\n10687#1:24964,3\n10687#1:24974,3\n10700#1:24977,3\n10700#1:24987,3\n10713#1:24990,3\n10713#1:25000,3\n10726#1:25003,3\n10726#1:25013,3\n11065#1:25142,3\n11075#1:25145,3\n11085#1:25148,3\n11095#1:25151,3\n11105#1:25154,3\n11115#1:25157,3\n11125#1:25160,3\n11135#1:25163,3\n11145#1:25166,3\n11155#1:25169,4\n11165#1:25173,4\n11175#1:25177,4\n11185#1:25181,4\n11195#1:25185,4\n11205#1:25189,4\n11215#1:25193,4\n11225#1:25197,4\n11235#1:25201,4\n11245#1:25205\n11245#1:25206,2\n11245#1:25209\n11245#1:25210\n11255#1:25211,3\n11383#1:25214\n11383#1:25215\n11383#1:25217\n11383#1:25218\n11391#1:25219,2\n18891#1:25221,3\n18903#1:25224,3\n18915#1:25227,3\n18927#1:25230,3\n18939#1:25233,3\n18951#1:25236,3\n18963#1:25239,3\n18975#1:25242,3\n18987#1:25245,3\n21455#1:25248,2\n21455#1:25251,6\n21617#1:25257,2\n21617#1:25260,6\n22944#1:25266,6\n22954#1:25272,6\n22964#1:25278,6\n22974#1:25284,6\n22984#1:25290,6\n22994#1:25296,6\n23004#1:25302,6\n23014#1:25308,6\n23024#1:25314,6\n23178#1:25320,8\n23188#1:25328,8\n23198#1:25336,8\n23208#1:25344,8\n23218#1:25352,8\n23228#1:25360,8\n23238#1:25368,8\n23248#1:25376,8\n23258#1:25384,8\n23430#1:25392,6\n23440#1:25398,6\n23450#1:25404,6\n23460#1:25410,6\n23470#1:25416,6\n23480#1:25422,6\n23490#1:25428,6\n23500#1:25434,6\n11245#1:25208\n11383#1:25216\n21455#1:25250\n21617#1:25259\n10513#1:24785,7\n10525#1:24798,7\n10537#1:24811,7\n10549#1:24824,7\n10561#1:24837,7\n10573#1:24850,7\n10585#1:24863,7\n10597#1:24876,7\n10609#1:24889,7\n10622#1:24902,7\n10635#1:24915,7\n10648#1:24928,7\n10661#1:24941,7\n10674#1:24954,7\n10687#1:24967,7\n10700#1:24980,7\n10713#1:24993,7\n10726#1:25006,7\n10740#1:25016,7\n10757#1:25023,7\n10774#1:25030,7\n10791#1:25037,7\n10808#1:25044,7\n10825#1:25051,7\n10842#1:25058,7\n10859#1:25065,7\n10876#1:25072,7\n10894#1:25079,7\n10912#1:25086,7\n10930#1:25093,7\n10948#1:25100,7\n10966#1:25107,7\n10984#1:25114,7\n11002#1:25121,7\n11020#1:25128,7\n11038#1:25135,7\n*E\n"})
/* renamed from: kotlin.collections.p */
/* loaded from: classes2.dex */
public class C2101p extends C2100o {

    /* renamed from: kotlin.collections.p$A */
    /* loaded from: classes2.dex */
    static final class A extends Lambda implements X2.a<Iterator<? extends Boolean>> {

        /* renamed from: F */
        final /* synthetic */ boolean[] f51964F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(boolean[] zArr) {
            super(0);
            this.f51964F = zArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Boolean> n() {
            return C2186i.a(this.f51964F);
        }
    }

    /* renamed from: kotlin.collections.p$B */
    /* loaded from: classes2.dex */
    static final class B extends Lambda implements X2.a<Iterator<? extends Character>> {

        /* renamed from: F */
        final /* synthetic */ char[] f51965F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(char[] cArr) {
            super(0);
            this.f51965F = cArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Character> n() {
            return C2186i.c(this.f51965F);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23966#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$a */
    /* loaded from: classes2.dex */
    public static final class C2102a<T> implements Iterable<T>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ Object[] f51966E;

        public C2102a(Object[] objArr) {
            this.f51966E = objArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<T> iterator() {
            return C2185h.a(this.f51966E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23974#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$b */
    /* loaded from: classes2.dex */
    public static final class C2103b implements Iterable<Byte>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ byte[] f51967E;

        public C2103b(byte[] bArr) {
            this.f51967E = bArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Byte> iterator() {
            return C2186i.b(this.f51967E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23982#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$c */
    /* loaded from: classes2.dex */
    public static final class c implements Iterable<Short>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ short[] f51968E;

        public c(short[] sArr) {
            this.f51968E = sArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Short> iterator() {
            return C2186i.h(this.f51968E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23990#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$d */
    /* loaded from: classes2.dex */
    public static final class d implements Iterable<Integer>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ int[] f51969E;

        public d(int[] iArr) {
            this.f51969E = iArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Integer> iterator() {
            return C2186i.f(this.f51969E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23998#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$e */
    /* loaded from: classes2.dex */
    public static final class e implements Iterable<Long>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ long[] f51970E;

        public e(long[] jArr) {
            this.f51970E = jArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Long> iterator() {
            return C2186i.g(this.f51970E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24006#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$f */
    /* loaded from: classes2.dex */
    public static final class f implements Iterable<Float>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ float[] f51971E;

        public f(float[] fArr) {
            this.f51971E = fArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Float> iterator() {
            return C2186i.e(this.f51971E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24014#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$g */
    /* loaded from: classes2.dex */
    public static final class g implements Iterable<Double>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ double[] f51972E;

        public g(double[] dArr) {
            this.f51972E = dArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Double> iterator() {
            return C2186i.d(this.f51972E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24022#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$h */
    /* loaded from: classes2.dex */
    public static final class h implements Iterable<Boolean>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ boolean[] f51973E;

        public h(boolean[] zArr) {
            this.f51973E = zArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Boolean> iterator() {
            return C2186i.a(this.f51973E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24030#2:71\n*E\n"})
    /* renamed from: kotlin.collections.p$i */
    /* loaded from: classes2.dex */
    public static final class i implements Iterable<Character>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ char[] f51974E;

        public i(char[] cArr) {
            this.f51974E = cArr;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Character> iterator() {
            return C2186i.c(this.f51974E);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24040#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$j */
    /* loaded from: classes2.dex */
    public static final class j<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f51975a;

        public j(Object[] objArr) {
            this.f51975a = objArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            return C2185h.a(this.f51975a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24050#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$k */
    /* loaded from: classes2.dex */
    public static final class k implements kotlin.sequences.m<Byte> {

        /* renamed from: a */
        final /* synthetic */ byte[] f51976a;

        public k(byte[] bArr) {
            this.f51976a = bArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Byte> iterator() {
            return C2186i.b(this.f51976a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24060#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$l */
    /* loaded from: classes2.dex */
    public static final class l implements kotlin.sequences.m<Short> {

        /* renamed from: a */
        final /* synthetic */ short[] f51977a;

        public l(short[] sArr) {
            this.f51977a = sArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Short> iterator() {
            return C2186i.h(this.f51977a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24070#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$m */
    /* loaded from: classes2.dex */
    public static final class m implements kotlin.sequences.m<Integer> {

        /* renamed from: a */
        final /* synthetic */ int[] f51978a;

        public m(int[] iArr) {
            this.f51978a = iArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Integer> iterator() {
            return C2186i.f(this.f51978a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24080#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$n */
    /* loaded from: classes2.dex */
    public static final class n implements kotlin.sequences.m<Long> {

        /* renamed from: a */
        final /* synthetic */ long[] f51979a;

        public n(long[] jArr) {
            this.f51979a = jArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Long> iterator() {
            return C2186i.g(this.f51979a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24090#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$o */
    /* loaded from: classes2.dex */
    public static final class o implements kotlin.sequences.m<Float> {

        /* renamed from: a */
        final /* synthetic */ float[] f51980a;

        public o(float[] fArr) {
            this.f51980a = fArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Float> iterator() {
            return C2186i.e(this.f51980a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24100#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$p */
    /* loaded from: classes2.dex */
    public static final class C0457p implements kotlin.sequences.m<Double> {

        /* renamed from: a */
        final /* synthetic */ double[] f51981a;

        public C0457p(double[] dArr) {
            this.f51981a = dArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Double> iterator() {
            return C2186i.d(this.f51981a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24110#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$q */
    /* loaded from: classes2.dex */
    public static final class q implements kotlin.sequences.m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean[] f51982a;

        public q(boolean[] zArr) {
            this.f51982a = zArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Boolean> iterator() {
            return C2186i.a(this.f51982a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24120#2:681\n*E\n"})
    /* renamed from: kotlin.collections.p$r */
    /* loaded from: classes2.dex */
    public static final class r implements kotlin.sequences.m<Character> {

        /* renamed from: a */
        final /* synthetic */ char[] f51983a;

        public r(char[] cArr) {
            this.f51983a = cArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Character> iterator() {
            return C2186i.c(this.f51983a);
        }
    }

    @kotlin.jvm.internal.U({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt$groupingBy$1\n*L\n1#1,24423:1\n*E\n"})
    /* renamed from: kotlin.collections.p$s */
    /* loaded from: classes2.dex */
    public static final class s<K, T> implements I<T, K> {

        /* renamed from: a */
        final /* synthetic */ T[] f51984a;

        /* renamed from: b */
        final /* synthetic */ X2.l<T, K> f51985b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(T[] tArr, X2.l<? super T, ? extends K> lVar) {
            this.f51984a = tArr;
            this.f51985b = lVar;
        }

        @Override // kotlin.collections.I
        public K a(T t3) {
            return this.f51985b.C(t3);
        }

        @Override // kotlin.collections.I
        @l3.d
        public Iterator<T> b() {
            return C2185h.a(this.f51984a);
        }
    }

    /* renamed from: kotlin.collections.p$t */
    /* loaded from: classes2.dex */
    static final class t<T> extends Lambda implements X2.a<Iterator<? extends T>> {

        /* renamed from: F */
        final /* synthetic */ T[] f51986F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(T[] tArr) {
            super(0);
            this.f51986F = tArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<T> n() {
            return C2185h.a(this.f51986F);
        }
    }

    /* renamed from: kotlin.collections.p$u */
    /* loaded from: classes2.dex */
    static final class u extends Lambda implements X2.a<Iterator<? extends Byte>> {

        /* renamed from: F */
        final /* synthetic */ byte[] f51987F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(byte[] bArr) {
            super(0);
            this.f51987F = bArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Byte> n() {
            return C2186i.b(this.f51987F);
        }
    }

    /* renamed from: kotlin.collections.p$v */
    /* loaded from: classes2.dex */
    static final class v extends Lambda implements X2.a<Iterator<? extends Short>> {

        /* renamed from: F */
        final /* synthetic */ short[] f51988F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(short[] sArr) {
            super(0);
            this.f51988F = sArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Short> n() {
            return C2186i.h(this.f51988F);
        }
    }

    /* renamed from: kotlin.collections.p$w */
    /* loaded from: classes2.dex */
    static final class w extends Lambda implements X2.a<Iterator<? extends Integer>> {

        /* renamed from: F */
        final /* synthetic */ int[] f51989F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int[] iArr) {
            super(0);
            this.f51989F = iArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Integer> n() {
            return C2186i.f(this.f51989F);
        }
    }

    /* renamed from: kotlin.collections.p$x */
    /* loaded from: classes2.dex */
    static final class x extends Lambda implements X2.a<Iterator<? extends Long>> {

        /* renamed from: F */
        final /* synthetic */ long[] f51990F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(long[] jArr) {
            super(0);
            this.f51990F = jArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Long> n() {
            return C2186i.g(this.f51990F);
        }
    }

    /* renamed from: kotlin.collections.p$y */
    /* loaded from: classes2.dex */
    static final class y extends Lambda implements X2.a<Iterator<? extends Float>> {

        /* renamed from: F */
        final /* synthetic */ float[] f51991F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(float[] fArr) {
            super(0);
            this.f51991F = fArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Float> n() {
            return C2186i.e(this.f51991F);
        }
    }

    /* renamed from: kotlin.collections.p$z */
    /* loaded from: classes2.dex */
    static final class z extends Lambda implements X2.a<Iterator<? extends Double>> {

        /* renamed from: F */
        final /* synthetic */ double[] f51992F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(double[] dArr) {
            super(0);
            this.f51992F = dArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<Double> n() {
            return C2186i.d(this.f51992F);
        }
    }

    @l3.d
    public static final Iterable<Long> A5(@l3.d long[] jArr) {
        List H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new e(jArr);
    }

    @l3.d
    public static final <T, K, M extends Map<? super K, ? super T>> M A6(@l3.d T[] tArr, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (T t3 : tArr) {
            destination.put(keySelector.C(t3), t3);
        }
        return destination;
    }

    @kotlin.internal.f
    private static final short A7(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr[0];
    }

    public static final int A8(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Float> A9(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int te = te(fArr); -1 < te; te--) {
            if (!predicate.C(Float.valueOf(fArr[te])).booleanValue()) {
                return xx(fArr, te + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <V> List<V> AA(@l3.d short[] sArr, @l3.d short[] other, @l3.d X2.p<? super Short, ? super Short, ? extends V> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Short.valueOf(sArr[i4]), Short.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Character>> C Aa(@l3.d char[] cArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            char c4 = cArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Character.valueOf(c4)).booleanValue()) {
                destination.add(Character.valueOf(c4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final Float Ab(float[] fArr, X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                float f4 = fArr[length];
                if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                    return Float.valueOf(f4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Ac(byte[] bArr, X2.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Ad(@l3.d float[] fArr, R r4, @l3.d X2.p<? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int te = te(fArr); te >= 0; te--) {
            r4 = operation.c0(Float.valueOf(fArr[te]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final char Ae(char[] cArr, int i4, X2.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= re(cArr)) {
            return cArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).charValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Af(@l3.d boolean[] zArr, @l3.d M destination, @l3.d X2.l<? super Boolean, ? extends K> keySelector, @l3.d X2.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (boolean z3 : zArr) {
            K C3 = keySelector.C(Boolean.valueOf(z3));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Boolean.valueOf(z3)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean Ag(long[] jArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final <T> T Ah(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[we(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C Ai(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i5 + 1;
            R c02 = transform.c0(Integer.valueOf(i5), tArr[i4]);
            if (c02 != null) {
                destination.add(c02);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Aj(int[] iArr, X2.l<? super Integer, Float> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            float floatValue = selector.C(Integer.valueOf(iArr[0])).floatValue();
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Integer.valueOf(iArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Ak(double[] dArr, Comparator<? super R> comparator, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Double.valueOf(dArr[0]));
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Double.valueOf(dArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T Al(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        int we = we(tArr);
        if (we == 0) {
            return t3;
        }
        R C3 = selector.C(t3);
        P it = new kotlin.ranges.l(1, we).iterator();
        while (it.hasNext()) {
            T t4 = tArr[it.c()];
            R C4 = selector.C(t4);
            if (C3.compareTo(C4) > 0) {
                t3 = t4;
                C3 = C4;
            }
        }
        return t3;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double Am(long[] jArr, X2.l<? super Long, Double> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Long.valueOf(jArr[0])).doubleValue();
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Long.valueOf(jArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Byte An(@l3.d byte[] bArr, @l3.d Comparator<? super Byte> comparator) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            if (comparator.compare(Byte.valueOf(b4), Byte.valueOf(b5)) > 0) {
                b4 = b5;
            }
        }
        return Byte.valueOf(b4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean[] Ao(boolean[] zArr, X2.p<? super Integer, ? super Boolean, H0> action) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Boolean.valueOf(zArr[i4]));
            i4++;
            i5++;
        }
        return zArr;
    }

    public static final <S, T extends S> S Ap(@l3.d T[] tArr, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length != 0) {
            S s4 = (S) tArr[0];
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                s4 = operation.c0(s4, (Object) tArr[it.c()]);
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float Aq(@l3.d float[] fArr, @l3.d X2.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int te = te(fArr);
        if (te < 0) {
            return null;
        }
        float f4 = fArr[te];
        for (int i4 = te - 1; i4 >= 0; i4--) {
            f4 = operation.z(Integer.valueOf(i4), Float.valueOf(fArr[i4]), Float.valueOf(f4)).floatValue();
        }
        return Float.valueOf(f4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Ar(char[] cArr, R r4, X2.p<? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        for (char c4 : cArr) {
            r4 = operation.c0(r4, Character.valueOf(c4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> As(boolean[] zArr, R r4, X2.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Boolean.valueOf(zArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static <T> T At(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void Au(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length > 1) {
            C2100o.Q3(jArr);
            Zq(jArr);
        }
    }

    @l3.d
    public static final List<Float> Av(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.M3(copyOf);
        return kr(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Aw(int[] iArr, X2.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 : iArr) {
            d4 += selector.C(Integer.valueOf(i4)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final <T> List<T> Ax(@l3.d T[] tArr, int i4) {
        List<T> k4;
        List<T> Jy;
        List<T> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= tArr.length) {
                Jy = Jy(tArr);
                return Jy;
            }
            if (i4 == 1) {
                k4 = C2108v.k(tArr[0]);
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (T t3 : tArr) {
                arrayList.add(t3);
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Short> Ay(@l3.d short[] sArr) {
        int j4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        j4 = X.j(sArr.length);
        return (HashSet) py(sArr, new HashSet(j4));
    }

    @l3.d
    public static final Iterable<M<Double>> Az(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return new N(new z(dArr));
    }

    @l3.d
    public static <T> Iterable<T> B5(@l3.d T[] tArr) {
        List H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new C2102a(tArr);
    }

    @l3.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M B6(@l3.d T[] tArr, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (T t3 : tArr) {
            destination.put(keySelector.C(t3), valueTransform.C(t3));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean B7(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr[0];
    }

    @kotlin.internal.f
    private static final int B8(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr.length;
    }

    @l3.d
    public static final List<Integer> B9(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        int ue;
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (ue = ue(iArr); -1 < ue; ue--) {
            if (!predicate.C(Integer.valueOf(iArr[ue])).booleanValue()) {
                return yx(iArr, ue + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <R> List<Pair<Boolean, R>> BA(@l3.d boolean[] zArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = zArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Boolean.valueOf(zArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Double>> C Ba(@l3.d double[] dArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            double d4 = dArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Double.valueOf(d4)).booleanValue()) {
                destination.add(Double.valueOf(d4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final Integer Bb(int[] iArr, X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                int i5 = iArr[length];
                if (predicate.C(Integer.valueOf(i5)).booleanValue()) {
                    return Integer.valueOf(i5);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Bc(char[] cArr, X2.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Bd(@l3.d int[] iArr, R r4, @l3.d X2.p<? super Integer, ? super R, ? extends R> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (ue = ue(iArr); ue >= 0; ue--) {
            r4 = operation.c0(Integer.valueOf(iArr[ue]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final double Be(double[] dArr, int i4, X2.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= se(dArr)) {
            return dArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).doubleValue();
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K> I<T, K> Bf(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        return new s(tArr, keySelector);
    }

    @kotlin.internal.f
    private static final <T> boolean Bg(T[] tArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final <T> T Bh(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                T t3 = tArr[length];
                if (predicate.C(t3).booleanValue()) {
                    return t3;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Bi(@l3.d byte[] bArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Bj(long[] jArr, X2.l<? super Long, Float> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            float floatValue = selector.C(Long.valueOf(jArr[0])).floatValue();
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Long.valueOf(jArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Bk(float[] fArr, Comparator<? super R> comparator, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Float.valueOf(fArr[0]));
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Float.valueOf(fArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Short Bl(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        if (xe == 0) {
            return Short.valueOf(s4);
        }
        R C3 = selector.C(Short.valueOf(s4));
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            R C4 = selector.C(Short.valueOf(s5));
            if (C3.compareTo(C4) > 0) {
                s4 = s5;
                C3 = C4;
            }
        }
        return Short.valueOf(s4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double Bm(T[] tArr, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(tArr[0]).doubleValue();
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(tArr[it.c()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Character Bn(@l3.d char[] cArr, @l3.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            if (comparator.compare(Character.valueOf(c4), Character.valueOf(c5)) > 0) {
                c4 = c5;
            }
        }
        return Character.valueOf(c4);
    }

    @l3.d
    public static final Pair<List<Byte>, List<Byte>> Bo(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                arrayList.add(Byte.valueOf(b4));
            } else {
                arrayList2.add(Byte.valueOf(b4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final short Bp(@l3.d short[] sArr, @l3.d X2.p<? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                s4 = operation.c0(Short.valueOf(s4), Short.valueOf(sArr[it.c()])).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Integer Bq(@l3.d int[] iArr, @l3.d X2.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ue = ue(iArr);
        if (ue < 0) {
            return null;
        }
        int i4 = iArr[ue];
        for (int i5 = ue - 1; i5 >= 0; i5--) {
            i4 = operation.z(Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
        }
        return Integer.valueOf(i4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Br(double[] dArr, R r4, X2.p<? super R, ? super Double, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        for (double d4 : dArr) {
            r4 = operation.c0(r4, Double.valueOf(d4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Bs(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Cs(bArr, Random.f52425E);
    }

    @l3.e
    public static final <T> T Bt(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        T t3 = null;
        boolean z3 = false;
        for (T t4 : tArr) {
            if (predicate.C(t4).booleanValue()) {
                if (z3) {
                    return null;
                }
                z3 = true;
                t3 = t4;
            }
        }
        if (!z3) {
            return null;
        }
        return t3;
    }

    @kotlin.Y(version = "1.4")
    public static final void Bu(@l3.d long[] jArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        C2100o.R3(jArr, i4, i5);
        ar(jArr, i4, i5);
    }

    @l3.d
    public static final List<Integer> Bv(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.O3(copyOf);
        return lr(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Bw(long[] jArr, X2.l<? super Long, Double> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (long j4 : jArr) {
            d4 += selector.C(Long.valueOf(j4)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Short> Bx(@l3.d short[] sArr, int i4) {
        List<Short> k4;
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= sArr.length) {
                return Ky(sArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Short.valueOf(sArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (short s4 : sArr) {
                arrayList.add(Short.valueOf(s4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Boolean> By(@l3.d boolean[] zArr) {
        int j4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        j4 = X.j(zArr.length);
        return (HashSet) qy(zArr, new HashSet(j4));
    }

    @l3.d
    public static final Iterable<M<Float>> Bz(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return new N(new y(fArr));
    }

    @l3.d
    public static final Iterable<Short> C5(@l3.d short[] sArr) {
        List H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new c(sArr);
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Short>> M C6(@l3.d short[] sArr, @l3.d M destination, @l3.d X2.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (short s4 : sArr) {
            destination.put(keySelector.C(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final byte C7(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr[1];
    }

    public static final int C8(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Long> C9(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        int ve;
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (ve = ve(jArr); -1 < ve; ve--) {
            if (!predicate.C(Long.valueOf(jArr[ve])).booleanValue()) {
                return zx(jArr, ve + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <R, V> List<V> CA(@l3.d boolean[] zArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Boolean, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = zArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Boolean.valueOf(zArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Float>> C Ca(@l3.d float[] fArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            float f4 = fArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Float.valueOf(f4)).booleanValue()) {
                destination.add(Float.valueOf(f4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final Long Cb(long[] jArr, X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                long j4 = jArr[length];
                if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                    return Long.valueOf(j4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Cc(double[] dArr, X2.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Cd(@l3.d long[] jArr, R r4, @l3.d X2.p<? super Long, ? super R, ? extends R> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (ve = ve(jArr); ve >= 0; ve--) {
            r4 = operation.c0(Long.valueOf(jArr[ve]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final float Ce(float[] fArr, int i4, X2.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= te(fArr)) {
            return fArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).floatValue();
    }

    public static int Cf(@l3.d byte[] bArr, byte b4) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (b4 == bArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @kotlin.internal.f
    private static final boolean Cg(short[] sArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static short Ch(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length != 0) {
            xe = xe(sArr);
            return sArr[xe];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ci(@l3.d char[] cArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> float Cj(T[] tArr, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            float floatValue = selector.C(tArr[0]).floatValue();
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(tArr[it.c()]).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Ck(int[] iArr, Comparator<? super R> comparator, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Integer.valueOf(iArr[0]));
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Integer.valueOf(iArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> byte Cl(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            if (qe == 0) {
                return b4;
            }
            R C3 = selector.C(Byte.valueOf(b4));
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte b5 = bArr[it.c()];
                R C4 = selector.C(Byte.valueOf(b5));
                if (C3.compareTo(C4) > 0) {
                    b4 = b5;
                    C3 = C4;
                }
            }
            return b4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double Cm(short[] sArr, X2.l<? super Short, Double> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Short.valueOf(sArr[0])).doubleValue();
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Short.valueOf(sArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double Cn(@l3.d double[] dArr, @l3.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            double d5 = dArr[it.c()];
            if (comparator.compare(Double.valueOf(d4), Double.valueOf(d5)) > 0) {
                d4 = d5;
            }
        }
        return Double.valueOf(d4);
    }

    @l3.d
    public static final Pair<List<Character>, List<Character>> Co(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                arrayList.add(Character.valueOf(c4));
            } else {
                arrayList2.add(Character.valueOf(c4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean Cp(@l3.d boolean[] zArr, @l3.d X2.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length != 0) {
            boolean z3 = zArr[0];
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                z3 = operation.c0(Boolean.valueOf(z3), Boolean.valueOf(zArr[it.c()])).booleanValue();
            }
            return z3;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Long Cq(@l3.d long[] jArr, @l3.d X2.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ve = ve(jArr);
        if (ve < 0) {
            return null;
        }
        long j4 = jArr[ve];
        for (int i4 = ve - 1; i4 >= 0; i4--) {
            j4 = operation.z(Integer.valueOf(i4), Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
        }
        return Long.valueOf(j4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Cr(float[] fArr, R r4, X2.p<? super R, ? super Float, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        for (float f4 : fArr) {
            r4 = operation.c0(r4, Float.valueOf(f4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Cs(@l3.d byte[] bArr, @l3.d Random random) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (qe = qe(bArr); qe > 0; qe--) {
            int m4 = random.m(qe + 1);
            byte b4 = bArr[qe];
            bArr[qe] = bArr[m4];
            bArr[m4] = b4;
        }
    }

    @l3.e
    public static final Short Ct(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void Cu(@l3.d T[] tArr) {
        Comparator x3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        x3 = kotlin.comparisons.g.x();
        C2100o.h4(tArr, x3);
    }

    @l3.d
    public static final List<Long> Cv(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.Q3(copyOf);
        return mr(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    public static final double Cw(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (Double d5 : dArr) {
            d4 += d5.doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Boolean> Cx(@l3.d boolean[] zArr, int i4) {
        List<Boolean> k4;
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= zArr.length) {
                return Ly(zArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Boolean.valueOf(zArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (boolean z3 : zArr) {
                arrayList.add(Boolean.valueOf(z3));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final int[] Cy(@l3.d Integer[] numArr) {
        kotlin.jvm.internal.F.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    @l3.d
    public static final Iterable<M<Integer>> Cz(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return new N(new w(iArr));
    }

    @l3.d
    public static final Iterable<Boolean> D5(@l3.d boolean[] zArr) {
        List H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new h(zArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D6(@l3.d short[] sArr, @l3.d M destination, @l3.d X2.l<? super Short, ? extends K> keySelector, @l3.d X2.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            destination.put(keySelector.C(Short.valueOf(s4)), valueTransform.C(Short.valueOf(s4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final char D7(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr[1];
    }

    @kotlin.internal.f
    private static final int D8(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr.length;
    }

    @l3.d
    public static final <T> List<T> D9(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        List<T> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int we = we(tArr); -1 < we; we--) {
            if (!predicate.C(tArr[we]).booleanValue()) {
                return Ax(tArr, we + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <R> List<Pair<Boolean, R>> DA(@l3.d boolean[] zArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            boolean z3 = zArr[i4];
            arrayList.add(C2122h0.a(Boolean.valueOf(z3), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Integer>> C Da(@l3.d int[] iArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            int i7 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Integer.valueOf(i6)).booleanValue()) {
                destination.add(Integer.valueOf(i6));
            }
            i4++;
            i5 = i7;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> T Db(T[] tArr, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                T t3 = tArr[length];
                if (!predicate.C(t3).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return t3;
                }
            }
        }
        return null;
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Dc(float[] fArr, X2.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Dd(@l3.d T[] tArr, R r4, @l3.d X2.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int we = we(tArr); we >= 0; we--) {
            r4 = operation.c0(tArr[we], r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final int De(int[] iArr, int i4, X2.l<? super Integer, Integer> defaultValue) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ue = ue(iArr);
            if (i4 <= ue) {
                return iArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).intValue();
    }

    public static final int Df(@l3.d char[] cArr, char c4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (c4 == cArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @kotlin.internal.f
    private static final boolean Dg(boolean[] zArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final short Dh(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                short s4 = sArr[length];
                if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                    return s4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Di(@l3.d double[] dArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Dj(short[] sArr, X2.l<? super Short, Float> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            float floatValue = selector.C(Short.valueOf(sArr[0])).floatValue();
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Short.valueOf(sArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Dk(long[] jArr, Comparator<? super R> comparator, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Long.valueOf(jArr[0]));
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Long.valueOf(jArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> char Dl(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            int re = re(cArr);
            if (re == 0) {
                return c4;
            }
            R C3 = selector.C(Character.valueOf(c4));
            P it = new kotlin.ranges.l(1, re).iterator();
            while (it.hasNext()) {
                char c5 = cArr[it.c()];
                R C4 = selector.C(Character.valueOf(c5));
                if (C3.compareTo(C4) > 0) {
                    c4 = c5;
                    C3 = C4;
                }
            }
            return c4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double Dm(boolean[] zArr, X2.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Boolean.valueOf(zArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Boolean.valueOf(zArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float Dn(@l3.d float[] fArr, @l3.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            float f5 = fArr[it.c()];
            if (comparator.compare(Float.valueOf(f4), Float.valueOf(f5)) > 0) {
                f4 = f5;
            }
        }
        return Float.valueOf(f4);
    }

    @l3.d
    public static final Pair<List<Double>, List<Double>> Do(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                arrayList.add(Double.valueOf(d4));
            } else {
                arrayList2.add(Double.valueOf(d4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final byte Dp(@l3.d byte[] bArr, @l3.d X2.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                b4 = operation.z(Integer.valueOf(c4), Byte.valueOf(b4), Byte.valueOf(bArr[c4])).byteValue();
            }
            return b4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S Dq(@l3.d T[] tArr, @l3.d X2.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int we = we(tArr);
        if (we < 0) {
            return null;
        }
        S s4 = (S) tArr[we];
        for (int i4 = we - 1; i4 >= 0; i4--) {
            s4 = operation.z(Integer.valueOf(i4), (Object) tArr[i4], s4);
        }
        return s4;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Dr(int[] iArr, R r4, X2.p<? super R, ? super Integer, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        for (int i4 : iArr) {
            r4 = operation.c0(r4, Integer.valueOf(i4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Ds(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        Es(cArr, Random.f52425E);
    }

    @l3.e
    public static final Short Dt(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Short sh = null;
        boolean z3 = false;
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                sh = Short.valueOf(s4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return sh;
    }

    @kotlin.Y(version = "1.4")
    public static final <T extends Comparable<? super T>> void Du(@l3.d T[] tArr, int i4, int i5) {
        Comparator x3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        x3 = kotlin.comparisons.g.x();
        C2100o.i4(tArr, x3, i4, i5);
    }

    @l3.d
    public static final <T extends Comparable<? super T>> List<T> Dv(@l3.d T[] tArr) {
        Comparator x3;
        List<T> Lv;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        x3 = kotlin.comparisons.g.x();
        Lv = Lv(tArr, x3);
        return Lv;
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double Dw(T[] tArr, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (T t3 : tArr) {
            d4 += selector.C(t3).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Byte> Dx(@l3.d byte[] bArr, int i4) {
        List<Byte> k4;
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = bArr.length;
            if (i4 >= length) {
                return Dy(bArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Byte.valueOf(bArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Byte.valueOf(bArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Byte> Dy(@l3.d byte[] bArr) {
        List<Byte> H3;
        List<Byte> k4;
        List<Byte> Ny;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length != 1) {
            Ny = Ny(bArr);
            return Ny;
        }
        k4 = C2108v.k(Byte.valueOf(bArr[0]));
        return k4;
    }

    @l3.d
    public static final Iterable<M<Long>> Dz(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return new N(new x(jArr));
    }

    @l3.d
    public static final kotlin.sequences.m<Byte> E5(@l3.d byte[] bArr) {
        kotlin.sequences.m<Byte> g4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new k(bArr);
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Boolean>> M E6(@l3.d boolean[] zArr, @l3.d M destination, @l3.d X2.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (boolean z3 : zArr) {
            destination.put(keySelector.C(Boolean.valueOf(z3)), Boolean.valueOf(z3));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final double E7(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr[1];
    }

    public static final int E8(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (int i5 : iArr) {
            if (predicate.C(Integer.valueOf(i5)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Short> E9(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        int xe;
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (xe = xe(sArr); -1 < xe; xe--) {
            if (!predicate.C(Short.valueOf(sArr[xe])).booleanValue()) {
                return Bx(sArr, xe + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <R, V> List<V> EA(@l3.d boolean[] zArr, @l3.d R[] other, @l3.d X2.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Boolean.valueOf(zArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Long>> C Ea(@l3.d long[] jArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            long j4 = jArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Long.valueOf(j4)).booleanValue()) {
                destination.add(Long.valueOf(j4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final Short Eb(short[] sArr, X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                short s4 = sArr[length];
                if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                    return Short.valueOf(s4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Ec(int[] iArr, X2.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Ed(@l3.d short[] sArr, R r4, @l3.d X2.p<? super Short, ? super R, ? extends R> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (xe = xe(sArr); xe >= 0; xe--) {
            r4 = operation.c0(Short.valueOf(sArr[xe]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final long Ee(long[] jArr, int i4, X2.l<? super Integer, Long> defaultValue) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ve = ve(jArr);
            if (i4 <= ve) {
                return jArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).longValue();
    }

    @InterfaceC2205l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.V(expression = "indexOfFirst { it == element }", imports = {}))
    @InterfaceC2207m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Ef(double[] dArr, double d4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (d4 == dArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Eg(@l3.d byte[] bArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (byte b4 : bArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Byte.valueOf(b4)));
            } else {
                buffer.append(String.valueOf((int) b4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean Eh(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[ye(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ei(@l3.d float[] fArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Ej(boolean[] zArr, X2.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            float floatValue = selector.C(Boolean.valueOf(zArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Boolean.valueOf(zArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R Ek(T[] tArr, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(tArr[0]);
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(tArr[it.c()]);
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> double El(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            int se = se(dArr);
            if (se == 0) {
                return d4;
            }
            R C3 = selector.C(Double.valueOf(d4));
            P it = new kotlin.ranges.l(1, se).iterator();
            while (it.hasNext()) {
                double d5 = dArr[it.c()];
                R C4 = selector.C(Double.valueOf(d5));
                if (C3.compareTo(C4) > 0) {
                    d4 = d5;
                    C3 = C4;
                }
            }
            return d4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Em(byte[] bArr, X2.l<? super Byte, Float> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Byte.valueOf(bArr[0])).floatValue();
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Byte.valueOf(bArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Integer En(@l3.d int[] iArr, @l3.d Comparator<? super Integer> comparator) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) > 0) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    @l3.d
    public static final Pair<List<Float>, List<Float>> Eo(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                arrayList.add(Float.valueOf(f4));
            } else {
                arrayList2.add(Float.valueOf(f4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final char Ep(@l3.d char[] cArr, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                int c5 = it.c();
                c4 = operation.z(Integer.valueOf(c5), Character.valueOf(c4), Character.valueOf(cArr[c5])).charValue();
            }
            return c4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Short Eq(@l3.d short[] sArr, @l3.d X2.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        xe = xe(sArr);
        if (xe < 0) {
            return null;
        }
        short s4 = sArr[xe];
        for (int i4 = xe - 1; i4 >= 0; i4--) {
            s4 = operation.z(Integer.valueOf(i4), Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
        }
        return Short.valueOf(s4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Er(long[] jArr, R r4, X2.p<? super R, ? super Long, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        for (long j4 : jArr) {
            r4 = operation.c0(r4, Long.valueOf(j4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Es(@l3.d char[] cArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (int re = re(cArr); re > 0; re--) {
            int m4 = random.m(re + 1);
            char c4 = cArr[re];
            cArr[re] = cArr[m4];
            cArr[m4] = c4;
        }
    }

    @l3.d
    public static final List<Byte> Et(@l3.d byte[] bArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final void Eu(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length > 1) {
            C2100o.W3(sArr);
            dr(sArr);
        }
    }

    @l3.d
    public static final List<Short> Ev(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.W3(copyOf);
        return or(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Ew(short[] sArr, X2.l<? super Short, Double> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (short s4 : sArr) {
            d4 += selector.C(Short.valueOf(s4)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Character> Ex(@l3.d char[] cArr, int i4) {
        List<Character> k4;
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = cArr.length;
            if (i4 >= length) {
                return Ey(cArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Character.valueOf(cArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Character.valueOf(cArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Character> Ey(@l3.d char[] cArr) {
        List<Character> H3;
        List<Character> k4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Character.valueOf(cArr[0]));
            return k4;
        }
        return Oy(cArr);
    }

    @l3.d
    public static final <T> Iterable<M<T>> Ez(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return new N(new t(tArr));
    }

    @l3.d
    public static final kotlin.sequences.m<Character> F5(@l3.d char[] cArr) {
        kotlin.sequences.m<Character> g4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new r(cArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M F6(@l3.d boolean[] zArr, @l3.d M destination, @l3.d X2.l<? super Boolean, ? extends K> keySelector, @l3.d X2.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (boolean z3 : zArr) {
            destination.put(keySelector.C(Boolean.valueOf(z3)), valueTransform.C(Boolean.valueOf(z3)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final float F7(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr[1];
    }

    @kotlin.internal.f
    private static final int F8(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr.length;
    }

    @l3.d
    public static final List<Boolean> F9(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int ye = ye(zArr); -1 < ye; ye--) {
            if (!predicate.C(Boolean.valueOf(zArr[ye])).booleanValue()) {
                return Cx(zArr, ye + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final List<Pair<Boolean, Boolean>> FA(@l3.d boolean[] zArr, @l3.d boolean[] other) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Boolean.valueOf(zArr[i4]), Boolean.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C Fa(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            T t3 = tArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), t3).booleanValue()) {
                destination.add(t3);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    public static byte Fb(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Fc(long[] jArr, X2.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Fd(@l3.d boolean[] zArr, R r4, @l3.d X2.p<? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int ye = ye(zArr); ye >= 0; ye--) {
            r4 = operation.c0(Boolean.valueOf(zArr[ye]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final <T> T Fe(T[] tArr, int i4, X2.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= we(tArr)) {
            return tArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4));
    }

    @InterfaceC2205l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.V(expression = "indexOfFirst { it == element }", imports = {}))
    @InterfaceC2207m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Ff(float[] fArr, float f4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (f4 == fArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Fg(@l3.d char[] cArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (char c4 : cArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Character.valueOf(c4)));
            } else {
                buffer.append(c4);
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean Fh(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                boolean z3 = zArr[length];
                if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                    return z3;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Fi(@l3.d int[] iArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Fj(byte[] bArr, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            R C3 = selector.C(Byte.valueOf(bArr[0]));
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Byte.valueOf(bArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Fk(short[] sArr, Comparator<? super R> comparator, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Short.valueOf(sArr[0]));
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Short.valueOf(sArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> float Fl(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            int te = te(fArr);
            if (te == 0) {
                return f4;
            }
            R C3 = selector.C(Float.valueOf(f4));
            P it = new kotlin.ranges.l(1, te).iterator();
            while (it.hasNext()) {
                float f5 = fArr[it.c()];
                R C4 = selector.C(Float.valueOf(f5));
                if (C3.compareTo(C4) > 0) {
                    f4 = f5;
                    C3 = C4;
                }
            }
            return f4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Fm(char[] cArr, X2.l<? super Character, Float> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Character.valueOf(cArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Character.valueOf(cArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Long Fn(@l3.d long[] jArr, @l3.d Comparator<? super Long> comparator) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) > 0) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    @l3.d
    public static final Pair<List<Integer>, List<Integer>> Fo(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            } else {
                arrayList2.add(Integer.valueOf(i4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final double Fp(@l3.d double[] dArr, @l3.d X2.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                d4 = operation.z(Integer.valueOf(c4), Double.valueOf(d4), Double.valueOf(dArr[c4])).doubleValue();
            }
            return d4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Boolean Fq(@l3.d boolean[] zArr, @l3.d X2.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int ye = ye(zArr);
        if (ye < 0) {
            return null;
        }
        boolean z3 = zArr[ye];
        for (int i4 = ye - 1; i4 >= 0; i4--) {
            z3 = operation.c0(Boolean.valueOf(zArr[i4]), Boolean.valueOf(z3)).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> Fr(@l3.d T[] tArr, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        for (A1.a aVar : tArr) {
            r4 = operation.c0(r4, aVar);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Fs(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        Gs(dArr, Random.f52425E);
    }

    @l3.d
    public static final List<Byte> Ft(@l3.d byte[] bArr, @l3.d kotlin.ranges.l indices) {
        byte[] f12;
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        f12 = C2100o.f1(bArr, indices.c().intValue(), indices.k().intValue() + 1);
        return C2100o.n(f12);
    }

    @kotlin.Y(version = "1.4")
    public static final void Fu(@l3.d short[] sArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        C2100o.X3(sArr, i4, i5);
        er(sArr, i4, i5);
    }

    @l3.d
    public static final List<Byte> Fv(@l3.d byte[] bArr, @l3.d Comparator<? super Byte> comparator) {
        List<Byte> t3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Byte[] N4 = C2100o.N4(bArr);
        C2100o.h4(N4, comparator);
        t3 = C2100o.t(N4);
        return t3;
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Fw(boolean[] zArr, X2.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (boolean z3 : zArr) {
            d4 += selector.C(Boolean.valueOf(z3)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Double> Fx(@l3.d double[] dArr, int i4) {
        List<Double> k4;
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = dArr.length;
            if (i4 >= length) {
                return Fy(dArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Double.valueOf(dArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Double.valueOf(dArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Double> Fy(@l3.d double[] dArr) {
        List<Double> H3;
        List<Double> k4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Double.valueOf(dArr[0]));
            return k4;
        }
        return Py(dArr);
    }

    @l3.d
    public static final Iterable<M<Short>> Fz(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return new N(new v(sArr));
    }

    @l3.d
    public static final kotlin.sequences.m<Double> G5(@l3.d double[] dArr) {
        kotlin.sequences.m<Double> g4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new C0457p(dArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M G6(@l3.d byte[] bArr, @l3.d M destination, @l3.d X2.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (byte b4 : bArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Byte.valueOf(b4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final int G7(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr[1];
    }

    public static final int G8(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Byte> G9(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (byte b4 : bArr) {
            if (z3) {
                arrayList.add(Byte.valueOf(b4));
            } else if (!predicate.C(Byte.valueOf(b4)).booleanValue()) {
                arrayList.add(Byte.valueOf(b4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <V> List<V> GA(@l3.d boolean[] zArr, @l3.d boolean[] other, @l3.d X2.p<? super Boolean, ? super Boolean, ? extends V> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Boolean.valueOf(zArr[i4]), Boolean.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Short>> C Ga(@l3.d short[] sArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            short s4 = sArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    public static final byte Gb(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return b4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> List<R> Gc(T[] tArr, X2.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Gd(@l3.d byte[] bArr, R r4, @l3.d X2.q<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (qe = qe(bArr); qe >= 0; qe--) {
            r4 = operation.z(Integer.valueOf(qe), Byte.valueOf(bArr[qe]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final short Ge(short[] sArr, int i4, X2.l<? super Integer, Short> defaultValue) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            xe = xe(sArr);
            if (i4 <= xe) {
                return sArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).shortValue();
    }

    public static int Gf(@l3.d int[] iArr, int i4) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i4 == iArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Gg(@l3.d double[] dArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (double d4 : dArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Double.valueOf(d4)));
            } else {
                buffer.append(String.valueOf(d4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int Gh(@l3.d byte[] bArr, byte b4) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (b4 == bArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Gi(@l3.d long[] jArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Gj(char[] cArr, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            R C3 = selector.C(Character.valueOf(cArr[0]));
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Character.valueOf(cArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Gk(boolean[] zArr, Comparator<? super R> comparator, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Boolean.valueOf(zArr[0]));
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Boolean.valueOf(zArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> int Gl(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            if (ue == 0) {
                return i4;
            }
            R C3 = selector.C(Integer.valueOf(i4));
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i5 = iArr[it.c()];
                R C4 = selector.C(Integer.valueOf(i5));
                if (C3.compareTo(C4) > 0) {
                    i4 = i5;
                    C3 = C4;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Gm(double[] dArr, X2.l<? super Double, Float> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Double.valueOf(dArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Double.valueOf(dArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T> T Gn(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            T t4 = tArr[it.c()];
            if (comparator.compare(t3, t4) > 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    @l3.d
    public static final Pair<List<Long>, List<Long>> Go(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            } else {
                arrayList2.add(Long.valueOf(j4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final float Gp(@l3.d float[] fArr, @l3.d X2.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                f4 = operation.z(Integer.valueOf(c4), Float.valueOf(f4), Float.valueOf(fArr[c4])).floatValue();
            }
            return f4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Byte Gq(@l3.d byte[] bArr, @l3.d X2.p<? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        qe = qe(bArr);
        if (qe < 0) {
            return null;
        }
        byte b4 = bArr[qe];
        for (int i4 = qe - 1; i4 >= 0; i4--) {
            b4 = operation.c0(Byte.valueOf(bArr[i4]), Byte.valueOf(b4)).byteValue();
        }
        return Byte.valueOf(b4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Gr(short[] sArr, R r4, X2.p<? super R, ? super Short, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        for (short s4 : sArr) {
            r4 = operation.c0(r4, Short.valueOf(s4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Gs(@l3.d double[] dArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (int se = se(dArr); se > 0; se--) {
            int m4 = random.m(se + 1);
            double d4 = dArr[se];
            dArr[se] = dArr[m4];
            dArr[m4] = d4;
        }
    }

    @l3.d
    public static final List<Character> Gt(@l3.d char[] cArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Byte> Gu(@l3.d byte[] bArr) {
        List<Byte> t3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Byte[] N4 = C2100o.N4(bArr);
        C2100o.U3(N4);
        t3 = C2100o.t(N4);
        return t3;
    }

    @l3.d
    public static final List<Character> Gv(@l3.d char[] cArr, @l3.d Comparator<? super Character> comparator) {
        List<Character> t3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Character[] O4 = C2100o.O4(cArr);
        C2100o.h4(O4, comparator);
        t3 = C2100o.t(O4);
        return t3;
    }

    @W2.i(name = "sumOfFloat")
    public static final float Gw(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        float f4 = 0.0f;
        for (Float f5 : fArr) {
            f4 += f5.floatValue();
        }
        return f4;
    }

    @l3.d
    public static final List<Float> Gx(@l3.d float[] fArr, int i4) {
        List<Float> k4;
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = fArr.length;
            if (i4 >= length) {
                return Gy(fArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Float.valueOf(fArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Float.valueOf(fArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Float> Gy(@l3.d float[] fArr) {
        List<Float> H3;
        List<Float> k4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Float.valueOf(fArr[0]));
            return k4;
        }
        return Qy(fArr);
    }

    @l3.d
    public static final Iterable<M<Boolean>> Gz(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return new N(new A(zArr));
    }

    @l3.d
    public static final kotlin.sequences.m<Float> H5(@l3.d float[] fArr) {
        kotlin.sequences.m<Float> g4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new o(fArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M H6(@l3.d char[] cArr, @l3.d M destination, @l3.d X2.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (char c4 : cArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Character.valueOf(c4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final long H7(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr[1];
    }

    @kotlin.internal.f
    private static final <T> int H8(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr.length;
    }

    @l3.d
    public static final List<Character> H9(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (char c4 : cArr) {
            if (z3) {
                arrayList.add(Character.valueOf(c4));
            } else if (!predicate.C(Character.valueOf(c4)).booleanValue()) {
                arrayList.add(Character.valueOf(c4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Boolean>> C Ha(@l3.d boolean[] zArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            boolean z3 = zArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Boolean.valueOf(z3)).booleanValue()) {
                destination.add(Boolean.valueOf(z3));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    public static final char Hb(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Hc(short[] sArr, X2.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Hd(@l3.d char[] cArr, R r4, @l3.d X2.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int re = re(cArr); re >= 0; re--) {
            r4 = operation.z(Integer.valueOf(re), Character.valueOf(cArr[re]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final boolean He(boolean[] zArr, int i4, X2.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= ye(zArr)) {
            return zArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).booleanValue();
    }

    public static int Hf(@l3.d long[] jArr, long j4) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (j4 == jArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Hg(@l3.d float[] fArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (float f4 : fArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Float.valueOf(f4)));
            } else {
                buffer.append(String.valueOf(f4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final int Hh(@l3.d char[] cArr, char c4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (c4 == cArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C Hi(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Hj(double[] dArr, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            R C3 = selector.C(Double.valueOf(dArr[0]));
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Double.valueOf(dArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Byte Hk(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            if (b4 < b5) {
                b4 = b5;
            }
        }
        return Byte.valueOf(b4);
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> long Hl(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            if (ve == 0) {
                return j4;
            }
            R C3 = selector.C(Long.valueOf(j4));
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long j5 = jArr[it.c()];
                R C4 = selector.C(Long.valueOf(j5));
                if (C3.compareTo(C4) > 0) {
                    j4 = j5;
                    C3 = C4;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Hm(float[] fArr, X2.l<? super Float, Float> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Float.valueOf(fArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Float.valueOf(fArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Short Hn(@l3.d short[] sArr, @l3.d Comparator<? super Short> comparator) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) > 0) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    @l3.d
    public static final <T> Pair<List<T>, List<T>> Ho(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            } else {
                arrayList2.add(t3);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final int Hp(@l3.d int[] iArr, @l3.d X2.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                i4 = operation.z(Integer.valueOf(c4), Integer.valueOf(i4), Integer.valueOf(iArr[c4])).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Character Hq(@l3.d char[] cArr, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int re = re(cArr);
        if (re < 0) {
            return null;
        }
        char c4 = cArr[re];
        for (int i4 = re - 1; i4 >= 0; i4--) {
            c4 = operation.c0(Character.valueOf(cArr[i4]), Character.valueOf(c4)).charValue();
        }
        return Character.valueOf(c4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Hr(boolean[] zArr, R r4, X2.p<? super R, ? super Boolean, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        for (boolean z3 : zArr) {
            r4 = operation.c0(r4, Boolean.valueOf(z3));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Hs(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        Is(fArr, Random.f52425E);
    }

    @l3.d
    public static final List<Character> Ht(@l3.d char[] cArr, @l3.d kotlin.ranges.l indices) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return C2100o.o(C2100o.g1(cArr, indices.c().intValue(), indices.k().intValue() + 1));
    }

    @l3.d
    public static final List<Character> Hu(@l3.d char[] cArr) {
        List<Character> t3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        Character[] O4 = C2100o.O4(cArr);
        C2100o.U3(O4);
        t3 = C2100o.t(O4);
        return t3;
    }

    @l3.d
    public static final List<Double> Hv(@l3.d double[] dArr, @l3.d Comparator<? super Double> comparator) {
        List<Double> t3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Double[] P4 = C2100o.P4(dArr);
        C2100o.h4(P4, comparator);
        t3 = C2100o.t(P4);
        return t3;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Hw(byte[] bArr, X2.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (byte b4 : bArr) {
            i4 += selector.C(Byte.valueOf(b4)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Integer> Hx(@l3.d int[] iArr, int i4) {
        List<Integer> k4;
        List<Integer> Hy;
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = iArr.length;
            if (i4 >= length) {
                Hy = Hy(iArr);
                return Hy;
            }
            if (i4 == 1) {
                k4 = C2108v.k(Integer.valueOf(iArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Integer.valueOf(iArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static List<Integer> Hy(@l3.d int[] iArr) {
        List<Integer> H3;
        List<Integer> k4;
        List<Integer> Ry;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length != 1) {
            Ry = Ry(iArr);
            return Ry;
        }
        k4 = C2108v.k(Integer.valueOf(iArr[0]));
        return k4;
    }

    @l3.d
    public static final <R> List<Pair<Byte, R>> Hz(@l3.d byte[] bArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = bArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Byte.valueOf(bArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final kotlin.sequences.m<Integer> I5(@l3.d int[] iArr) {
        kotlin.sequences.m<Integer> g4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new m(iArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M I6(@l3.d double[] dArr, @l3.d M destination, @l3.d X2.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (double d4 : dArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Double.valueOf(d4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> T I7(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr[1];
    }

    public static final <T> int I8(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Double> I9(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (double d4 : dArr) {
            if (z3) {
                arrayList.add(Double.valueOf(d4));
            } else if (!predicate.C(Double.valueOf(d4)).booleanValue()) {
                arrayList.add(Double.valueOf(d4));
                z3 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> Ia(Object[] objArr) {
        kotlin.jvm.internal.F.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            kotlin.jvm.internal.F.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char Ib(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                return c4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Ic(boolean[] zArr, X2.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R Id(@l3.d double[] dArr, R r4, @l3.d X2.q<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int se = se(dArr); se >= 0; se--) {
            r4 = operation.z(Integer.valueOf(se), Double.valueOf(dArr[se]), r4);
        }
        return r4;
    }

    @l3.e
    public static final Boolean Ie(@l3.d boolean[] zArr, int i4) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (i4 >= 0 && i4 <= ye(zArr)) {
            return Boolean.valueOf(zArr[i4]);
        }
        return null;
    }

    public static <T> int If(@l3.d T[] tArr, T t3) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int i4 = 0;
        if (t3 == null) {
            int length = tArr.length;
            while (i4 < length) {
                if (tArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i4 < length2) {
            if (kotlin.jvm.internal.F.g(t3, tArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Ig(@l3.d int[] iArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (int i6 : iArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Integer.valueOf(i6)));
            } else {
                buffer.append(String.valueOf(i6));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC2205l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.V(expression = "indexOfLast { it == element }", imports = {}))
    @InterfaceC2207m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Ih(double[] dArr, double d4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (d4 == dArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ii(@l3.d short[] sArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Ij(float[] fArr, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            R C3 = selector.C(Float.valueOf(fArr[0]));
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Float.valueOf(fArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Character Ik(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            if (kotlin.jvm.internal.F.t(c4, c5) < 0) {
                c4 = c5;
            }
        }
        return Character.valueOf(c4);
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T Il(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            T t3 = tArr[0];
            int we = we(tArr);
            if (we == 0) {
                return t3;
            }
            R C3 = selector.C(t3);
            P it = new kotlin.ranges.l(1, we).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                R C4 = selector.C(t4);
                if (C3.compareTo(C4) > 0) {
                    t3 = t4;
                    C3 = C4;
                }
            }
            return t3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Im(int[] iArr, X2.l<? super Integer, Float> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Integer.valueOf(iArr[0])).floatValue();
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Integer.valueOf(iArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final byte In(@l3.d byte[] bArr, @l3.d Comparator<? super Byte> comparator) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte b5 = bArr[it.c()];
                if (comparator.compare(Byte.valueOf(b4), Byte.valueOf(b5)) > 0) {
                    b4 = b5;
                }
            }
            return b4;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final Pair<List<Short>, List<Short>> Io(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            } else {
                arrayList2.add(Short.valueOf(s4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final long Ip(@l3.d long[] jArr, @l3.d X2.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                j4 = operation.z(Integer.valueOf(c4), Long.valueOf(j4), Long.valueOf(jArr[c4])).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Double Iq(@l3.d double[] dArr, @l3.d X2.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int se = se(dArr);
        if (se < 0) {
            return null;
        }
        double d4 = dArr[se];
        for (int i4 = se - 1; i4 >= 0; i4--) {
            d4 = operation.c0(Double.valueOf(dArr[i4]), Double.valueOf(d4)).doubleValue();
        }
        return Double.valueOf(d4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Ir(byte[] bArr, R r4, X2.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Byte.valueOf(bArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Is(@l3.d float[] fArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (int te = te(fArr); te > 0; te--) {
            int m4 = random.m(te + 1);
            float f4 = fArr[te];
            fArr[te] = fArr[m4];
            fArr[m4] = f4;
        }
    }

    @l3.d
    public static final List<Double> It(@l3.d double[] dArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Double> Iu(@l3.d double[] dArr) {
        List<Double> t3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        Double[] P4 = C2100o.P4(dArr);
        C2100o.U3(P4);
        t3 = C2100o.t(P4);
        return t3;
    }

    @l3.d
    public static final List<Float> Iv(@l3.d float[] fArr, @l3.d Comparator<? super Float> comparator) {
        List<Float> t3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Float[] Q4 = C2100o.Q4(fArr);
        C2100o.h4(Q4, comparator);
        t3 = C2100o.t(Q4);
        return t3;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Iw(char[] cArr, X2.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (char c4 : cArr) {
            i4 += selector.C(Character.valueOf(c4)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Long> Ix(@l3.d long[] jArr, int i4) {
        List<Long> k4;
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = jArr.length;
            if (i4 >= length) {
                return Iy(jArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Long.valueOf(jArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Long.valueOf(jArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Long> Iy(@l3.d long[] jArr) {
        List<Long> H3;
        List<Long> k4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Long.valueOf(jArr[0]));
            return k4;
        }
        return Sy(jArr);
    }

    @l3.d
    public static final <R, V> List<V> Iz(@l3.d byte[] bArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Byte, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = bArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Byte.valueOf(bArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final kotlin.sequences.m<Long> J5(@l3.d long[] jArr) {
        kotlin.sequences.m<Long> g4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new n(jArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M J6(@l3.d float[] fArr, @l3.d M destination, @l3.d X2.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (float f4 : fArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Float.valueOf(f4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final short J7(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr[1];
    }

    @kotlin.internal.f
    private static final int J8(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr.length;
    }

    @l3.d
    public static final List<Float> J9(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (float f4 : fArr) {
            if (z3) {
                arrayList.add(Float.valueOf(f4));
            } else if (!predicate.C(Float.valueOf(f4)).booleanValue()) {
                arrayList.add(Float.valueOf(f4));
                z3 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C Ja(Object[] objArr, C destination) {
        kotlin.jvm.internal.F.p(objArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (Object obj : objArr) {
            kotlin.jvm.internal.F.y(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final double Jb(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Jc(byte[] bArr, C destination, X2.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final <R> R Jd(@l3.d float[] fArr, R r4, @l3.d X2.q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int te = te(fArr); te >= 0; te--) {
            r4 = operation.z(Integer.valueOf(te), Float.valueOf(fArr[te]), r4);
        }
        return r4;
    }

    @l3.e
    public static Byte Je(@l3.d byte[] bArr, int i4) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (i4 >= 0) {
            qe = qe(bArr);
            if (i4 <= qe) {
                return Byte.valueOf(bArr[i4]);
            }
        }
        return null;
    }

    public static int Jf(@l3.d short[] sArr, short s4) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (s4 == sArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Jg(@l3.d long[] jArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (long j4 : jArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Long.valueOf(j4)));
            } else {
                buffer.append(String.valueOf(j4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC2205l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.V(expression = "indexOfLast { it == element }", imports = {}))
    @InterfaceC2207m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Jh(float[] fArr, float f4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (f4 == fArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ji(@l3.d boolean[] zArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.c0(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Jj(int[] iArr, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            R C3 = selector.C(Integer.valueOf(iArr[0]));
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Integer.valueOf(iArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T extends Comparable<? super T>> T Jk(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            T t4 = tArr[it.c()];
            if (t3.compareTo(t4) < 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> short Jl(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            if (xe == 0) {
                return s4;
            }
            R C3 = selector.C(Short.valueOf(s4));
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short s5 = sArr[it.c()];
                R C4 = selector.C(Short.valueOf(s5));
                if (C3.compareTo(C4) > 0) {
                    s4 = s5;
                    C3 = C4;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Jm(long[] jArr, X2.l<? super Long, Float> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Long.valueOf(jArr[0])).floatValue();
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Long.valueOf(jArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final char Jn(@l3.d char[] cArr, @l3.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                char c5 = cArr[it.c()];
                if (comparator.compare(Character.valueOf(c4), Character.valueOf(c5)) > 0) {
                    c4 = c5;
                }
            }
            return c4;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final Pair<List<Boolean>, List<Boolean>> Jo(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z3));
            } else {
                arrayList2.add(Boolean.valueOf(z3));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S Jp(@l3.d T[] tArr, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length != 0) {
            S s4 = (S) tArr[0];
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                s4 = operation.z(Integer.valueOf(c4), s4, (Object) tArr[c4]);
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Float Jq(@l3.d float[] fArr, @l3.d X2.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int te = te(fArr);
        if (te < 0) {
            return null;
        }
        float f4 = fArr[te];
        for (int i4 = te - 1; i4 >= 0; i4--) {
            f4 = operation.c0(Float.valueOf(fArr[i4]), Float.valueOf(f4)).floatValue();
        }
        return Float.valueOf(f4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Jr(char[] cArr, R r4, X2.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Character.valueOf(cArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Js(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        Ks(iArr, Random.f52425E);
    }

    @l3.d
    public static final List<Double> Jt(@l3.d double[] dArr, @l3.d kotlin.ranges.l indices) {
        List<Double> p4;
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        p4 = C2100o.p(C2100o.h1(dArr, indices.c().intValue(), indices.k().intValue() + 1));
        return p4;
    }

    @l3.d
    public static final List<Float> Ju(@l3.d float[] fArr) {
        List<Float> t3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        Float[] Q4 = C2100o.Q4(fArr);
        C2100o.U3(Q4);
        t3 = C2100o.t(Q4);
        return t3;
    }

    @l3.d
    public static final List<Integer> Jv(@l3.d int[] iArr, @l3.d Comparator<? super Integer> comparator) {
        List<Integer> t3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Integer[] R4 = C2100o.R4(iArr);
        C2100o.h4(R4, comparator);
        t3 = C2100o.t(R4);
        return t3;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Jw(double[] dArr, X2.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (double d4 : dArr) {
            i4 += selector.C(Double.valueOf(d4)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final <T> List<T> Jx(@l3.d T[] tArr, int i4) {
        List<T> k4;
        List<T> Jy;
        List<T> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = tArr.length;
            if (i4 >= length) {
                Jy = Jy(tArr);
                return Jy;
            }
            if (i4 == 1) {
                k4 = C2108v.k(tArr[length - 1]);
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(tArr[i5]);
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static <T> List<T> Jy(@l3.d T[] tArr) {
        List<T> H3;
        List<T> k4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(tArr[0]);
            return k4;
        }
        return Ty(tArr);
    }

    @l3.d
    public static final List<Pair<Byte, Byte>> Jz(@l3.d byte[] bArr, @l3.d byte[] other) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Byte.valueOf(bArr[i4]), Byte.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static <T> kotlin.sequences.m<T> K5(@l3.d T[] tArr) {
        kotlin.sequences.m<T> g4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new j(tArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M K6(@l3.d int[] iArr, @l3.d M destination, @l3.d X2.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 : iArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Integer.valueOf(i4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean K7(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr[1];
    }

    public static final int K8(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Integer> K9(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (int i4 : iArr) {
            if (z3) {
                arrayList.add(Integer.valueOf(i4));
            } else if (!predicate.C(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final List<Byte> Ka(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b4 : bArr) {
            if (!predicate.C(Byte.valueOf(b4)).booleanValue()) {
                arrayList.add(Byte.valueOf(b4));
            }
        }
        return arrayList;
    }

    public static final double Kb(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                return d4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Kc(char[] cArr, C destination, X2.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final <R> R Kd(@l3.d int[] iArr, R r4, @l3.d X2.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (ue = ue(iArr); ue >= 0; ue--) {
            r4 = operation.z(Integer.valueOf(ue), Integer.valueOf(iArr[ue]), r4);
        }
        return r4;
    }

    @l3.e
    public static final Character Ke(@l3.d char[] cArr, int i4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (i4 >= 0 && i4 <= re(cArr)) {
            return Character.valueOf(cArr[i4]);
        }
        return null;
    }

    public static final int Kf(@l3.d boolean[] zArr, boolean z3) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (z3 == zArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <T, A extends Appendable> A Kg(@l3.d T[] tArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t3 : tArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            kotlin.text.r.b(buffer, t3, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int Kh(@l3.d int[] iArr, int i4) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (i4 == iArr[length]) {
                    return length;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return -1;
    }

    @l3.d
    public static final <T, R> List<R> Ki(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            R C3 = transform.C(t3);
            if (C3 != null) {
                arrayList.add(C3);
            }
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Kj(long[] jArr, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            R C3 = selector.C(Long.valueOf(jArr[0]));
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Long.valueOf(jArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double Kk(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            d4 = Math.max(d4, dArr[it.c()]);
        }
        return Double.valueOf(d4);
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean Kl(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            boolean z3 = zArr[0];
            int ye = ye(zArr);
            if (ye == 0) {
                return z3;
            }
            R C3 = selector.C(Boolean.valueOf(z3));
            P it = new kotlin.ranges.l(1, ye).iterator();
            while (it.hasNext()) {
                boolean z4 = zArr[it.c()];
                R C4 = selector.C(Boolean.valueOf(z4));
                if (C3.compareTo(C4) > 0) {
                    z3 = z4;
                    C3 = C4;
                }
            }
            return z3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float Km(T[] tArr, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(tArr[0]).floatValue();
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(tArr[it.c()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double Kn(@l3.d double[] dArr, @l3.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                double d5 = dArr[it.c()];
                if (comparator.compare(Double.valueOf(d4), Double.valueOf(d5)) > 0) {
                    d4 = d5;
                }
            }
            return d4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final byte Ko(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return Lo(bArr, Random.f52425E);
    }

    public static final short Kp(@l3.d short[] sArr, @l3.d X2.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                s4 = operation.z(Integer.valueOf(c4), Short.valueOf(s4), Short.valueOf(sArr[c4])).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Integer Kq(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ue = ue(iArr);
        if (ue < 0) {
            return null;
        }
        int i4 = iArr[ue];
        for (int i5 = ue - 1; i5 >= 0; i5--) {
            i4 = operation.c0(Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
        }
        return Integer.valueOf(i4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Kr(double[] dArr, R r4, X2.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Double.valueOf(dArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Ks(@l3.d int[] iArr, @l3.d Random random) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (ue = ue(iArr); ue > 0; ue--) {
            int m4 = random.m(ue + 1);
            int i4 = iArr[ue];
            iArr[ue] = iArr[m4];
            iArr[m4] = i4;
        }
    }

    @l3.d
    public static final List<Float> Kt(@l3.d float[] fArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Integer> Ku(@l3.d int[] iArr) {
        List<Integer> t3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        Integer[] R4 = C2100o.R4(iArr);
        C2100o.U3(R4);
        t3 = C2100o.t(R4);
        return t3;
    }

    @l3.d
    public static final List<Long> Kv(@l3.d long[] jArr, @l3.d Comparator<? super Long> comparator) {
        List<Long> t3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Long[] S4 = C2100o.S4(jArr);
        C2100o.h4(S4, comparator);
        t3 = C2100o.t(S4);
        return t3;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Kw(float[] fArr, X2.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (float f4 : fArr) {
            i4 += selector.C(Float.valueOf(f4)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Short> Kx(@l3.d short[] sArr, int i4) {
        List<Short> k4;
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = sArr.length;
            if (i4 >= length) {
                return Ky(sArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Short.valueOf(sArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Short.valueOf(sArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Short> Ky(@l3.d short[] sArr) {
        List<Short> H3;
        List<Short> k4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Short.valueOf(sArr[0]));
            return k4;
        }
        return Uy(sArr);
    }

    @l3.d
    public static final <V> List<V> Kz(@l3.d byte[] bArr, @l3.d byte[] other, @l3.d X2.p<? super Byte, ? super Byte, ? extends V> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Byte.valueOf(bArr[i4]), Byte.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final kotlin.sequences.m<Short> L5(@l3.d short[] sArr) {
        kotlin.sequences.m<Short> g4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new l(sArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M L6(@l3.d long[] jArr, @l3.d M destination, @l3.d X2.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (long j4 : jArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Long.valueOf(j4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final byte L7(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr[2];
    }

    @kotlin.internal.f
    private static final int L8(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr.length;
    }

    @l3.d
    public static final List<Long> L9(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (long j4 : jArr) {
            if (z3) {
                arrayList.add(Long.valueOf(j4));
            } else if (!predicate.C(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final List<Character> La(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c4 : cArr) {
            if (!predicate.C(Character.valueOf(c4)).booleanValue()) {
                arrayList.add(Character.valueOf(c4));
            }
        }
        return arrayList;
    }

    public static final float Lb(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Lc(double[] dArr, C destination, X2.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final <R> R Ld(@l3.d long[] jArr, R r4, @l3.d X2.q<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (ve = ve(jArr); ve >= 0; ve--) {
            r4 = operation.z(Integer.valueOf(ve), Long.valueOf(jArr[ve]), r4);
        }
        return r4;
    }

    @l3.e
    public static final Double Le(@l3.d double[] dArr, int i4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (i4 >= 0 && i4 <= se(dArr)) {
            return Double.valueOf(dArr[i4]);
        }
        return null;
    }

    public static final int Lf(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Byte.valueOf(bArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Lg(@l3.d short[] sArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (short s4 : sArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Short.valueOf(s4)));
            } else {
                buffer.append(String.valueOf((int) s4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int Lh(@l3.d long[] jArr, long j4) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (j4 == jArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C Li(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (T t3 : tArr) {
            R C3 = transform.C(t3);
            if (C3 != null) {
                destination.add(C3);
            }
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R Lj(T[] tArr, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            R C3 = selector.C(tArr[0]);
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(tArr[it.c()]);
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double Lk(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        P it = new kotlin.ranges.l(1, we(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.c()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Ll(byte[] bArr, X2.l<? super Byte, Double> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            double doubleValue = selector.C(Byte.valueOf(bArr[0])).doubleValue();
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Byte.valueOf(bArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Lm(short[] sArr, X2.l<? super Short, Float> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Short.valueOf(sArr[0])).floatValue();
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Short.valueOf(sArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float Ln(@l3.d float[] fArr, @l3.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                float f5 = fArr[it.c()];
                if (comparator.compare(Float.valueOf(f4), Float.valueOf(f5)) > 0) {
                    f4 = f5;
                }
            }
            return f4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    public static final byte Lo(@l3.d byte[] bArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (bArr.length != 0) {
            return bArr[random.m(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final boolean Lp(@l3.d boolean[] zArr, @l3.d X2.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length != 0) {
            boolean z3 = zArr[0];
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                z3 = operation.z(Integer.valueOf(c4), Boolean.valueOf(z3), Boolean.valueOf(zArr[c4])).booleanValue();
            }
            return z3;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Long Lq(@l3.d long[] jArr, @l3.d X2.p<? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ve = ve(jArr);
        if (ve < 0) {
            return null;
        }
        long j4 = jArr[ve];
        for (int i4 = ve - 1; i4 >= 0; i4--) {
            j4 = operation.c0(Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
        }
        return Long.valueOf(j4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Lr(float[] fArr, R r4, X2.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Float.valueOf(fArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Ls(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        Ms(jArr, Random.f52425E);
    }

    @l3.d
    public static final List<Float> Lt(@l3.d float[] fArr, @l3.d kotlin.ranges.l indices) {
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return C2100o.q(C2100o.i1(fArr, indices.c().intValue(), indices.k().intValue() + 1));
    }

    @l3.d
    public static final List<Long> Lu(@l3.d long[] jArr) {
        List<Long> t3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        Long[] S4 = C2100o.S4(jArr);
        C2100o.U3(S4);
        t3 = C2100o.t(S4);
        return t3;
    }

    @l3.d
    public static <T> List<T> Lv(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        List<T> t3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        t3 = C2100o.t(ev(tArr, comparator));
        return t3;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Lw(int[] iArr, X2.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += selector.C(Integer.valueOf(i5)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Boolean> Lx(@l3.d boolean[] zArr, int i4) {
        List<Boolean> k4;
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int length = zArr.length;
            if (i4 >= length) {
                return Ly(zArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Boolean.valueOf(zArr[length - 1]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Boolean.valueOf(zArr[i5]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Boolean> Ly(@l3.d boolean[] zArr) {
        List<Boolean> H3;
        List<Boolean> k4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Boolean.valueOf(zArr[0]));
            return k4;
        }
        return Vy(zArr);
    }

    @l3.d
    public static final <R> List<Pair<Byte, R>> Lz(@l3.d byte[] bArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            byte b4 = bArr[i4];
            arrayList.add(C2122h0.a(Byte.valueOf(b4), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final kotlin.sequences.m<Boolean> M5(@l3.d boolean[] zArr) {
        kotlin.sequences.m<Boolean> g4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new q(zArr);
    }

    @l3.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M M6(@l3.d T[] tArr, @l3.d M destination, @l3.d X2.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (T t3 : tArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(t3);
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final char M7(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr[2];
    }

    public static final int M8(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final <T> List<T> M9(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (T t3 : tArr) {
            if (z3) {
                arrayList.add(t3);
            } else if (!predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final List<Double> Ma(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d4 : dArr) {
            if (!predicate.C(Double.valueOf(d4)).booleanValue()) {
                arrayList.add(Double.valueOf(d4));
            }
        }
        return arrayList;
    }

    public static final float Mb(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                return f4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Mc(float[] fArr, C destination, X2.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Md(@l3.d T[] tArr, R r4, @l3.d X2.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int we = we(tArr); we >= 0; we--) {
            r4 = operation.z(Integer.valueOf(we), tArr[we], r4);
        }
        return r4;
    }

    @l3.e
    public static final Float Me(@l3.d float[] fArr, int i4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (i4 >= 0 && i4 <= te(fArr)) {
            return Float.valueOf(fArr[i4]);
        }
        return null;
    }

    public static final int Mf(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Character.valueOf(cArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <A extends Appendable> A Mg(@l3.d boolean[] zArr, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Boolean, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (boolean z3 : zArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.C(Boolean.valueOf(z3)));
            } else {
                buffer.append(String.valueOf(z3));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> int Mh(@l3.d T[] tArr, T t3) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (t3 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i4 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i5 = length2 - 1;
                    if (kotlin.jvm.internal.F.g(t3, tArr[length2])) {
                        return length2;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length2 = i5;
                }
            }
        }
        return -1;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Mi(@l3.d byte[] bArr, @l3.d C destination, @l3.d X2.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (byte b4 : bArr) {
            destination.add(transform.C(Byte.valueOf(b4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Mj(short[] sArr, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            R C3 = selector.C(Short.valueOf(sArr[0]));
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Short.valueOf(sArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float Mk(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            f4 = Math.max(f4, fArr[it.c()]);
        }
        return Float.valueOf(f4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Ml(char[] cArr, X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            double doubleValue = selector.C(Character.valueOf(cArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Character.valueOf(cArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Mm(boolean[] zArr, X2.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Boolean.valueOf(zArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Boolean.valueOf(zArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final int Mn(@l3.d int[] iArr, @l3.d Comparator<? super Integer> comparator) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i5 = iArr[it.c()];
                if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) > 0) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final char Mo(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return No(cArr, Random.f52425E);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Boolean Mp(@l3.d boolean[] zArr, @l3.d X2.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            z3 = operation.z(Integer.valueOf(c4), Boolean.valueOf(z3), Boolean.valueOf(zArr[c4])).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S Mq(@l3.d T[] tArr, @l3.d X2.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int we = we(tArr);
        if (we < 0) {
            return null;
        }
        S s4 = (S) tArr[we];
        for (int i4 = we - 1; i4 >= 0; i4--) {
            s4 = operation.c0((Object) tArr[i4], s4);
        }
        return s4;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Mr(int[] iArr, R r4, X2.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Integer.valueOf(iArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Ms(@l3.d long[] jArr, @l3.d Random random) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (ve = ve(jArr); ve > 0; ve--) {
            int m4 = random.m(ve + 1);
            long j4 = jArr[ve];
            jArr[ve] = jArr[m4];
            jArr[m4] = j4;
        }
    }

    @l3.d
    public static final List<Integer> Mt(@l3.d int[] iArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> List<T> Mu(@l3.d T[] tArr) {
        List<T> t3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        t3 = C2100o.t(Uu(tArr));
        return t3;
    }

    @l3.d
    public static final List<Short> Mv(@l3.d short[] sArr, @l3.d Comparator<? super Short> comparator) {
        List<Short> t3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Short[] T4 = C2100o.T4(sArr);
        C2100o.h4(T4, comparator);
        t3 = C2100o.t(T4);
        return t3;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Mw(long[] jArr, X2.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (long j4 : jArr) {
            i4 += selector.C(Long.valueOf(j4)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Byte> Mx(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (qe = qe(bArr); -1 < qe; qe--) {
            if (!predicate.C(Byte.valueOf(bArr[qe])).booleanValue()) {
                return f9(bArr, qe + 1);
            }
        }
        return Dy(bArr);
    }

    @l3.d
    public static final long[] My(@l3.d Long[] lArr) {
        kotlin.jvm.internal.F.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    @l3.d
    public static final <R, V> List<V> Mz(@l3.d byte[] bArr, @l3.d R[] other, @l3.d X2.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Byte.valueOf(bArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> N5(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(bArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (byte b4 : bArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Byte.valueOf(b4));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M N6(@l3.d short[] sArr, @l3.d M destination, @l3.d X2.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Short.valueOf(s4));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final double N7(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr[2];
    }

    @l3.d
    public static final List<Byte> N8(@l3.d byte[] bArr) {
        List<Byte> V5;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        V5 = D.V5(Wy(bArr));
        return V5;
    }

    @l3.d
    public static final List<Short> N9(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (short s4 : sArr) {
            if (z3) {
                arrayList.add(Short.valueOf(s4));
            } else if (!predicate.C(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final List<Float> Na(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f4 : fArr) {
            if (!predicate.C(Float.valueOf(f4)).booleanValue()) {
                arrayList.add(Float.valueOf(f4));
            }
        }
        return arrayList;
    }

    public static int Nb(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Nc(int[] iArr, C destination, X2.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final <R> R Nd(@l3.d short[] sArr, R r4, @l3.d X2.q<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (xe = xe(sArr); xe >= 0; xe--) {
            r4 = operation.z(Integer.valueOf(xe), Short.valueOf(sArr[xe]), r4);
        }
        return r4;
    }

    @l3.e
    public static final Integer Ne(@l3.d int[] iArr, int i4) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (i4 >= 0) {
            ue = ue(iArr);
            if (i4 <= ue) {
                return Integer.valueOf(iArr[i4]);
            }
        }
        return null;
    }

    public static final int Nf(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Double.valueOf(dArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Ng(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Eg(bArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    public static int Nh(@l3.d short[] sArr, short s4) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (s4 == sArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ni(@l3.d char[] cArr, @l3.d C destination, @l3.d X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (char c4 : cArr) {
            destination.add(transform.C(Character.valueOf(c4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Nj(boolean[] zArr, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            R C3 = selector.C(Boolean.valueOf(zArr[0]));
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Boolean.valueOf(zArr[it.c()]));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float Nk(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        P it = new kotlin.ranges.l(1, we(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.c()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Nl(double[] dArr, X2.l<? super Double, Double> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            double doubleValue = selector.C(Double.valueOf(dArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Double.valueOf(dArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Nm(byte[] bArr, Comparator<? super R> comparator, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            Object obj = (R) selector.C(Byte.valueOf(bArr[0]));
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Byte.valueOf(bArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final long Nn(@l3.d long[] jArr, @l3.d Comparator<? super Long> comparator) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long j5 = jArr[it.c()];
                if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) > 0) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    public static final char No(@l3.d char[] cArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (cArr.length != 0) {
            return cArr[random.m(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Byte Np(@l3.d byte[] bArr, @l3.d X2.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            b4 = operation.z(Integer.valueOf(c4), Byte.valueOf(b4), Byte.valueOf(bArr[c4])).byteValue();
        }
        return Byte.valueOf(b4);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Short Nq(@l3.d short[] sArr, @l3.d X2.p<? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        xe = xe(sArr);
        if (xe < 0) {
            return null;
        }
        short s4 = sArr[xe];
        for (int i4 = xe - 1; i4 >= 0; i4--) {
            s4 = operation.c0(Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
        }
        return Short.valueOf(s4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Nr(long[] jArr, R r4, X2.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Long.valueOf(jArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final <T> void Ns(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        Os(tArr, Random.f52425E);
    }

    @l3.d
    public static final List<Integer> Nt(@l3.d int[] iArr, @l3.d kotlin.ranges.l indices) {
        int[] j12;
        List<Integer> r4;
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        j12 = C2100o.j1(iArr, indices.c().intValue(), indices.k().intValue() + 1);
        r4 = C2100o.r(j12);
        return r4;
    }

    @l3.d
    public static final List<Short> Nu(@l3.d short[] sArr) {
        List<Short> t3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        Short[] T4 = C2100o.T4(sArr);
        C2100o.U3(T4);
        t3 = C2100o.t(T4);
        return t3;
    }

    @l3.d
    public static final List<Boolean> Nv(@l3.d boolean[] zArr, @l3.d Comparator<? super Boolean> comparator) {
        List<Boolean> t3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Boolean[] M4 = C2100o.M4(zArr);
        C2100o.h4(M4, comparator);
        t3 = C2100o.t(M4);
        return t3;
    }

    @W2.i(name = "sumOfInt")
    public static final int Nw(@l3.d Integer[] numArr) {
        kotlin.jvm.internal.F.p(numArr, "<this>");
        int i4 = 0;
        for (Integer num : numArr) {
            i4 += num.intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Character> Nx(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int re = re(cArr); -1 < re; re--) {
            if (!predicate.C(Character.valueOf(cArr[re])).booleanValue()) {
                return g9(cArr, re + 1);
            }
        }
        return Ey(cArr);
    }

    @l3.d
    public static List<Byte> Ny(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b4 : bArr) {
            arrayList.add(Byte.valueOf(b4));
        }
        return arrayList;
    }

    @l3.d
    public static final <R> List<Pair<Character, R>> Nz(@l3.d char[] cArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = cArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Character.valueOf(cArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> O5(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(cArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (char c4 : cArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Character.valueOf(c4));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M O6(@l3.d boolean[] zArr, @l3.d M destination, @l3.d X2.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (boolean z3 : zArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Boolean.valueOf(z3));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final float O7(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr[2];
    }

    @l3.d
    public static final List<Character> O8(@l3.d char[] cArr) {
        List<Character> V5;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        V5 = D.V5(Xy(cArr));
        return V5;
    }

    @l3.d
    public static final List<Boolean> O9(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (boolean z4 : zArr) {
            if (z3) {
                arrayList.add(Boolean.valueOf(z4));
            } else if (!predicate.C(Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @l3.d
    public static final List<Integer> Oa(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (!predicate.C(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    public static final int Ob(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                return i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Oc(long[] jArr, C destination, X2.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final <R> R Od(@l3.d boolean[] zArr, R r4, @l3.d X2.q<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int ye = ye(zArr); ye >= 0; ye--) {
            r4 = operation.z(Integer.valueOf(ye), Boolean.valueOf(zArr[ye]), r4);
        }
        return r4;
    }

    @l3.e
    public static final Long Oe(@l3.d long[] jArr, int i4) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (i4 >= 0) {
            ve = ve(jArr);
            if (i4 <= ve) {
                return Long.valueOf(jArr[i4]);
            }
        }
        return null;
    }

    public static final int Of(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Float.valueOf(fArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Og(char[] cArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Fg(cArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    public static final int Oh(@l3.d boolean[] zArr, boolean z3) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (z3 == zArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Oi(@l3.d double[] dArr, @l3.d C destination, @l3.d X2.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (double d4 : dArr) {
            destination.add(transform.C(Double.valueOf(d4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Oj(byte[] bArr, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Byte.valueOf(bArr[0]));
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Byte.valueOf(bArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Integer Ok(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            if (i4 < i5) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Ol(float[] fArr, X2.l<? super Float, Double> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            double doubleValue = selector.C(Float.valueOf(fArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Float.valueOf(fArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Om(char[] cArr, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            Object obj = (R) selector.C(Character.valueOf(cArr[0]));
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Character.valueOf(cArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T> T On(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (tArr.length != 0) {
            T t3 = tArr[0];
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                if (comparator.compare(t3, t4) > 0) {
                    t3 = t4;
                }
            }
            return t3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final double Oo(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return Po(dArr, Random.f52425E);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Character Op(@l3.d char[] cArr, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            int c5 = it.c();
            c4 = operation.z(Integer.valueOf(c5), Character.valueOf(c4), Character.valueOf(cArr[c5])).charValue();
        }
        return Character.valueOf(c4);
    }

    @l3.d
    public static final <T> T[] Oq(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        for (T t3 : tArr) {
            if (t3 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> Or(@l3.d T[] tArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, tArr[i4]);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final <T> void Os(@l3.d T[] tArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (int we = we(tArr); we > 0; we--) {
            int m4 = random.m(we + 1);
            T t3 = tArr[we];
            tArr[we] = tArr[m4];
            tArr[m4] = t3;
        }
    }

    @l3.d
    public static final List<Long> Ot(@l3.d long[] jArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final byte[] Ou(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.G3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Byte> Ov(@l3.d byte[] bArr, @l3.d Iterable<Byte> other) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Byte> Wy = Wy(bArr);
        kotlin.collections.A.H0(Wy, other);
        return Wy;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> int Ow(T[] tArr, X2.l<? super T, Integer> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (T t3 : tArr) {
            i4 += selector.C(t3).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Double> Ox(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int se = se(dArr); -1 < se; se--) {
            if (!predicate.C(Double.valueOf(dArr[se])).booleanValue()) {
                return h9(dArr, se + 1);
            }
        }
        return Fy(dArr);
    }

    @l3.d
    public static final List<Character> Oy(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c4 : cArr) {
            arrayList.add(Character.valueOf(c4));
        }
        return arrayList;
    }

    @l3.d
    public static final <R, V> List<V> Oz(@l3.d char[] cArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Character, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = cArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Character.valueOf(cArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> P5(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(dArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (double d4 : dArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Double.valueOf(d4));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Byte, V> P6(byte[] bArr, X2.l<? super Byte, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(bArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (byte b4 : bArr) {
            linkedHashMap.put(Byte.valueOf(b4), valueSelector.C(Byte.valueOf(b4)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final int P7(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr[2];
    }

    @l3.d
    public static final List<Double> P8(@l3.d double[] dArr) {
        List<Double> V5;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        V5 = D.V5(Yy(dArr));
        return V5;
    }

    @kotlin.internal.f
    private static final byte P9(byte[] bArr, int i4, X2.l<? super Integer, Byte> defaultValue) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            qe = qe(bArr);
            if (i4 <= qe) {
                return bArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).byteValue();
    }

    @l3.d
    public static final List<Long> Pa(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (!predicate.C(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            }
        }
        return arrayList;
    }

    public static long Pb(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R, C extends Collection<? super R>> C Pc(T[] tArr, C destination, X2.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final void Pd(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, H0> action) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (byte b4 : bArr) {
            action.C(Byte.valueOf(b4));
        }
    }

    @l3.e
    public static <T> T Pe(@l3.d T[] tArr, int i4) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (i4 >= 0 && i4 <= we(tArr)) {
            return tArr[i4];
        }
        return null;
    }

    public static final int Pf(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Integer.valueOf(iArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Pg(double[] dArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Gg(dArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Boolean Ph(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Pi(@l3.d float[] fArr, @l3.d C destination, @l3.d X2.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (float f4 : fArr) {
            destination.add(transform.C(Float.valueOf(f4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Pj(char[] cArr, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Character.valueOf(cArr[0]));
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Character.valueOf(cArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Long Pk(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            if (j4 < j5) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Pl(int[] iArr, X2.l<? super Integer, Double> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            double doubleValue = selector.C(Integer.valueOf(iArr[0])).doubleValue();
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Integer.valueOf(iArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Pm(double[] dArr, Comparator<? super R> comparator, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            Object obj = (R) selector.C(Double.valueOf(dArr[0]));
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Double.valueOf(dArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final short Pn(@l3.d short[] sArr, @l3.d Comparator<? super Short> comparator) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short s5 = sArr[it.c()];
                if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) > 0) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    public static final double Po(@l3.d double[] dArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (dArr.length != 0) {
            return dArr[random.m(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double Pp(@l3.d double[] dArr, @l3.d X2.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            d4 = operation.z(Integer.valueOf(c4), Double.valueOf(d4), Double.valueOf(dArr[c4])).doubleValue();
        }
        return Double.valueOf(d4);
    }

    public static void Pq(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length >= 0) {
            qe = qe(bArr);
            P it = new kotlin.ranges.l(0, length).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                byte b4 = bArr[c4];
                bArr[c4] = bArr[qe];
                bArr[qe] = b4;
                qe--;
            }
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Pr(short[] sArr, R r4, X2.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Short.valueOf(sArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Ps(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        Qs(sArr, Random.f52425E);
    }

    @l3.d
    public static final List<Long> Pt(@l3.d long[] jArr, @l3.d kotlin.ranges.l indices) {
        long[] k12;
        List<Long> s4;
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        k12 = C2100o.k1(jArr, indices.c().intValue(), indices.k().intValue() + 1);
        s4 = C2100o.s(k12);
        return s4;
    }

    @l3.d
    public static final char[] Pu(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.I3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Character> Pv(@l3.d char[] cArr, @l3.d Iterable<Character> other) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Character> Xy = Xy(cArr);
        kotlin.collections.A.H0(Xy, other);
        return Xy;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Pw(short[] sArr, X2.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (short s4 : sArr) {
            i4 += selector.C(Short.valueOf(s4)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Float> Px(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int te = te(fArr); -1 < te; te--) {
            if (!predicate.C(Float.valueOf(fArr[te])).booleanValue()) {
                return i9(fArr, te + 1);
            }
        }
        return Gy(fArr);
    }

    @l3.d
    public static final List<Double> Py(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d4 : dArr) {
            arrayList.add(Double.valueOf(d4));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Pair<Character, Character>> Pz(@l3.d char[] cArr, @l3.d char[] other) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Character.valueOf(cArr[i4]), Character.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> Q5(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(fArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (float f4 : fArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Float.valueOf(f4));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Character, V> Q6(char[] cArr, X2.l<? super Character, ? extends V> valueSelector) {
        int B3;
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        B3 = kotlin.ranges.u.B(cArr.length, 128);
        j4 = X.j(B3);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (char c4 : cArr) {
            linkedHashMap.put(Character.valueOf(c4), valueSelector.C(Character.valueOf(c4)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final long Q7(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr[2];
    }

    @l3.d
    public static final List<Float> Q8(@l3.d float[] fArr) {
        List<Float> V5;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        V5 = D.V5(Zy(fArr));
        return V5;
    }

    @kotlin.internal.f
    private static final char Q9(char[] cArr, int i4, X2.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= re(cArr)) {
            return cArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).charValue();
    }

    @l3.d
    public static final <T> List<T> Qa(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            if (!predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final long Qb(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                return j4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Qc(short[] sArr, C destination, X2.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final void Qd(@l3.d char[] cArr, @l3.d X2.l<? super Character, H0> action) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (char c4 : cArr) {
            action.C(Character.valueOf(c4));
        }
    }

    @l3.e
    public static final Short Qe(@l3.d short[] sArr, int i4) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (i4 >= 0) {
            xe = xe(sArr);
            if (i4 <= xe) {
                return Short.valueOf(sArr[i4]);
            }
        }
        return null;
    }

    public static final int Qf(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Long.valueOf(jArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Qg(float[] fArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Hg(fArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Boolean Qh(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            boolean z3 = zArr[length];
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return Boolean.valueOf(z3);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Qi(@l3.d int[] iArr, @l3.d C destination, @l3.d X2.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 : iArr) {
            destination.add(transform.C(Integer.valueOf(i4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Qj(double[] dArr, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Double.valueOf(dArr[0]));
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Double.valueOf(dArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Short Qk(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            if (s4 < s5) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Ql(long[] jArr, X2.l<? super Long, Double> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            double doubleValue = selector.C(Long.valueOf(jArr[0])).doubleValue();
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Long.valueOf(jArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Qm(float[] fArr, Comparator<? super R> comparator, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            Object obj = (R) selector.C(Float.valueOf(fArr[0]));
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Float.valueOf(fArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final boolean Qn(@l3.d boolean[] zArr, @l3.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z3 = zArr[0];
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                boolean z4 = zArr[it.c()];
                if (comparator.compare(Boolean.valueOf(z3), Boolean.valueOf(z4)) > 0) {
                    z3 = z4;
                }
            }
            return z3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final float Qo(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return Ro(fArr, Random.f52425E);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float Qp(@l3.d float[] fArr, @l3.d X2.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            f4 = operation.z(Integer.valueOf(c4), Float.valueOf(f4), Float.valueOf(fArr[c4])).floatValue();
        }
        return Float.valueOf(f4);
    }

    @kotlin.Y(version = "1.4")
    public static void Qq(@l3.d byte[] bArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, bArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            byte b4 = bArr[i4];
            bArr[i4] = bArr[i7];
            bArr[i7] = b4;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Qr(boolean[] zArr, R r4, X2.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Boolean.valueOf(zArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Qs(@l3.d short[] sArr, @l3.d Random random) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (xe = xe(sArr); xe > 0; xe--) {
            int m4 = random.m(xe + 1);
            short s4 = sArr[xe];
            sArr[xe] = sArr[m4];
            sArr[m4] = s4;
        }
    }

    @l3.d
    public static final <T> List<T> Qt(@l3.d T[] tArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<T> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @l3.d
    public static final double[] Qu(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.K3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Double> Qv(@l3.d double[] dArr, @l3.d Iterable<Double> other) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Double> Yy = Yy(dArr);
        kotlin.collections.A.H0(Yy, other);
        return Yy;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int Qw(boolean[] zArr, X2.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (boolean z3 : zArr) {
            i4 += selector.C(Boolean.valueOf(z3)).intValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Integer> Qx(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        int ue;
        List<Integer> Hy;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (ue = ue(iArr); -1 < ue; ue--) {
            if (!predicate.C(Integer.valueOf(iArr[ue])).booleanValue()) {
                return j9(iArr, ue + 1);
            }
        }
        Hy = Hy(iArr);
        return Hy;
    }

    @l3.d
    public static final List<Float> Qy(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f4 : fArr) {
            arrayList.add(Float.valueOf(f4));
        }
        return arrayList;
    }

    @l3.d
    public static final <V> List<V> Qz(@l3.d char[] cArr, @l3.d char[] other, @l3.d X2.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Character.valueOf(cArr[i4]), Character.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> R5(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(iArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 : iArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Integer.valueOf(i4));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Double, V> R6(double[] dArr, X2.l<? super Double, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(dArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (double d4 : dArr) {
            linkedHashMap.put(Double.valueOf(d4), valueSelector.C(Double.valueOf(d4)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <T> T R7(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr[2];
    }

    @l3.d
    public static final List<Integer> R8(@l3.d int[] iArr) {
        List<Integer> V5;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        V5 = D.V5(az(iArr));
        return V5;
    }

    @kotlin.internal.f
    private static final double R9(double[] dArr, int i4, X2.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= se(dArr)) {
            return dArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).doubleValue();
    }

    @l3.d
    public static final List<Short> Ra(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.C(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    public static final <T> T Rb(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C Rc(boolean[] zArr, C destination, X2.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final void Rd(@l3.d double[] dArr, @l3.d X2.l<? super Double, H0> action) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (double d4 : dArr) {
            action.C(Double.valueOf(d4));
        }
    }

    @l3.d
    public static final <K> Map<K, List<Byte>> Re(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b4 : bArr) {
            K C3 = keySelector.C(Byte.valueOf(b4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Byte.valueOf(b4));
        }
        return linkedHashMap;
    }

    public static final <T> int Rf(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(tArr[i4]).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Rg(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Ig(iArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Byte Rh(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ri(@l3.d long[] jArr, @l3.d C destination, @l3.d X2.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (long j4 : jArr) {
            destination.add(transform.C(Long.valueOf(j4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Rj(float[] fArr, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Float.valueOf(fArr[0]));
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Float.valueOf(fArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final byte Rk(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte b5 = bArr[it.c()];
                if (b4 < b5) {
                    b4 = b5;
                }
            }
            return b4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double Rl(T[] tArr, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            double doubleValue = selector.C(tArr[0]).doubleValue();
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(tArr[it.c()]).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Rm(int[] iArr, Comparator<? super R> comparator, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            Object obj = (R) selector.C(Integer.valueOf(iArr[0]));
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Integer.valueOf(iArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean Rn(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    @kotlin.Y(version = "1.3")
    public static final float Ro(@l3.d float[] fArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (fArr.length != 0) {
            return fArr[random.m(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Integer Rp(@l3.d int[] iArr, @l3.d X2.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            i4 = operation.z(Integer.valueOf(c4), Integer.valueOf(i4), Integer.valueOf(iArr[c4])).intValue();
        }
        return Integer.valueOf(i4);
    }

    public static final void Rq(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int re = re(cArr);
        P it = new kotlin.ranges.l(0, length).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            char c5 = cArr[c4];
            cArr[c4] = cArr[re];
            cArr[re] = c5;
            re--;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Byte> Rr(byte[] bArr, X2.p<? super Byte, ? super Byte, Byte> operation) {
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        byte b4 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b4));
        int length = bArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            b4 = operation.c0(Byte.valueOf(b4), Byte.valueOf(bArr[i4])).byteValue();
            arrayList.add(Byte.valueOf(b4));
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Rs(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        Ss(zArr, Random.f52425E);
    }

    @l3.d
    public static final <T> List<T> Rt(@l3.d T[] tArr, @l3.d kotlin.ranges.l indices) {
        Object[] l12;
        List<T> t3;
        List<T> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        l12 = C2100o.l1(tArr, indices.c().intValue(), indices.k().intValue() + 1);
        t3 = C2100o.t(l12);
        return t3;
    }

    @l3.d
    public static final float[] Ru(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.M3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Float> Rv(@l3.d float[] fArr, @l3.d Iterable<Float> other) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Float> Zy = Zy(fArr);
        kotlin.collections.A.H0(Zy, other);
        return Zy;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Rw(byte[] bArr, X2.l<? super Byte, Long> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (byte b4 : bArr) {
            j4 += selector.C(Byte.valueOf(b4)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Long> Rx(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (ve = ve(jArr); -1 < ve; ve--) {
            if (!predicate.C(Long.valueOf(jArr[ve])).booleanValue()) {
                return k9(jArr, ve + 1);
            }
        }
        return Iy(jArr);
    }

    @l3.d
    public static List<Integer> Ry(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    @l3.d
    public static final <R> List<Pair<Character, R>> Rz(@l3.d char[] cArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            char c4 = cArr[i4];
            arrayList.add(C2122h0.a(Character.valueOf(c4), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> S5(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(jArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (long j5 : jArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Long.valueOf(j5));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Float, V> S6(float[] fArr, X2.l<? super Float, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(fArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (float f4 : fArr) {
            linkedHashMap.put(Float.valueOf(f4), valueSelector.C(Float.valueOf(f4)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final short S7(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr[2];
    }

    @l3.d
    public static final List<Long> S8(@l3.d long[] jArr) {
        List<Long> V5;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        V5 = D.V5(bz(jArr));
        return V5;
    }

    @kotlin.internal.f
    private static final float S9(float[] fArr, int i4, X2.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= te(fArr)) {
            return fArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).floatValue();
    }

    @l3.d
    public static final List<Boolean> Sa(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z3 : zArr) {
            if (!predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z3));
            }
        }
        return arrayList;
    }

    public static final <T> T Sb(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @W2.i(name = "flatMapIndexedSequence")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> List<R> Sc(T[] tArr, X2.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.r0(arrayList, transform.c0(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final void Sd(@l3.d float[] fArr, @l3.d X2.l<? super Float, H0> action) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (float f4 : fArr) {
            action.C(Float.valueOf(f4));
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> Se(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends K> keySelector, @l3.d X2.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b4 : bArr) {
            K C3 = keySelector.C(Byte.valueOf(b4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Byte.valueOf(b4)));
        }
        return linkedHashMap;
    }

    public static final int Sf(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Short.valueOf(sArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Sg(long[] jArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Jg(jArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Byte Sh(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            byte b4 = bArr[length];
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return Byte.valueOf(b4);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C Si(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (T t3 : tArr) {
            destination.add(transform.C(t3));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Sj(int[] iArr, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Integer.valueOf(iArr[0]));
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Integer.valueOf(iArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final char Sk(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                char c5 = cArr[it.c()];
                if (kotlin.jvm.internal.F.t(c4, c5) < 0) {
                    c4 = c5;
                }
            }
            return c4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Sl(short[] sArr, X2.l<? super Short, Double> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            double doubleValue = selector.C(Short.valueOf(sArr[0])).doubleValue();
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Short.valueOf(sArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Sm(long[] jArr, Comparator<? super R> comparator, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            Object obj = (R) selector.C(Long.valueOf(jArr[0]));
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Long.valueOf(jArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean Sn(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final int So(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return To(iArr, Random.f52425E);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Long Sp(@l3.d long[] jArr, @l3.d X2.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            j4 = operation.z(Integer.valueOf(c4), Long.valueOf(j4), Long.valueOf(jArr[c4])).longValue();
        }
        return Long.valueOf(j4);
    }

    @kotlin.Y(version = "1.4")
    public static final void Sq(@l3.d char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, cArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            char c4 = cArr[i4];
            cArr[i4] = cArr[i7];
            cArr[i7] = c4;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Character> Sr(char[] cArr, X2.p<? super Character, ? super Character, Character> operation) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        char c4 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c4));
        int length = cArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            c4 = operation.c0(Character.valueOf(c4), Character.valueOf(cArr[i4])).charValue();
            arrayList.add(Character.valueOf(c4));
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.4")
    public static final void Ss(@l3.d boolean[] zArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (int ye = ye(zArr); ye > 0; ye--) {
            int m4 = random.m(ye + 1);
            boolean z3 = zArr[ye];
            zArr[ye] = zArr[m4];
            zArr[m4] = z3;
        }
    }

    @l3.d
    public static final List<Short> St(@l3.d short[] sArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final int[] Su(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.O3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Integer> Sv(@l3.d int[] iArr, @l3.d Iterable<Integer> other) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Integer> az = az(iArr);
        kotlin.collections.A.H0(az, other);
        return az;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Sw(char[] cArr, X2.l<? super Character, Long> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (char c4 : cArr) {
            j4 += selector.C(Character.valueOf(c4)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final <T> List<T> Sx(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        List<T> Jy;
        List<T> l9;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int we = we(tArr); -1 < we; we--) {
            if (!predicate.C(tArr[we]).booleanValue()) {
                l9 = l9(tArr, we + 1);
                return l9;
            }
        }
        Jy = Jy(tArr);
        return Jy;
    }

    @l3.d
    public static final List<Long> Sy(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j4 : jArr) {
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    @l3.d
    public static final <R, V> List<V> Sz(@l3.d char[] cArr, @l3.d R[] other, @l3.d X2.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Character.valueOf(cArr[i4]), other[i4]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, K, V> Map<K, V> T5(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(tArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (A1.a aVar : tArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(aVar);
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Integer, V> T6(int[] iArr, X2.l<? super Integer, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(iArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 : iArr) {
            linkedHashMap.put(Integer.valueOf(i4), valueSelector.C(Integer.valueOf(i4)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final boolean T7(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr[2];
    }

    @l3.d
    public static final <T> List<T> T8(@l3.d T[] tArr) {
        List<T> V5;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        V5 = D.V5(cz(tArr));
        return V5;
    }

    @kotlin.internal.f
    private static final int T9(int[] iArr, int i4, X2.l<? super Integer, Integer> defaultValue) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ue = ue(iArr);
            if (i4 <= ue) {
                return iArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).intValue();
    }

    @l3.d
    public static <T> List<T> Ta(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return (List) Ua(tArr, new ArrayList());
    }

    public static short Tb(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @W2.i(name = "flatMapIndexedSequenceTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R, C extends Collection<? super R>> C Tc(T[] tArr, C destination, X2.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            kotlin.collections.A.r0(destination, transform.c0(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return destination;
    }

    public static final void Td(@l3.d int[] iArr, @l3.d X2.l<? super Integer, H0> action) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (int i4 : iArr) {
            action.C(Integer.valueOf(i4));
        }
    }

    @l3.d
    public static final <K> Map<K, List<Character>> Te(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c4 : cArr) {
            K C3 = keySelector.C(Character.valueOf(c4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Character.valueOf(c4));
        }
        return linkedHashMap;
    }

    public static final int Tf(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Boolean.valueOf(zArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Tg(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Kg(objArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Character Th(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ti(@l3.d short[] sArr, @l3.d C destination, @l3.d X2.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (short s4 : sArr) {
            destination.add(transform.C(Short.valueOf(s4)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Tj(long[] jArr, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Long.valueOf(jArr[0]));
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Long.valueOf(jArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double Tk(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                d4 = Math.max(d4, dArr[it.c()]);
            }
            return d4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double Tl(boolean[] zArr, X2.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            double doubleValue = selector.C(Boolean.valueOf(zArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Boolean.valueOf(zArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R Tm(T[] tArr, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            Object obj = (R) selector.C(tArr[0]);
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(tArr[it.c()]);
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean Tn(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return true;
        }
        return false;
    }

    @kotlin.Y(version = "1.3")
    public static final int To(@l3.d int[] iArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (iArr.length != 0) {
            return iArr[random.m(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S Tp(@l3.d T[] tArr, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s4 = (S) tArr[0];
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            s4 = operation.z(Integer.valueOf(c4), s4, (Object) tArr[c4]);
        }
        return s4;
    }

    public static final void Tq(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int se = se(dArr);
        P it = new kotlin.ranges.l(0, length).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            double d4 = dArr[c4];
            dArr[c4] = dArr[se];
            dArr[se] = d4;
            se--;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Double> Tr(double[] dArr, X2.p<? super Double, ? super Double, Double> operation) {
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        double d4 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d4));
        int length = dArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            d4 = operation.c0(Double.valueOf(d4), Double.valueOf(dArr[i4])).doubleValue();
            arrayList.add(Double.valueOf(d4));
        }
        return arrayList;
    }

    public static byte Ts(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length == 1) {
                return bArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final List<Short> Tt(@l3.d short[] sArr, @l3.d kotlin.ranges.l indices) {
        short[] m12;
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        m12 = C2100o.m1(sArr, indices.c().intValue(), indices.k().intValue() + 1);
        return C2100o.u(m12);
    }

    @l3.d
    public static final long[] Tu(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.Q3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Long> Tv(@l3.d long[] jArr, @l3.d Iterable<Long> other) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Long> bz = bz(jArr);
        kotlin.collections.A.H0(bz, other);
        return bz;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Tw(double[] dArr, X2.l<? super Double, Long> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (double d4 : dArr) {
            j4 += selector.C(Double.valueOf(d4)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Short> Tx(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (xe = xe(sArr); -1 < xe; xe--) {
            if (!predicate.C(Short.valueOf(sArr[xe])).booleanValue()) {
                return m9(sArr, xe + 1);
            }
        }
        return Ky(sArr);
    }

    @l3.d
    public static final <T> List<T> Ty(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.t(tArr));
    }

    @l3.d
    public static final <R> List<Pair<Double, R>> Tz(@l3.d double[] dArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = dArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Double.valueOf(dArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    public static final boolean U4(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (!predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K, V> Map<K, V> U5(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(sArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Short.valueOf(s4));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Long, V> U6(long[] jArr, X2.l<? super Long, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(jArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (long j5 : jArr) {
            linkedHashMap.put(Long.valueOf(j5), valueSelector.C(Long.valueOf(j5)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final byte U7(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr[3];
    }

    @l3.d
    public static final List<Short> U8(@l3.d short[] sArr) {
        List<Short> V5;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        V5 = D.V5(dz(sArr));
        return V5;
    }

    @kotlin.internal.f
    private static final long U9(long[] jArr, int i4, X2.l<? super Integer, Long> defaultValue) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ve = ve(jArr);
            if (i4 <= ve) {
                return jArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).longValue();
    }

    @l3.d
    public static final <C extends Collection<? super T>, T> C Ua(@l3.d T[] tArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (T t3 : tArr) {
            if (t3 != null) {
                destination.add(t3);
            }
        }
        return destination;
    }

    public static final short Ub(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                return s4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    @W2.i(name = "flatMapSequence")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> Uc(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            kotlin.collections.A.r0(arrayList, transform.C(t3));
        }
        return arrayList;
    }

    public static final void Ud(@l3.d long[] jArr, @l3.d X2.l<? super Long, H0> action) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (long j4 : jArr) {
            action.C(Long.valueOf(j4));
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> Ue(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c4 : cArr) {
            K C3 = keySelector.C(Character.valueOf(c4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Character.valueOf(c4)));
        }
        return linkedHashMap;
    }

    public static final int Uf(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Ug(short[] sArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Lg(sArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Character Uh(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            char c4 = cArr[length];
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                return Character.valueOf(c4);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Ui(@l3.d boolean[] zArr, @l3.d C destination, @l3.d X2.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (boolean z3 : zArr) {
            destination.add(transform.C(Boolean.valueOf(z3)));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R Uj(T[] tArr, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R C3 = selector.C(tArr[0]);
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(tArr[it.c()]);
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double Uk(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length != 0) {
            double doubleValue = dArr[0].doubleValue();
            P it = new kotlin.ranges.l(1, we(dArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, dArr[it.c()].doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Ul(byte[] bArr, X2.l<? super Byte, Float> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            float floatValue = selector.C(Byte.valueOf(bArr[0])).floatValue();
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Byte.valueOf(bArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Um(short[] sArr, Comparator<? super R> comparator, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            Object obj = (R) selector.C(Short.valueOf(sArr[0]));
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Short.valueOf(sArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean Un(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final long Uo(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return Vo(jArr, Random.f52425E);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Short Up(@l3.d short[] sArr, @l3.d X2.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            s4 = operation.z(Integer.valueOf(c4), Short.valueOf(s4), Short.valueOf(sArr[c4])).shortValue();
        }
        return Short.valueOf(s4);
    }

    @kotlin.Y(version = "1.4")
    public static final void Uq(@l3.d double[] dArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, dArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            double d4 = dArr[i4];
            dArr[i4] = dArr[i7];
            dArr[i7] = d4;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Float> Ur(float[] fArr, X2.p<? super Float, ? super Float, Float> operation) {
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        float f4 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f4));
        int length = fArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            f4 = operation.c0(Float.valueOf(f4), Float.valueOf(fArr[i4])).floatValue();
            arrayList.add(Float.valueOf(f4));
        }
        return arrayList;
    }

    public static final byte Us(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Byte b4 = null;
        boolean z3 = false;
        for (byte b5 : bArr) {
            if (predicate.C(Byte.valueOf(b5)).booleanValue()) {
                if (!z3) {
                    b4 = Byte.valueOf(b5);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(b4, "null cannot be cast to non-null type kotlin.Byte");
            return b4.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final List<Boolean> Ut(@l3.d boolean[] zArr, @l3.d Iterable<Integer> indices) {
        int b02;
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> T[] Uu(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        C2100o.U3(tArr2);
        return tArr2;
    }

    @l3.d
    public static final <T> Set<T> Uv(@l3.d T[] tArr, @l3.d Iterable<? extends T> other) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<T> cz = cz(tArr);
        kotlin.collections.A.H0(cz, other);
        return cz;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Uw(float[] fArr, X2.l<? super Float, Long> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (float f4 : fArr) {
            j4 += selector.C(Float.valueOf(f4)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Boolean> Ux(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int ye = ye(zArr); -1 < ye; ye--) {
            if (!predicate.C(Boolean.valueOf(zArr[ye])).booleanValue()) {
                return n9(zArr, ye + 1);
            }
        }
        return Ly(zArr);
    }

    @l3.d
    public static final List<Short> Uy(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @l3.d
    public static final <R, V> List<V> Uz(@l3.d double[] dArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Double, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = dArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Double.valueOf(dArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    public static final boolean V4(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (!predicate.C(Character.valueOf(c4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K, V> Map<K, V> V5(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(zArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (boolean z3 : zArr) {
            Pair<? extends K, ? extends V> C3 = transform.C(Boolean.valueOf(z3));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <K, V> Map<K, V> V6(@l3.d K[] kArr, @l3.d X2.l<? super K, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(kArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(kArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (K k4 : kArr) {
            linkedHashMap.put(k4, valueSelector.C(k4));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final char V7(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr[3];
    }

    @l3.d
    public static final List<Boolean> V8(@l3.d boolean[] zArr) {
        List<Boolean> V5;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        V5 = D.V5(ez(zArr));
        return V5;
    }

    @kotlin.internal.f
    private static final <T> T V9(T[] tArr, int i4, X2.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= we(tArr)) {
            return tArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4));
    }

    @l3.d
    public static final <C extends Collection<? super Byte>> C Va(@l3.d byte[] bArr, @l3.d C destination, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (!predicate.C(Byte.valueOf(b4)).booleanValue()) {
                destination.add(Byte.valueOf(b4));
            }
        }
        return destination;
    }

    public static final boolean Vb(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    @W2.i(name = "flatMapSequenceTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C Vc(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (T t3 : tArr) {
            kotlin.collections.A.r0(destination, transform.C(t3));
        }
        return destination;
    }

    public static final <T> void Vd(@l3.d T[] tArr, @l3.d X2.l<? super T, H0> action) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (T t3 : tArr) {
            action.C(t3);
        }
    }

    @l3.d
    public static final <K> Map<K, List<Double>> Ve(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d4 : dArr) {
            K C3 = keySelector.C(Double.valueOf(d4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Double.valueOf(d4));
        }
        return linkedHashMap;
    }

    public static final int Vf(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Vg(boolean[] zArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return Mg(zArr, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.e
    public static final Double Vh(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean Vi(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        int ye = ye(zArr);
        if (ye == 0) {
            return Boolean.valueOf(z3);
        }
        R C3 = selector.C(Boolean.valueOf(z3));
        P it = new kotlin.ranges.l(1, ye).iterator();
        while (it.hasNext()) {
            boolean z4 = zArr[it.c()];
            R C4 = selector.C(Boolean.valueOf(z4));
            if (C3.compareTo(C4) < 0) {
                z3 = z4;
                C3 = C4;
            }
        }
        return Boolean.valueOf(z3);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Vj(short[] sArr, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Short.valueOf(sArr[0]));
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Short.valueOf(sArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float Vk(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                f4 = Math.max(f4, fArr[it.c()]);
            }
            return f4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Vl(char[] cArr, X2.l<? super Character, Float> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            float floatValue = selector.C(Character.valueOf(cArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Character.valueOf(cArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Vm(boolean[] zArr, Comparator<? super R> comparator, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            Object obj = (R) selector.C(Boolean.valueOf(zArr[0]));
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Boolean.valueOf(zArr[it.c()]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean Vn(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return true;
        }
        return false;
    }

    @kotlin.Y(version = "1.3")
    public static final long Vo(@l3.d long[] jArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (jArr.length != 0) {
            return jArr[random.m(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Boolean Vp(@l3.d boolean[] zArr, @l3.d X2.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            z3 = operation.c0(Boolean.valueOf(z3), Boolean.valueOf(zArr[it.c()])).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    public static final void Vq(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int te = te(fArr);
        P it = new kotlin.ranges.l(0, length).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            float f4 = fArr[c4];
            fArr[c4] = fArr[te];
            fArr[te] = f4;
            te--;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Integer> Vr(int[] iArr, X2.p<? super Integer, ? super Integer, Integer> operation) {
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        int i4 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i4));
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = operation.c0(Integer.valueOf(i4), Integer.valueOf(iArr[i5])).intValue();
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static char Vs(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final List<Boolean> Vt(@l3.d boolean[] zArr, @l3.d kotlin.ranges.l indices) {
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return C2100o.v(C2100o.n1(zArr, indices.c().intValue(), indices.k().intValue() + 1));
    }

    @l3.d
    public static final short[] Vu(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.W3(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Short> Vv(@l3.d short[] sArr, @l3.d Iterable<Short> other) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Short> dz = dz(sArr);
        kotlin.collections.A.H0(dz, other);
        return dz;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Vw(int[] iArr, X2.l<? super Integer, Long> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (int i4 : iArr) {
            j4 += selector.C(Integer.valueOf(i4)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Byte> Vx(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b4 : bArr) {
            if (!predicate.C(Byte.valueOf(b4)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b4));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Boolean> Vy(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z3 : zArr) {
            arrayList.add(Boolean.valueOf(z3));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Pair<Double, Double>> Vz(@l3.d double[] dArr, @l3.d double[] other) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Double.valueOf(dArr[i4]), Double.valueOf(other[i4])));
        }
        return arrayList;
    }

    public static final boolean W4(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (!predicate.C(Double.valueOf(d4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K> Map<K, Byte> W5(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(bArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (byte b4 : bArr) {
            linkedHashMap.put(keySelector.C(Byte.valueOf(b4)), Byte.valueOf(b4));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Short, V> W6(short[] sArr, X2.l<? super Short, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(sArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (short s4 : sArr) {
            linkedHashMap.put(Short.valueOf(s4), valueSelector.C(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final double W7(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr[3];
    }

    @l3.d
    public static final <K> List<Byte> W8(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends K> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b4 : bArr) {
            if (hashSet.add(selector.C(Byte.valueOf(b4)))) {
                arrayList.add(Byte.valueOf(b4));
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final short W9(short[] sArr, int i4, X2.l<? super Integer, Short> defaultValue) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            xe = xe(sArr);
            if (i4 <= xe) {
                return sArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).shortValue();
    }

    @l3.d
    public static final <C extends Collection<? super Character>> C Wa(@l3.d char[] cArr, @l3.d C destination, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (!predicate.C(Character.valueOf(c4)).booleanValue()) {
                destination.add(Character.valueOf(c4));
            }
        }
        return destination;
    }

    public static final boolean Wb(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return z3;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Wc(@l3.d byte[] bArr, @l3.d C destination, @l3.d X2.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (byte b4 : bArr) {
            kotlin.collections.A.q0(destination, transform.C(Byte.valueOf(b4)));
        }
        return destination;
    }

    public static final void Wd(@l3.d short[] sArr, @l3.d X2.l<? super Short, H0> action) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (short s4 : sArr) {
            action.C(Short.valueOf(s4));
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> We(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends K> keySelector, @l3.d X2.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d4 : dArr) {
            K C3 = keySelector.C(Double.valueOf(d4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Double.valueOf(d4)));
        }
        return linkedHashMap;
    }

    public static final int Wf(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final String Wg(@l3.d byte[] bArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Eg(bArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Double Wh(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            double d4 = dArr[length];
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                return Double.valueOf(d4);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte Wi(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        if (qe == 0) {
            return Byte.valueOf(b4);
        }
        R C3 = selector.C(Byte.valueOf(b4));
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            R C4 = selector.C(Byte.valueOf(b5));
            if (C3.compareTo(C4) < 0) {
                b4 = b5;
                C3 = C4;
            }
        }
        return Byte.valueOf(b4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Wj(boolean[] zArr, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Boolean.valueOf(zArr[0]));
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Boolean.valueOf(zArr[it.c()]));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float Wk(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length != 0) {
            float floatValue = fArr[0].floatValue();
            P it = new kotlin.ranges.l(1, we(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, fArr[it.c()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Wl(double[] dArr, X2.l<? super Double, Float> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            float floatValue = selector.C(Double.valueOf(dArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Double.valueOf(dArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Wm(byte[] bArr, Comparator<? super R> comparator, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Byte.valueOf(bArr[0]));
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Byte.valueOf(bArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean Wn(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> T Wo(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return (T) Xo(tArr, Random.f52425E);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Byte Wp(@l3.d byte[] bArr, @l3.d X2.p<? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            b4 = operation.c0(Byte.valueOf(b4), Byte.valueOf(bArr[it.c()])).byteValue();
        }
        return Byte.valueOf(b4);
    }

    @kotlin.Y(version = "1.4")
    public static final void Wq(@l3.d float[] fArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, fArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            float f4 = fArr[i4];
            fArr[i4] = fArr[i7];
            fArr[i7] = f4;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Long> Wr(long[] jArr, X2.p<? super Long, ? super Long, Long> operation) {
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        long j4 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j4));
        int length = jArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            j4 = operation.c0(Long.valueOf(j4), Long.valueOf(jArr[i4])).longValue();
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    public static final char Ws(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Character ch = null;
        boolean z3 = false;
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                if (!z3) {
                    ch = Character.valueOf(c4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static byte[] Wt(@l3.d byte[] bArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bArr2[i4] = bArr[it.next().intValue()];
            i4++;
        }
        return bArr2;
    }

    @l3.d
    public static final byte[] Wu(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        qu(copyOf);
        return copyOf;
    }

    @l3.d
    public static final Set<Boolean> Wv(@l3.d boolean[] zArr, @l3.d Iterable<Boolean> other) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Boolean> ez = ez(zArr);
        kotlin.collections.A.H0(ez, other);
        return ez;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Ww(long[] jArr, X2.l<? super Long, Long> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += selector.C(Long.valueOf(j5)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Character> Wx(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c4 : cArr) {
            if (!predicate.C(Character.valueOf(c4)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c4));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Byte> Wy(@l3.d byte[] bArr) {
        int j4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        j4 = X.j(bArr.length);
        return (Set) iy(bArr, new LinkedHashSet(j4));
    }

    @l3.d
    public static final <V> List<V> Wz(@l3.d double[] dArr, @l3.d double[] other, @l3.d X2.p<? super Double, ? super Double, ? extends V> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Double.valueOf(dArr[i4]), Double.valueOf(other[i4])));
        }
        return arrayList;
    }

    public static final boolean X4(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (!predicate.C(Float.valueOf(f4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K, V> Map<K, V> X5(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends K> keySelector, @l3.d X2.l<? super Byte, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(bArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (byte b4 : bArr) {
            linkedHashMap.put(keySelector.C(Byte.valueOf(b4)), valueTransform.C(Byte.valueOf(b4)));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> Map<Boolean, V> X6(boolean[] zArr, X2.l<? super Boolean, ? extends V> valueSelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        j4 = X.j(zArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (boolean z3 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z3), valueSelector.C(Boolean.valueOf(z3)));
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final float X7(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr[3];
    }

    @l3.d
    public static final <K> List<Character> X8(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends K> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c4 : cArr) {
            if (hashSet.add(selector.C(Character.valueOf(c4)))) {
                arrayList.add(Character.valueOf(c4));
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final boolean X9(boolean[] zArr, int i4, X2.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0 && i4 <= ye(zArr)) {
            return zArr[i4];
        }
        return defaultValue.C(Integer.valueOf(i4)).booleanValue();
    }

    @l3.d
    public static final <C extends Collection<? super Double>> C Xa(@l3.d double[] dArr, @l3.d C destination, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (!predicate.C(Double.valueOf(d4)).booleanValue()) {
                destination.add(Double.valueOf(d4));
            }
        }
        return destination;
    }

    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R Xb(T[] tArr, X2.l<? super T, ? extends R> transform) {
        R r4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                r4 = transform.C(tArr[i4]);
                if (r4 != null) {
                    break;
                }
                i4++;
            } else {
                r4 = null;
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Xc(@l3.d char[] cArr, @l3.d C destination, @l3.d X2.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (char c4 : cArr) {
            kotlin.collections.A.q0(destination, transform.C(Character.valueOf(c4)));
        }
        return destination;
    }

    public static final void Xd(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, H0> action) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (boolean z3 : zArr) {
            action.C(Boolean.valueOf(z3));
        }
    }

    @l3.d
    public static final <K> Map<K, List<Float>> Xe(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f4 : fArr) {
            K C3 = keySelector.C(Float.valueOf(f4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Float.valueOf(f4));
        }
        return linkedHashMap;
    }

    public static final int Xf(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final String Xg(@l3.d char[] cArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Fg(cArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Float Xh(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Character Xi(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        int re = re(cArr);
        if (re == 0) {
            return Character.valueOf(c4);
        }
        R C3 = selector.C(Character.valueOf(c4));
        P it = new kotlin.ranges.l(1, re).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            R C4 = selector.C(Character.valueOf(c5));
            if (C3.compareTo(C4) < 0) {
                c4 = c5;
                C3 = C4;
            }
        }
        return Character.valueOf(c4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double Xj(byte[] bArr, X2.l<? super Byte, Double> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Byte.valueOf(bArr[0])).doubleValue();
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Byte.valueOf(bArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final int Xk(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i5 = iArr[it.c()];
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Xl(float[] fArr, X2.l<? super Float, Float> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            float floatValue = selector.C(Float.valueOf(fArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Float.valueOf(fArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Xm(char[] cArr, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Character.valueOf(cArr[0]));
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Character.valueOf(cArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean Xn(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return true;
        }
        return false;
    }

    @kotlin.Y(version = "1.3")
    public static final <T> T Xo(@l3.d T[] tArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (tArr.length != 0) {
            return tArr[random.m(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Character Xp(@l3.d char[] cArr, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            c4 = operation.c0(Character.valueOf(c4), Character.valueOf(cArr[it.c()])).charValue();
        }
        return Character.valueOf(c4);
    }

    public static void Xq(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length >= 0) {
            ue = ue(iArr);
            P it = new kotlin.ranges.l(0, length).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                int i4 = iArr[c4];
                iArr[c4] = iArr[ue];
                iArr[ue] = i4;
                ue--;
            }
        }
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> List<S> Xr(@l3.d T[] tArr, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        List<S> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        S s4 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s4);
        int length = tArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.c0(s4, (Object) tArr[i4]);
            arrayList.add(s4);
        }
        return arrayList;
    }

    public static final double Xs(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length == 1) {
                return dArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static byte[] Xt(@l3.d byte[] bArr, @l3.d kotlin.ranges.l indices) {
        byte[] f12;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (!indices.isEmpty()) {
            f12 = C2100o.f1(bArr, indices.c().intValue(), indices.k().intValue() + 1);
            return f12;
        }
        return new byte[0];
    }

    @l3.d
    public static final char[] Xu(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        su(copyOf);
        return copyOf;
    }

    public static final double Xv(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (double d5 : dArr) {
            d4 += d5;
        }
        return d4;
    }

    @W2.i(name = "sumOfLong")
    public static final long Xw(@l3.d Long[] lArr) {
        kotlin.jvm.internal.F.p(lArr, "<this>");
        long j4 = 0;
        for (Long l4 : lArr) {
            j4 += l4.longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Double> Xx(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d4 : dArr) {
            if (!predicate.C(Double.valueOf(d4)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d4));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Character> Xy(@l3.d char[] cArr) {
        int B3;
        int j4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        B3 = kotlin.ranges.u.B(cArr.length, 128);
        j4 = X.j(B3);
        return (Set) jy(cArr, new LinkedHashSet(j4));
    }

    @l3.d
    public static final <R> List<Pair<Double, R>> Xz(@l3.d double[] dArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            double d4 = dArr[i4];
            arrayList.add(C2122h0.a(Double.valueOf(d4), other[i4]));
        }
        return arrayList;
    }

    public static final boolean Y4(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (!predicate.C(Integer.valueOf(i4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K> Map<K, Character> Y5(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(cArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (char c4 : cArr) {
            linkedHashMap.put(keySelector.C(Character.valueOf(c4)), Character.valueOf(c4));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Byte, ? super V>> M Y6(byte[] bArr, M destination, X2.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (byte b4 : bArr) {
            destination.put(Byte.valueOf(b4), valueSelector.C(Byte.valueOf(b4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final int Y7(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr[3];
    }

    @l3.d
    public static final <K> List<Double> Y8(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends K> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d4 : dArr) {
            if (hashSet.add(selector.C(Double.valueOf(d4)))) {
                arrayList.add(Double.valueOf(d4));
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Boolean Y9(boolean[] zArr, int i4) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return Ie(zArr, i4);
    }

    @l3.d
    public static final <C extends Collection<? super Float>> C Ya(@l3.d float[] fArr, @l3.d C destination, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (!predicate.C(Float.valueOf(f4)).booleanValue()) {
                destination.add(Float.valueOf(f4));
            }
        }
        return destination;
    }

    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R Yb(T[] tArr, X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (T t3 : tArr) {
            R C3 = transform.C(t3);
            if (C3 != null) {
                return C3;
            }
        }
        return null;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Yc(@l3.d double[] dArr, @l3.d C destination, @l3.d X2.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (double d4 : dArr) {
            kotlin.collections.A.q0(destination, transform.C(Double.valueOf(d4)));
        }
        return destination;
    }

    public static final void Yd(@l3.d byte[] bArr, @l3.d X2.p<? super Integer, ? super Byte, H0> action) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Byte.valueOf(bArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> Ye(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends K> keySelector, @l3.d X2.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f4 : fArr) {
            K C3 = keySelector.C(Float.valueOf(f4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Float.valueOf(f4)));
        }
        return linkedHashMap;
    }

    public static final int Yf(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final String Yg(@l3.d double[] dArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Gg(dArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Float Yh(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            float f4 = fArr[length];
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                return Float.valueOf(f4);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Double Yi(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        int se = se(dArr);
        if (se == 0) {
            return Double.valueOf(d4);
        }
        R C3 = selector.C(Double.valueOf(d4));
        P it = new kotlin.ranges.l(1, se).iterator();
        while (it.hasNext()) {
            double d5 = dArr[it.c()];
            R C4 = selector.C(Double.valueOf(d5));
            if (C3.compareTo(C4) < 0) {
                d4 = d5;
                C3 = C4;
            }
        }
        return Double.valueOf(d4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double Yj(char[] cArr, X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Character.valueOf(cArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Character.valueOf(cArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final long Yk(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long j5 = jArr[it.c()];
                if (j4 < j5) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Yl(int[] iArr, X2.l<? super Integer, Float> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            float floatValue = selector.C(Integer.valueOf(iArr[0])).floatValue();
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Integer.valueOf(iArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Ym(double[] dArr, Comparator<? super R> comparator, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Double.valueOf(dArr[0]));
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Double.valueOf(dArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean Yn(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final short Yo(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return Zo(sArr, Random.f52425E);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Double Yp(@l3.d double[] dArr, @l3.d X2.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            d4 = operation.c0(Double.valueOf(d4), Double.valueOf(dArr[it.c()])).doubleValue();
        }
        return Double.valueOf(d4);
    }

    @kotlin.Y(version = "1.4")
    public static void Yq(@l3.d int[] iArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, iArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            int i8 = iArr[i4];
            iArr[i4] = iArr[i7];
            iArr[i7] = i8;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Short> Yr(short[] sArr, X2.p<? super Short, ? super Short, Short> operation) {
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        short s4 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s4));
        int length = sArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.c0(Short.valueOf(s4), Short.valueOf(sArr[i4])).shortValue();
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public static final double Ys(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Double d4 = null;
        boolean z3 = false;
        for (double d5 : dArr) {
            if (predicate.C(Double.valueOf(d5)).booleanValue()) {
                if (!z3) {
                    d4 = Double.valueOf(d5);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(d4, "null cannot be cast to non-null type kotlin.Double");
            return d4.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final char[] Yt(@l3.d char[] cArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            cArr2[i4] = cArr[it.next().intValue()];
            i4++;
        }
        return cArr2;
    }

    @l3.d
    public static final double[] Yu(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        uu(copyOf);
        return copyOf;
    }

    public static final float Yv(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        float f4 = 0.0f;
        for (float f5 : fArr) {
            f4 += f5;
        }
        return f4;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> long Yw(T[] tArr, X2.l<? super T, Long> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (T t3 : tArr) {
            j4 += selector.C(t3).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Float> Yx(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f4 : fArr) {
            if (!predicate.C(Float.valueOf(f4)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f4));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Double> Yy(@l3.d double[] dArr) {
        int j4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        j4 = X.j(dArr.length);
        return (Set) ky(dArr, new LinkedHashSet(j4));
    }

    @l3.d
    public static final <R, V> List<V> Yz(@l3.d double[] dArr, @l3.d R[] other, @l3.d X2.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Double.valueOf(dArr[i4]), other[i4]));
        }
        return arrayList;
    }

    public static final boolean Z4(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (!predicate.C(Long.valueOf(j4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K, V> Map<K, V> Z5(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(cArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (char c4 : cArr) {
            linkedHashMap.put(keySelector.C(Character.valueOf(c4)), valueTransform.C(Character.valueOf(c4)));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Character, ? super V>> M Z6(char[] cArr, M destination, X2.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (char c4 : cArr) {
            destination.put(Character.valueOf(c4), valueSelector.C(Character.valueOf(c4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final long Z7(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr[3];
    }

    @l3.d
    public static final <K> List<Float> Z8(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends K> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f4 : fArr) {
            if (hashSet.add(selector.C(Float.valueOf(f4)))) {
                arrayList.add(Float.valueOf(f4));
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Byte Z9(byte[] bArr, int i4) {
        Byte Je;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Je = Je(bArr, i4);
        return Je;
    }

    @l3.d
    public static final <C extends Collection<? super Integer>> C Za(@l3.d int[] iArr, @l3.d C destination, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (!predicate.C(Integer.valueOf(i4)).booleanValue()) {
                destination.add(Integer.valueOf(i4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Boolean Zb(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C Zc(@l3.d float[] fArr, @l3.d C destination, @l3.d X2.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (float f4 : fArr) {
            kotlin.collections.A.q0(destination, transform.C(Float.valueOf(f4)));
        }
        return destination;
    }

    public static final void Zd(@l3.d char[] cArr, @l3.d X2.p<? super Integer, ? super Character, H0> action) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Character.valueOf(cArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K> Map<K, List<Integer>> Ze(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 : iArr) {
            K C3 = keySelector.C(Integer.valueOf(i4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Integer.valueOf(i4));
        }
        return linkedHashMap;
    }

    public static final int Zf(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final String Zg(@l3.d float[] fArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Hg(fArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Integer Zh(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Float Zi(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        int te = te(fArr);
        if (te == 0) {
            return Float.valueOf(f4);
        }
        R C3 = selector.C(Float.valueOf(f4));
        P it = new kotlin.ranges.l(1, te).iterator();
        while (it.hasNext()) {
            float f5 = fArr[it.c()];
            R C4 = selector.C(Float.valueOf(f5));
            if (C3.compareTo(C4) < 0) {
                f4 = f5;
                C3 = C4;
            }
        }
        return Float.valueOf(f4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double Zj(double[] dArr, X2.l<? super Double, Double> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Double.valueOf(dArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Double.valueOf(dArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T extends Comparable<? super T>> T Zk(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length != 0) {
            T t3 = tArr[0];
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                if (t3.compareTo(t4) < 0) {
                    t3 = t4;
                }
            }
            return t3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float Zl(long[] jArr, X2.l<? super Long, Float> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            float floatValue = selector.C(Long.valueOf(jArr[0])).floatValue();
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Long.valueOf(jArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Zm(float[] fArr, Comparator<? super R> comparator, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Float.valueOf(fArr[0]));
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Float.valueOf(fArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean Zn(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    @kotlin.Y(version = "1.3")
    public static final short Zo(@l3.d short[] sArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (sArr.length != 0) {
            return sArr[random.m(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Float Zp(@l3.d float[] fArr, @l3.d X2.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            f4 = operation.c0(Float.valueOf(f4), Float.valueOf(fArr[it.c()])).floatValue();
        }
        return Float.valueOf(f4);
    }

    public static void Zq(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length >= 0) {
            ve = ve(jArr);
            P it = new kotlin.ranges.l(0, length).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                long j4 = jArr[c4];
                jArr[c4] = jArr[ve];
                jArr[ve] = j4;
                ve--;
            }
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Boolean> Zr(boolean[] zArr, X2.p<? super Boolean, ? super Boolean, Boolean> operation) {
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        boolean z3 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z3));
        int length = zArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            z3 = operation.c0(Boolean.valueOf(z3), Boolean.valueOf(zArr[i4])).booleanValue();
            arrayList.add(Boolean.valueOf(z3));
        }
        return arrayList;
    }

    public static final float Zs(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length == 1) {
                return fArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final char[] Zt(@l3.d char[] cArr, @l3.d kotlin.ranges.l indices) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            return new char[0];
        }
        return C2100o.g1(cArr, indices.c().intValue(), indices.k().intValue() + 1);
    }

    @l3.d
    public static final float[] Zu(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        wu(copyOf);
        return copyOf;
    }

    public static final int Zv(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int i4 = 0;
        for (byte b4 : bArr) {
            i4 += b4;
        }
        return i4;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long Zw(short[] sArr, X2.l<? super Short, Long> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (short s4 : sArr) {
            j4 += selector.C(Short.valueOf(s4)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Integer> Zx(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (!predicate.C(Integer.valueOf(i4)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Float> Zy(@l3.d float[] fArr) {
        int j4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        j4 = X.j(fArr.length);
        return (Set) ly(fArr, new LinkedHashSet(j4));
    }

    @l3.d
    public static final <R> List<Pair<Float, R>> Zz(@l3.d float[] fArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = fArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Float.valueOf(fArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    public static final <T> boolean a5(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (!predicate.C(t3).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K> Map<K, Double> a6(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(dArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (double d4 : dArr) {
            linkedHashMap.put(keySelector.C(Double.valueOf(d4)), Double.valueOf(d4));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Double, ? super V>> M a7(double[] dArr, M destination, X2.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (double d4 : dArr) {
            destination.put(Double.valueOf(d4), valueSelector.C(Double.valueOf(d4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> T a8(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr[3];
    }

    @l3.d
    public static final <K> List<Integer> a9(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends K> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (hashSet.add(selector.C(Integer.valueOf(i4)))) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <R, V> List<V> aA(@l3.d float[] fArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Float, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = fArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Float.valueOf(fArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Character aa(char[] cArr, int i4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return Ke(cArr, i4);
    }

    @l3.d
    public static final <C extends Collection<? super Long>> C ab(@l3.d long[] jArr, @l3.d C destination, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (!predicate.C(Long.valueOf(j4)).booleanValue()) {
                destination.add(Long.valueOf(j4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Boolean ac(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return Boolean.valueOf(z3);
            }
        }
        return null;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C ad(@l3.d int[] iArr, @l3.d C destination, @l3.d X2.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 : iArr) {
            kotlin.collections.A.q0(destination, transform.C(Integer.valueOf(i4)));
        }
        return destination;
    }

    public static final void ae(@l3.d double[] dArr, @l3.d X2.p<? super Integer, ? super Double, H0> action) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Double.valueOf(dArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> af(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends K> keySelector, @l3.d X2.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 : iArr) {
            K C3 = keySelector.C(Integer.valueOf(i4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Integer.valueOf(i4)));
        }
        return linkedHashMap;
    }

    public static final <T> int ag(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final String ah(@l3.d int[] iArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Ig(iArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Integer ai(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            int i5 = iArr[length];
            if (predicate.C(Integer.valueOf(i5)).booleanValue()) {
                return Integer.valueOf(i5);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer aj(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        if (ue == 0) {
            return Integer.valueOf(i4);
        }
        R C3 = selector.C(Integer.valueOf(i4));
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            R C4 = selector.C(Integer.valueOf(i5));
            if (C3.compareTo(C4) < 0) {
                i4 = i5;
                C3 = C4;
            }
        }
        return Integer.valueOf(i4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double ak(float[] fArr, X2.l<? super Float, Double> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Float.valueOf(fArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Float.valueOf(fArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final short al(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short s5 = sArr[it.c()];
                if (s4 < s5) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> float am(T[] tArr, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            float floatValue = selector.C(tArr[0]).floatValue();
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(tArr[it.c()]).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R an(int[] iArr, Comparator<? super R> comparator, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Integer.valueOf(iArr[0]));
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Integer.valueOf(iArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean ao(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final boolean ap(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return bp(zArr, Random.f52425E);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Integer aq(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            i4 = operation.c0(Integer.valueOf(i4), Integer.valueOf(iArr[it.c()])).intValue();
        }
        return Integer.valueOf(i4);
    }

    @kotlin.Y(version = "1.4")
    public static void ar(@l3.d long[] jArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, jArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            long j4 = jArr[i4];
            jArr[i4] = jArr[i7];
            jArr[i7] = j4;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Byte> as(byte[] bArr, X2.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        byte b4 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b4));
        int length = bArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            b4 = operation.z(Integer.valueOf(i4), Byte.valueOf(b4), Byte.valueOf(bArr[i4])).byteValue();
            arrayList.add(Byte.valueOf(b4));
        }
        return arrayList;
    }

    public static final float at(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Float f4 = null;
        boolean z3 = false;
        for (float f5 : fArr) {
            if (predicate.C(Float.valueOf(f5)).booleanValue()) {
                if (!z3) {
                    f4 = Float.valueOf(f5);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(f4, "null cannot be cast to non-null type kotlin.Float");
            return f4.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final double[] au(@l3.d double[] dArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            dArr2[i4] = dArr[it.next().intValue()];
            i4++;
        }
        return dArr2;
    }

    @l3.d
    public static final int[] av(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        yu(copyOf);
        return copyOf;
    }

    public static int aw(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        return i4;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long ax(boolean[] zArr, X2.l<? super Boolean, Long> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (boolean z3 : zArr) {
            j4 += selector.C(Boolean.valueOf(z3)).longValue();
        }
        return j4;
    }

    @l3.d
    public static final List<Long> ay(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (!predicate.C(Long.valueOf(j4)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Integer> az(@l3.d int[] iArr) {
        int j4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        j4 = X.j(iArr.length);
        return (Set) my(iArr, new LinkedHashSet(j4));
    }

    public static final boolean b5(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.C(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K, V> Map<K, V> b6(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends K> keySelector, @l3.d X2.l<? super Double, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(dArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (double d4 : dArr) {
            linkedHashMap.put(keySelector.C(Double.valueOf(d4)), valueTransform.C(Double.valueOf(d4)));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Float, ? super V>> M b7(float[] fArr, M destination, X2.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (float f4 : fArr) {
            destination.put(Float.valueOf(f4), valueSelector.C(Float.valueOf(f4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final short b8(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr[3];
    }

    @l3.d
    public static final <K> List<Long> b9(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends K> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (hashSet.add(selector.C(Long.valueOf(j4)))) {
                arrayList.add(Long.valueOf(j4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final List<Pair<Float, Float>> bA(@l3.d float[] fArr, @l3.d float[] other) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Float.valueOf(fArr[i4]), Float.valueOf(other[i4])));
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Double ba(double[] dArr, int i4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return Le(dArr, i4);
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C bb(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (!predicate.C(t3).booleanValue()) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @l3.e
    public static final Byte bc(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C bd(@l3.d long[] jArr, @l3.d C destination, @l3.d X2.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (long j4 : jArr) {
            kotlin.collections.A.q0(destination, transform.C(Long.valueOf(j4)));
        }
        return destination;
    }

    public static final void be(@l3.d float[] fArr, @l3.d X2.p<? super Integer, ? super Float, H0> action) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Float.valueOf(fArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K> Map<K, List<Long>> bf(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j4 : jArr) {
            K C3 = keySelector.C(Long.valueOf(j4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Long.valueOf(j4));
        }
        return linkedHashMap;
    }

    public static final int bg(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final String bh(@l3.d long[] jArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Jg(jArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Long bi(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Long bj(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        if (ve == 0) {
            return Long.valueOf(j4);
        }
        R C3 = selector.C(Long.valueOf(j4));
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            R C4 = selector.C(Long.valueOf(j5));
            if (C3.compareTo(C4) < 0) {
                j4 = j5;
                C3 = C4;
            }
        }
        return Long.valueOf(j4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double bk(int[] iArr, X2.l<? super Integer, Double> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Integer.valueOf(iArr[0])).doubleValue();
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Integer.valueOf(iArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Boolean bl(@l3.d boolean[] zArr, @l3.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            boolean z4 = zArr[it.c()];
            if (comparator.compare(Boolean.valueOf(z3), Boolean.valueOf(z4)) < 0) {
                z3 = z4;
            }
        }
        return Boolean.valueOf(z3);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float bm(short[] sArr, X2.l<? super Short, Float> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            float floatValue = selector.C(Short.valueOf(sArr[0])).floatValue();
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Short.valueOf(sArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R bn(long[] jArr, Comparator<? super R> comparator, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Long.valueOf(jArr[0]));
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Long.valueOf(jArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean bo(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    @kotlin.Y(version = "1.3")
    public static final boolean bp(@l3.d boolean[] zArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (zArr.length != 0) {
            return zArr[random.m(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Long bq(@l3.d long[] jArr, @l3.d X2.p<? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            j4 = operation.c0(Long.valueOf(j4), Long.valueOf(jArr[it.c()])).longValue();
        }
        return Long.valueOf(j4);
    }

    public static final <T> void br(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int we = we(tArr);
        P it = new kotlin.ranges.l(0, length).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            T t3 = tArr[c4];
            tArr[c4] = tArr[we];
            tArr[we] = t3;
            we--;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Character> bs(char[] cArr, X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        char c4 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c4));
        int length = cArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            c4 = operation.z(Integer.valueOf(i4), Character.valueOf(c4), Character.valueOf(cArr[i4])).charValue();
            arrayList.add(Character.valueOf(c4));
        }
        return arrayList;
    }

    public static int bt(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length == 1) {
                return iArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final double[] bu(@l3.d double[] dArr, @l3.d kotlin.ranges.l indices) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            return new double[0];
        }
        return C2100o.h1(dArr, indices.c().intValue(), indices.k().intValue() + 1);
    }

    @l3.d
    public static final long[] bv(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        Au(copyOf);
        return copyOf;
    }

    public static final int bw(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int i4 = 0;
        for (short s4 : sArr) {
            i4 += s4;
        }
        return i4;
    }

    @W2.i(name = "sumOfShort")
    public static final int bx(@l3.d Short[] shArr) {
        kotlin.jvm.internal.F.p(shArr, "<this>");
        int i4 = 0;
        for (Short sh : shArr) {
            i4 += sh.shortValue();
        }
        return i4;
    }

    @l3.d
    public static final Set<Long> bz(@l3.d long[] jArr) {
        int j4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        j4 = X.j(jArr.length);
        return (Set) ny(jArr, new LinkedHashSet(j4));
    }

    public static final boolean c5(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (!predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <K> Map<K, Float> c6(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(fArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (float f4 : fArr) {
            linkedHashMap.put(keySelector.C(Float.valueOf(f4)), Float.valueOf(f4));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Integer, ? super V>> M c7(int[] iArr, M destination, X2.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (int i4 : iArr) {
            destination.put(Integer.valueOf(i4), valueSelector.C(Integer.valueOf(i4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean c8(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr[3];
    }

    @l3.d
    public static final <T, K> List<T> c9(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            if (hashSet.add(selector.C(t3))) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <V> List<V> cA(@l3.d float[] fArr, @l3.d float[] other, @l3.d X2.p<? super Float, ? super Float, ? extends V> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Float.valueOf(fArr[i4]), Float.valueOf(other[i4])));
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Float ca(float[] fArr, int i4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return Me(fArr, i4);
    }

    @l3.d
    public static final <C extends Collection<? super Short>> C cb(@l3.d short[] sArr, @l3.d C destination, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.C(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Byte cc(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return Byte.valueOf(b4);
            }
        }
        return null;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C cd(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (T t3 : tArr) {
            kotlin.collections.A.q0(destination, transform.C(t3));
        }
        return destination;
    }

    public static final void ce(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, H0> action) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Integer.valueOf(iArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> cf(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends K> keySelector, @l3.d X2.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j4 : jArr) {
            K C3 = keySelector.C(Long.valueOf(j4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Long.valueOf(j4)));
        }
        return linkedHashMap;
    }

    public static final int cg(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    @l3.d
    public static final <T> String ch(@l3.d T[] tArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Kg(tArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final Long ci(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            long j4 = jArr[length];
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                return Long.valueOf(j4);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T cj(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        int we = we(tArr);
        if (we == 0) {
            return t3;
        }
        R C3 = selector.C(t3);
        P it = new kotlin.ranges.l(1, we).iterator();
        while (it.hasNext()) {
            T t4 = tArr[it.c()];
            R C4 = selector.C(t4);
            if (C3.compareTo(C4) < 0) {
                t3 = t4;
                C3 = C4;
            }
        }
        return t3;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double ck(long[] jArr, X2.l<? super Long, Double> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Long.valueOf(jArr[0])).doubleValue();
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Long.valueOf(jArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Byte cl(@l3.d byte[] bArr, @l3.d Comparator<? super Byte> comparator) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            if (comparator.compare(Byte.valueOf(b4), Byte.valueOf(b5)) < 0) {
                b4 = b5;
            }
        }
        return Byte.valueOf(b4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float cm(boolean[] zArr, X2.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            float floatValue = selector.C(Boolean.valueOf(zArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Boolean.valueOf(zArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R cn(T[] tArr, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(tArr[0]);
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(tArr[it.c()]);
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final boolean co(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Boolean cp(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return dp(zArr, Random.f52425E);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S cq(@l3.d T[] tArr, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s4 = (S) tArr[0];
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            s4 = operation.c0(s4, (Object) tArr[it.c()]);
        }
        return s4;
    }

    @kotlin.Y(version = "1.4")
    public static final <T> void cr(@l3.d T[] tArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, tArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            T t3 = tArr[i4];
            tArr[i4] = tArr[i7];
            tArr[i7] = t3;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Double> cs(double[] dArr, X2.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        double d4 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d4));
        int length = dArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            d4 = operation.z(Integer.valueOf(i4), Double.valueOf(d4), Double.valueOf(dArr[i4])).doubleValue();
            arrayList.add(Double.valueOf(d4));
        }
        return arrayList;
    }

    public static final int ct(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Integer num = null;
        boolean z3 = false;
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                if (!z3) {
                    num = Integer.valueOf(i4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final float[] cu(@l3.d float[] fArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            fArr2[i4] = fArr[it.next().intValue()];
            i4++;
        }
        return fArr2;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> T[] cv(@l3.d T[] tArr) {
        Comparator x3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        x3 = kotlin.comparisons.g.x();
        C2100o.h4(tArr2, x3);
        return tArr2;
    }

    public static long cw(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int cx(byte[] bArr, X2.l<? super Byte, t0> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (byte b4 : bArr) {
            l4 = t0.l(l4 + selector.C(Byte.valueOf(b4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <T> List<T> cy(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            if (!predicate.C(t3).booleanValue()) {
                break;
            }
            arrayList.add(t3);
        }
        return arrayList;
    }

    @l3.d
    public static final <T> Set<T> cz(@l3.d T[] tArr) {
        int j4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        j4 = X.j(tArr.length);
        return (Set) oy(tArr, new LinkedHashSet(j4));
    }

    public static boolean d5(@l3.d byte[] bArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V> Map<K, V> d6(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends K> keySelector, @l3.d X2.l<? super Float, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(fArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (float f4 : fArr) {
            linkedHashMap.put(keySelector.C(Float.valueOf(f4)), valueTransform.C(Float.valueOf(f4)));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Long, ? super V>> M d7(long[] jArr, M destination, X2.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (long j4 : jArr) {
            destination.put(Long.valueOf(j4), valueSelector.C(Long.valueOf(j4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final byte d8(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr[4];
    }

    @l3.d
    public static final <K> List<Short> d9(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends K> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (hashSet.add(selector.C(Short.valueOf(s4)))) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <R> List<Pair<Float, R>> dA(@l3.d float[] fArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            float f4 = fArr[i4];
            arrayList.add(C2122h0.a(Float.valueOf(f4), other[i4]));
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Integer da(int[] iArr, int i4) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return Ne(iArr, i4);
    }

    @l3.d
    public static final <C extends Collection<? super Boolean>> C db(@l3.d boolean[] zArr, @l3.d C destination, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (!predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                destination.add(Boolean.valueOf(z3));
            }
        }
        return destination;
    }

    @l3.e
    public static final Character dc(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C dd(@l3.d short[] sArr, @l3.d C destination, @l3.d X2.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (short s4 : sArr) {
            kotlin.collections.A.q0(destination, transform.C(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final void de(@l3.d long[] jArr, @l3.d X2.p<? super Integer, ? super Long, H0> action) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Long.valueOf(jArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <T, K> Map<K, List<T>> df(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : tArr) {
            K C3 = keySelector.C(t3);
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(t3);
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Set<Byte> dg(@l3.d byte[] bArr, @l3.d Iterable<Byte> other) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Byte> Wy = Wy(bArr);
        kotlin.collections.A.R0(Wy, other);
        return Wy;
    }

    @l3.d
    public static final String dh(@l3.d short[] sArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Lg(sArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final <T> T di(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Short dj(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        if (xe == 0) {
            return Short.valueOf(s4);
        }
        R C3 = selector.C(Short.valueOf(s4));
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            R C4 = selector.C(Short.valueOf(s5));
            if (C3.compareTo(C4) < 0) {
                s4 = s5;
                C3 = C4;
            }
        }
        return Short.valueOf(s4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double dk(T[] tArr, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(tArr[0]).doubleValue();
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(tArr[it.c()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Character dl(@l3.d char[] cArr, @l3.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            if (comparator.compare(Character.valueOf(c4), Character.valueOf(c5)) < 0) {
                c4 = c5;
            }
        }
        return Character.valueOf(c4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R dm(byte[] bArr, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            R C3 = selector.C(Byte.valueOf(bArr[0]));
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Byte.valueOf(bArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R dn(short[] sArr, Comparator<? super R> comparator, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Short.valueOf(sArr[0]));
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Short.valueOf(sArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* renamed from: do */
    public static final <T> boolean m1do(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Boolean dp(@l3.d boolean[] zArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.m(zArr.length)]);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Short dq(@l3.d short[] sArr, @l3.d X2.p<? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            s4 = operation.c0(Short.valueOf(s4), Short.valueOf(sArr[it.c()])).shortValue();
        }
        return Short.valueOf(s4);
    }

    public static void dr(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length >= 0) {
            xe = xe(sArr);
            P it = new kotlin.ranges.l(0, length).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                short s4 = sArr[c4];
                sArr[c4] = sArr[xe];
                sArr[xe] = s4;
                xe--;
            }
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Float> ds(float[] fArr, X2.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        float f4 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f4));
        int length = fArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            f4 = operation.z(Integer.valueOf(i4), Float.valueOf(f4), Float.valueOf(fArr[i4])).floatValue();
            arrayList.add(Float.valueOf(f4));
        }
        return arrayList;
    }

    public static long dt(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length == 1) {
                return jArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final float[] du(@l3.d float[] fArr, @l3.d kotlin.ranges.l indices) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            return new float[0];
        }
        return C2100o.i1(fArr, indices.c().intValue(), indices.k().intValue() + 1);
    }

    @l3.d
    public static final short[] dv(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        Eu(copyOf);
        return copyOf;
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int dw(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (byte b4 : bArr) {
            i4 += selector.C(Byte.valueOf(b4)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int dx(char[] cArr, X2.l<? super Character, t0> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (char c4 : cArr) {
            l4 = t0.l(l4 + selector.C(Character.valueOf(c4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final List<Short> dy(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.C(Short.valueOf(s4)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Short> dz(@l3.d short[] sArr) {
        int j4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        j4 = X.j(sArr.length);
        return (Set) py(sArr, new LinkedHashSet(j4));
    }

    public static final boolean e5(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K> Map<K, Integer> e6(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(iArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 : iArr) {
            linkedHashMap.put(keySelector.C(Integer.valueOf(i4)), Integer.valueOf(i4));
        }
        return linkedHashMap;
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <K, V, M extends Map<? super K, ? super V>> M e7(@l3.d K[] kArr, @l3.d M destination, @l3.d X2.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(kArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (K k4 : kArr) {
            destination.put(k4, valueSelector.C(k4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final char e8(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr[4];
    }

    @l3.d
    public static final <K> List<Boolean> e9(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends K> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z3 : zArr) {
            if (hashSet.add(selector.C(Boolean.valueOf(z3)))) {
                arrayList.add(Boolean.valueOf(z3));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <R, V> List<V> eA(@l3.d float[] fArr, @l3.d R[] other, @l3.d X2.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Float.valueOf(fArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Long ea(long[] jArr, int i4) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return Oe(jArr, i4);
    }

    @l3.d
    public static final <C extends Collection<? super Byte>> C eb(@l3.d byte[] bArr, @l3.d C destination, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                destination.add(Byte.valueOf(b4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Character ec(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                return Character.valueOf(c4);
            }
        }
        return null;
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C ed(@l3.d boolean[] zArr, @l3.d C destination, @l3.d X2.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (boolean z3 : zArr) {
            kotlin.collections.A.q0(destination, transform.C(Boolean.valueOf(z3)));
        }
        return destination;
    }

    public static final <T> void ee(@l3.d T[] tArr, @l3.d X2.p<? super Integer, ? super T, H0> action) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), tArr[i4]);
            i4++;
            i5++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, K, V> Map<K, List<V>> ef(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (A1.a aVar : tArr) {
            K C3 = keySelector.C(aVar);
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(aVar));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Set<Character> eg(@l3.d char[] cArr, @l3.d Iterable<Character> other) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Character> Xy = Xy(cArr);
        kotlin.collections.A.R0(Xy, other);
        return Xy;
    }

    @l3.d
    public static final String eh(@l3.d boolean[] zArr, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super Boolean, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) Mg(zArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @l3.e
    public static final <T> T ei(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            T t3 = tArr[length];
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> byte ej(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            if (qe == 0) {
                return b4;
            }
            R C3 = selector.C(Byte.valueOf(b4));
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte b5 = bArr[it.c()];
                R C4 = selector.C(Byte.valueOf(b5));
                if (C3.compareTo(C4) < 0) {
                    b4 = b5;
                    C3 = C4;
                }
            }
            return b4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double ek(short[] sArr, X2.l<? super Short, Double> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Short.valueOf(sArr[0])).doubleValue();
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Short.valueOf(sArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double el(@l3.d double[] dArr, @l3.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            double d5 = dArr[it.c()];
            if (comparator.compare(Double.valueOf(d4), Double.valueOf(d5)) < 0) {
                d4 = d5;
            }
        }
        return Double.valueOf(d4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R em(char[] cArr, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            R C3 = selector.C(Character.valueOf(cArr[0]));
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Character.valueOf(cArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R en(boolean[] zArr, Comparator<? super R> comparator, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Boolean.valueOf(zArr[0]));
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Boolean.valueOf(zArr[it.c()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final <T> boolean eo(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Byte ep(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return fp(bArr, Random.f52425E);
    }

    public static final byte eq(@l3.d byte[] bArr, @l3.d X2.p<? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        qe = qe(bArr);
        if (qe >= 0) {
            byte b4 = bArr[qe];
            for (int i4 = qe - 1; i4 >= 0; i4--) {
                b4 = operation.c0(Byte.valueOf(bArr[i4]), Byte.valueOf(b4)).byteValue();
            }
            return b4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @kotlin.Y(version = "1.4")
    public static void er(@l3.d short[] sArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, sArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            short s4 = sArr[i4];
            sArr[i4] = sArr[i7];
            sArr[i7] = s4;
            i7--;
            i4++;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Integer> es(int[] iArr, X2.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        int i4 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i4));
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = operation.z(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(iArr[i5])).intValue();
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static final long et(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Long l4 = null;
        boolean z3 = false;
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                if (!z3) {
                    l4 = Long.valueOf(j4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(l4, "null cannot be cast to non-null type kotlin.Long");
            return l4.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static int[] eu(@l3.d int[] iArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr2[i4] = iArr[it.next().intValue()];
            i4++;
        }
        return iArr2;
    }

    @l3.d
    public static final <T> T[] ev(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.F.o(tArr2, "copyOf(...)");
        C2100o.h4(tArr2, comparator);
        return tArr2;
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int ew(@l3.d char[] cArr, @l3.d X2.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (char c4 : cArr) {
            i4 += selector.C(Character.valueOf(c4)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int ex(double[] dArr, X2.l<? super Double, t0> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (double d4 : dArr) {
            l4 = t0.l(l4 + selector.C(Double.valueOf(d4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final List<Boolean> ey(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z3 : zArr) {
            if (!predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z3));
        }
        return arrayList;
    }

    @l3.d
    public static final Set<Boolean> ez(@l3.d boolean[] zArr) {
        int j4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        j4 = X.j(zArr.length);
        return (Set) qy(zArr, new LinkedHashSet(j4));
    }

    public static final boolean f5(@l3.d char[] cArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V> Map<K, V> f6(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends K> keySelector, @l3.d X2.l<? super Integer, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(iArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 : iArr) {
            linkedHashMap.put(keySelector.C(Integer.valueOf(i4)), valueTransform.C(Integer.valueOf(i4)));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Short, ? super V>> M f7(short[] sArr, M destination, X2.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (short s4 : sArr) {
            destination.put(Short.valueOf(s4), valueSelector.C(Short.valueOf(s4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final double f8(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr[4];
    }

    @l3.d
    public static final List<Byte> f9(@l3.d byte[] bArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(bArr.length - i4, 0);
            return Dx(bArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<Pair<Integer, R>> fA(@l3.d int[] iArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = iArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Integer.valueOf(iArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final <T> T fa(T[] tArr, int i4) {
        Object Pe;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        Pe = Pe(tArr, i4);
        return (T) Pe;
    }

    @l3.d
    public static final <C extends Collection<? super Character>> C fb(@l3.d char[] cArr, @l3.d C destination, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                destination.add(Character.valueOf(c4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Double fc(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R> R fd(@l3.d byte[] bArr, R r4, @l3.d X2.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (byte b4 : bArr) {
            r4 = operation.c0(r4, Byte.valueOf(b4));
        }
        return r4;
    }

    public static final void fe(@l3.d short[] sArr, @l3.d X2.p<? super Integer, ? super Short, H0> action) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Short.valueOf(sArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K> Map<K, List<Short>> ff(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K C3 = keySelector.C(Short.valueOf(s4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Set<Double> fg(@l3.d double[] dArr, @l3.d Iterable<Double> other) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Double> Yy = Yy(dArr);
        kotlin.collections.A.R0(Yy, other);
        return Yy;
    }

    public static /* synthetic */ String fh(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return Wg(bArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.e
    public static final Short fi(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> char fj(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            int re = re(cArr);
            if (re == 0) {
                return c4;
            }
            R C3 = selector.C(Character.valueOf(c4));
            P it = new kotlin.ranges.l(1, re).iterator();
            while (it.hasNext()) {
                char c5 = cArr[it.c()];
                R C4 = selector.C(Character.valueOf(c5));
                if (C3.compareTo(C4) < 0) {
                    c4 = c5;
                    C3 = C4;
                }
            }
            return c4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double fk(boolean[] zArr, X2.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Boolean.valueOf(zArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Boolean.valueOf(zArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float fl(@l3.d float[] fArr, @l3.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            float f5 = fArr[it.c()];
            if (comparator.compare(Float.valueOf(f4), Float.valueOf(f5)) < 0) {
                f4 = f5;
            }
        }
        return Float.valueOf(f4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R fm(double[] dArr, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            R C3 = selector.C(Double.valueOf(dArr[0]));
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Double.valueOf(dArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Byte fn(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            if (b4 > b5) {
                b4 = b5;
            }
        }
        return Byte.valueOf(b4);
    }

    public static final boolean fo(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Byte fp(@l3.d byte[] bArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.m(bArr.length)]);
    }

    public static final char fq(@l3.d char[] cArr, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int re = re(cArr);
        if (re >= 0) {
            char c4 = cArr[re];
            for (int i4 = re - 1; i4 >= 0; i4--) {
                c4 = operation.c0(Character.valueOf(cArr[i4]), Character.valueOf(c4)).charValue();
            }
            return c4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void fr(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int ye = ye(zArr);
        P it = new kotlin.ranges.l(0, length).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            boolean z3 = zArr[c4];
            zArr[c4] = zArr[ye];
            zArr[ye] = z3;
            ye--;
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Long> fs(long[] jArr, X2.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        long j4 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j4));
        int length = jArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            j4 = operation.z(Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(jArr[i4])).longValue();
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    public static final <T> T ft(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static int[] fu(@l3.d int[] iArr, @l3.d kotlin.ranges.l indices) {
        int[] j12;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (!indices.isEmpty()) {
            j12 = C2100o.j1(iArr, indices.c().intValue(), indices.k().intValue() + 1);
            return j12;
        }
        return new int[0];
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Byte> fv(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Fv(bArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int fw(@l3.d double[] dArr, @l3.d X2.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (double d4 : dArr) {
            i4 += selector.C(Double.valueOf(d4)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int fx(float[] fArr, X2.l<? super Float, t0> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (float f4 : fArr) {
            l4 = t0.l(l4 + selector.C(Float.valueOf(f4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final boolean[] fy(@l3.d Boolean[] boolArr) {
        kotlin.jvm.internal.F.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zArr[i4] = boolArr[i4].booleanValue();
        }
        return zArr;
    }

    @l3.d
    public static final Set<Byte> fz(@l3.d byte[] bArr) {
        Set<Byte> k4;
        Set<Byte> f4;
        int j4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(bArr.length);
            return (Set) iy(bArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Byte.valueOf(bArr[0]));
        return f4;
    }

    public static final boolean g5(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K> Map<K, Long> g6(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(jArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (long j5 : jArr) {
            linkedHashMap.put(keySelector.C(Long.valueOf(j5)), Long.valueOf(j5));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <V, M extends Map<? super Boolean, ? super V>> M g7(boolean[] zArr, M destination, X2.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (boolean z3 : zArr) {
            destination.put(Boolean.valueOf(z3), valueSelector.C(Boolean.valueOf(z3)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final float g8(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr[4];
    }

    @l3.d
    public static final List<Character> g9(@l3.d char[] cArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(cArr.length - i4, 0);
            return Ex(cArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, V> List<V> gA(@l3.d int[] iArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Integer, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = iArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Integer.valueOf(iArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Short ga(short[] sArr, int i4) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return Qe(sArr, i4);
    }

    @l3.d
    public static final <C extends Collection<? super Double>> C gb(@l3.d double[] dArr, @l3.d C destination, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                destination.add(Double.valueOf(d4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Double gc(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                return Double.valueOf(d4);
            }
        }
        return null;
    }

    public static final <R> R gd(@l3.d char[] cArr, R r4, @l3.d X2.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (char c4 : cArr) {
            r4 = operation.c0(r4, Character.valueOf(c4));
        }
        return r4;
    }

    public static final void ge(@l3.d boolean[] zArr, @l3.d X2.p<? super Integer, ? super Boolean, H0> action) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Boolean.valueOf(zArr[i4]));
            i4++;
            i5++;
        }
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> gf(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends K> keySelector, @l3.d X2.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K C3 = keySelector.C(Short.valueOf(s4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Set<Float> gg(@l3.d float[] fArr, @l3.d Iterable<Float> other) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Float> Zy = Zy(fArr);
        kotlin.collections.A.R0(Zy, other);
        return Zy;
    }

    public static /* synthetic */ String gh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return Xg(cArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.e
    public static final Short gi(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            short s4 = sArr[length];
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> double gj(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            int se = se(dArr);
            if (se == 0) {
                return d4;
            }
            R C3 = selector.C(Double.valueOf(d4));
            P it = new kotlin.ranges.l(1, se).iterator();
            while (it.hasNext()) {
                double d5 = dArr[it.c()];
                R C4 = selector.C(Double.valueOf(d5));
                if (C3.compareTo(C4) < 0) {
                    d4 = d5;
                    C3 = C4;
                }
            }
            return d4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float gk(byte[] bArr, X2.l<? super Byte, Float> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Byte.valueOf(bArr[0])).floatValue();
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Byte.valueOf(bArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Integer gl(@l3.d int[] iArr, @l3.d Comparator<? super Integer> comparator) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) < 0) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R gm(float[] fArr, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            R C3 = selector.C(Float.valueOf(fArr[0]));
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Float.valueOf(fArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Character gn(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            if (kotlin.jvm.internal.F.t(c4, c5) > 0) {
                c4 = c5;
            }
        }
        return Character.valueOf(c4);
    }

    public static final boolean go(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Character gp(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return hp(cArr, Random.f52425E);
    }

    public static final double gq(@l3.d double[] dArr, @l3.d X2.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int se = se(dArr);
        if (se >= 0) {
            double d4 = dArr[se];
            for (int i4 = se - 1; i4 >= 0; i4--) {
                d4 = operation.c0(Double.valueOf(dArr[i4]), Double.valueOf(d4)).doubleValue();
            }
            return d4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @kotlin.Y(version = "1.4")
    public static final void gr(@l3.d boolean[] zArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        AbstractC2088c.f51901E.d(i4, i5, zArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            boolean z3 = zArr[i4];
            zArr[i4] = zArr[i7];
            zArr[i7] = z3;
            i7--;
            i4++;
        }
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> List<S> gs(@l3.d T[] tArr, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        List<S> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        S s4 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s4);
        int length = tArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.z(Integer.valueOf(i4), s4, (Object) tArr[i4]);
            arrayList.add(s4);
        }
        return arrayList;
    }

    public static final <T> T gt(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        T t3 = null;
        boolean z3 = false;
        for (T t4 : tArr) {
            if (predicate.C(t4).booleanValue()) {
                if (!z3) {
                    z3 = true;
                    t3 = t4;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return t3;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static long[] gu(@l3.d long[] jArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr2[i4] = jArr[it.next().intValue()];
            i4++;
        }
        return jArr2;
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Character> gv(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Gv(cArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int gw(@l3.d float[] fArr, @l3.d X2.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (float f4 : fArr) {
            i4 += selector.C(Float.valueOf(f4)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int gx(int[] iArr, X2.l<? super Integer, t0> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (int i4 : iArr) {
            l4 = t0.l(l4 + selector.C(Integer.valueOf(i4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final byte[] gy(@l3.d Byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr2[i4] = bArr[i4].byteValue();
        }
        return bArr2;
    }

    @l3.d
    public static final Set<Character> gz(@l3.d char[] cArr) {
        Set<Character> k4;
        Set<Character> f4;
        int B3;
        int j4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            B3 = kotlin.ranges.u.B(cArr.length, 128);
            j4 = X.j(B3);
            return (Set) jy(cArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Character.valueOf(cArr[0]));
        return f4;
    }

    public static final boolean h5(@l3.d double[] dArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V> Map<K, V> h6(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends K> keySelector, @l3.d X2.l<? super Long, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(jArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (long j5 : jArr) {
            linkedHashMap.put(keySelector.C(Long.valueOf(j5)), valueTransform.C(Long.valueOf(j5)));
        }
        return linkedHashMap;
    }

    public static final double h7(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (byte b4 : bArr) {
            d4 += b4;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @kotlin.internal.f
    private static final int h8(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr[4];
    }

    @l3.d
    public static final List<Double> h9(@l3.d double[] dArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(dArr.length - i4, 0);
            return Fx(dArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Pair<Integer, Integer>> hA(@l3.d int[] iArr, @l3.d int[] other) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Integer.valueOf(iArr[i4]), Integer.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Byte> ha(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                arrayList.add(Byte.valueOf(b4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Float>> C hb(@l3.d float[] fArr, @l3.d C destination, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                destination.add(Float.valueOf(f4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Float hc(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R hd(@l3.d double[] dArr, R r4, @l3.d X2.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (double d4 : dArr) {
            r4 = operation.c0(r4, Double.valueOf(d4));
        }
        return r4;
    }

    @l3.d
    public static kotlin.ranges.l he(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        qe = qe(bArr);
        return new kotlin.ranges.l(0, qe);
    }

    @l3.d
    public static final <K> Map<K, List<Boolean>> hf(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z3 : zArr) {
            K C3 = keySelector.C(Boolean.valueOf(z3));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Boolean.valueOf(z3));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Set<Integer> hg(@l3.d int[] iArr, @l3.d Iterable<Integer> other) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Integer> az = az(iArr);
        kotlin.collections.A.R0(az, other);
        return az;
    }

    public static /* synthetic */ String hh(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return Yg(dArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <R> List<R> hi(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b4 : bArr) {
            arrayList.add(transform.C(Byte.valueOf(b4)));
        }
        return arrayList;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> float hj(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            int te = te(fArr);
            if (te == 0) {
                return f4;
            }
            R C3 = selector.C(Float.valueOf(f4));
            P it = new kotlin.ranges.l(1, te).iterator();
            while (it.hasNext()) {
                float f5 = fArr[it.c()];
                R C4 = selector.C(Float.valueOf(f5));
                if (C3.compareTo(C4) < 0) {
                    f4 = f5;
                    C3 = C4;
                }
            }
            return f4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float hk(char[] cArr, X2.l<? super Character, Float> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Character.valueOf(cArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Character.valueOf(cArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Long hl(@l3.d long[] jArr, @l3.d Comparator<? super Long> comparator) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) < 0) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R hm(int[] iArr, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            R C3 = selector.C(Integer.valueOf(iArr[0]));
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Integer.valueOf(iArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T extends Comparable<? super T>> T hn(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            T t4 = tArr[it.c()];
            if (t3.compareTo(t4) > 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    public static final boolean ho(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Character hp(@l3.d char[] cArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.m(cArr.length)]);
    }

    public static final float hq(@l3.d float[] fArr, @l3.d X2.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int te = te(fArr);
        if (te >= 0) {
            float f4 = fArr[te];
            for (int i4 = te - 1; i4 >= 0; i4--) {
                f4 = operation.c0(Float.valueOf(fArr[i4]), Float.valueOf(f4)).floatValue();
            }
            return f4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Byte> hr(@l3.d byte[] bArr) {
        List<Byte> Ny;
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Ny = Ny(bArr);
        C.r1(Ny);
        return Ny;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Short> hs(short[] sArr, X2.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        short s4 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s4));
        int length = sArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.z(Integer.valueOf(i4), Short.valueOf(s4), Short.valueOf(sArr[i4])).shortValue();
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public static short ht(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length == 1) {
                return sArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static long[] hu(@l3.d long[] jArr, @l3.d kotlin.ranges.l indices) {
        long[] k12;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (!indices.isEmpty()) {
            k12 = C2100o.k1(jArr, indices.c().intValue(), indices.k().intValue() + 1);
            return k12;
        }
        return new long[0];
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Double> hv(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Hv(dArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int hw(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += selector.C(Integer.valueOf(i5)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int hx(long[] jArr, X2.l<? super Long, t0> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (long j4 : jArr) {
            l4 = t0.l(l4 + selector.C(Long.valueOf(j4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final char[] hy(@l3.d Character[] chArr) {
        kotlin.jvm.internal.F.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = chArr[i4].charValue();
        }
        return cArr;
    }

    @l3.d
    public static final Set<Double> hz(@l3.d double[] dArr) {
        Set<Double> k4;
        Set<Double> f4;
        int j4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(dArr.length);
            return (Set) ky(dArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Double.valueOf(dArr[0]));
        return f4;
    }

    public static final boolean i5(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <T, K> Map<K, T> i6(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(tArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (T t3 : tArr) {
            linkedHashMap.put(keySelector.C(t3), t3);
        }
        return linkedHashMap;
    }

    public static final double i7(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (double d5 : dArr) {
            d4 += d5;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @kotlin.internal.f
    private static final long i8(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr[4];
    }

    @l3.d
    public static final List<Float> i9(@l3.d float[] fArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(fArr.length - i4, 0);
            return Gx(fArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <V> List<V> iA(@l3.d int[] iArr, @l3.d int[] other, @l3.d X2.p<? super Integer, ? super Integer, ? extends V> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Integer.valueOf(iArr[i4]), Integer.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Character> ia(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                arrayList.add(Character.valueOf(c4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Integer>> C ib(@l3.d int[] iArr, @l3.d C destination, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                destination.add(Integer.valueOf(i4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Float ic(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                return Float.valueOf(f4);
            }
        }
        return null;
    }

    public static final <R> R id(@l3.d float[] fArr, R r4, @l3.d X2.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (float f4 : fArr) {
            r4 = operation.c0(r4, Float.valueOf(f4));
        }
        return r4;
    }

    @l3.d
    public static kotlin.ranges.l ie(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return new kotlin.ranges.l(0, re(cArr));
    }

    @l3.d
    /* renamed from: if */
    public static final <K, V> Map<K, List<V>> m2if(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends K> keySelector, @l3.d X2.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z3 : zArr) {
            K C3 = keySelector.C(Boolean.valueOf(z3));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Boolean.valueOf(z3)));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Set<Long> ig(@l3.d long[] jArr, @l3.d Iterable<Long> other) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Long> bz = bz(jArr);
        kotlin.collections.A.R0(bz, other);
        return bz;
    }

    public static /* synthetic */ String ih(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return Zg(fArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <R> List<R> ii(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c4 : cArr) {
            arrayList.add(transform.C(Character.valueOf(c4)));
        }
        return arrayList;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> int ij(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            if (ue == 0) {
                return i4;
            }
            R C3 = selector.C(Integer.valueOf(i4));
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i5 = iArr[it.c()];
                R C4 = selector.C(Integer.valueOf(i5));
                if (C3.compareTo(C4) < 0) {
                    i4 = i5;
                    C3 = C4;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float ik(double[] dArr, X2.l<? super Double, Float> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Double.valueOf(dArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Double.valueOf(dArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T> T il(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            T t4 = tArr[it.c()];
            if (comparator.compare(t3, t4) < 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R im(long[] jArr, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            R C3 = selector.C(Long.valueOf(jArr[0]));
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Long.valueOf(jArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double in(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            d4 = Math.min(d4, dArr[it.c()]);
        }
        return Double.valueOf(d4);
    }

    public static final boolean io(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double ip(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return jp(dArr, Random.f52425E);
    }

    public static final int iq(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ue = ue(iArr);
        if (ue >= 0) {
            int i4 = iArr[ue];
            for (int i5 = ue - 1; i5 >= 0; i5--) {
                i4 = operation.c0(Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Character> ir(@l3.d char[] cArr) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<Character> Oy = Oy(cArr);
        C.r1(Oy);
        return Oy;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final List<Boolean> is(boolean[] zArr, X2.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        boolean z3 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z3));
        int length = zArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            z3 = operation.z(Integer.valueOf(i4), Boolean.valueOf(z3), Boolean.valueOf(zArr[i4])).booleanValue();
            arrayList.add(Boolean.valueOf(z3));
        }
        return arrayList;
    }

    @l3.d
    public static final <T> T[] iu(@l3.d T[] tArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        T[] tArr2 = (T[]) C2098m.a(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            tArr2[i4] = tArr[it.next().intValue()];
            i4++;
        }
        return tArr2;
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Float> iv(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Iv(fArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int iw(@l3.d long[] jArr, @l3.d X2.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (long j4 : jArr) {
            i4 += selector.C(Long.valueOf(j4)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> int ix(T[] tArr, X2.l<? super T, t0> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (T t3 : tArr) {
            l4 = t0.l(l4 + selector.C(t3).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Byte>> C iy(@l3.d byte[] bArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (byte b4 : bArr) {
            destination.add(Byte.valueOf(b4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Float> iz(@l3.d float[] fArr) {
        Set<Float> k4;
        Set<Float> f4;
        int j4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(fArr.length);
            return (Set) ly(fArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Float.valueOf(fArr[0]));
        return f4;
    }

    public static final boolean j5(@l3.d float[] fArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <T, K, V> Map<K, V> j6(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(tArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (T t3 : tArr) {
            linkedHashMap.put(keySelector.C(t3), valueTransform.C(t3));
        }
        return linkedHashMap;
    }

    public static final double j7(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (float f4 : fArr) {
            d4 += f4;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @kotlin.internal.f
    private static final <T> T j8(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr[4];
    }

    @l3.d
    public static final List<Integer> j9(@l3.d int[] iArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(iArr.length - i4, 0);
            return Hx(iArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<Pair<Integer, R>> jA(@l3.d int[] iArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            int i5 = iArr[i4];
            arrayList.add(C2122h0.a(Integer.valueOf(i5), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Double> ja(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                arrayList.add(Double.valueOf(d4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Long>> C jb(@l3.d long[] jArr, @l3.d C destination, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                destination.add(Long.valueOf(j4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Integer jc(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R> R jd(@l3.d int[] iArr, R r4, @l3.d X2.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int i4 : iArr) {
            r4 = operation.c0(r4, Integer.valueOf(i4));
        }
        return r4;
    }

    @l3.d
    public static final kotlin.ranges.l je(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return new kotlin.ranges.l(0, se(dArr));
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Byte>>> M jf(@l3.d byte[] bArr, @l3.d M destination, @l3.d X2.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (byte b4 : bArr) {
            K C3 = keySelector.C(Byte.valueOf(b4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Byte.valueOf(b4));
        }
        return destination;
    }

    @l3.d
    public static final <T> Set<T> jg(@l3.d T[] tArr, @l3.d Iterable<? extends T> other) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<T> cz = cz(tArr);
        kotlin.collections.A.R0(cz, other);
        return cz;
    }

    public static /* synthetic */ String jh(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return ah(iArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <R> List<R> ji(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d4 : dArr) {
            arrayList.add(transform.C(Double.valueOf(d4)));
        }
        return arrayList;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> long jj(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            if (ve == 0) {
                return j4;
            }
            R C3 = selector.C(Long.valueOf(j4));
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long j5 = jArr[it.c()];
                R C4 = selector.C(Long.valueOf(j5));
                if (C3.compareTo(C4) < 0) {
                    j4 = j5;
                    C3 = C4;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float jk(float[] fArr, X2.l<? super Float, Float> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Float.valueOf(fArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Float.valueOf(fArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Short jl(@l3.d short[] sArr, @l3.d Comparator<? super Short> comparator) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) < 0) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R jm(T[] tArr, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            R C3 = selector.C(tArr[0]);
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(tArr[it.c()]);
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double jn(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        P it = new kotlin.ranges.l(1, we(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.c()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final byte[] jo(byte[] bArr, X2.l<? super Byte, H0> action) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (byte b4 : bArr) {
            action.C(Byte.valueOf(b4));
        }
        return bArr;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Double jp(@l3.d double[] dArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.m(dArr.length)]);
    }

    public static final long jq(@l3.d long[] jArr, @l3.d X2.p<? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ve = ve(jArr);
        if (ve >= 0) {
            long j4 = jArr[ve];
            for (int i4 = ve - 1; i4 >= 0; i4--) {
                j4 = operation.c0(Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Double> jr(@l3.d double[] dArr) {
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<Double> Py = Py(dArr);
        C.r1(Py);
        return Py;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> js(byte[] bArr, R r4, X2.p<? super R, ? super Byte, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        for (byte b4 : bArr) {
            r4 = operation.c0(r4, Byte.valueOf(b4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final short jt(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Short sh = null;
        boolean z3 = false;
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                if (!z3) {
                    sh = Short.valueOf(s4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(sh, "null cannot be cast to non-null type kotlin.Short");
            return sh.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <T> T[] ju(@l3.d T[] tArr, @l3.d kotlin.ranges.l indices) {
        Object[] l12;
        Object[] l13;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            l13 = C2100o.l1(tArr, 0, 0);
            return (T[]) l13;
        }
        l12 = C2100o.l1(tArr, indices.c().intValue(), indices.k().intValue() + 1);
        return (T[]) l12;
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Integer> jv(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Jv(iArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final <T> int jw(@l3.d T[] tArr, @l3.d X2.l<? super T, Integer> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (T t3 : tArr) {
            i4 += selector.C(t3).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int jx(short[] sArr, X2.l<? super Short, t0> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (short s4 : sArr) {
            l4 = t0.l(l4 + selector.C(Short.valueOf(s4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Character>> C jy(@l3.d char[] cArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (char c4 : cArr) {
            destination.add(Character.valueOf(c4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Integer> jz(@l3.d int[] iArr) {
        Set<Integer> k4;
        Set<Integer> f4;
        int j4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(iArr.length);
            return (Set) my(iArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Integer.valueOf(iArr[0]));
        return f4;
    }

    public static final boolean k5(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K> Map<K, Short> k6(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(sArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.C(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    public static final double k7(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (int i5 : iArr) {
            d4 += i5;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @kotlin.internal.f
    private static final short k8(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr[4];
    }

    @l3.d
    public static final List<Long> k9(@l3.d long[] jArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(jArr.length - i4, 0);
            return Ix(jArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, V> List<V> kA(@l3.d int[] iArr, @l3.d R[] other, @l3.d X2.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Integer.valueOf(iArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Float> ka(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                arrayList.add(Float.valueOf(f4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C kb(@l3.d T[] tArr, @l3.d C destination, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @l3.e
    public static final Integer kc(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                return Integer.valueOf(i4);
            }
        }
        return null;
    }

    public static final <R> R kd(@l3.d long[] jArr, R r4, @l3.d X2.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (long j4 : jArr) {
            r4 = operation.c0(r4, Long.valueOf(j4));
        }
        return r4;
    }

    @l3.d
    public static final kotlin.ranges.l ke(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return new kotlin.ranges.l(0, te(fArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M kf(@l3.d byte[] bArr, @l3.d M destination, @l3.d X2.l<? super Byte, ? extends K> keySelector, @l3.d X2.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (byte b4 : bArr) {
            K C3 = keySelector.C(Byte.valueOf(b4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Byte.valueOf(b4)));
        }
        return destination;
    }

    @l3.d
    public static final Set<Short> kg(@l3.d short[] sArr, @l3.d Iterable<Short> other) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Short> dz = dz(sArr);
        kotlin.collections.A.R0(dz, other);
        return dz;
    }

    public static /* synthetic */ String kh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return bh(jArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <R> List<R> ki(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f4 : fArr) {
            arrayList.add(transform.C(Float.valueOf(f4)));
        }
        return arrayList;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T kj(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            T t3 = tArr[0];
            int we = we(tArr);
            if (we == 0) {
                return t3;
            }
            R C3 = selector.C(t3);
            P it = new kotlin.ranges.l(1, we).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                R C4 = selector.C(t4);
                if (C3.compareTo(C4) < 0) {
                    t3 = t4;
                    C3 = C4;
                }
            }
            return t3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float kk(int[] iArr, X2.l<? super Integer, Float> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Integer.valueOf(iArr[0])).floatValue();
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Integer.valueOf(iArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final byte kl(@l3.d byte[] bArr, @l3.d Comparator<? super Byte> comparator) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte b5 = bArr[it.c()];
                if (comparator.compare(Byte.valueOf(b4), Byte.valueOf(b5)) < 0) {
                    b4 = b5;
                }
            }
            return b4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R km(short[] sArr, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            R C3 = selector.C(Short.valueOf(sArr[0]));
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Short.valueOf(sArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float kn(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            f4 = Math.min(f4, fArr[it.c()]);
        }
        return Float.valueOf(f4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final char[] ko(char[] cArr, X2.l<? super Character, H0> action) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (char c4 : cArr) {
            action.C(Character.valueOf(c4));
        }
        return cArr;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float kp(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return lp(fArr, Random.f52425E);
    }

    public static final <S, T extends S> S kq(@l3.d T[] tArr, @l3.d X2.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int we = we(tArr);
        if (we >= 0) {
            S s4 = (S) tArr[we];
            for (int i4 = we - 1; i4 >= 0; i4--) {
                s4 = operation.c0((Object) tArr[i4], s4);
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Float> kr(@l3.d float[] fArr) {
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<Float> Qy = Qy(fArr);
        C.r1(Qy);
        return Qy;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ks(char[] cArr, R r4, X2.p<? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        for (char c4 : cArr) {
            r4 = operation.c0(r4, Character.valueOf(c4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final boolean kt(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length == 1) {
                return zArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static short[] ku(@l3.d short[] sArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            sArr2[i4] = sArr[it.next().intValue()];
            i4++;
        }
        return sArr2;
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Long> kv(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Kv(jArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int kw(@l3.d short[] sArr, @l3.d X2.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (short s4 : sArr) {
            i4 += selector.C(Short.valueOf(s4)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final int kx(boolean[] zArr, X2.l<? super Boolean, t0> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (boolean z3 : zArr) {
            l4 = t0.l(l4 + selector.C(Boolean.valueOf(z3)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Double>> C ky(@l3.d double[] dArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (double d4 : dArr) {
            destination.add(Double.valueOf(d4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Long> kz(@l3.d long[] jArr) {
        Set<Long> k4;
        Set<Long> f4;
        int j4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(jArr.length);
            return (Set) ny(jArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Long.valueOf(jArr[0]));
        return f4;
    }

    public static boolean l5(@l3.d int[] iArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V> Map<K, V> l6(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends K> keySelector, @l3.d X2.l<? super Short, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(sArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.C(Short.valueOf(s4)), valueTransform.C(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    public static final double l7(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (long j4 : jArr) {
            d4 += j4;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @kotlin.internal.f
    private static final boolean l8(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr[4];
    }

    @l3.d
    public static <T> List<T> l9(@l3.d T[] tArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(tArr.length - i4, 0);
            return Jx(tArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<Pair<Long, R>> lA(@l3.d long[] jArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = jArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Long.valueOf(jArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final List<Integer> la(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Short>> C lb(@l3.d short[] sArr, @l3.d C destination, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    @l3.e
    public static final Long lc(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ld(@l3.d T[] tArr, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (A1.a aVar : tArr) {
            r4 = operation.c0(r4, aVar);
        }
        return r4;
    }

    @l3.d
    public static kotlin.ranges.l le(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        ue = ue(iArr);
        return new kotlin.ranges.l(0, ue);
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Character>>> M lf(@l3.d char[] cArr, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (char c4 : cArr) {
            K C3 = keySelector.C(Character.valueOf(c4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Character.valueOf(c4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Boolean> lg(@l3.d boolean[] zArr, @l3.d Iterable<Boolean> other) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Boolean> ez = ez(zArr);
        kotlin.collections.A.R0(ez, other);
        return ez;
    }

    public static /* synthetic */ String lh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return ch(objArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <R> List<R> li(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(transform.C(Integer.valueOf(i4)));
        }
        return arrayList;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> short lj(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            if (xe == 0) {
                return s4;
            }
            R C3 = selector.C(Short.valueOf(s4));
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short s5 = sArr[it.c()];
                R C4 = selector.C(Short.valueOf(s5));
                if (C3.compareTo(C4) < 0) {
                    s4 = s5;
                    C3 = C4;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float lk(long[] jArr, X2.l<? super Long, Float> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Long.valueOf(jArr[0])).floatValue();
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Long.valueOf(jArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final char ll(@l3.d char[] cArr, @l3.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                char c5 = cArr[it.c()];
                if (comparator.compare(Character.valueOf(c4), Character.valueOf(c5)) < 0) {
                    c4 = c5;
                }
            }
            return c4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R lm(boolean[] zArr, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            R C3 = selector.C(Boolean.valueOf(zArr[0]));
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Boolean.valueOf(zArr[it.c()]));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float ln(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        P it = new kotlin.ranges.l(1, we(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.c()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double[] lo(double[] dArr, X2.l<? super Double, H0> action) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (double d4 : dArr) {
            action.C(Double.valueOf(d4));
        }
        return dArr;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Float lp(@l3.d float[] fArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.m(fArr.length)]);
    }

    public static final short lq(@l3.d short[] sArr, @l3.d X2.p<? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        xe = xe(sArr);
        if (xe >= 0) {
            short s4 = sArr[xe];
            for (int i4 = xe - 1; i4 >= 0; i4--) {
                s4 = operation.c0(Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Integer> lr(@l3.d int[] iArr) {
        List<Integer> Ry;
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Ry = Ry(iArr);
        C.r1(Ry);
        return Ry;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ls(double[] dArr, R r4, X2.p<? super R, ? super Double, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        for (double d4 : dArr) {
            r4 = operation.c0(r4, Double.valueOf(d4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final boolean lt(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Boolean bool = null;
        boolean z3 = false;
        for (boolean z4 : zArr) {
            if (predicate.C(Boolean.valueOf(z4)).booleanValue()) {
                if (!z3) {
                    bool = Boolean.valueOf(z4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static short[] lu(@l3.d short[] sArr, @l3.d kotlin.ranges.l indices) {
        short[] m12;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (!indices.isEmpty()) {
            m12 = C2100o.m1(sArr, indices.c().intValue(), indices.k().intValue() + 1);
            return m12;
        }
        return new short[0];
    }

    @l3.d
    public static final <T, R extends Comparable<? super R>> List<T> lv(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        List<T> Lv;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Lv = Lv(tArr, new g.a(selector));
        return Lv;
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int lw(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (boolean z3 : zArr) {
            i4 += selector.C(Boolean.valueOf(z3)).intValue();
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long lx(byte[] bArr, X2.l<? super Byte, x0> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (byte b4 : bArr) {
            l4 = x0.l(l4 + selector.C(Byte.valueOf(b4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Float>> C ly(@l3.d float[] fArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (float f4 : fArr) {
            destination.add(Float.valueOf(f4));
        }
        return destination;
    }

    @l3.d
    public static final <T> Set<T> lz(@l3.d T[] tArr) {
        Set<T> k4;
        Set<T> f4;
        int j4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(tArr.length);
            return (Set) oy(tArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(tArr[0]);
        return f4;
    }

    public static final boolean m5(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K> Map<K, Boolean> m6(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(zArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (boolean z3 : zArr) {
            linkedHashMap.put(keySelector.C(Boolean.valueOf(z3)), Boolean.valueOf(z3));
        }
        return linkedHashMap;
    }

    public static final double m7(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (short s4 : sArr) {
            d4 += s4;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    public static boolean m8(@l3.d byte[] bArr, byte b4) {
        int Cf;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Cf = Cf(bArr, b4);
        if (Cf >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Short> m9(@l3.d short[] sArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(sArr.length - i4, 0);
            return Kx(sArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, V> List<V> mA(@l3.d long[] jArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Long, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = jArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Long.valueOf(jArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final List<Long> ma(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Boolean>> C mb(@l3.d boolean[] zArr, @l3.d C destination, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                destination.add(Boolean.valueOf(z3));
            }
        }
        return destination;
    }

    @l3.e
    public static final Long mc(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                return Long.valueOf(j4);
            }
        }
        return null;
    }

    public static final <R> R md(@l3.d short[] sArr, R r4, @l3.d X2.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (short s4 : sArr) {
            r4 = operation.c0(r4, Short.valueOf(s4));
        }
        return r4;
    }

    @l3.d
    public static kotlin.ranges.l me(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        ve = ve(jArr);
        return new kotlin.ranges.l(0, ve);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M mf(@l3.d char[] cArr, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (char c4 : cArr) {
            K C3 = keySelector.C(Character.valueOf(c4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Character.valueOf(c4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean mg(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String mh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return dh(sArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <R> List<R> mi(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j4 : jArr) {
            arrayList.add(transform.C(Long.valueOf(j4)));
        }
        return arrayList;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean mj(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            boolean z3 = zArr[0];
            int ye = ye(zArr);
            if (ye == 0) {
                return z3;
            }
            R C3 = selector.C(Boolean.valueOf(z3));
            P it = new kotlin.ranges.l(1, ye).iterator();
            while (it.hasNext()) {
                boolean z4 = zArr[it.c()];
                R C4 = selector.C(Boolean.valueOf(z4));
                if (C3.compareTo(C4) < 0) {
                    z3 = z4;
                    C3 = C4;
                }
            }
            return z3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float mk(T[] tArr, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(tArr[0]).floatValue();
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(tArr[it.c()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double ml(@l3.d double[] dArr, @l3.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                double d5 = dArr[it.c()];
                if (comparator.compare(Double.valueOf(d4), Double.valueOf(d5)) < 0) {
                    d4 = d5;
                }
            }
            return d4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R mm(byte[] bArr, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Byte.valueOf(bArr[0]));
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Byte.valueOf(bArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Integer mn(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            if (i4 > i5) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float[] mo(float[] fArr, X2.l<? super Float, H0> action) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (float f4 : fArr) {
            action.C(Float.valueOf(f4));
        }
        return fArr;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Integer mp(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return np(iArr, Random.f52425E);
    }

    public static final boolean mq(@l3.d boolean[] zArr, @l3.d X2.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int ye = ye(zArr);
        if (ye >= 0) {
            boolean z3 = zArr[ye];
            for (int i4 = ye - 1; i4 >= 0; i4--) {
                z3 = operation.c0(Boolean.valueOf(zArr[i4]), Boolean.valueOf(z3)).booleanValue();
            }
            return z3;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Long> mr(@l3.d long[] jArr) {
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<Long> Sy = Sy(jArr);
        C.r1(Sy);
        return Sy;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ms(float[] fArr, R r4, X2.p<? super R, ? super Float, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        for (float f4 : fArr) {
            r4 = operation.c0(r4, Float.valueOf(f4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Boolean mt(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @l3.d
    public static final boolean[] mu(@l3.d boolean[] zArr, @l3.d Collection<Integer> indices) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            zArr2[i4] = zArr[it.next().intValue()];
            i4++;
        }
        return zArr2;
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Short> mv(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Mv(sArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double mw(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (byte b4 : bArr) {
            d4 += selector.C(Byte.valueOf(b4)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long mx(char[] cArr, X2.l<? super Character, x0> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (char c4 : cArr) {
            l4 = x0.l(l4 + selector.C(Character.valueOf(c4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Integer>> C my(@l3.d int[] iArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (int i4 : iArr) {
            destination.add(Integer.valueOf(i4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Short> mz(@l3.d short[] sArr) {
        Set<Short> k4;
        Set<Short> f4;
        int j4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(sArr.length);
            return (Set) py(sArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Short.valueOf(sArr[0]));
        return f4;
    }

    public static boolean n5(@l3.d long[] jArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V> Map<K, V> n6(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends K> keySelector, @l3.d X2.l<? super Boolean, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(zArr.length);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (boolean z3 : zArr) {
            linkedHashMap.put(keySelector.C(Boolean.valueOf(z3)), valueTransform.C(Boolean.valueOf(z3)));
        }
        return linkedHashMap;
    }

    @W2.i(name = "averageOfByte")
    public static final double n7(@l3.d Byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (Byte b4 : bArr) {
            d4 += b4.byteValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    public static boolean n8(@l3.d char[] cArr, char c4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (Df(cArr, c4) >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Boolean> n9(@l3.d boolean[] zArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(zArr.length - i4, 0);
            return Lx(zArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final List<Pair<Long, Long>> nA(@l3.d long[] jArr, @l3.d long[] other) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Long.valueOf(jArr[i4]), Long.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <T> List<T> na(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Boolean nb(boolean[] zArr, X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return Boolean.valueOf(z3);
            }
        }
        return null;
    }

    @l3.e
    public static final <T> T nc(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <R> R nd(@l3.d boolean[] zArr, R r4, @l3.d X2.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (boolean z3 : zArr) {
            r4 = operation.c0(r4, Boolean.valueOf(z3));
        }
        return r4;
    }

    @l3.d
    public static final <T> kotlin.ranges.l ne(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return new kotlin.ranges.l(0, we(tArr));
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Double>>> M nf(@l3.d double[] dArr, @l3.d M destination, @l3.d X2.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (double d4 : dArr) {
            K C3 = keySelector.C(Double.valueOf(d4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Double.valueOf(d4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean ng(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String nh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return eh(zArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <T, R> List<R> ni(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t3 : tArr) {
            arrayList.add(transform.C(t3));
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double nj(byte[] bArr, X2.l<? super Byte, Double> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            double doubleValue = selector.C(Byte.valueOf(bArr[0])).doubleValue();
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Byte.valueOf(bArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float nk(short[] sArr, X2.l<? super Short, Float> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Short.valueOf(sArr[0])).floatValue();
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Short.valueOf(sArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float nl(@l3.d float[] fArr, @l3.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                float f5 = fArr[it.c()];
                if (comparator.compare(Float.valueOf(f4), Float.valueOf(f5)) < 0) {
                    f4 = f5;
                }
            }
            return f4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R nm(char[] cArr, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Character.valueOf(cArr[0]));
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Character.valueOf(cArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Long nn(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            if (j4 > j5) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int[] no(int[] iArr, X2.l<? super Integer, H0> action) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (int i4 : iArr) {
            action.C(Integer.valueOf(i4));
        }
        return iArr;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Integer np(@l3.d int[] iArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.m(iArr.length)]);
    }

    public static final byte nq(@l3.d byte[] bArr, @l3.d X2.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        qe = qe(bArr);
        if (qe >= 0) {
            byte b4 = bArr[qe];
            for (int i4 = qe - 1; i4 >= 0; i4--) {
                b4 = operation.z(Integer.valueOf(i4), Byte.valueOf(bArr[i4]), Byte.valueOf(b4)).byteValue();
            }
            return b4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final <T> List<T> nr(@l3.d T[] tArr) {
        List<T> H3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<T> Ty = Ty(tArr);
        C.r1(Ty);
        return Ty;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ns(int[] iArr, R r4, X2.p<? super R, ? super Integer, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        for (int i4 : iArr) {
            r4 = operation.c0(r4, Integer.valueOf(i4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Boolean nt(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Boolean bool = null;
        boolean z3 = false;
        for (boolean z4 : zArr) {
            if (predicate.C(Boolean.valueOf(z4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                bool = Boolean.valueOf(z4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return bool;
    }

    @l3.d
    public static final boolean[] nu(@l3.d boolean[] zArr, @l3.d kotlin.ranges.l indices) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            return new boolean[0];
        }
        return C2100o.n1(zArr, indices.c().intValue(), indices.k().intValue() + 1);
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Boolean> nv(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Nv(zArr, new g.a(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double nw(@l3.d char[] cArr, @l3.d X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (char c4 : cArr) {
            d4 += selector.C(Character.valueOf(c4)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long nx(double[] dArr, X2.l<? super Double, x0> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (double d4 : dArr) {
            l4 = x0.l(l4 + selector.C(Double.valueOf(d4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Long>> C ny(@l3.d long[] jArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (long j4 : jArr) {
            destination.add(Long.valueOf(j4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Boolean> nz(@l3.d boolean[] zArr) {
        Set<Boolean> k4;
        Set<Boolean> f4;
        int j4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            j4 = X.j(zArr.length);
            return (Set) qy(zArr, new LinkedHashSet(j4));
        }
        f4 = i0.f(Boolean.valueOf(zArr[0]));
        return f4;
    }

    public static final boolean o5(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Byte>> M o6(@l3.d byte[] bArr, @l3.d M destination, @l3.d X2.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (byte b4 : bArr) {
            destination.put(keySelector.C(Byte.valueOf(b4)), Byte.valueOf(b4));
        }
        return destination;
    }

    @W2.i(name = "averageOfDouble")
    public static final double o7(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (Double d5 : dArr) {
            d4 += d5.doubleValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @InterfaceC2205l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.V(expression = "any { it == element }", imports = {}))
    @InterfaceC2207m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean o8(double[] dArr, double d4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        for (double d5 : dArr) {
            if (d5 == d4) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final List<Byte> o9(@l3.d byte[] bArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(bArr.length - i4, 0);
            return ux(bArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <V> List<V> oA(@l3.d long[] jArr, @l3.d long[] other, @l3.d X2.p<? super Long, ? super Long, ? extends V> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Long.valueOf(jArr[i4]), Long.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Short> oa(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Byte ob(byte[] bArr, X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                return Byte.valueOf(b4);
            }
        }
        return null;
    }

    @l3.e
    public static final <T> T oc(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    public static final <R> R od(@l3.d byte[] bArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Byte.valueOf(bArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    @l3.d
    public static kotlin.ranges.l oe(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        xe = xe(sArr);
        return new kotlin.ranges.l(0, xe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M of(@l3.d double[] dArr, @l3.d M destination, @l3.d X2.l<? super Double, ? extends K> keySelector, @l3.d X2.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (double d4 : dArr) {
            K C3 = keySelector.C(Double.valueOf(d4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Double.valueOf(d4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean og(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return true;
        }
        return false;
    }

    public static byte oh(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length != 0) {
            qe = qe(bArr);
            return bArr[qe];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R> List<R> oi(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(transform.C(Short.valueOf(s4)));
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double oj(char[] cArr, X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            double doubleValue = selector.C(Character.valueOf(cArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Character.valueOf(cArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Float ok(boolean[] zArr, X2.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.C(Boolean.valueOf(zArr[0])).floatValue();
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Boolean.valueOf(zArr[it.c()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final int ol(@l3.d int[] iArr, @l3.d Comparator<? super Integer> comparator) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i5 = iArr[it.c()];
                if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) < 0) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R om(double[] dArr, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Double.valueOf(dArr[0]));
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Double.valueOf(dArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Short on(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            if (s4 > s5) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long[] oo(long[] jArr, X2.l<? super Long, H0> action) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (long j4 : jArr) {
            action.C(Long.valueOf(j4));
        }
        return jArr;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Long op(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return pp(jArr, Random.f52425E);
    }

    public static final char oq(@l3.d char[] cArr, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int re = re(cArr);
        if (re >= 0) {
            char c4 = cArr[re];
            for (int i4 = re - 1; i4 >= 0; i4--) {
                c4 = operation.z(Integer.valueOf(i4), Character.valueOf(cArr[i4]), Character.valueOf(c4)).charValue();
            }
            return c4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Short> or(@l3.d short[] sArr) {
        List<Short> H3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<Short> Uy = Uy(sArr);
        C.r1(Uy);
        return Uy;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> os(long[] jArr, R r4, X2.p<? super R, ? super Long, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        for (long j4 : jArr) {
            r4 = operation.c0(r4, Long.valueOf(j4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Byte ot(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void ou(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length > 1) {
            C2100o.h4(tArr, new g.a(selector));
        }
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Byte> ov(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Fv(bArr, new g.c(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double ow(@l3.d double[] dArr, @l3.d X2.l<? super Double, Double> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (double d5 : dArr) {
            d4 += selector.C(Double.valueOf(d5)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long ox(float[] fArr, X2.l<? super Float, x0> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (float f4 : fArr) {
            l4 = x0.l(l4 + selector.C(Float.valueOf(f4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C oy(@l3.d T[] tArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (T t3 : tArr) {
            destination.add(t3);
        }
        return destination;
    }

    @l3.d
    public static final short[] oz(@l3.d Short[] shArr) {
        kotlin.jvm.internal.F.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i4 = 0; i4 < length; i4++) {
            sArr[i4] = shArr[i4].shortValue();
        }
        return sArr;
    }

    public static final <T> boolean p5(@l3.d T[] tArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M p6(@l3.d byte[] bArr, @l3.d M destination, @l3.d X2.l<? super Byte, ? extends K> keySelector, @l3.d X2.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (byte b4 : bArr) {
            destination.put(keySelector.C(Byte.valueOf(b4)), valueTransform.C(Byte.valueOf(b4)));
        }
        return destination;
    }

    @W2.i(name = "averageOfFloat")
    public static final double p7(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (Float f4 : fArr) {
            d4 += f4.floatValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @InterfaceC2205l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.V(expression = "any { it == element }", imports = {}))
    @InterfaceC2207m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean p8(float[] fArr, float f4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        for (float f5 : fArr) {
            if (f5 == f4) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final List<Character> p9(@l3.d char[] cArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(cArr.length - i4, 0);
            return vx(cArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<Pair<Long, R>> pA(@l3.d long[] jArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            long j4 = jArr[i4];
            arrayList.add(C2122h0.a(Long.valueOf(j4), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Boolean> pa(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z3));
            }
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Character pb(char[] cArr, X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                return Character.valueOf(c4);
            }
        }
        return null;
    }

    @l3.e
    public static final Short pc(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R pd(@l3.d char[] cArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Character.valueOf(cArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    @l3.d
    public static final kotlin.ranges.l pe(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return new kotlin.ranges.l(0, ye(zArr));
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Float>>> M pf(@l3.d float[] fArr, @l3.d M destination, @l3.d X2.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (float f4 : fArr) {
            K C3 = keySelector.C(Float.valueOf(f4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Float.valueOf(f4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean pg(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final byte ph(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                byte b4 = bArr[length];
                if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                    return b4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R> List<R> pi(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z3 : zArr) {
            arrayList.add(transform.C(Boolean.valueOf(z3)));
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double pj(double[] dArr, X2.l<? super Double, Double> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            double doubleValue = selector.C(Double.valueOf(dArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Double.valueOf(dArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R pk(byte[] bArr, Comparator<? super R> comparator, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            Object obj = (R) selector.C(Byte.valueOf(bArr[0]));
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Byte.valueOf(bArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final long pl(@l3.d long[] jArr, @l3.d Comparator<? super Long> comparator) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long j5 = jArr[it.c()];
                if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) < 0) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R pm(float[] fArr, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Float.valueOf(fArr[0]));
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Float.valueOf(fArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final byte pn(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte b5 = bArr[it.c()];
                if (b4 > b5) {
                    b4 = b5;
                }
            }
            return b4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> T[] po(T[] tArr, X2.l<? super T, H0> action) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (T t3 : tArr) {
            action.C(t3);
        }
        return tArr;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Long pp(@l3.d long[] jArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.m(jArr.length)]);
    }

    public static final double pq(@l3.d double[] dArr, @l3.d X2.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int se = se(dArr);
        if (se >= 0) {
            double d4 = dArr[se];
            for (int i4 = se - 1; i4 >= 0; i4--) {
                d4 = operation.z(Integer.valueOf(i4), Double.valueOf(dArr[i4]), Double.valueOf(d4)).doubleValue();
            }
            return d4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final List<Boolean> pr(@l3.d boolean[] zArr) {
        List<Boolean> H3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        List<Boolean> Vy = Vy(zArr);
        C.r1(Vy);
        return Vy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> ps(@l3.d T[] tArr, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        for (A1.a aVar : tArr) {
            r4 = operation.c0(r4, aVar);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Byte pt(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Byte b4 = null;
        boolean z3 = false;
        for (byte b5 : bArr) {
            if (predicate.C(Byte.valueOf(b5)).booleanValue()) {
                if (z3) {
                    return null;
                }
                b4 = Byte.valueOf(b5);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return b4;
    }

    public static final <T, R extends Comparable<? super R>> void pu(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length > 1) {
            C2100o.h4(tArr, new g.c(selector));
        }
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Character> pv(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Gv(cArr, new g.c(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double pw(@l3.d float[] fArr, @l3.d X2.l<? super Float, Double> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (float f4 : fArr) {
            d4 += selector.C(Float.valueOf(f4)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long px(int[] iArr, X2.l<? super Integer, x0> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (int i4 : iArr) {
            l4 = x0.l(l4 + selector.C(Integer.valueOf(i4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Short>> C py(@l3.d short[] sArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (short s4 : sArr) {
            destination.add(Short.valueOf(s4));
        }
        return destination;
    }

    @l3.d
    public static final Set<Byte> pz(@l3.d byte[] bArr, @l3.d Iterable<Byte> other) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Byte> Wy = Wy(bArr);
        kotlin.collections.A.q0(Wy, other);
        return Wy;
    }

    public static final <T> boolean q5(@l3.d T[] tArr, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Character>> M q6(@l3.d char[] cArr, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (char c4 : cArr) {
            destination.put(keySelector.C(Character.valueOf(c4)), Character.valueOf(c4));
        }
        return destination;
    }

    @W2.i(name = "averageOfInt")
    public static final double q7(@l3.d Integer[] numArr) {
        kotlin.jvm.internal.F.p(numArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (Integer num : numArr) {
            d4 += num.intValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    public static boolean q8(@l3.d int[] iArr, int i4) {
        int Gf;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        Gf = Gf(iArr, i4);
        if (Gf >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Double> q9(@l3.d double[] dArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(dArr.length - i4, 0);
            return wx(dArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, V> List<V> qA(@l3.d long[] jArr, @l3.d R[] other, @l3.d X2.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Long.valueOf(jArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Byte> qa(@l3.d byte[] bArr, @l3.d X2.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b4 = bArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Byte.valueOf(b4)).booleanValue()) {
                arrayList.add(Byte.valueOf(b4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Double qb(double[] dArr, X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (double d4 : dArr) {
            if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                return Double.valueOf(d4);
            }
        }
        return null;
    }

    @l3.e
    public static final Short qc(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    public static final <R> R qd(@l3.d double[] dArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Double.valueOf(dArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static int qe(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M qf(@l3.d float[] fArr, @l3.d M destination, @l3.d X2.l<? super Float, ? extends K> keySelector, @l3.d X2.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (float f4 : fArr) {
            K C3 = keySelector.C(Float.valueOf(f4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Float.valueOf(f4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean qg(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final char qh(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[re(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R> List<R> qi(@l3.d byte[] bArr, @l3.d X2.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double qj(float[] fArr, X2.l<? super Float, Double> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            double doubleValue = selector.C(Float.valueOf(fArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Float.valueOf(fArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R qk(char[] cArr, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            Object obj = (R) selector.C(Character.valueOf(cArr[0]));
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Character.valueOf(cArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T> T ql(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (tArr.length != 0) {
            T t3 = tArr[0];
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                if (comparator.compare(t3, t4) < 0) {
                    t3 = t4;
                }
            }
            return t3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R qm(int[] iArr, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Integer.valueOf(iArr[0]));
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Integer.valueOf(iArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final char qn(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                char c5 = cArr[it.c()];
                if (kotlin.jvm.internal.F.t(c4, c5) > 0) {
                    c4 = c5;
                }
            }
            return c4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final short[] qo(short[] sArr, X2.l<? super Short, H0> action) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (short s4 : sArr) {
            action.C(Short.valueOf(s4));
        }
        return sArr;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> T qp(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return (T) rp(tArr, Random.f52425E);
    }

    public static final float qq(@l3.d float[] fArr, @l3.d X2.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int te = te(fArr);
        if (te >= 0) {
            float f4 = fArr[te];
            for (int i4 = te - 1; i4 >= 0; i4--) {
                f4 = operation.z(Integer.valueOf(i4), Float.valueOf(fArr[i4]), Float.valueOf(f4)).floatValue();
            }
            return f4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static byte[] qr(@l3.d byte[] bArr) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        qe = qe(bArr);
        P it = new kotlin.ranges.l(0, qe).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            bArr2[qe - c4] = bArr[c4];
        }
        return bArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> qs(short[] sArr, R r4, X2.p<? super R, ? super Short, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        for (short s4 : sArr) {
            r4 = operation.c0(r4, Short.valueOf(s4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Character qt(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void qu(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length > 1) {
            C2100o.G3(bArr);
            Pq(bArr);
        }
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Double> qv(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Hv(dArr, new g.c(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double qw(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 : iArr) {
            d4 += selector.C(Integer.valueOf(i4)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long qx(long[] jArr, X2.l<? super Long, x0> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (long j4 : jArr) {
            l4 = x0.l(l4 + selector.C(Long.valueOf(j4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final <C extends Collection<? super Boolean>> C qy(@l3.d boolean[] zArr, @l3.d C destination) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (boolean z3 : zArr) {
            destination.add(Boolean.valueOf(z3));
        }
        return destination;
    }

    @l3.d
    public static final Set<Character> qz(@l3.d char[] cArr, @l3.d Iterable<Character> other) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Character> Xy = Xy(cArr);
        kotlin.collections.A.q0(Xy, other);
        return Xy;
    }

    public static boolean r5(@l3.d short[] sArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M r6(@l3.d char[] cArr, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (char c4 : cArr) {
            destination.put(keySelector.C(Character.valueOf(c4)), valueTransform.C(Character.valueOf(c4)));
        }
        return destination;
    }

    @W2.i(name = "averageOfLong")
    public static final double r7(@l3.d Long[] lArr) {
        kotlin.jvm.internal.F.p(lArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (Long l4 : lArr) {
            d4 += l4.longValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    public static boolean r8(@l3.d long[] jArr, long j4) {
        int Hf;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        Hf = Hf(jArr, j4);
        if (Hf >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Float> r9(@l3.d float[] fArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(fArr.length - i4, 0);
            return xx(fArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <T, R> List<Pair<T, R>> rA(@l3.d T[] tArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = tArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(tArr[i4], r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final List<Character> ra(@l3.d char[] cArr, @l3.d X2.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            char c4 = cArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Character.valueOf(c4)).booleanValue()) {
                arrayList.add(Character.valueOf(c4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Float rb(float[] fArr, X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (float f4 : fArr) {
            if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                return Float.valueOf(f4);
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> rc(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b4 : bArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Byte.valueOf(b4)));
        }
        return arrayList;
    }

    public static final <R> R rd(@l3.d float[] fArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Float.valueOf(fArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final int re(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr.length - 1;
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Integer>>> M rf(@l3.d int[] iArr, @l3.d M destination, @l3.d X2.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (int i4 : iArr) {
            K C3 = keySelector.C(Integer.valueOf(i4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Integer.valueOf(i4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean rg(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final char rh(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char c4 = cArr[length];
                if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                    return c4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R> List<R> ri(@l3.d char[] cArr, @l3.d X2.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double rj(int[] iArr, X2.l<? super Integer, Double> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            double doubleValue = selector.C(Integer.valueOf(iArr[0])).doubleValue();
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Integer.valueOf(iArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R rk(double[] dArr, Comparator<? super R> comparator, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            Object obj = (R) selector.C(Double.valueOf(dArr[0]));
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Double.valueOf(dArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final short rl(@l3.d short[] sArr, @l3.d Comparator<? super Short> comparator) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short s5 = sArr[it.c()];
                if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) < 0) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R rm(long[] jArr, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Long.valueOf(jArr[0]));
        ve = ve(jArr);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Long.valueOf(jArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double rn(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                d4 = Math.min(d4, dArr[it.c()]);
            }
            return d4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean[] ro(boolean[] zArr, X2.l<? super Boolean, H0> action) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (boolean z3 : zArr) {
            action.C(Boolean.valueOf(z3));
        }
        return zArr;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T> T rp(@l3.d T[] tArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.m(tArr.length)];
    }

    public static final int rq(@l3.d int[] iArr, @l3.d X2.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ue = ue(iArr);
        if (ue >= 0) {
            int i4 = iArr[ue];
            for (int i5 = ue - 1; i5 >= 0; i5--) {
                i4 = operation.z(Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final char[] rr(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int re = re(cArr);
        P it = new kotlin.ranges.l(0, re).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            cArr2[re - c4] = cArr[c4];
        }
        return cArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> rs(boolean[] zArr, R r4, X2.p<? super R, ? super Boolean, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (zArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        for (boolean z3 : zArr) {
            r4 = operation.c0(r4, Boolean.valueOf(z3));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Character rt(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Character ch = null;
        boolean z3 = false;
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                ch = Character.valueOf(c4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return ch;
    }

    @kotlin.Y(version = "1.4")
    public static final void ru(@l3.d byte[] bArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        C2100o.H3(bArr, i4, i5);
        Qq(bArr, i4, i5);
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Float> rv(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Iv(fArr, new g.c(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double rw(@l3.d long[] jArr, @l3.d X2.l<? super Long, Double> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (long j4 : jArr) {
            d4 += selector.C(Long.valueOf(j4)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> long rx(T[] tArr, X2.l<? super T, x0> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (T t3 : tArr) {
            l4 = x0.l(l4 + selector.C(t3).l0());
        }
        return l4;
    }

    @l3.d
    public static final double[] ry(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr2[i4] = dArr[i4].doubleValue();
        }
        return dArr2;
    }

    @l3.d
    public static final Set<Double> rz(@l3.d double[] dArr, @l3.d Iterable<Double> other) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Double> Yy = Yy(dArr);
        kotlin.collections.A.q0(Yy, other);
        return Yy;
    }

    public static final boolean s5(@l3.d short[] sArr, @l3.d X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Double>> M s6(@l3.d double[] dArr, @l3.d M destination, @l3.d X2.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (double d4 : dArr) {
            destination.put(keySelector.C(Double.valueOf(d4)), Double.valueOf(d4));
        }
        return destination;
    }

    @W2.i(name = "averageOfShort")
    public static final double s7(@l3.d Short[] shArr) {
        kotlin.jvm.internal.F.p(shArr, "<this>");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        for (Short sh : shArr) {
            d4 += sh.shortValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    public static <T> boolean s8(@l3.d T[] tArr, T t3) {
        int If;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        If = If(tArr, t3);
        if (If >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Integer> s9(@l3.d int[] iArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(iArr.length - i4, 0);
            return yx(iArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, R, V> List<V> sA(@l3.d T[] tArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super T, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = tArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(tArr[i4], r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final List<Double> sa(@l3.d double[] dArr, @l3.d X2.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            double d4 = dArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Double.valueOf(d4)).booleanValue()) {
                arrayList.add(Double.valueOf(d4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Integer sb(int[] iArr, X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                return Integer.valueOf(i4);
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> sc(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c4 : cArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Character.valueOf(c4)));
        }
        return arrayList;
    }

    public static final <R> R sd(@l3.d int[] iArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Integer.valueOf(iArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final int se(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M sf(@l3.d int[] iArr, @l3.d M destination, @l3.d X2.l<? super Integer, ? extends K> keySelector, @l3.d X2.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (int i4 : iArr) {
            K C3 = keySelector.C(Integer.valueOf(i4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Integer.valueOf(i4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> boolean sg(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final double sh(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[se(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R> List<R> si(@l3.d double[] dArr, @l3.d X2.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double sj(long[] jArr, X2.l<? super Long, Double> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            double doubleValue = selector.C(Long.valueOf(jArr[0])).doubleValue();
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Long.valueOf(jArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R sk(float[] fArr, Comparator<? super R> comparator, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            Object obj = (R) selector.C(Float.valueOf(fArr[0]));
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Float.valueOf(fArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final boolean sl(@l3.d boolean[] zArr, @l3.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z3 = zArr[0];
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                boolean z4 = zArr[it.c()];
                if (comparator.compare(Boolean.valueOf(z3), Boolean.valueOf(z4)) < 0) {
                    z3 = z4;
                }
            }
            return z3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R sm(T[] tArr, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R C3 = selector.C(tArr[0]);
        P it = new kotlin.ranges.l(1, we(tArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(tArr[it.c()]);
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double sn(@l3.d Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length != 0) {
            double doubleValue = dArr[0].doubleValue();
            P it = new kotlin.ranges.l(1, we(dArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, dArr[it.c()].doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final byte[] so(byte[] bArr, X2.p<? super Integer, ? super Byte, H0> action) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Byte.valueOf(bArr[i4]));
            i4++;
            i5++;
        }
        return bArr;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Short sp(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return tp(sArr, Random.f52425E);
    }

    public static final long sq(@l3.d long[] jArr, @l3.d X2.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ve = ve(jArr);
        if (ve >= 0) {
            long j4 = jArr[ve];
            for (int i4 = ve - 1; i4 >= 0; i4--) {
                j4 = operation.z(Integer.valueOf(i4), Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final double[] sr(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int se = se(dArr);
        P it = new kotlin.ranges.l(0, se).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            dArr2[se - c4] = dArr[c4];
        }
        return dArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ss(byte[] bArr, R r4, X2.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Byte.valueOf(bArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Double st(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void su(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length > 1) {
            C2100o.I3(cArr);
            Rq(cArr);
        }
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Integer> sv(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Jv(iArr, new g.c(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final <T> double sw(@l3.d T[] tArr, @l3.d X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (T t3 : tArr) {
            d4 += selector.C(t3).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long sx(short[] sArr, X2.l<? super Short, x0> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (short s4 : sArr) {
            l4 = x0.l(l4 + selector.C(Short.valueOf(s4)).l0());
        }
        return l4;
    }

    @l3.d
    public static final float[] sy(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            fArr2[i4] = fArr[i4].floatValue();
        }
        return fArr2;
    }

    @l3.d
    public static final Set<Float> sz(@l3.d float[] fArr, @l3.d Iterable<Float> other) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Float> Zy = Zy(fArr);
        kotlin.collections.A.q0(Zy, other);
        return Zy;
    }

    public static final boolean t5(@l3.d boolean[] zArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M t6(@l3.d double[] dArr, @l3.d M destination, @l3.d X2.l<? super Double, ? extends K> keySelector, @l3.d X2.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (double d4 : dArr) {
            destination.put(keySelector.C(Double.valueOf(d4)), valueTransform.C(Double.valueOf(d4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final byte t7(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr[0];
    }

    public static boolean t8(@l3.d short[] sArr, short s4) {
        int Jf;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        Jf = Jf(sArr, s4);
        if (Jf >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Long> t9(@l3.d long[] jArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(jArr.length - i4, 0);
            return zx(jArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <T, R> List<Pair<T, R>> tA(@l3.d T[] tArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(tArr[i4], other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Float> ta(@l3.d float[] fArr, @l3.d X2.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            float f4 = fArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Float.valueOf(f4)).booleanValue()) {
                arrayList.add(Float.valueOf(f4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Long tb(long[] jArr, X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                return Long.valueOf(j4);
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> tc(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d4 : dArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Double.valueOf(d4)));
        }
        return arrayList;
    }

    public static final <R> R td(@l3.d long[] jArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Long.valueOf(jArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final int te(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr.length - 1;
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Long>>> M tf(@l3.d long[] jArr, @l3.d M destination, @l3.d X2.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (long j4 : jArr) {
            K C3 = keySelector.C(Long.valueOf(j4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Long.valueOf(j4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean tg(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final double th(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                double d4 = dArr[length];
                if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                    return d4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R> List<R> ti(@l3.d float[] fArr, @l3.d X2.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double tj(T[] tArr, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            double doubleValue = selector.C(tArr[0]).doubleValue();
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(tArr[it.c()]).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R tk(int[] iArr, Comparator<? super R> comparator, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length != 0) {
            Object obj = (R) selector.C(Integer.valueOf(iArr[0]));
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Integer.valueOf(iArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean tl(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        int ye = ye(zArr);
        if (ye == 0) {
            return Boolean.valueOf(z3);
        }
        R C3 = selector.C(Boolean.valueOf(z3));
        P it = new kotlin.ranges.l(1, ye).iterator();
        while (it.hasNext()) {
            boolean z4 = zArr[it.c()];
            R C4 = selector.C(Boolean.valueOf(z4));
            if (C3.compareTo(C4) > 0) {
                z3 = z4;
                C3 = C4;
            }
        }
        return Boolean.valueOf(z3);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R tm(short[] sArr, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Short.valueOf(sArr[0]));
        xe = xe(sArr);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Short.valueOf(sArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float tn(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                f4 = Math.min(f4, fArr[it.c()]);
            }
            return f4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final char[] to(char[] cArr, X2.p<? super Integer, ? super Character, H0> action) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Character.valueOf(cArr[i4]));
            i4++;
            i5++;
        }
        return cArr;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final Short tp(@l3.d short[] sArr, @l3.d Random random) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.m(sArr.length)]);
    }

    public static final <S, T extends S> S tq(@l3.d T[] tArr, @l3.d X2.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int we = we(tArr);
        if (we >= 0) {
            S s4 = (S) tArr[we];
            for (int i4 = we - 1; i4 >= 0; i4--) {
                s4 = operation.z(Integer.valueOf(i4), (Object) tArr[i4], s4);
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static final float[] tr(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int te = te(fArr);
        P it = new kotlin.ranges.l(0, te).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            fArr2[te - c4] = fArr[c4];
        }
        return fArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ts(char[] cArr, R r4, X2.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Character.valueOf(cArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Double tt(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Double d4 = null;
        boolean z3 = false;
        for (double d5 : dArr) {
            if (predicate.C(Double.valueOf(d5)).booleanValue()) {
                if (z3) {
                    return null;
                }
                d4 = Double.valueOf(d5);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return d4;
    }

    @kotlin.Y(version = "1.4")
    public static final void tu(@l3.d char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        C2100o.J3(cArr, i4, i5);
        Sq(cArr, i4, i5);
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Long> tv(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Kv(jArr, new g.c(selector));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double tw(@l3.d short[] sArr, @l3.d X2.l<? super Short, Double> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (short s4 : sArr) {
            d4 += selector.C(Short.valueOf(s4)).doubleValue();
        }
        return d4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long tx(boolean[] zArr, X2.l<? super Boolean, x0> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (boolean z3 : zArr) {
            l4 = x0.l(l4 + selector.C(Boolean.valueOf(z3)).l0());
        }
        return l4;
    }

    @l3.d
    public static final HashSet<Byte> ty(@l3.d byte[] bArr) {
        int j4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        j4 = X.j(bArr.length);
        return (HashSet) iy(bArr, new HashSet(j4));
    }

    @l3.d
    public static final Set<Integer> tz(@l3.d int[] iArr, @l3.d Iterable<Integer> other) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Integer> az = az(iArr);
        kotlin.collections.A.q0(az, other);
        return az;
    }

    public static final boolean u5(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (boolean z3 : zArr) {
            if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Float>> M u6(@l3.d float[] fArr, @l3.d M destination, @l3.d X2.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (float f4 : fArr) {
            destination.put(keySelector.C(Float.valueOf(f4)), Float.valueOf(f4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final char u7(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr[0];
    }

    public static final boolean u8(@l3.d boolean[] zArr, boolean z3) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (Kf(zArr, z3) >= 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final <T> List<T> u9(@l3.d T[] tArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(tArr.length - i4, 0);
            return Ax(tArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <T, R, V> List<V> uA(@l3.d T[] tArr, @l3.d R[] other, @l3.d X2.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(tArr[i4], other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Integer> ua(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            int i7 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Integer.valueOf(i6)).booleanValue()) {
                arrayList.add(Integer.valueOf(i6));
            }
            i4++;
            i5 = i7;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final <T> T ub(T[] tArr, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : tArr) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> uc(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f4 : fArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Float.valueOf(f4)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ud(@l3.d T[] tArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, tArr[i4]);
            i4++;
            i5++;
        }
        return r4;
    }

    public static int ue(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M uf(@l3.d long[] jArr, @l3.d M destination, @l3.d X2.l<? super Long, ? extends K> keySelector, @l3.d X2.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (long j4 : jArr) {
            K C3 = keySelector.C(Long.valueOf(j4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Long.valueOf(j4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean ug(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final float uh(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[te(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R> List<R> ui(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double uj(short[] sArr, X2.l<? super Short, Double> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            double doubleValue = selector.C(Short.valueOf(sArr[0])).doubleValue();
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Short.valueOf(sArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R uk(long[] jArr, Comparator<? super R> comparator, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length != 0) {
            Object obj = (R) selector.C(Long.valueOf(jArr[0]));
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Long.valueOf(jArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte ul(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = qe(bArr);
        if (qe == 0) {
            return Byte.valueOf(b4);
        }
        R C3 = selector.C(Byte.valueOf(b4));
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            R C4 = selector.C(Byte.valueOf(b5));
            if (C3.compareTo(C4) > 0) {
                b4 = b5;
                C3 = C4;
            }
        }
        return Byte.valueOf(b4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R um(boolean[] zArr, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R C3 = selector.C(Boolean.valueOf(zArr[0]));
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Boolean.valueOf(zArr[it.c()]));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float un(@l3.d Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length != 0) {
            float floatValue = fArr[0].floatValue();
            P it = new kotlin.ranges.l(1, we(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, fArr[it.c()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double[] uo(double[] dArr, X2.p<? super Integer, ? super Double, H0> action) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Double.valueOf(dArr[i4]));
            i4++;
            i5++;
        }
        return dArr;
    }

    public static final byte up(@l3.d byte[] bArr, @l3.d X2.p<? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length != 0) {
            byte b4 = bArr[0];
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                b4 = operation.c0(Byte.valueOf(b4), Byte.valueOf(bArr[it.c()])).byteValue();
            }
            return b4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short uq(@l3.d short[] sArr, @l3.d X2.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        xe = xe(sArr);
        if (xe >= 0) {
            short s4 = sArr[xe];
            for (int i4 = xe - 1; i4 >= 0; i4--) {
                s4 = operation.z(Integer.valueOf(i4), Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static int[] ur(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        ue = ue(iArr);
        P it = new kotlin.ranges.l(0, ue).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            iArr2[ue - c4] = iArr[c4];
        }
        return iArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> us(double[] dArr, R r4, X2.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Double.valueOf(dArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Float ut(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void uu(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length > 1) {
            C2100o.K3(dArr);
            Tq(dArr);
        }
    }

    @l3.d
    public static final <T, R extends Comparable<? super R>> List<T> uv(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends R> selector) {
        List<T> Lv;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Lv = Lv(tArr, new g.c(selector));
        return Lv;
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double uw(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (boolean z3 : zArr) {
            d4 += selector.C(Boolean.valueOf(z3)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Byte> ux(@l3.d byte[] bArr, int i4) {
        List<Byte> k4;
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= bArr.length) {
                return Dy(bArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Byte.valueOf(bArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (byte b4 : bArr) {
                arrayList.add(Byte.valueOf(b4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Character> uy(@l3.d char[] cArr) {
        int B3;
        int j4;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        B3 = kotlin.ranges.u.B(cArr.length, 128);
        j4 = X.j(B3);
        return (HashSet) jy(cArr, new HashSet(j4));
    }

    @l3.d
    public static final Set<Long> uz(@l3.d long[] jArr, @l3.d Iterable<Long> other) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Long> bz = bz(jArr);
        kotlin.collections.A.q0(bz, other);
        return bz;
    }

    @l3.d
    public static final Iterable<Byte> v5(@l3.d byte[] bArr) {
        List H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new C2103b(bArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M v6(@l3.d float[] fArr, @l3.d M destination, @l3.d X2.l<? super Float, ? extends K> keySelector, @l3.d X2.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (float f4 : fArr) {
            destination.put(keySelector.C(Float.valueOf(f4)), valueTransform.C(Float.valueOf(f4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final double v7(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr[0];
    }

    @kotlin.internal.f
    private static final int v8(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr.length;
    }

    @l3.d
    public static final List<Short> v9(@l3.d short[] sArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(sArr.length - i4, 0);
            return Bx(sArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<Pair<Short, R>> vA(@l3.d short[] sArr, @l3.d Iterable<? extends R> other) {
        int b02;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = sArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(Short.valueOf(sArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final List<Long> va(@l3.d long[] jArr, @l3.d X2.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            long j4 = jArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Short vb(short[] sArr, X2.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.C(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> vc(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Integer.valueOf(i4)));
        }
        return arrayList;
    }

    public static final <R> R vd(@l3.d short[] sArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Short.valueOf(sArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static int ve(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr.length - 1;
    }

    @l3.d
    public static final <T, K, M extends Map<? super K, List<T>>> M vf(@l3.d T[] tArr, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (T t3 : tArr) {
            K C3 = keySelector.C(t3);
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(t3);
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean vg(byte[] bArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final float vh(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                float f4 = fArr[length];
                if (predicate.C(Float.valueOf(f4)).booleanValue()) {
                    return f4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R> List<R> vi(@l3.d long[] jArr, @l3.d X2.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double vj(boolean[] zArr, X2.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            double doubleValue = selector.C(Boolean.valueOf(zArr[0])).doubleValue();
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Boolean.valueOf(zArr[it.c()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R vk(T[] tArr, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length != 0) {
            Object obj = (R) selector.C(tArr[0]);
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(tArr[it.c()]);
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Character vl(@l3.d char[] cArr, @l3.d X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        int re = re(cArr);
        if (re == 0) {
            return Character.valueOf(c4);
        }
        R C3 = selector.C(Character.valueOf(c4));
        P it = new kotlin.ranges.l(1, re).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            R C4 = selector.C(Character.valueOf(c5));
            if (C3.compareTo(C4) > 0) {
                c4 = c5;
                C3 = C4;
            }
        }
        return Character.valueOf(c4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double vm(byte[] bArr, X2.l<? super Byte, Double> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Byte.valueOf(bArr[0])).doubleValue();
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Byte.valueOf(bArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final int vn(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i5 = iArr[it.c()];
                if (i4 > i5) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float[] vo(float[] fArr, X2.p<? super Integer, ? super Float, H0> action) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Float.valueOf(fArr[i4]));
            i4++;
            i5++;
        }
        return fArr;
    }

    public static final char vp(@l3.d char[] cArr, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (cArr.length != 0) {
            char c4 = cArr[0];
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                c4 = operation.c0(Character.valueOf(c4), Character.valueOf(cArr[it.c()])).charValue();
            }
            return c4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean vq(@l3.d boolean[] zArr, @l3.d X2.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int ye = ye(zArr);
        if (ye >= 0) {
            boolean z3 = zArr[ye];
            for (int i4 = ye - 1; i4 >= 0; i4--) {
                z3 = operation.z(Integer.valueOf(i4), Boolean.valueOf(zArr[i4]), Boolean.valueOf(z3)).booleanValue();
            }
            return z3;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.d
    public static long[] vr(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        ve = ve(jArr);
        P it = new kotlin.ranges.l(0, ve).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            jArr2[ve - c4] = jArr[c4];
        }
        return jArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> vs(float[] fArr, R r4, X2.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Float.valueOf(fArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Float vt(@l3.d float[] fArr, @l3.d X2.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Float f4 = null;
        boolean z3 = false;
        for (float f5 : fArr) {
            if (predicate.C(Float.valueOf(f5)).booleanValue()) {
                if (z3) {
                    return null;
                }
                f4 = Float.valueOf(f5);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return f4;
    }

    @kotlin.Y(version = "1.4")
    public static final void vu(@l3.d double[] dArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        C2100o.L3(dArr, i4, i5);
        Uq(dArr, i4, i5);
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Short> vv(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Mv(sArr, new g.c(selector));
    }

    @W2.i(name = "sumOfByte")
    public static final int vw(@l3.d Byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int i4 = 0;
        for (Byte b4 : bArr) {
            i4 += b4.byteValue();
        }
        return i4;
    }

    @l3.d
    public static final List<Character> vx(@l3.d char[] cArr, int i4) {
        List<Character> k4;
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= cArr.length) {
                return Ey(cArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Character.valueOf(cArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (char c4 : cArr) {
                arrayList.add(Character.valueOf(c4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Double> vy(@l3.d double[] dArr) {
        int j4;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        j4 = X.j(dArr.length);
        return (HashSet) ky(dArr, new HashSet(j4));
    }

    @l3.d
    public static final <T> Set<T> vz(@l3.d T[] tArr, @l3.d Iterable<? extends T> other) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<T> cz = cz(tArr);
        kotlin.collections.A.q0(cz, other);
        return cz;
    }

    @l3.d
    public static final Iterable<Character> w5(@l3.d char[] cArr) {
        List H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new i(cArr);
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Integer>> M w6(@l3.d int[] iArr, @l3.d M destination, @l3.d X2.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (int i4 : iArr) {
            destination.put(keySelector.C(Integer.valueOf(i4)), Integer.valueOf(i4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final float w7(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr[0];
    }

    public static final int w8(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (byte b4 : bArr) {
            if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Boolean> w9(@l3.d boolean[] zArr, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(zArr.length - i4, 0);
            return Cx(zArr, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, V> List<V> wA(@l3.d short[] sArr, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super Short, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = sArr.length;
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(Short.valueOf(sArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <T> List<T> wa(@l3.d T[] tArr, @l3.d X2.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            T t3 = tArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), t3).booleanValue()) {
                arrayList.add(t3);
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Boolean wb(boolean[] zArr, X2.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                boolean z3 = zArr[length];
                if (predicate.C(Boolean.valueOf(z3)).booleanValue()) {
                    return Boolean.valueOf(z3);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> wc(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Long.valueOf(j4)));
        }
        return arrayList;
    }

    public static final <R> R wd(@l3.d boolean[] zArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.z(Integer.valueOf(i5), r4, Boolean.valueOf(zArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final <T> int we(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M wf(@l3.d T[] tArr, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (T t3 : tArr) {
            K C3 = keySelector.C(t3);
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(t3));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean wg(char[] cArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static int wh(@l3.d int[] iArr) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length != 0) {
            ue = ue(iArr);
            return iArr[ue];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <T, R> List<R> wi(@l3.d T[] tArr, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float wj(byte[] bArr, X2.l<? super Byte, Float> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length != 0) {
            float floatValue = selector.C(Byte.valueOf(bArr[0])).floatValue();
            qe = qe(bArr);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Byte.valueOf(bArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R wk(short[] sArr, Comparator<? super R> comparator, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length != 0) {
            Object obj = (R) selector.C(Short.valueOf(sArr[0]));
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Short.valueOf(sArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Double wl(@l3.d double[] dArr, @l3.d X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        int se = se(dArr);
        if (se == 0) {
            return Double.valueOf(d4);
        }
        R C3 = selector.C(Double.valueOf(d4));
        P it = new kotlin.ranges.l(1, se).iterator();
        while (it.hasNext()) {
            double d5 = dArr[it.c()];
            R C4 = selector.C(Double.valueOf(d5));
            if (C3.compareTo(C4) > 0) {
                d4 = d5;
                C3 = C4;
            }
        }
        return Double.valueOf(d4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double wm(char[] cArr, X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Character.valueOf(cArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Character.valueOf(cArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final long wn(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long j5 = jArr[it.c()];
                if (j4 > j5) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int[] wo(int[] iArr, X2.p<? super Integer, ? super Integer, H0> action) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Integer.valueOf(iArr[i4]));
            i4++;
            i5++;
        }
        return iArr;
    }

    public static final double wp(@l3.d double[] dArr, @l3.d X2.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (dArr.length != 0) {
            double d4 = dArr[0];
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                d4 = operation.c0(Double.valueOf(d4), Double.valueOf(dArr[it.c()])).doubleValue();
            }
            return d4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Boolean wq(@l3.d boolean[] zArr, @l3.d X2.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int ye = ye(zArr);
        if (ye < 0) {
            return null;
        }
        boolean z3 = zArr[ye];
        for (int i4 = ye - 1; i4 >= 0; i4--) {
            z3 = operation.z(Integer.valueOf(i4), Boolean.valueOf(zArr[i4]), Boolean.valueOf(z3)).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    @l3.d
    public static final <T> T[] wr(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) C2098m.a(tArr, tArr.length);
        int we = we(tArr);
        P it = new kotlin.ranges.l(0, we).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            tArr2[we - c4] = tArr[c4];
        }
        return tArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> ws(int[] iArr, R r4, X2.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Integer.valueOf(iArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Integer wt(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void wu(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length > 1) {
            C2100o.M3(fArr);
            Vq(fArr);
        }
    }

    @l3.d
    public static final <R extends Comparable<? super R>> List<Boolean> wv(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return Nv(zArr, new g.c(selector));
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double ww(byte[] bArr, X2.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (byte b4 : bArr) {
            d4 += selector.C(Byte.valueOf(b4)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Double> wx(@l3.d double[] dArr, int i4) {
        List<Double> k4;
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= dArr.length) {
                return Fy(dArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Double.valueOf(dArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (double d4 : dArr) {
                arrayList.add(Double.valueOf(d4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Float> wy(@l3.d float[] fArr) {
        int j4;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        j4 = X.j(fArr.length);
        return (HashSet) ly(fArr, new HashSet(j4));
    }

    @l3.d
    public static final Set<Short> wz(@l3.d short[] sArr, @l3.d Iterable<Short> other) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Short> dz = dz(sArr);
        kotlin.collections.A.q0(dz, other);
        return dz;
    }

    @l3.d
    public static final Iterable<Double> x5(@l3.d double[] dArr) {
        List H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new g(dArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M x6(@l3.d int[] iArr, @l3.d M destination, @l3.d X2.l<? super Integer, ? extends K> keySelector, @l3.d X2.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (int i4 : iArr) {
            destination.put(keySelector.C(Integer.valueOf(i4)), valueTransform.C(Integer.valueOf(i4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final int x7(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr[0];
    }

    @kotlin.internal.f
    private static final int x8(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr.length;
    }

    @l3.d
    public static final List<Byte> x9(@l3.d byte[] bArr, @l3.d X2.l<? super Byte, Boolean> predicate) {
        int qe;
        List<Byte> H3;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (qe = qe(bArr); -1 < qe; qe--) {
            if (!predicate.C(Byte.valueOf(bArr[qe])).booleanValue()) {
                return ux(bArr, qe + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <R> List<Pair<Short, R>> xA(@l3.d short[] sArr, @l3.d R[] other) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            short s4 = sArr[i4];
            arrayList.add(C2122h0.a(Short.valueOf(s4), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Short> xa(@l3.d short[] sArr, @l3.d X2.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            short s4 = sArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Byte xb(byte[] bArr, X2.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                byte b4 = bArr[length];
                if (predicate.C(Byte.valueOf(b4)).booleanValue()) {
                    return Byte.valueOf(b4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @l3.d
    public static final <T, R> List<R> xc(@l3.d T[] tArr, @l3.d X2.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            kotlin.collections.A.q0(arrayList, transform.C(t3));
        }
        return arrayList;
    }

    public static final <R> R xd(@l3.d byte[] bArr, R r4, @l3.d X2.p<? super Byte, ? super R, ? extends R> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (qe = qe(bArr); qe >= 0; qe--) {
            r4 = operation.c0(Byte.valueOf(bArr[qe]), r4);
        }
        return r4;
    }

    public static int xe(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr.length - 1;
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Short>>> M xf(@l3.d short[] sArr, @l3.d M destination, @l3.d X2.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (short s4 : sArr) {
            K C3 = keySelector.C(Short.valueOf(s4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Short.valueOf(s4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean xg(double[] dArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final int xh(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                int i5 = iArr[length];
                if (predicate.C(Integer.valueOf(i5)).booleanValue()) {
                    return i5;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <R> List<R> xi(@l3.d short[] sArr, @l3.d X2.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float xj(char[] cArr, X2.l<? super Character, Float> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length != 0) {
            float floatValue = selector.C(Character.valueOf(cArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, re(cArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Character.valueOf(cArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R xk(boolean[] zArr, Comparator<? super R> comparator, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length != 0) {
            Object obj = (R) selector.C(Boolean.valueOf(zArr[0]));
            P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Boolean.valueOf(zArr[it.c()]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Float xl(@l3.d float[] fArr, @l3.d X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        int te = te(fArr);
        if (te == 0) {
            return Float.valueOf(f4);
        }
        R C3 = selector.C(Float.valueOf(f4));
        P it = new kotlin.ranges.l(1, te).iterator();
        while (it.hasNext()) {
            float f5 = fArr[it.c()];
            R C4 = selector.C(Float.valueOf(f5));
            if (C3.compareTo(C4) > 0) {
                f4 = f5;
                C3 = C4;
            }
        }
        return Float.valueOf(f4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double xm(double[] dArr, X2.l<? super Double, Double> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Double.valueOf(dArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, se(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Double.valueOf(dArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T extends Comparable<? super T>> T xn(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length != 0) {
            T t3 = tArr[0];
            P it = new kotlin.ranges.l(1, we(tArr)).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                if (t3.compareTo(t4) > 0) {
                    t3 = t4;
                }
            }
            return t3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final long[] xo(long[] jArr, X2.p<? super Integer, ? super Long, H0> action) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Long.valueOf(jArr[i4]));
            i4++;
            i5++;
        }
        return jArr;
    }

    public static final float xp(@l3.d float[] fArr, @l3.d X2.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (fArr.length != 0) {
            float f4 = fArr[0];
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                f4 = operation.c0(Float.valueOf(f4), Float.valueOf(fArr[it.c()])).floatValue();
            }
            return f4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Byte xq(@l3.d byte[] bArr, @l3.d X2.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        qe = qe(bArr);
        if (qe < 0) {
            return null;
        }
        byte b4 = bArr[qe];
        for (int i4 = qe - 1; i4 >= 0; i4--) {
            b4 = operation.z(Integer.valueOf(i4), Byte.valueOf(bArr[i4]), Byte.valueOf(b4)).byteValue();
        }
        return Byte.valueOf(b4);
    }

    @l3.d
    public static short[] xr(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        xe = xe(sArr);
        P it = new kotlin.ranges.l(0, xe).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            sArr2[xe - c4] = sArr[c4];
        }
        return sArr2;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> xs(long[] jArr, R r4, X2.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Long.valueOf(jArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Integer xt(@l3.d int[] iArr, @l3.d X2.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Integer num = null;
        boolean z3 = false;
        for (int i4 : iArr) {
            if (predicate.C(Integer.valueOf(i4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                num = Integer.valueOf(i4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return num;
    }

    @kotlin.Y(version = "1.4")
    public static final void xu(@l3.d float[] fArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        C2100o.N3(fArr, i4, i5);
        Wq(fArr, i4, i5);
    }

    @l3.d
    public static final List<Byte> xv(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.G3(copyOf);
        return hr(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double xw(char[] cArr, X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (char c4 : cArr) {
            d4 += selector.C(Character.valueOf(c4)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Float> xx(@l3.d float[] fArr, int i4) {
        List<Float> k4;
        List<Float> H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= fArr.length) {
                return Gy(fArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Float.valueOf(fArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (float f4 : fArr) {
                arrayList.add(Float.valueOf(f4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Integer> xy(@l3.d int[] iArr) {
        int j4;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        j4 = X.j(iArr.length);
        return (HashSet) my(iArr, new HashSet(j4));
    }

    @l3.d
    public static final Set<Boolean> xz(@l3.d boolean[] zArr, @l3.d Iterable<Boolean> other) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<Boolean> ez = ez(zArr);
        kotlin.collections.A.q0(ez, other);
        return ez;
    }

    @l3.d
    public static final Iterable<Float> y5(@l3.d float[] fArr) {
        List H3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new f(fArr);
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Long>> M y6(@l3.d long[] jArr, @l3.d M destination, @l3.d X2.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (long j4 : jArr) {
            destination.put(keySelector.C(Long.valueOf(j4)), Long.valueOf(j4));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final long y7(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr[0];
    }

    public static final int y8(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (char c4 : cArr) {
            if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final List<Character> y9(@l3.d char[] cArr, @l3.d X2.l<? super Character, Boolean> predicate) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int re = re(cArr); -1 < re; re--) {
            if (!predicate.C(Character.valueOf(cArr[re])).booleanValue()) {
                return vx(cArr, re + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final <R, V> List<V> yA(@l3.d short[] sArr, @l3.d R[] other, @l3.d X2.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Short.valueOf(sArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @l3.d
    public static final List<Boolean> ya(@l3.d boolean[] zArr, @l3.d X2.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            boolean z3 = zArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Boolean.valueOf(z3)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z3));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final Character yb(char[] cArr, X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char c4 = cArr[length];
                if (predicate.C(Character.valueOf(c4)).booleanValue()) {
                    return Character.valueOf(c4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> yc(@l3.d short[] sArr, @l3.d X2.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Short.valueOf(s4)));
        }
        return arrayList;
    }

    public static final <R> R yd(@l3.d char[] cArr, R r4, @l3.d X2.p<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int re = re(cArr); re >= 0; re--) {
            r4 = operation.c0(Character.valueOf(cArr[re]), r4);
        }
        return r4;
    }

    public static final int ye(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M yf(@l3.d short[] sArr, @l3.d M destination, @l3.d X2.l<? super Short, ? extends K> keySelector, @l3.d X2.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            K C3 = keySelector.C(Short.valueOf(s4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Short.valueOf(s4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean yg(float[] fArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static long yh(@l3.d long[] jArr) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length != 0) {
            ve = ve(jArr);
            return jArr[ve];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    public static final <R> List<R> yi(@l3.d boolean[] zArr, @l3.d X2.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float yj(double[] dArr, X2.l<? super Double, Float> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length != 0) {
            float floatValue = selector.C(Double.valueOf(dArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, se(dArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Double.valueOf(dArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R yk(byte[] bArr, Comparator<? super R> comparator, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Byte.valueOf(bArr[0]));
        qe = qe(bArr);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Byte.valueOf(bArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer yl(@l3.d int[] iArr, @l3.d X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = ue(iArr);
        if (ue == 0) {
            return Integer.valueOf(i4);
        }
        R C3 = selector.C(Integer.valueOf(i4));
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            R C4 = selector.C(Integer.valueOf(i5));
            if (C3.compareTo(C4) > 0) {
                i4 = i5;
                C3 = C4;
            }
        }
        return Integer.valueOf(i4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double ym(float[] fArr, X2.l<? super Float, Double> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Float.valueOf(fArr[0])).doubleValue();
        P it = new kotlin.ranges.l(1, te(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Float.valueOf(fArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final short yn(@l3.d short[] sArr) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length != 0) {
            short s4 = sArr[0];
            xe = xe(sArr);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short s5 = sArr[it.c()];
                if (s4 > s5) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> T[] yo(T[] tArr, X2.p<? super Integer, ? super T, H0> action) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), tArr[i4]);
            i4++;
            i5++;
        }
        return tArr;
    }

    public static final int yp(@l3.d int[] iArr, @l3.d X2.p<? super Integer, ? super Integer, Integer> operation) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            ue = ue(iArr);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                i4 = operation.c0(Integer.valueOf(i4), Integer.valueOf(iArr[it.c()])).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Character yq(@l3.d char[] cArr, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int re = re(cArr);
        if (re < 0) {
            return null;
        }
        char c4 = cArr[re];
        for (int i4 = re - 1; i4 >= 0; i4--) {
            c4 = operation.z(Integer.valueOf(i4), Character.valueOf(cArr[i4]), Character.valueOf(c4)).charValue();
        }
        return Character.valueOf(c4);
    }

    @l3.d
    public static final boolean[] yr(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int ye = ye(zArr);
        P it = new kotlin.ranges.l(0, ye).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            zArr2[ye - c4] = zArr[c4];
        }
        return zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> ys(@l3.d T[] tArr, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (tArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, tArr[i4]);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Long yt(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void yu(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length > 1) {
            C2100o.O3(iArr);
            Xq(iArr);
        }
    }

    @l3.d
    public static final List<Character> yv(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.I3(copyOf);
        return ir(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double yw(double[] dArr, X2.l<? super Double, Double> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (double d5 : dArr) {
            d4 += selector.C(Double.valueOf(d5)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Integer> yx(@l3.d int[] iArr, int i4) {
        List<Integer> k4;
        List<Integer> Hy;
        List<Integer> H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= iArr.length) {
                Hy = Hy(iArr);
                return Hy;
            }
            if (i4 == 1) {
                k4 = C2108v.k(Integer.valueOf(iArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (int i6 : iArr) {
                arrayList.add(Integer.valueOf(i6));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final HashSet<Long> yy(@l3.d long[] jArr) {
        int j4;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        j4 = X.j(jArr.length);
        return (HashSet) ny(jArr, new HashSet(j4));
    }

    @l3.d
    public static final Iterable<M<Byte>> yz(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return new N(new u(bArr));
    }

    @l3.d
    public static final Iterable<Integer> z5(@l3.d int[] iArr) {
        List H3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new d(iArr);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M z6(@l3.d long[] jArr, @l3.d M destination, @l3.d X2.l<? super Long, ? extends K> keySelector, @l3.d X2.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (long j4 : jArr) {
            destination.put(keySelector.C(Long.valueOf(j4)), valueTransform.C(Long.valueOf(j4)));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> T z7(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr[0];
    }

    @kotlin.internal.f
    private static final int z8(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr.length;
    }

    @l3.d
    public static final List<Double> z9(@l3.d double[] dArr, @l3.d X2.l<? super Double, Boolean> predicate) {
        List<Double> H3;
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int se = se(dArr); -1 < se; se--) {
            if (!predicate.C(Double.valueOf(dArr[se])).booleanValue()) {
                return wx(dArr, se + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public static final List<Pair<Short, Short>> zA(@l3.d short[] sArr, @l3.d short[] other) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Short.valueOf(sArr[i4]), Short.valueOf(other[i4])));
        }
        return arrayList;
    }

    @l3.d
    public static final <C extends Collection<? super Byte>> C za(@l3.d byte[] bArr, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b4 = bArr[i4];
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Byte.valueOf(b4)).booleanValue()) {
                destination.add(Byte.valueOf(b4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final Double zb(double[] dArr, X2.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                double d4 = dArr[length];
                if (predicate.C(Double.valueOf(d4)).booleanValue()) {
                    return Double.valueOf(d4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @l3.d
    public static final <R> List<R> zc(@l3.d boolean[] zArr, @l3.d X2.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z3 : zArr) {
            kotlin.collections.A.q0(arrayList, transform.C(Boolean.valueOf(z3)));
        }
        return arrayList;
    }

    public static final <R> R zd(@l3.d double[] dArr, R r4, @l3.d X2.p<? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int se = se(dArr); se >= 0; se--) {
            r4 = operation.c0(Double.valueOf(dArr[se]), r4);
        }
        return r4;
    }

    @kotlin.internal.f
    private static final byte ze(byte[] bArr, int i4, X2.l<? super Integer, Byte> defaultValue) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            qe = qe(bArr);
            if (i4 <= qe) {
                return bArr[i4];
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).byteValue();
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Boolean>>> M zf(@l3.d boolean[] zArr, @l3.d M destination, @l3.d X2.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (boolean z3 : zArr) {
            K C3 = keySelector.C(Boolean.valueOf(z3));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Boolean.valueOf(z3));
        }
        return destination;
    }

    @kotlin.internal.f
    private static final boolean zg(int[] iArr) {
        boolean z3;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final long zh(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                long j4 = jArr[length];
                if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                    return j4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    public static final <T, R> List<R> zi(@l3.d T[] tArr, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i5 + 1;
            R c02 = transform.c0(Integer.valueOf(i5), tArr[i4]);
            if (c02 != null) {
                arrayList.add(c02);
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final float zj(float[] fArr, X2.l<? super Float, Float> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length != 0) {
            float floatValue = selector.C(Float.valueOf(fArr[0])).floatValue();
            P it = new kotlin.ranges.l(1, te(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Float.valueOf(fArr[it.c()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R zk(char[] cArr, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.C(Character.valueOf(cArr[0]));
        P it = new kotlin.ranges.l(1, re(cArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Character.valueOf(cArr[it.c()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Long zl(@l3.d long[] jArr, @l3.d X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = ve(jArr);
        if (ve == 0) {
            return Long.valueOf(j4);
        }
        R C3 = selector.C(Long.valueOf(j4));
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            R C4 = selector.C(Long.valueOf(j5));
            if (C3.compareTo(C4) > 0) {
                j4 = j5;
                C3 = C4;
            }
        }
        return Long.valueOf(j4);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final Double zm(int[] iArr, X2.l<? super Integer, Double> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.C(Integer.valueOf(iArr[0])).doubleValue();
        ue = ue(iArr);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Integer.valueOf(iArr[it.c()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Boolean zn(@l3.d boolean[] zArr, @l3.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        P it = new kotlin.ranges.l(1, ye(zArr)).iterator();
        while (it.hasNext()) {
            boolean z4 = zArr[it.c()];
            if (comparator.compare(Boolean.valueOf(z3), Boolean.valueOf(z4)) > 0) {
                z3 = z4;
            }
        }
        return Boolean.valueOf(z3);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final short[] zo(short[] sArr, X2.p<? super Integer, ? super Short, H0> action) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.c0(Integer.valueOf(i5), Short.valueOf(sArr[i4]));
            i4++;
            i5++;
        }
        return sArr;
    }

    public static final long zp(@l3.d long[] jArr, @l3.d X2.p<? super Long, ? super Long, Long> operation) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (jArr.length != 0) {
            long j4 = jArr[0];
            ve = ve(jArr);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                j4 = operation.c0(Long.valueOf(j4), Long.valueOf(jArr[it.c()])).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double zq(@l3.d double[] dArr, @l3.d X2.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int se = se(dArr);
        if (se < 0) {
            return null;
        }
        double d4 = dArr[se];
        for (int i4 = se - 1; i4 >= 0; i4--) {
            d4 = operation.z(Integer.valueOf(i4), Double.valueOf(dArr[i4]), Double.valueOf(d4)).doubleValue();
        }
        return Double.valueOf(d4);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> zr(byte[] bArr, R r4, X2.p<? super R, ? super Byte, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (bArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        for (byte b4 : bArr) {
            r4 = operation.c0(r4, Byte.valueOf(b4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> zs(short[] sArr, R r4, X2.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (sArr.length == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Short.valueOf(sArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.e
    public static final Long zt(@l3.d long[] jArr, @l3.d X2.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Long l4 = null;
        boolean z3 = false;
        for (long j4 : jArr) {
            if (predicate.C(Long.valueOf(j4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                l4 = Long.valueOf(j4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return l4;
    }

    @kotlin.Y(version = "1.4")
    public static final void zu(@l3.d int[] iArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        C2100o.P3(iArr, i4, i5);
        Yq(iArr, i4, i5);
    }

    @l3.d
    public static final List<Double> zv(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        C2100o.K3(copyOf);
        return jr(copyOf);
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final double zw(float[] fArr, X2.l<? super Float, Double> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (float f4 : fArr) {
            d4 += selector.C(Float.valueOf(f4)).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final List<Long> zx(@l3.d long[] jArr, int i4) {
        List<Long> k4;
        List<Long> H3;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= jArr.length) {
                return Iy(jArr);
            }
            if (i4 == 1) {
                k4 = C2108v.k(Long.valueOf(jArr[0]));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (long j4 : jArr) {
                arrayList.add(Long.valueOf(j4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <T> HashSet<T> zy(@l3.d T[] tArr) {
        int j4;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        j4 = X.j(tArr.length);
        return (HashSet) oy(tArr, new HashSet(j4));
    }

    @l3.d
    public static final Iterable<M<Character>> zz(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return new N(new B(cArr));
    }
}
