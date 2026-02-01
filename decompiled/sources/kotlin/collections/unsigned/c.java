package kotlin.collections.unsigned;

import W2.i;
import X2.l;
import X2.p;
import X2.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C2122h0;
import kotlin.D0;
import kotlin.E0;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.N;
import kotlin.Pair;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.A;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.C;
import kotlin.collections.C2100o;
import kotlin.collections.C2101p;
import kotlin.collections.C2108v;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.M;
import kotlin.collections.P;
import kotlin.collections.X;
import kotlin.internal.f;
import kotlin.internal.m;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.p0;
import kotlin.q0;
import kotlin.r;
import kotlin.random.Random;
import kotlin.ranges.u;
import kotlin.t0;
import kotlin.u0;
import kotlin.x0;
import kotlin.y0;
import l3.e;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10733:1\n3775#1:10734\n3783#1:10735\n3791#1:10736\n3799#1:10737\n3775#1:10738\n3783#1:10739\n3791#1:10740\n3799#1:10741\n3775#1:10742\n3783#1:10743\n3791#1:10744\n3799#1:10745\n3775#1:10795\n3783#1:10796\n3791#1:10797\n3799#1:10798\n3775#1:10799\n3783#1:10800\n3791#1:10801\n3799#1:10802\n3775#1:10803\n3783#1:10804\n3791#1:10805\n3799#1:10806\n3775#1:10863\n3783#1:10864\n3791#1:10865\n3799#1:10866\n3775#1:10867\n3783#1:10868\n3791#1:10869\n3799#1:10870\n3775#1:10871\n3783#1:10872\n3791#1:10873\n3799#1:10874\n3775#1:10875\n3783#1:10876\n3791#1:10877\n3799#1:10878\n3775#1:10879\n3783#1:10880\n3791#1:10881\n3799#1:10882\n3775#1:10883\n3783#1:10884\n3791#1:10885\n3799#1:10886\n3775#1:10887\n3783#1:10888\n3791#1:10889\n3799#1:10890\n3775#1:10891\n3783#1:10892\n3791#1:10893\n3799#1:10894\n3775#1:10895\n3783#1:10896\n3791#1:10897\n3799#1:10898\n3775#1:10899\n3783#1:10900\n3791#1:10901\n3799#1:10902\n3775#1:10903\n3783#1:10904\n3791#1:10905\n3799#1:10906\n3775#1:10907\n3783#1:10908\n3791#1:10909\n3799#1:10910\n3775#1:10911\n3783#1:10912\n3791#1:10913\n3799#1:10914\n3775#1:10915\n3783#1:10916\n3791#1:10917\n3799#1:10918\n3775#1:10919\n3783#1:10920\n3791#1:10921\n3799#1:10922\n3775#1:10923\n3783#1:10924\n3791#1:10925\n3799#1:10926\n3775#1:10927\n3783#1:10928\n3791#1:10929\n3799#1:10930\n3775#1:10931\n3783#1:10932\n3791#1:10933\n3799#1:10934\n3775#1:10935\n3783#1:10936\n3791#1:10937\n3799#1:10938\n3775#1:10939\n3783#1:10940\n3791#1:10941\n3799#1:10942\n3775#1:10943\n3783#1:10944\n3791#1:10945\n3799#1:10946\n3775#1:10947\n3783#1:10948\n3791#1:10949\n3799#1:10950\n3775#1:10951\n3783#1:10952\n3791#1:10953\n3799#1:10954\n3775#1:10955\n3783#1:10956\n3791#1:10957\n3799#1:10958\n3775#1:10959\n3783#1:10960\n3791#1:10961\n3799#1:10962\n3775#1:10963\n3783#1:10964\n3791#1:10965\n3799#1:10966\n3775#1:10967\n3783#1:10968\n3791#1:10969\n3799#1:10970\n3775#1:10971\n3783#1:10972\n3791#1:10973\n3799#1:10974\n3775#1:10975\n3783#1:10976\n3791#1:10977\n3799#1:10978\n3775#1:10979\n3783#1:10980\n3791#1:10981\n3799#1:10982\n3775#1:10983\n3783#1:10984\n3791#1:10985\n3799#1:10986\n3775#1:10987\n3783#1:10988\n3791#1:10989\n3799#1:10990\n3775#1:10991\n3783#1:10992\n3791#1:10993\n3799#1:10994\n3775#1:10995\n3783#1:10996\n3791#1:10997\n3799#1:10998\n3775#1:10999\n3783#1:11000\n3791#1:11001\n3799#1:11002\n3775#1:11003\n3783#1:11004\n3791#1:11005\n3799#1:11006\n3775#1:11007\n3783#1:11008\n3791#1:11009\n3799#1:11010\n3775#1:11011\n3783#1:11012\n3791#1:11013\n3799#1:11014\n1663#2,6:10746\n1675#2,6:10752\n1639#2,6:10758\n1651#2,6:10764\n1771#2,6:10770\n1783#2,6:10776\n1747#2,6:10782\n1759#2,6:10788\n1#3:10794\n372#4,7:10807\n372#4,7:10814\n372#4,7:10821\n372#4,7:10828\n372#4,7:10835\n372#4,7:10842\n372#4,7:10849\n372#4,7:10856\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n326#1:10734\n338#1:10735\n350#1:10736\n362#1:10737\n692#1:10738\n702#1:10739\n712#1:10740\n722#1:10741\n733#1:10742\n744#1:10743\n755#1:10744\n766#1:10745\n1718#1:10795\n1735#1:10796\n1752#1:10797\n1769#1:10798\n2546#1:10799\n2563#1:10800\n2580#1:10801\n2597#1:10802\n2913#1:10803\n2929#1:10804\n2945#1:10805\n2961#1:10806\n5573#1:10863\n5593#1:10864\n5613#1:10865\n5633#1:10866\n5654#1:10867\n5676#1:10868\n5698#1:10869\n5720#1:10870\n5833#1:10871\n5852#1:10872\n5871#1:10873\n5890#1:10874\n5912#1:10875\n5941#1:10876\n5970#1:10877\n5999#1:10878\n6024#1:10879\n6049#1:10880\n6074#1:10881\n6099#1:10882\n6129#1:10883\n6152#1:10884\n6175#1:10885\n6198#1:10886\n6221#1:10887\n6244#1:10888\n6267#1:10889\n6290#1:10890\n6311#1:10891\n6334#1:10892\n6357#1:10893\n6380#1:10894\n6403#1:10895\n6424#1:10896\n6445#1:10897\n6466#1:10898\n6487#1:10899\n6508#1:10900\n6529#1:10901\n6550#1:10902\n6569#1:10903\n6590#1:10904\n6611#1:10905\n6632#1:10906\n6655#1:10907\n6678#1:10908\n6701#1:10909\n6724#1:10910\n6745#1:10911\n6766#1:10912\n6787#1:10913\n6808#1:10914\n6825#1:10915\n6840#1:10916\n6855#1:10917\n6870#1:10918\n6889#1:10919\n6908#1:10920\n6927#1:10921\n6946#1:10922\n6961#1:10923\n6976#1:10924\n6991#1:10925\n7006#1:10926\n7025#1:10927\n7044#1:10928\n7063#1:10929\n7082#1:10930\n7104#1:10931\n7133#1:10932\n7162#1:10933\n7191#1:10934\n7216#1:10935\n7241#1:10936\n7266#1:10937\n7291#1:10938\n7321#1:10939\n7344#1:10940\n7367#1:10941\n7390#1:10942\n7413#1:10943\n7436#1:10944\n7459#1:10945\n7482#1:10946\n7503#1:10947\n7526#1:10948\n7549#1:10949\n7572#1:10950\n7595#1:10951\n7616#1:10952\n7637#1:10953\n7658#1:10954\n7679#1:10955\n7700#1:10956\n7721#1:10957\n7742#1:10958\n7761#1:10959\n7782#1:10960\n7803#1:10961\n7824#1:10962\n7847#1:10963\n7870#1:10964\n7893#1:10965\n7916#1:10966\n7937#1:10967\n7958#1:10968\n7979#1:10969\n8000#1:10970\n8017#1:10971\n8032#1:10972\n8047#1:10973\n8062#1:10974\n8081#1:10975\n8100#1:10976\n8119#1:10977\n8138#1:10978\n8153#1:10979\n8168#1:10980\n8183#1:10981\n8198#1:10982\n8416#1:10983\n8441#1:10984\n8466#1:10985\n8491#1:10986\n8516#1:10987\n8541#1:10988\n8566#1:10989\n8591#1:10990\n8615#1:10991\n8639#1:10992\n8663#1:10993\n8687#1:10994\n8712#1:10995\n8737#1:10996\n8762#1:10997\n8787#1:10998\n8809#1:10999\n8834#1:11000\n8859#1:11001\n8884#1:11002\n8909#1:11003\n8935#1:11004\n8961#1:11005\n8987#1:11006\n9012#1:11007\n9037#1:11008\n9062#1:11009\n9087#1:11010\n9113#1:11011\n9138#1:11012\n9163#1:11013\n9188#1:11014\n816#1:10746,6\n826#1:10752,6\n836#1:10758,6\n846#1:10764,6\n856#1:10770,6\n866#1:10776,6\n876#1:10782,6\n886#1:10788,6\n4791#1:10807,7\n4811#1:10814,7\n4831#1:10821,7\n4851#1:10828,7\n4872#1:10835,7\n4893#1:10842,7\n4914#1:10849,7\n4935#1:10856,7\n*E\n"})
/* loaded from: classes2.dex */
public class c extends kotlin.collections.unsigned.b {

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.a<Iterator<? extends t0>> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int[] f51997F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int[] iArr) {
            super(0);
            this.f51997F = iArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<t0> n() {
            return u0.v(this.f51997F);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<Iterator<? extends x0>> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long[] f51998F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long[] jArr) {
            super(0);
            this.f51998F = jArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<x0> n() {
            return y0.v(this.f51998F);
        }
    }

    /* renamed from: kotlin.collections.unsigned.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0459c extends Lambda implements X2.a<Iterator<? extends p0>> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ byte[] f51999F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0459c(byte[] bArr) {
            super(0);
            this.f51999F = bArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<p0> n() {
            return q0.v(this.f51999F);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.a<Iterator<? extends D0>> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ short[] f52000F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(short[] sArr) {
            super(0);
            this.f52000F = sArr;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<D0> n() {
            return E0.v(this.f52000F);
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long A0(long[] component1) {
        F.p(component1, "$this$component1");
        return y0.p(component1, 0);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int A1(int[] count, l<? super t0, Boolean> predicate) {
        F.p(count, "$this$count");
        F.p(predicate, "predicate");
        int r4 = u0.r(count);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            if (predicate.C(t0.e(u0.p(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super t0>> C A2(int[] filterNotTo, C destination, l<? super t0, Boolean> predicate) {
        F.p(filterNotTo, "$this$filterNotTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = u0.r(filterNotTo);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(filterNotTo, i4);
            if (!predicate.C(t0.e(p4)).booleanValue()) {
                destination.add(t0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R A3(long[] foldIndexed, R r4, q<? super Integer, ? super R, ? super x0, ? extends R> operation) {
        F.p(foldIndexed, "$this$foldIndexed");
        F.p(operation, "operation");
        int r5 = y0.r(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r5) {
            r4 = operation.z(Integer.valueOf(i5), r4, x0.e(y0.p(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M A4(int[] groupByTo, M destination, l<? super t0, ? extends K> keySelector, l<? super t0, ? extends V> valueTransform) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        int r4 = u0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(groupByTo, i4);
            K C3 = keySelector.C(t0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(t0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C A5(int[] mapTo, C destination, l<? super t0, ? extends R> transform) {
        F.p(mapTo, "$this$mapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = u0.r(mapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            destination.add(transform.C(t0.e(u0.p(mapTo, i4))));
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final D0 A6(@l3.d short[] maxWithOrNull, @l3.d Comparator<? super D0> comparator) {
        int xe;
        F.p(maxWithOrNull, "$this$maxWithOrNull");
        F.p(comparator, "comparator");
        if (E0.u(maxWithOrNull)) {
            return null;
        }
        short p4 = E0.p(maxWithOrNull, 0);
        xe = C2101p.xe(maxWithOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short p5 = E0.p(maxWithOrNull, it.c());
            if (comparator.compare(D0.e(p4), D0.e(p5)) < 0) {
                p4 = p5;
            }
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minOrThrow-U")
    @Y(version = "1.7")
    public static final long A7(@l3.d long[] min) {
        int ve;
        int compare;
        F.p(min, "$this$min");
        if (!y0.u(min)) {
            long p4 = y0.p(min, 0);
            ve = C2101p.ve(min);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(min, it.c());
                compare = Long.compare(p4 ^ Long.MIN_VALUE, p5 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final D0 A8(short[] randomOrNull) {
        F.p(randomOrNull, "$this$randomOrNull");
        return B8(randomOrNull, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> A9(int[] runningFold, R r4, p<? super R, ? super t0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFold, "$this$runningFold");
        F.p(operation, "operation");
        if (u0.u(runningFold)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(u0.r(runningFold) + 1);
        arrayList.add(r4);
        int r5 = u0.r(runningFold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, t0.e(u0.p(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> Aa(@l3.d byte[] slice, @l3.d kotlin.ranges.l indices) {
        byte[] f12;
        List<p0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        f12 = C2100o.f1(slice, indices.c().intValue(), indices.k().intValue() + 1);
        return kotlin.collections.unsigned.b.b(q0.j(f12));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final int Ab(int[] sumBy, l<? super t0, t0> selector) {
        F.p(sumBy, "$this$sumBy");
        F.p(selector, "selector");
        int r4 = u0.r(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 = t0.l(i4 + selector.C(t0.e(u0.p(sumBy, i5))).l0());
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final x0[] Ac(@l3.d long[] toTypedArray) {
        F.p(toTypedArray, "$this$toTypedArray");
        int r4 = y0.r(toTypedArray);
        x0[] x0VarArr = new x0[r4];
        for (int i4 = 0; i4 < r4; i4++) {
            x0VarArr[i4] = x0.e(y0.p(toTypedArray, i4));
        }
        return x0VarArr;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short B0(short[] component1) {
        F.p(component1, "$this$component1");
        return E0.p(component1, 0);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int B1(short[] count, l<? super D0, Boolean> predicate) {
        F.p(count, "$this$count");
        F.p(predicate, "predicate");
        int r4 = E0.r(count);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            if (predicate.C(D0.e(E0.p(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super p0>> C B2(byte[] filterNotTo, C destination, l<? super p0, Boolean> predicate) {
        F.p(filterNotTo, "$this$filterNotTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = q0.r(filterNotTo);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(filterNotTo, i4);
            if (!predicate.C(p0.e(p4)).booleanValue()) {
                destination.add(p0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R B3(int[] foldIndexed, R r4, q<? super Integer, ? super R, ? super t0, ? extends R> operation) {
        F.p(foldIndexed, "$this$foldIndexed");
        F.p(operation, "operation");
        int r5 = u0.r(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r5) {
            r4 = operation.z(Integer.valueOf(i5), r4, t0.e(u0.p(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M B4(long[] groupByTo, M destination, l<? super x0, ? extends K> keySelector, l<? super x0, ? extends V> valueTransform) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        int r4 = y0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(groupByTo, i4);
            K C3 = keySelector.C(x0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(x0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C B5(byte[] mapTo, C destination, l<? super p0, ? extends R> transform) {
        F.p(mapTo, "$this$mapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = q0.r(mapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            destination.add(transform.C(p0.e(q0.p(mapTo, i4))));
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final x0 B6(@l3.d long[] maxWithOrNull, @l3.d Comparator<? super x0> comparator) {
        int ve;
        F.p(maxWithOrNull, "$this$maxWithOrNull");
        F.p(comparator, "comparator");
        if (y0.u(maxWithOrNull)) {
            return null;
        }
        long p4 = y0.p(maxWithOrNull, 0);
        ve = C2101p.ve(maxWithOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long p5 = y0.p(maxWithOrNull, it.c());
            if (comparator.compare(x0.e(p4), x0.e(p5)) < 0) {
                p4 = p5;
            }
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minOrThrow-U")
    @Y(version = "1.7")
    public static final short B7(@l3.d short[] min) {
        int xe;
        F.p(min, "$this$min");
        if (!E0.u(min)) {
            short p4 = E0.p(min, 0);
            xe = C2101p.xe(min);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(min, it.c());
                if (F.t(p4 & D0.f51794H, 65535 & p5) > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final D0 B8(@l3.d short[] randomOrNull, @l3.d Random random) {
        F.p(randomOrNull, "$this$randomOrNull");
        F.p(random, "random");
        if (E0.u(randomOrNull)) {
            return null;
        }
        return D0.e(E0.p(randomOrNull, random.m(E0.r(randomOrNull))));
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> B9(short[] runningFold, R r4, p<? super R, ? super D0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFold, "$this$runningFold");
        F.p(operation, "operation");
        if (E0.u(runningFold)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(E0.r(runningFold) + 1);
        arrayList.add(r4);
        int r5 = E0.r(runningFold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, D0.e(E0.p(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> Ba(@l3.d int[] slice, @l3.d kotlin.ranges.l indices) {
        int[] j12;
        List<t0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        j12 = C2100o.j1(slice, indices.c().intValue(), indices.k().intValue() + 1);
        return kotlin.collections.unsigned.b.a(u0.j(j12));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final int Bb(short[] sumBy, l<? super D0, t0> selector) {
        F.p(sumBy, "$this$sumBy");
        F.p(selector, "selector");
        int r4 = E0.r(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 = t0.l(i4 + selector.C(D0.e(E0.p(sumBy, i5))).l0());
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final D0[] Bc(@l3.d short[] toTypedArray) {
        F.p(toTypedArray, "$this$toTypedArray");
        int r4 = E0.r(toTypedArray);
        D0[] d0Arr = new D0[r4];
        for (int i4 = 0; i4 < r4; i4++) {
            d0Arr[i4] = D0.e(E0.p(toTypedArray, i4));
        }
        return d0Arr;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int C0(int[] component2) {
        F.p(component2, "$this$component2");
        return u0.p(component2, 1);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> C1(@l3.d byte[] drop, int i4) {
        int u3;
        F.p(drop, "$this$drop");
        if (i4 >= 0) {
            u3 = u.u(q0.r(drop) - i4, 0);
            return ic(drop, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super x0>> C C2(long[] filterTo, C destination, l<? super x0, Boolean> predicate) {
        F.p(filterTo, "$this$filterTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = y0.r(filterTo);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(filterTo, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                destination.add(x0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R C3(long[] foldRight, R r4, p<? super x0, ? super R, ? extends R> operation) {
        int ve;
        F.p(foldRight, "$this$foldRight");
        F.p(operation, "operation");
        for (ve = C2101p.ve(foldRight); ve >= 0; ve--) {
            r4 = operation.c0(x0.e(y0.p(foldRight, ve)), r4);
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, M extends Map<? super K, List<x0>>> M C4(long[] groupByTo, M destination, l<? super x0, ? extends K> keySelector) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        int r4 = y0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(groupByTo, i4);
            K C3 = keySelector.C(x0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(x0.e(p4));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> p0 C5(byte[] maxByOrNull, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxByOrNull, "$this$maxByOrNull");
        F.p(selector, "selector");
        if (q0.u(maxByOrNull)) {
            return null;
        }
        byte p4 = q0.p(maxByOrNull, 0);
        qe = C2101p.qe(maxByOrNull);
        if (qe == 0) {
            return p0.e(p4);
        }
        R C3 = selector.C(p0.e(p4));
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte p5 = q0.p(maxByOrNull, it.c());
            R C4 = selector.C(p0.e(p5));
            if (C3.compareTo(C4) < 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "maxWithOrThrow-U")
    @Y(version = "1.7")
    public static final byte C6(@l3.d byte[] maxWith, @l3.d Comparator<? super p0> comparator) {
        int qe;
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        if (!q0.u(maxWith)) {
            byte p4 = q0.p(maxWith, 0);
            qe = C2101p.qe(maxWith);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(maxWith, it.c());
                if (comparator.compare(p0.e(p4), p0.e(p5)) < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final p0 C7(@l3.d byte[] minWithOrNull, @l3.d Comparator<? super p0> comparator) {
        int qe;
        F.p(minWithOrNull, "$this$minWithOrNull");
        F.p(comparator, "comparator");
        if (q0.u(minWithOrNull)) {
            return null;
        }
        byte p4 = q0.p(minWithOrNull, 0);
        qe = C2101p.qe(minWithOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte p5 = q0.p(minWithOrNull, it.c());
            if (comparator.compare(p0.e(p4), p0.e(p5)) > 0) {
                p4 = p5;
            }
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte C8(byte[] reduce, p<? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduce, "$this$reduce");
        F.p(operation, "operation");
        if (!q0.u(reduce)) {
            byte p4 = q0.p(reduce, 0);
            qe = C2101p.qe(reduce);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                p4 = operation.c0(p0.e(p4), p0.e(q0.p(reduce, it.c()))).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> C9(byte[] runningFoldIndexed, R r4, q<? super Integer, ? super R, ? super p0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFoldIndexed, "$this$runningFoldIndexed");
        F.p(operation, "operation");
        if (q0.u(runningFoldIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(q0.r(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int r5 = q0.r(runningFoldIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, p0.e(q0.p(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int[] Ca(@l3.d int[] sliceArray, @l3.d Collection<Integer> indices) {
        int[] eu;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        eu = C2101p.eu(sliceArray, indices);
        return u0.j(eu);
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final double Cb(byte[] sumByDouble, l<? super p0, Double> selector) {
        F.p(sumByDouble, "$this$sumByDouble");
        F.p(selector, "selector");
        int r4 = q0.r(sumByDouble);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(p0.e(q0.p(sumByDouble, i4))).doubleValue();
        }
        return d4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] Cc(byte[] bArr) {
        F.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        F.o(copyOf, "copyOf(...)");
        return q0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte D0(byte[] component2) {
        F.p(component2, "$this$component2");
        return q0.p(component2, 1);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> D1(@l3.d short[] drop, int i4) {
        int u3;
        F.p(drop, "$this$drop");
        if (i4 >= 0) {
            u3 = u.u(E0.r(drop) - i4, 0);
            return jc(drop, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super D0>> C D2(short[] filterTo, C destination, l<? super D0, Boolean> predicate) {
        F.p(filterTo, "$this$filterTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = E0.r(filterTo);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(filterTo, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                destination.add(D0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R D3(byte[] foldRight, R r4, p<? super p0, ? super R, ? extends R> operation) {
        int qe;
        F.p(foldRight, "$this$foldRight");
        F.p(operation, "operation");
        for (qe = C2101p.qe(foldRight); qe >= 0; qe--) {
            r4 = operation.c0(p0.e(q0.p(foldRight, qe)), r4);
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, M extends Map<? super K, List<D0>>> M D4(short[] groupByTo, M destination, l<? super D0, ? extends K> keySelector) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        int r4 = E0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(groupByTo, i4);
            K C3 = keySelector.C(D0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(D0.e(p4));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> x0 D5(long[] maxByOrNull, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxByOrNull, "$this$maxByOrNull");
        F.p(selector, "selector");
        if (y0.u(maxByOrNull)) {
            return null;
        }
        long p4 = y0.p(maxByOrNull, 0);
        ve = C2101p.ve(maxByOrNull);
        if (ve == 0) {
            return x0.e(p4);
        }
        R C3 = selector.C(x0.e(p4));
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long p5 = y0.p(maxByOrNull, it.c());
            R C4 = selector.C(x0.e(p5));
            if (C3.compareTo(C4) < 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "maxWithOrThrow-U")
    @Y(version = "1.7")
    public static final int D6(@l3.d int[] maxWith, @l3.d Comparator<? super t0> comparator) {
        int ue;
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        if (!u0.u(maxWith)) {
            int p4 = u0.p(maxWith, 0);
            ue = C2101p.ue(maxWith);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(maxWith, it.c());
                if (comparator.compare(t0.e(p4), t0.e(p5)) < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final t0 D7(@l3.d int[] minWithOrNull, @l3.d Comparator<? super t0> comparator) {
        int ue;
        F.p(minWithOrNull, "$this$minWithOrNull");
        F.p(comparator, "comparator");
        if (u0.u(minWithOrNull)) {
            return null;
        }
        int p4 = u0.p(minWithOrNull, 0);
        ue = C2101p.ue(minWithOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int p5 = u0.p(minWithOrNull, it.c());
            if (comparator.compare(t0.e(p4), t0.e(p5)) > 0) {
                p4 = p5;
            }
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int D8(int[] reduce, p<? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduce, "$this$reduce");
        F.p(operation, "operation");
        if (!u0.u(reduce)) {
            int p4 = u0.p(reduce, 0);
            ue = C2101p.ue(reduce);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                p4 = operation.c0(t0.e(p4), t0.e(u0.p(reduce, it.c()))).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> D9(short[] runningFoldIndexed, R r4, q<? super Integer, ? super R, ? super D0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFoldIndexed, "$this$runningFoldIndexed");
        F.p(operation, "operation");
        if (E0.u(runningFoldIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(E0.r(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int r5 = E0.r(runningFoldIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, D0.e(E0.p(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short[] Da(@l3.d short[] sliceArray, @l3.d kotlin.ranges.l indices) {
        short[] lu;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        lu = C2101p.lu(sliceArray, indices);
        return E0.j(lu);
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final double Db(long[] sumByDouble, l<? super x0, Double> selector) {
        F.p(sumByDouble, "$this$sumByDouble");
        F.p(selector, "selector");
        int r4 = y0.r(sumByDouble);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(x0.e(y0.p(sumByDouble, i4))).doubleValue();
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] Dc(@l3.d p0[] p0VarArr) {
        F.p(p0VarArr, "<this>");
        int length = p0VarArr.length;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = p0VarArr[i4].j0();
        }
        return q0.j(bArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long E0(long[] component2) {
        F.p(component2, "$this$component2");
        return y0.p(component2, 1);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> E1(@l3.d int[] drop, int i4) {
        int u3;
        F.p(drop, "$this$drop");
        if (i4 >= 0) {
            u3 = u.u(u0.r(drop) - i4, 0);
            return kc(drop, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super t0>> C E2(int[] filterTo, C destination, l<? super t0, Boolean> predicate) {
        F.p(filterTo, "$this$filterTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = u0.r(filterTo);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(filterTo, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                destination.add(t0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R E3(int[] foldRight, R r4, p<? super t0, ? super R, ? extends R> operation) {
        int ue;
        F.p(foldRight, "$this$foldRight");
        F.p(operation, "operation");
        for (ue = C2101p.ue(foldRight); ue >= 0; ue--) {
            r4 = operation.c0(t0.e(u0.p(foldRight, ue)), r4);
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M E4(short[] groupByTo, M destination, l<? super D0, ? extends K> keySelector, l<? super D0, ? extends V> valueTransform) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        int r4 = E0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(groupByTo, i4);
            K C3 = keySelector.C(D0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(D0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> t0 E5(int[] maxByOrNull, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxByOrNull, "$this$maxByOrNull");
        F.p(selector, "selector");
        if (u0.u(maxByOrNull)) {
            return null;
        }
        int p4 = u0.p(maxByOrNull, 0);
        ue = C2101p.ue(maxByOrNull);
        if (ue == 0) {
            return t0.e(p4);
        }
        R C3 = selector.C(t0.e(p4));
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int p5 = u0.p(maxByOrNull, it.c());
            R C4 = selector.C(t0.e(p5));
            if (C3.compareTo(C4) < 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "maxWithOrThrow-U")
    @Y(version = "1.7")
    public static final long E6(@l3.d long[] maxWith, @l3.d Comparator<? super x0> comparator) {
        int ve;
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        if (!y0.u(maxWith)) {
            long p4 = y0.p(maxWith, 0);
            ve = C2101p.ve(maxWith);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(maxWith, it.c());
                if (comparator.compare(x0.e(p4), x0.e(p5)) < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final D0 E7(@l3.d short[] minWithOrNull, @l3.d Comparator<? super D0> comparator) {
        int xe;
        F.p(minWithOrNull, "$this$minWithOrNull");
        F.p(comparator, "comparator");
        if (E0.u(minWithOrNull)) {
            return null;
        }
        short p4 = E0.p(minWithOrNull, 0);
        xe = C2101p.xe(minWithOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short p5 = E0.p(minWithOrNull, it.c());
            if (comparator.compare(D0.e(p4), D0.e(p5)) > 0) {
                p4 = p5;
            }
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long E8(long[] reduce, p<? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduce, "$this$reduce");
        F.p(operation, "operation");
        if (!y0.u(reduce)) {
            long p4 = y0.p(reduce, 0);
            ve = C2101p.ve(reduce);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                p4 = operation.c0(x0.e(p4), x0.e(y0.p(reduce, it.c()))).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> E9(long[] runningFoldIndexed, R r4, q<? super Integer, ? super R, ? super x0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFoldIndexed, "$this$runningFoldIndexed");
        F.p(operation, "operation");
        if (y0.u(runningFoldIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(y0.r(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int r5 = y0.r(runningFoldIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, x0.e(y0.p(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long[] Ea(@l3.d long[] sliceArray, @l3.d kotlin.ranges.l indices) {
        long[] hu;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        hu = C2101p.hu(sliceArray, indices);
        return y0.j(hu);
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final double Eb(int[] sumByDouble, l<? super t0, Double> selector) {
        F.p(sumByDouble, "$this$sumByDouble");
        F.p(selector, "selector");
        int r4 = u0.r(sumByDouble);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(t0.e(u0.p(sumByDouble, i4))).doubleValue();
        }
        return d4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] Ec(int[] iArr) {
        F.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        F.o(copyOf, "copyOf(...)");
        return u0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short F0(short[] component2) {
        F.p(component2, "$this$component2");
        return E0.p(component2, 1);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> F1(@l3.d long[] drop, int i4) {
        int u3;
        F.p(drop, "$this$drop");
        if (i4 >= 0) {
            u3 = u.u(y0.r(drop) - i4, 0);
            return lc(drop, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super p0>> C F2(byte[] filterTo, C destination, l<? super p0, Boolean> predicate) {
        F.p(filterTo, "$this$filterTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = q0.r(filterTo);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(filterTo, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                destination.add(p0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R F3(short[] foldRight, R r4, p<? super D0, ? super R, ? extends R> operation) {
        int xe;
        F.p(foldRight, "$this$foldRight");
        F.p(operation, "operation");
        for (xe = C2101p.xe(foldRight); xe >= 0; xe--) {
            r4 = operation.c0(D0.e(E0.p(foldRight, xe)), r4);
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M F4(byte[] groupByTo, M destination, l<? super p0, ? extends K> keySelector, l<? super p0, ? extends V> valueTransform) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        int r4 = q0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(groupByTo, i4);
            K C3 = keySelector.C(p0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(p0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> D0 F5(short[] maxByOrNull, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxByOrNull, "$this$maxByOrNull");
        F.p(selector, "selector");
        if (E0.u(maxByOrNull)) {
            return null;
        }
        short p4 = E0.p(maxByOrNull, 0);
        xe = C2101p.xe(maxByOrNull);
        if (xe == 0) {
            return D0.e(p4);
        }
        R C3 = selector.C(D0.e(p4));
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short p5 = E0.p(maxByOrNull, it.c());
            R C4 = selector.C(D0.e(p5));
            if (C3.compareTo(C4) < 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "maxWithOrThrow-U")
    @Y(version = "1.7")
    public static final short F6(@l3.d short[] maxWith, @l3.d Comparator<? super D0> comparator) {
        int xe;
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        if (!E0.u(maxWith)) {
            short p4 = E0.p(maxWith, 0);
            xe = C2101p.xe(maxWith);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(maxWith, it.c());
                if (comparator.compare(D0.e(p4), D0.e(p5)) < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final x0 F7(@l3.d long[] minWithOrNull, @l3.d Comparator<? super x0> comparator) {
        int ve;
        F.p(minWithOrNull, "$this$minWithOrNull");
        F.p(comparator, "comparator");
        if (y0.u(minWithOrNull)) {
            return null;
        }
        long p4 = y0.p(minWithOrNull, 0);
        ve = C2101p.ve(minWithOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long p5 = y0.p(minWithOrNull, it.c());
            if (comparator.compare(x0.e(p4), x0.e(p5)) > 0) {
                p4 = p5;
            }
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short F8(short[] reduce, p<? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduce, "$this$reduce");
        F.p(operation, "operation");
        if (!E0.u(reduce)) {
            short p4 = E0.p(reduce, 0);
            xe = C2101p.xe(reduce);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                p4 = operation.c0(D0.e(p4), D0.e(E0.p(reduce, it.c()))).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> F9(int[] runningFoldIndexed, R r4, q<? super Integer, ? super R, ? super t0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFoldIndexed, "$this$runningFoldIndexed");
        F.p(operation, "operation");
        if (u0.u(runningFoldIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(u0.r(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int r5 = u0.r(runningFoldIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, t0.e(u0.p(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] Fa(@l3.d byte[] sliceArray, @l3.d kotlin.ranges.l indices) {
        byte[] Xt;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        Xt = C2101p.Xt(sliceArray, indices);
        return q0.j(Xt);
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final double Fb(short[] sumByDouble, l<? super D0, Double> selector) {
        F.p(sumByDouble, "$this$sumByDouble");
        F.p(selector, "selector");
        int r4 = E0.r(sumByDouble);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(D0.e(E0.p(sumByDouble, i4))).doubleValue();
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int[] Fc(@l3.d t0[] t0VarArr) {
        F.p(t0VarArr, "<this>");
        int length = t0VarArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = t0VarArr[i4].l0();
        }
        return u0.j(iArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int G0(int[] component3) {
        F.p(component3, "$this$component3");
        return u0.p(component3, 2);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> G1(@l3.d byte[] dropLast, int i4) {
        int u3;
        F.p(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            u3 = u.u(q0.r(dropLast) - i4, 0);
            return ec(dropLast, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final p0 G2(byte[] find, l<? super p0, Boolean> predicate) {
        F.p(find, "$this$find");
        F.p(predicate, "predicate");
        int r4 = q0.r(find);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(find, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                return p0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R G3(byte[] foldRightIndexed, R r4, q<? super Integer, ? super p0, ? super R, ? extends R> operation) {
        int qe;
        F.p(foldRightIndexed, "$this$foldRightIndexed");
        F.p(operation, "operation");
        for (qe = C2101p.qe(foldRightIndexed); qe >= 0; qe--) {
            r4 = operation.z(Integer.valueOf(qe), p0.e(q0.p(foldRightIndexed, qe)), r4);
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int G4(long[] indexOf, long j4) {
        int Hf;
        F.p(indexOf, "$this$indexOf");
        Hf = C2101p.Hf(indexOf, j4);
        return Hf;
    }

    @InterfaceC2218t
    @i(name = "maxByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> byte G5(byte[] maxBy, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (!q0.u(maxBy)) {
            byte p4 = q0.p(maxBy, 0);
            qe = C2101p.qe(maxBy);
            if (qe == 0) {
                return p4;
            }
            R C3 = selector.C(p0.e(p4));
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(maxBy, it.c());
                R C4 = selector.C(p0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> p0 G6(byte[] minByOrNull, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minByOrNull, "$this$minByOrNull");
        F.p(selector, "selector");
        if (q0.u(minByOrNull)) {
            return null;
        }
        byte p4 = q0.p(minByOrNull, 0);
        qe = C2101p.qe(minByOrNull);
        if (qe == 0) {
            return p0.e(p4);
        }
        R C3 = selector.C(p0.e(p4));
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte p5 = q0.p(minByOrNull, it.c());
            R C4 = selector.C(p0.e(p5));
            if (C3.compareTo(C4) > 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minWithOrThrow-U")
    @Y(version = "1.7")
    public static final byte G7(@l3.d byte[] minWith, @l3.d Comparator<? super p0> comparator) {
        int qe;
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        if (!q0.u(minWith)) {
            byte p4 = q0.p(minWith, 0);
            qe = C2101p.qe(minWith);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(minWith, it.c());
                if (comparator.compare(p0.e(p4), p0.e(p5)) > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int G8(int[] reduceIndexed, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceIndexed, "$this$reduceIndexed");
        F.p(operation, "operation");
        if (!u0.u(reduceIndexed)) {
            int p4 = u0.p(reduceIndexed, 0);
            ue = C2101p.ue(reduceIndexed);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                p4 = operation.z(Integer.valueOf(c4), t0.e(p4), t0.e(u0.p(reduceIndexed, c4))).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<p0> G9(byte[] runningReduce, p<? super p0, ? super p0, p0> operation) {
        List<p0> H3;
        F.p(runningReduce, "$this$runningReduce");
        F.p(operation, "operation");
        if (q0.u(runningReduce)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        byte p4 = q0.p(runningReduce, 0);
        ArrayList arrayList = new ArrayList(q0.r(runningReduce));
        arrayList.add(p0.e(p4));
        int r4 = q0.r(runningReduce);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.c0(p0.e(p4), p0.e(q0.p(runningReduce, i4))).j0();
            arrayList.add(p0.e(p4));
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long[] Ga(@l3.d long[] sliceArray, @l3.d Collection<Integer> indices) {
        long[] gu;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        gu = C2101p.gu(sliceArray, indices);
        return y0.j(gu);
    }

    @InterfaceC2218t
    @i(name = "sumOfDouble")
    @N
    @Y(version = "1.4")
    @f
    private static final double Gb(byte[] sumOf, l<? super p0, Double> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = q0.r(sumOf);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(p0.e(q0.p(sumOf, i4))).doubleValue();
        }
        return d4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] Gc(long[] jArr) {
        F.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        F.o(copyOf, "copyOf(...)");
        return y0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte H0(byte[] component3) {
        F.p(component3, "$this$component3");
        return q0.p(component3, 2);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> H1(@l3.d short[] dropLast, int i4) {
        int u3;
        F.p(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            u3 = u.u(E0.r(dropLast) - i4, 0);
            return fc(dropLast, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final x0 H2(long[] find, l<? super x0, Boolean> predicate) {
        F.p(find, "$this$find");
        F.p(predicate, "predicate");
        int r4 = y0.r(find);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(find, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                return x0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R H3(short[] foldRightIndexed, R r4, q<? super Integer, ? super D0, ? super R, ? extends R> operation) {
        int xe;
        F.p(foldRightIndexed, "$this$foldRightIndexed");
        F.p(operation, "operation");
        for (xe = C2101p.xe(foldRightIndexed); xe >= 0; xe--) {
            r4 = operation.z(Integer.valueOf(xe), D0.e(E0.p(foldRightIndexed, xe)), r4);
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int H4(short[] indexOf, short s4) {
        int Jf;
        F.p(indexOf, "$this$indexOf");
        Jf = C2101p.Jf(indexOf, s4);
        return Jf;
    }

    @InterfaceC2218t
    @i(name = "maxByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> int H5(int[] maxBy, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (!u0.u(maxBy)) {
            int p4 = u0.p(maxBy, 0);
            ue = C2101p.ue(maxBy);
            if (ue == 0) {
                return p4;
            }
            R C3 = selector.C(t0.e(p4));
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(maxBy, it.c());
                R C4 = selector.C(t0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> x0 H6(long[] minByOrNull, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minByOrNull, "$this$minByOrNull");
        F.p(selector, "selector");
        if (y0.u(minByOrNull)) {
            return null;
        }
        long p4 = y0.p(minByOrNull, 0);
        ve = C2101p.ve(minByOrNull);
        if (ve == 0) {
            return x0.e(p4);
        }
        R C3 = selector.C(x0.e(p4));
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long p5 = y0.p(minByOrNull, it.c());
            R C4 = selector.C(x0.e(p5));
            if (C3.compareTo(C4) > 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minWithOrThrow-U")
    @Y(version = "1.7")
    public static final int H7(@l3.d int[] minWith, @l3.d Comparator<? super t0> comparator) {
        int ue;
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        if (!u0.u(minWith)) {
            int p4 = u0.p(minWith, 0);
            ue = C2101p.ue(minWith);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(minWith, it.c());
                if (comparator.compare(t0.e(p4), t0.e(p5)) > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte H8(byte[] reduceIndexed, q<? super Integer, ? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceIndexed, "$this$reduceIndexed");
        F.p(operation, "operation");
        if (!q0.u(reduceIndexed)) {
            byte p4 = q0.p(reduceIndexed, 0);
            qe = C2101p.qe(reduceIndexed);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                p4 = operation.z(Integer.valueOf(c4), p0.e(p4), p0.e(q0.p(reduceIndexed, c4))).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<t0> H9(int[] runningReduce, p<? super t0, ? super t0, t0> operation) {
        List<t0> H3;
        F.p(runningReduce, "$this$runningReduce");
        F.p(operation, "operation");
        if (u0.u(runningReduce)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        int p4 = u0.p(runningReduce, 0);
        ArrayList arrayList = new ArrayList(u0.r(runningReduce));
        arrayList.add(t0.e(p4));
        int r4 = u0.r(runningReduce);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.c0(t0.e(p4), t0.e(u0.p(runningReduce, i4))).l0();
            arrayList.add(t0.e(p4));
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short[] Ha(@l3.d short[] sliceArray, @l3.d Collection<Integer> indices) {
        short[] ku;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        ku = C2101p.ku(sliceArray, indices);
        return E0.j(ku);
    }

    @InterfaceC2218t
    @i(name = "sumOfDouble")
    @N
    @Y(version = "1.4")
    @f
    private static final double Hb(int[] sumOf, l<? super t0, Double> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = u0.r(sumOf);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(t0.e(u0.p(sumOf, i4))).doubleValue();
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long[] Hc(@l3.d x0[] x0VarArr) {
        F.p(x0VarArr, "<this>");
        int length = x0VarArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = x0VarArr[i4].l0();
        }
        return y0.j(jArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long I0(long[] component3) {
        F.p(component3, "$this$component3");
        return y0.p(component3, 2);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> I1(@l3.d int[] dropLast, int i4) {
        int u3;
        F.p(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            u3 = u.u(u0.r(dropLast) - i4, 0);
            return gc(dropLast, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final t0 I2(int[] find, l<? super t0, Boolean> predicate) {
        F.p(find, "$this$find");
        F.p(predicate, "predicate");
        int r4 = u0.r(find);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(find, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                return t0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R I3(long[] foldRightIndexed, R r4, q<? super Integer, ? super x0, ? super R, ? extends R> operation) {
        int ve;
        F.p(foldRightIndexed, "$this$foldRightIndexed");
        F.p(operation, "operation");
        for (ve = C2101p.ve(foldRightIndexed); ve >= 0; ve--) {
            r4 = operation.z(Integer.valueOf(ve), x0.e(y0.p(foldRightIndexed, ve)), r4);
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int I4(byte[] indexOf, byte b4) {
        int Cf;
        F.p(indexOf, "$this$indexOf");
        Cf = C2101p.Cf(indexOf, b4);
        return Cf;
    }

    @InterfaceC2218t
    @i(name = "maxByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> long I5(long[] maxBy, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (!y0.u(maxBy)) {
            long p4 = y0.p(maxBy, 0);
            ve = C2101p.ve(maxBy);
            if (ve == 0) {
                return p4;
            }
            R C3 = selector.C(x0.e(p4));
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(maxBy, it.c());
                R C4 = selector.C(x0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> t0 I6(int[] minByOrNull, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minByOrNull, "$this$minByOrNull");
        F.p(selector, "selector");
        if (u0.u(minByOrNull)) {
            return null;
        }
        int p4 = u0.p(minByOrNull, 0);
        ue = C2101p.ue(minByOrNull);
        if (ue == 0) {
            return t0.e(p4);
        }
        R C3 = selector.C(t0.e(p4));
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int p5 = u0.p(minByOrNull, it.c());
            R C4 = selector.C(t0.e(p5));
            if (C3.compareTo(C4) > 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minWithOrThrow-U")
    @Y(version = "1.7")
    public static final long I7(@l3.d long[] minWith, @l3.d Comparator<? super x0> comparator) {
        int ve;
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        if (!y0.u(minWith)) {
            long p4 = y0.p(minWith, 0);
            ve = C2101p.ve(minWith);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(minWith, it.c());
                if (comparator.compare(x0.e(p4), x0.e(p5)) > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short I8(short[] reduceIndexed, q<? super Integer, ? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceIndexed, "$this$reduceIndexed");
        F.p(operation, "operation");
        if (!E0.u(reduceIndexed)) {
            short p4 = E0.p(reduceIndexed, 0);
            xe = C2101p.xe(reduceIndexed);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                p4 = operation.z(Integer.valueOf(c4), D0.e(p4), D0.e(E0.p(reduceIndexed, c4))).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<x0> I9(long[] runningReduce, p<? super x0, ? super x0, x0> operation) {
        List<x0> H3;
        F.p(runningReduce, "$this$runningReduce");
        F.p(operation, "operation");
        if (y0.u(runningReduce)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        long p4 = y0.p(runningReduce, 0);
        ArrayList arrayList = new ArrayList(y0.r(runningReduce));
        arrayList.add(x0.e(p4));
        int r4 = y0.r(runningReduce);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.c0(x0.e(p4), x0.e(y0.p(runningReduce, i4))).l0();
            arrayList.add(x0.e(p4));
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int[] Ia(@l3.d int[] sliceArray, @l3.d kotlin.ranges.l indices) {
        int[] fu;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        fu = C2101p.fu(sliceArray, indices);
        return u0.j(fu);
    }

    @InterfaceC2218t
    @i(name = "sumOfDouble")
    @N
    @Y(version = "1.4")
    @f
    private static final double Ib(long[] sumOf, l<? super x0, Double> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = y0.r(sumOf);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(x0.e(y0.p(sumOf, i4))).doubleValue();
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short[] Ic(@l3.d D0[] d0Arr) {
        F.p(d0Arr, "<this>");
        int length = d0Arr.length;
        short[] sArr = new short[length];
        for (int i4 = 0; i4 < length; i4++) {
            sArr[i4] = d0Arr[i4].j0();
        }
        return E0.j(sArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short J0(short[] component3) {
        F.p(component3, "$this$component3");
        return E0.p(component3, 2);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> J1(@l3.d long[] dropLast, int i4) {
        int u3;
        F.p(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            u3 = u.u(y0.r(dropLast) - i4, 0);
            return hc(dropLast, u3);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final D0 J2(short[] find, l<? super D0, Boolean> predicate) {
        F.p(find, "$this$find");
        F.p(predicate, "predicate");
        int r4 = E0.r(find);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(find, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                return D0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R J3(int[] foldRightIndexed, R r4, q<? super Integer, ? super t0, ? super R, ? extends R> operation) {
        int ue;
        F.p(foldRightIndexed, "$this$foldRightIndexed");
        F.p(operation, "operation");
        for (ue = C2101p.ue(foldRightIndexed); ue >= 0; ue--) {
            r4 = operation.z(Integer.valueOf(ue), t0.e(u0.p(foldRightIndexed, ue)), r4);
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int J4(int[] indexOf, int i4) {
        int Gf;
        F.p(indexOf, "$this$indexOf");
        Gf = C2101p.Gf(indexOf, i4);
        return Gf;
    }

    @InterfaceC2218t
    @i(name = "maxByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> short J5(short[] maxBy, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (!E0.u(maxBy)) {
            short p4 = E0.p(maxBy, 0);
            xe = C2101p.xe(maxBy);
            if (xe == 0) {
                return p4;
            }
            R C3 = selector.C(D0.e(p4));
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(maxBy, it.c());
                R C4 = selector.C(D0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> D0 J6(short[] minByOrNull, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minByOrNull, "$this$minByOrNull");
        F.p(selector, "selector");
        if (E0.u(minByOrNull)) {
            return null;
        }
        short p4 = E0.p(minByOrNull, 0);
        xe = C2101p.xe(minByOrNull);
        if (xe == 0) {
            return D0.e(p4);
        }
        R C3 = selector.C(D0.e(p4));
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short p5 = E0.p(minByOrNull, it.c());
            R C4 = selector.C(D0.e(p5));
            if (C3.compareTo(C4) > 0) {
                p4 = p5;
                C3 = C4;
            }
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minWithOrThrow-U")
    @Y(version = "1.7")
    public static final short J7(@l3.d short[] minWith, @l3.d Comparator<? super D0> comparator) {
        int xe;
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        if (!E0.u(minWith)) {
            short p4 = E0.p(minWith, 0);
            xe = C2101p.xe(minWith);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(minWith, it.c());
                if (comparator.compare(D0.e(p4), D0.e(p5)) > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long J8(long[] reduceIndexed, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceIndexed, "$this$reduceIndexed");
        F.p(operation, "operation");
        if (!y0.u(reduceIndexed)) {
            long p4 = y0.p(reduceIndexed, 0);
            ve = C2101p.ve(reduceIndexed);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                p4 = operation.z(Integer.valueOf(c4), x0.e(p4), x0.e(y0.p(reduceIndexed, c4))).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<D0> J9(short[] runningReduce, p<? super D0, ? super D0, D0> operation) {
        List<D0> H3;
        F.p(runningReduce, "$this$runningReduce");
        F.p(operation, "operation");
        if (E0.u(runningReduce)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        short p4 = E0.p(runningReduce, 0);
        ArrayList arrayList = new ArrayList(E0.r(runningReduce));
        arrayList.add(D0.e(p4));
        int r4 = E0.r(runningReduce);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.c0(D0.e(p4), D0.e(E0.p(runningReduce, i4))).j0();
            arrayList.add(D0.e(p4));
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] Ja(@l3.d byte[] sliceArray, @l3.d Collection<Integer> indices) {
        byte[] Wt;
        F.p(sliceArray, "$this$sliceArray");
        F.p(indices, "indices");
        Wt = C2101p.Wt(sliceArray, indices);
        return q0.j(Wt);
    }

    @InterfaceC2218t
    @i(name = "sumOfDouble")
    @N
    @Y(version = "1.4")
    @f
    private static final double Jb(short[] sumOf, l<? super D0, Double> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = E0.r(sumOf);
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < r4; i4++) {
            d4 += selector.C(D0.e(E0.p(sumOf, i4))).doubleValue();
        }
        return d4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] Jc(short[] sArr) {
        F.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        F.o(copyOf, "copyOf(...)");
        return E0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int K0(int[] component4) {
        F.p(component4, "$this$component4");
        return u0.p(component4, 3);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> K1(byte[] dropLastWhile, l<? super p0, Boolean> predicate) {
        int qe;
        List<p0> H3;
        F.p(dropLastWhile, "$this$dropLastWhile");
        F.p(predicate, "predicate");
        for (qe = C2101p.qe(dropLastWhile); -1 < qe; qe--) {
            if (!predicate.C(p0.e(q0.p(dropLastWhile, qe))).booleanValue()) {
                return ec(dropLastWhile, qe + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final p0 K2(byte[] findLast, l<? super p0, Boolean> predicate) {
        F.p(findLast, "$this$findLast");
        F.p(predicate, "predicate");
        int r4 = q0.r(findLast) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                byte p4 = q0.p(findLast, r4);
                if (predicate.C(p0.e(p4)).booleanValue()) {
                    return p0.e(p4);
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void K3(byte[] forEach, l<? super p0, H0> action) {
        F.p(forEach, "$this$forEach");
        F.p(action, "action");
        int r4 = q0.r(forEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(p0.e(q0.p(forEach, i4)));
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int K4(byte[] indexOfFirst, l<? super p0, Boolean> predicate) {
        F.p(indexOfFirst, "$this$indexOfFirst");
        F.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(p0.e(p0.l(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double K5(byte[] maxOf, l<? super p0, Double> selector) {
        int qe;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!q0.u(maxOf)) {
            double doubleValue = selector.C(p0.e(q0.p(maxOf, 0))).doubleValue();
            qe = C2101p.qe(maxOf);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(p0.e(q0.p(maxOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @i(name = "minByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> byte K6(byte[] minBy, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (!q0.u(minBy)) {
            byte p4 = q0.p(minBy, 0);
            qe = C2101p.qe(minBy);
            if (qe == 0) {
                return p4;
            }
            R C3 = selector.C(p0.e(p4));
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(minBy, it.c());
                R C4 = selector.C(p0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean K7(int[] none) {
        F.p(none, "$this$none");
        return u0.u(none);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final t0 K8(int[] reduceIndexedOrNull, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        F.p(operation, "operation");
        if (u0.u(reduceIndexedOrNull)) {
            return null;
        }
        int p4 = u0.p(reduceIndexedOrNull, 0);
        ue = C2101p.ue(reduceIndexedOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            p4 = operation.z(Integer.valueOf(c4), t0.e(p4), t0.e(u0.p(reduceIndexedOrNull, c4))).l0();
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<t0> K9(int[] runningReduceIndexed, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        List<t0> H3;
        F.p(runningReduceIndexed, "$this$runningReduceIndexed");
        F.p(operation, "operation");
        if (u0.u(runningReduceIndexed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        int p4 = u0.p(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(u0.r(runningReduceIndexed));
        arrayList.add(t0.e(p4));
        int r4 = u0.r(runningReduceIndexed);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.z(Integer.valueOf(i4), t0.e(p4), t0.e(u0.p(runningReduceIndexed, i4))).l0();
            arrayList.add(t0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void Ka(@l3.d int[] sort) {
        F.p(sort, "$this$sort");
        if (u0.r(sort) > 1) {
            kotlin.collections.p0.l(sort, 0, u0.r(sort));
        }
    }

    @InterfaceC2218t
    @i(name = "sumOfInt")
    @N
    @Y(version = "1.4")
    @f
    private static final int Kb(byte[] sumOf, l<? super p0, Integer> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = q0.r(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 += selector.C(p0.e(q0.p(sumOf, i5))).intValue();
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final Iterable<M<t0>> Kc(@l3.d int[] withIndex) {
        F.p(withIndex, "$this$withIndex");
        return new kotlin.collections.N(new a(withIndex));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte L0(byte[] component4) {
        F.p(component4, "$this$component4");
        return q0.p(component4, 3);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> L1(long[] dropLastWhile, l<? super x0, Boolean> predicate) {
        int ve;
        List<x0> H3;
        F.p(dropLastWhile, "$this$dropLastWhile");
        F.p(predicate, "predicate");
        for (ve = C2101p.ve(dropLastWhile); -1 < ve; ve--) {
            if (!predicate.C(x0.e(y0.p(dropLastWhile, ve))).booleanValue()) {
                return hc(dropLastWhile, ve + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final x0 L2(long[] findLast, l<? super x0, Boolean> predicate) {
        F.p(findLast, "$this$findLast");
        F.p(predicate, "predicate");
        int r4 = y0.r(findLast) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                long p4 = y0.p(findLast, r4);
                if (predicate.C(x0.e(p4)).booleanValue()) {
                    return x0.e(p4);
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void L3(long[] forEach, l<? super x0, H0> action) {
        F.p(forEach, "$this$forEach");
        F.p(action, "action");
        int r4 = y0.r(forEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(x0.e(y0.p(forEach, i4)));
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int L4(long[] indexOfFirst, l<? super x0, Boolean> predicate) {
        F.p(indexOfFirst, "$this$indexOfFirst");
        F.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(x0.e(x0.l(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float L5(byte[] maxOf, l<? super p0, Float> selector) {
        int qe;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!q0.u(maxOf)) {
            float floatValue = selector.C(p0.e(q0.p(maxOf, 0))).floatValue();
            qe = C2101p.qe(maxOf);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(p0.e(q0.p(maxOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @i(name = "minByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> int L6(int[] minBy, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (!u0.u(minBy)) {
            int p4 = u0.p(minBy, 0);
            ue = C2101p.ue(minBy);
            if (ue == 0) {
                return p4;
            }
            R C3 = selector.C(t0.e(p4));
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(minBy, it.c());
                R C4 = selector.C(t0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean L7(byte[] none) {
        F.p(none, "$this$none");
        return q0.u(none);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final p0 L8(byte[] reduceIndexedOrNull, q<? super Integer, ? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        F.p(operation, "operation");
        if (q0.u(reduceIndexedOrNull)) {
            return null;
        }
        byte p4 = q0.p(reduceIndexedOrNull, 0);
        qe = C2101p.qe(reduceIndexedOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            p4 = operation.z(Integer.valueOf(c4), p0.e(p4), p0.e(q0.p(reduceIndexedOrNull, c4))).j0();
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<p0> L9(byte[] runningReduceIndexed, q<? super Integer, ? super p0, ? super p0, p0> operation) {
        List<p0> H3;
        F.p(runningReduceIndexed, "$this$runningReduceIndexed");
        F.p(operation, "operation");
        if (q0.u(runningReduceIndexed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        byte p4 = q0.p(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(q0.r(runningReduceIndexed));
        arrayList.add(p0.e(p4));
        int r4 = q0.r(runningReduceIndexed);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.z(Integer.valueOf(i4), p0.e(p4), p0.e(q0.p(runningReduceIndexed, i4))).j0();
            arrayList.add(p0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void La(@l3.d long[] sort, int i4, int i5) {
        F.p(sort, "$this$sort");
        AbstractC2088c.f51901E.d(i4, i5, y0.r(sort));
        kotlin.collections.p0.i(sort, i4, i5);
    }

    @InterfaceC2218t
    @i(name = "sumOfInt")
    @N
    @Y(version = "1.4")
    @f
    private static final int Lb(int[] sumOf, l<? super t0, Integer> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = u0.r(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 += selector.C(t0.e(u0.p(sumOf, i5))).intValue();
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final Iterable<M<p0>> Lc(@l3.d byte[] withIndex) {
        F.p(withIndex, "$this$withIndex");
        return new kotlin.collections.N(new C0459c(withIndex));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long M0(long[] component4) {
        F.p(component4, "$this$component4");
        return y0.p(component4, 3);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> M1(int[] dropLastWhile, l<? super t0, Boolean> predicate) {
        int ue;
        List<t0> H3;
        F.p(dropLastWhile, "$this$dropLastWhile");
        F.p(predicate, "predicate");
        for (ue = C2101p.ue(dropLastWhile); -1 < ue; ue--) {
            if (!predicate.C(t0.e(u0.p(dropLastWhile, ue))).booleanValue()) {
                return gc(dropLastWhile, ue + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final t0 M2(int[] findLast, l<? super t0, Boolean> predicate) {
        F.p(findLast, "$this$findLast");
        F.p(predicate, "predicate");
        int r4 = u0.r(findLast) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                int p4 = u0.p(findLast, r4);
                if (predicate.C(t0.e(p4)).booleanValue()) {
                    return t0.e(p4);
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void M3(int[] forEach, l<? super t0, H0> action) {
        F.p(forEach, "$this$forEach");
        F.p(action, "action");
        int r4 = u0.r(forEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(t0.e(u0.p(forEach, i4)));
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int M4(int[] indexOfFirst, l<? super t0, Boolean> predicate) {
        F.p(indexOfFirst, "$this$indexOfFirst");
        F.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(t0.e(t0.l(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R M5(byte[] maxOf, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!q0.u(maxOf)) {
            R C3 = selector.C(p0.e(q0.p(maxOf, 0)));
            qe = C2101p.qe(maxOf);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(p0.e(q0.p(maxOf, it.c())));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @i(name = "minByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> long M6(long[] minBy, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (!y0.u(minBy)) {
            long p4 = y0.p(minBy, 0);
            ve = C2101p.ve(minBy);
            if (ve == 0) {
                return p4;
            }
            R C3 = selector.C(x0.e(p4));
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(minBy, it.c());
                R C4 = selector.C(x0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean M7(byte[] none, l<? super p0, Boolean> predicate) {
        F.p(none, "$this$none");
        F.p(predicate, "predicate");
        int r4 = q0.r(none);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(p0.e(q0.p(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final D0 M8(short[] reduceIndexedOrNull, q<? super Integer, ? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        F.p(operation, "operation");
        if (E0.u(reduceIndexedOrNull)) {
            return null;
        }
        short p4 = E0.p(reduceIndexedOrNull, 0);
        xe = C2101p.xe(reduceIndexedOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            p4 = operation.z(Integer.valueOf(c4), D0.e(p4), D0.e(E0.p(reduceIndexedOrNull, c4))).j0();
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<D0> M9(short[] runningReduceIndexed, q<? super Integer, ? super D0, ? super D0, D0> operation) {
        List<D0> H3;
        F.p(runningReduceIndexed, "$this$runningReduceIndexed");
        F.p(operation, "operation");
        if (E0.u(runningReduceIndexed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        short p4 = E0.p(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(E0.r(runningReduceIndexed));
        arrayList.add(D0.e(p4));
        int r4 = E0.r(runningReduceIndexed);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.z(Integer.valueOf(i4), D0.e(p4), D0.e(E0.p(runningReduceIndexed, i4))).j0();
            arrayList.add(D0.e(p4));
        }
        return arrayList;
    }

    public static /* synthetic */ void Ma(long[] jArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = y0.r(jArr);
        }
        La(jArr, i4, i5);
    }

    @InterfaceC2218t
    @i(name = "sumOfInt")
    @N
    @Y(version = "1.4")
    @f
    private static final int Mb(long[] sumOf, l<? super x0, Integer> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = y0.r(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 += selector.C(x0.e(y0.p(sumOf, i5))).intValue();
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final Iterable<M<x0>> Mc(@l3.d long[] withIndex) {
        F.p(withIndex, "$this$withIndex");
        return new kotlin.collections.N(new b(withIndex));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short N0(short[] component4) {
        F.p(component4, "$this$component4");
        return E0.p(component4, 3);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> N1(short[] dropLastWhile, l<? super D0, Boolean> predicate) {
        int xe;
        List<D0> H3;
        F.p(dropLastWhile, "$this$dropLastWhile");
        F.p(predicate, "predicate");
        for (xe = C2101p.xe(dropLastWhile); -1 < xe; xe--) {
            if (!predicate.C(D0.e(E0.p(dropLastWhile, xe))).booleanValue()) {
                return fc(dropLastWhile, xe + 1);
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final D0 N2(short[] findLast, l<? super D0, Boolean> predicate) {
        F.p(findLast, "$this$findLast");
        F.p(predicate, "predicate");
        int r4 = E0.r(findLast) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                short p4 = E0.p(findLast, r4);
                if (predicate.C(D0.e(p4)).booleanValue()) {
                    return D0.e(p4);
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void N3(short[] forEach, l<? super D0, H0> action) {
        F.p(forEach, "$this$forEach");
        F.p(action, "action");
        int r4 = E0.r(forEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(D0.e(E0.p(forEach, i4)));
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int N4(short[] indexOfFirst, l<? super D0, Boolean> predicate) {
        F.p(indexOfFirst, "$this$indexOfFirst");
        F.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(D0.e(D0.l(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double N5(long[] maxOf, l<? super x0, Double> selector) {
        int ve;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!y0.u(maxOf)) {
            double doubleValue = selector.C(x0.e(y0.p(maxOf, 0))).doubleValue();
            ve = C2101p.ve(maxOf);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(x0.e(y0.p(maxOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @i(name = "minByOrThrow-U")
    @Y(version = "1.7")
    @f
    private static final <R extends Comparable<? super R>> short N6(short[] minBy, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (!E0.u(minBy)) {
            short p4 = E0.p(minBy, 0);
            xe = C2101p.xe(minBy);
            if (xe == 0) {
                return p4;
            }
            R C3 = selector.C(D0.e(p4));
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(minBy, it.c());
                R C4 = selector.C(D0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean N7(long[] none, l<? super x0, Boolean> predicate) {
        F.p(none, "$this$none");
        F.p(predicate, "predicate");
        int r4 = y0.r(none);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(x0.e(y0.p(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final x0 N8(long[] reduceIndexedOrNull, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        F.p(operation, "operation");
        if (y0.u(reduceIndexedOrNull)) {
            return null;
        }
        long p4 = y0.p(reduceIndexedOrNull, 0);
        ve = C2101p.ve(reduceIndexedOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            p4 = operation.z(Integer.valueOf(c4), x0.e(p4), x0.e(y0.p(reduceIndexedOrNull, c4))).l0();
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final List<x0> N9(long[] runningReduceIndexed, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        List<x0> H3;
        F.p(runningReduceIndexed, "$this$runningReduceIndexed");
        F.p(operation, "operation");
        if (y0.u(runningReduceIndexed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        long p4 = y0.p(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(y0.r(runningReduceIndexed));
        arrayList.add(x0.e(p4));
        int r4 = y0.r(runningReduceIndexed);
        for (int i4 = 1; i4 < r4; i4++) {
            p4 = operation.z(Integer.valueOf(i4), x0.e(p4), x0.e(y0.p(runningReduceIndexed, i4))).l0();
            arrayList.add(x0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Na(@l3.d byte[] sort, int i4, int i5) {
        F.p(sort, "$this$sort");
        AbstractC2088c.f51901E.d(i4, i5, q0.r(sort));
        kotlin.collections.p0.j(sort, i4, i5);
    }

    @InterfaceC2218t
    @i(name = "sumOfInt")
    @N
    @Y(version = "1.4")
    @f
    private static final int Nb(short[] sumOf, l<? super D0, Integer> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = E0.r(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 += selector.C(D0.e(E0.p(sumOf, i5))).intValue();
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final Iterable<M<D0>> Nc(@l3.d short[] withIndex) {
        F.p(withIndex, "$this$withIndex");
        return new kotlin.collections.N(new d(withIndex));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int O0(int[] component5) {
        F.p(component5, "$this$component5");
        return u0.p(component5, 4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> O1(byte[] dropWhile, l<? super p0, Boolean> predicate) {
        F.p(dropWhile, "$this$dropWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(dropWhile);
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(dropWhile, i4);
            if (z3) {
                arrayList.add(p0.e(p4));
            } else if (!predicate.C(p0.e(p4)).booleanValue()) {
                arrayList.add(p0.e(p4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int O2(int[] first) {
        int Nb;
        F.p(first, "$this$first");
        Nb = C2101p.Nb(first);
        return t0.l(Nb);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void O3(byte[] forEachIndexed, p<? super Integer, ? super p0, H0> action) {
        F.p(forEachIndexed, "$this$forEachIndexed");
        F.p(action, "action");
        int r4 = q0.r(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), p0.e(q0.p(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int O4(byte[] indexOfLast, l<? super p0, Boolean> predicate) {
        F.p(indexOfLast, "$this$indexOfLast");
        F.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.C(p0.e(p0.l(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float O5(long[] maxOf, l<? super x0, Float> selector) {
        int ve;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!y0.u(maxOf)) {
            float floatValue = selector.C(x0.e(y0.p(maxOf, 0))).floatValue();
            ve = C2101p.ve(maxOf);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(x0.e(y0.p(maxOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double O6(byte[] minOf, l<? super p0, Double> selector) {
        int qe;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!q0.u(minOf)) {
            double doubleValue = selector.C(p0.e(q0.p(minOf, 0))).doubleValue();
            qe = C2101p.qe(minOf);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(p0.e(q0.p(minOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean O7(long[] none) {
        F.p(none, "$this$none");
        return y0.u(none);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final p0 O8(byte[] reduceOrNull, p<? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceOrNull, "$this$reduceOrNull");
        F.p(operation, "operation");
        if (q0.u(reduceOrNull)) {
            return null;
        }
        byte p4 = q0.p(reduceOrNull, 0);
        qe = C2101p.qe(reduceOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            p4 = operation.c0(p0.e(p4), p0.e(q0.p(reduceOrNull, it.c()))).j0();
        }
        return p0.e(p4);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> O9(long[] scan, R r4, p<? super R, ? super x0, ? extends R> operation) {
        List<R> k4;
        F.p(scan, "$this$scan");
        F.p(operation, "operation");
        if (y0.u(scan)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(y0.r(scan) + 1);
        arrayList.add(r4);
        int r5 = y0.r(scan);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, x0.e(y0.p(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static /* synthetic */ void Oa(byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = q0.r(bArr);
        }
        Na(bArr, i4, i5);
    }

    @InterfaceC2218t
    @i(name = "sumOfLong")
    @N
    @Y(version = "1.4")
    @f
    private static final long Ob(byte[] sumOf, l<? super p0, Long> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = q0.r(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < r4; i4++) {
            j4 += selector.C(p0.e(q0.p(sumOf, i4))).longValue();
        }
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> Oc(int[] zip, Iterable<? extends R> other, p<? super t0, ? super R, ? extends V> transform) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int r4 = u0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(transform.c0(t0.e(u0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte P0(byte[] component5) {
        F.p(component5, "$this$component5");
        return q0.p(component5, 4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> P1(long[] dropWhile, l<? super x0, Boolean> predicate) {
        F.p(dropWhile, "$this$dropWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(dropWhile);
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(dropWhile, i4);
            if (z3) {
                arrayList.add(x0.e(p4));
            } else if (!predicate.C(x0.e(p4)).booleanValue()) {
                arrayList.add(x0.e(p4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte P2(byte[] first) {
        byte Fb;
        F.p(first, "$this$first");
        Fb = C2101p.Fb(first);
        return p0.l(Fb);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void P3(int[] forEachIndexed, p<? super Integer, ? super t0, H0> action) {
        F.p(forEachIndexed, "$this$forEachIndexed");
        F.p(action, "action");
        int r4 = u0.r(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), t0.e(u0.p(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int P4(long[] indexOfLast, l<? super x0, Boolean> predicate) {
        F.p(indexOfLast, "$this$indexOfLast");
        F.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.C(x0.e(x0.l(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R P5(long[] maxOf, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!y0.u(maxOf)) {
            R C3 = selector.C(x0.e(y0.p(maxOf, 0)));
            ve = C2101p.ve(maxOf);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(x0.e(y0.p(maxOf, it.c())));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float P6(byte[] minOf, l<? super p0, Float> selector) {
        int qe;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!q0.u(minOf)) {
            float floatValue = selector.C(p0.e(q0.p(minOf, 0))).floatValue();
            qe = C2101p.qe(minOf);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(p0.e(q0.p(minOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean P7(int[] none, l<? super t0, Boolean> predicate) {
        F.p(none, "$this$none");
        F.p(predicate, "predicate");
        int r4 = u0.r(none);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(t0.e(u0.p(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final t0 P8(int[] reduceOrNull, p<? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceOrNull, "$this$reduceOrNull");
        F.p(operation, "operation");
        if (u0.u(reduceOrNull)) {
            return null;
        }
        int p4 = u0.p(reduceOrNull, 0);
        ue = C2101p.ue(reduceOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            p4 = operation.c0(t0.e(p4), t0.e(u0.p(reduceOrNull, it.c()))).l0();
        }
        return t0.e(p4);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> P9(byte[] scan, R r4, p<? super R, ? super p0, ? extends R> operation) {
        List<R> k4;
        F.p(scan, "$this$scan");
        F.p(operation, "operation");
        if (q0.u(scan)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(q0.r(scan) + 1);
        arrayList.add(r4);
        int r5 = q0.r(scan);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, p0.e(q0.p(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Pa(@l3.d short[] sort, int i4, int i5) {
        F.p(sort, "$this$sort");
        AbstractC2088c.f51901E.d(i4, i5, E0.r(sort));
        kotlin.collections.p0.k(sort, i4, i5);
    }

    @InterfaceC2218t
    @i(name = "sumOfLong")
    @N
    @Y(version = "1.4")
    @f
    private static final long Pb(int[] sumOf, l<? super t0, Long> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = u0.r(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < r4; i4++) {
            j4 += selector.C(t0.e(u0.p(sumOf, i4))).longValue();
        }
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> Pc(long[] zip, R[] other, p<? super x0, ? super R, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(y0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(x0.e(y0.p(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long Q0(long[] component5) {
        F.p(component5, "$this$component5");
        return y0.p(component5, 4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> Q1(int[] dropWhile, l<? super t0, Boolean> predicate) {
        F.p(dropWhile, "$this$dropWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(dropWhile);
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(dropWhile, i4);
            if (z3) {
                arrayList.add(t0.e(p4));
            } else if (!predicate.C(t0.e(p4)).booleanValue()) {
                arrayList.add(t0.e(p4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte Q2(byte[] first, l<? super p0, Boolean> predicate) {
        F.p(first, "$this$first");
        F.p(predicate, "predicate");
        int r4 = q0.r(first);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(first, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                return p4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void Q3(long[] forEachIndexed, p<? super Integer, ? super x0, H0> action) {
        F.p(forEachIndexed, "$this$forEachIndexed");
        F.p(action, "action");
        int r4 = y0.r(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), x0.e(y0.p(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int Q4(int[] indexOfLast, l<? super t0, Boolean> predicate) {
        F.p(indexOfLast, "$this$indexOfLast");
        F.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.C(t0.e(t0.l(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double Q5(int[] maxOf, l<? super t0, Double> selector) {
        int ue;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!u0.u(maxOf)) {
            double doubleValue = selector.C(t0.e(u0.p(maxOf, 0))).doubleValue();
            ue = C2101p.ue(maxOf);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(t0.e(u0.p(maxOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R Q6(byte[] minOf, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!q0.u(minOf)) {
            R C3 = selector.C(p0.e(q0.p(minOf, 0)));
            qe = C2101p.qe(minOf);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(p0.e(q0.p(minOf, it.c())));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean Q7(short[] none) {
        F.p(none, "$this$none");
        return E0.u(none);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final x0 Q8(long[] reduceOrNull, p<? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceOrNull, "$this$reduceOrNull");
        F.p(operation, "operation");
        if (y0.u(reduceOrNull)) {
            return null;
        }
        long p4 = y0.p(reduceOrNull, 0);
        ve = C2101p.ve(reduceOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            p4 = operation.c0(x0.e(p4), x0.e(y0.p(reduceOrNull, it.c()))).l0();
        }
        return x0.e(p4);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> Q9(int[] scan, R r4, p<? super R, ? super t0, ? extends R> operation) {
        List<R> k4;
        F.p(scan, "$this$scan");
        F.p(operation, "operation");
        if (u0.u(scan)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(u0.r(scan) + 1);
        arrayList.add(r4);
        int r5 = u0.r(scan);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, t0.e(u0.p(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static /* synthetic */ void Qa(short[] sArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = E0.r(sArr);
        }
        Pa(sArr, i4, i5);
    }

    @InterfaceC2218t
    @i(name = "sumOfLong")
    @N
    @Y(version = "1.4")
    @f
    private static final long Qb(long[] sumOf, l<? super x0, Long> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = y0.r(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < r4; i4++) {
            j4 += selector.C(x0.e(y0.p(sumOf, i4))).longValue();
        }
        return j4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<t0, R>> Qc(@l3.d int[] zip, @l3.d R[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(u0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            int p4 = u0.p(zip, i4);
            arrayList.add(C2122h0.a(t0.e(p4), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short R0(short[] component5) {
        F.p(component5, "$this$component5");
        return E0.p(component5, 4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> R1(short[] dropWhile, l<? super D0, Boolean> predicate) {
        F.p(dropWhile, "$this$dropWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(dropWhile);
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(dropWhile, i4);
            if (z3) {
                arrayList.add(D0.e(p4));
            } else if (!predicate.C(D0.e(p4)).booleanValue()) {
                arrayList.add(D0.e(p4));
                z3 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long R2(long[] first, l<? super x0, Boolean> predicate) {
        F.p(first, "$this$first");
        F.p(predicate, "predicate");
        int r4 = y0.r(first);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(first, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                return p4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void R3(short[] forEachIndexed, p<? super Integer, ? super D0, H0> action) {
        F.p(forEachIndexed, "$this$forEachIndexed");
        F.p(action, "action");
        int r4 = E0.r(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), D0.e(E0.p(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int R4(short[] indexOfLast, l<? super D0, Boolean> predicate) {
        F.p(indexOfLast, "$this$indexOfLast");
        F.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.C(D0.e(D0.l(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float R5(int[] maxOf, l<? super t0, Float> selector) {
        int ue;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!u0.u(maxOf)) {
            float floatValue = selector.C(t0.e(u0.p(maxOf, 0))).floatValue();
            ue = C2101p.ue(maxOf);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(t0.e(u0.p(maxOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double R6(long[] minOf, l<? super x0, Double> selector) {
        int ve;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!y0.u(minOf)) {
            double doubleValue = selector.C(x0.e(y0.p(minOf, 0))).doubleValue();
            ve = C2101p.ve(minOf);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(x0.e(y0.p(minOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean R7(short[] none, l<? super D0, Boolean> predicate) {
        F.p(none, "$this$none");
        F.p(predicate, "predicate");
        int r4 = E0.r(none);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(D0.e(E0.p(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final D0 R8(short[] reduceOrNull, p<? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceOrNull, "$this$reduceOrNull");
        F.p(operation, "operation");
        if (E0.u(reduceOrNull)) {
            return null;
        }
        short p4 = E0.p(reduceOrNull, 0);
        xe = C2101p.xe(reduceOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            p4 = operation.c0(D0.e(p4), D0.e(E0.p(reduceOrNull, it.c()))).j0();
        }
        return D0.e(p4);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> R9(short[] scan, R r4, p<? super R, ? super D0, ? extends R> operation) {
        List<R> k4;
        F.p(scan, "$this$scan");
        F.p(operation, "operation");
        if (E0.u(scan)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(E0.r(scan) + 1);
        arrayList.add(r4);
        int r5 = E0.r(scan);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, D0.e(E0.p(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void Ra(@l3.d byte[] sort) {
        F.p(sort, "$this$sort");
        if (q0.r(sort) > 1) {
            kotlin.collections.p0.j(sort, 0, q0.r(sort));
        }
    }

    @InterfaceC2218t
    @i(name = "sumOfLong")
    @N
    @Y(version = "1.4")
    @f
    private static final long Rb(short[] sumOf, l<? super D0, Long> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int r4 = E0.r(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < r4; i4++) {
            j4 += selector.C(D0.e(E0.p(sumOf, i4))).longValue();
        }
        return j4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<x0, R>> Rc(@l3.d long[] zip, @l3.d Iterable<? extends R> other) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int r4 = y0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(C2122h0.a(x0.e(y0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static boolean S0(@e short[] sArr, @e short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short S1(short[] elementAtOrElse, int i4, l<? super Integer, D0> defaultValue) {
        int xe;
        F.p(elementAtOrElse, "$this$elementAtOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            xe = C2101p.xe(elementAtOrElse);
            if (i4 <= xe) {
                return E0.p(elementAtOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).j0();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long S2(long[] first) {
        long Pb;
        F.p(first, "$this$first");
        Pb = C2101p.Pb(first);
        return x0.l(Pb);
    }

    @l3.d
    public static final kotlin.ranges.l S3(@l3.d int[] indices) {
        kotlin.ranges.l le;
        F.p(indices, "$this$indices");
        le = C2101p.le(indices);
        return le;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int S4(int[] last) {
        int wh;
        F.p(last, "$this$last");
        wh = C2101p.wh(last);
        return t0.l(wh);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R S5(int[] maxOf, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!u0.u(maxOf)) {
            R C3 = selector.C(t0.e(u0.p(maxOf, 0)));
            ue = C2101p.ue(maxOf);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(t0.e(u0.p(maxOf, it.c())));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float S6(long[] minOf, l<? super x0, Float> selector) {
        int ve;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!y0.u(minOf)) {
            float floatValue = selector.C(x0.e(y0.p(minOf, 0))).floatValue();
            ve = C2101p.ve(minOf);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(x0.e(y0.p(minOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final byte[] S7(byte[] onEach, l<? super p0, H0> action) {
        F.p(onEach, "$this$onEach");
        F.p(action, "action");
        int r4 = q0.r(onEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(p0.e(q0.p(onEach, i4)));
        }
        return onEach;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte S8(byte[] reduceRight, p<? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceRight, "$this$reduceRight");
        F.p(operation, "operation");
        qe = C2101p.qe(reduceRight);
        if (qe >= 0) {
            byte p4 = q0.p(reduceRight, qe);
            for (int i4 = qe - 1; i4 >= 0; i4--) {
                p4 = operation.c0(p0.e(q0.p(reduceRight, i4)), p0.e(p4)).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> S9(byte[] scanIndexed, R r4, q<? super Integer, ? super R, ? super p0, ? extends R> operation) {
        List<R> k4;
        F.p(scanIndexed, "$this$scanIndexed");
        F.p(operation, "operation");
        if (q0.u(scanIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(q0.r(scanIndexed) + 1);
        arrayList.add(r4);
        int r5 = q0.r(scanIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, p0.e(q0.p(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void Sa(@l3.d long[] sort) {
        F.p(sort, "$this$sort");
        if (y0.r(sort) > 1) {
            kotlin.collections.p0.i(sort, 0, y0.r(sort));
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @i(name = "sumOfUByte")
    @Y(version = "1.5")
    public static final int Sb(@l3.d p0[] p0VarArr) {
        F.p(p0VarArr, "<this>");
        int i4 = 0;
        for (p0 p0Var : p0VarArr) {
            i4 = t0.l(i4 + t0.l(p0Var.j0() & 255));
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<t0, R>> Sc(@l3.d int[] zip, @l3.d Iterable<? extends R> other) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int r4 = u0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(C2122h0.a(t0.e(u0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static boolean T0(@e int[] iArr, @e int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int T1(int[] elementAtOrElse, int i4, l<? super Integer, t0> defaultValue) {
        int ue;
        F.p(elementAtOrElse, "$this$elementAtOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ue = C2101p.ue(elementAtOrElse);
            if (i4 <= ue) {
                return u0.p(elementAtOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).l0();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int T2(int[] first, l<? super t0, Boolean> predicate) {
        F.p(first, "$this$first");
        F.p(predicate, "predicate");
        int r4 = u0.r(first);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(first, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                return p4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void T3(int[] iArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte T4(byte[] last) {
        byte oh;
        F.p(last, "$this$last");
        oh = C2101p.oh(last);
        return p0.l(oh);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double T5(short[] maxOf, l<? super D0, Double> selector) {
        int xe;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!E0.u(maxOf)) {
            double doubleValue = selector.C(D0.e(E0.p(maxOf, 0))).doubleValue();
            xe = C2101p.xe(maxOf);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(D0.e(E0.p(maxOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R T6(long[] minOf, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!y0.u(minOf)) {
            R C3 = selector.C(x0.e(y0.p(minOf, 0)));
            ve = C2101p.ve(minOf);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(x0.e(y0.p(minOf, it.c())));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final long[] T7(long[] onEach, l<? super x0, H0> action) {
        F.p(onEach, "$this$onEach");
        F.p(action, "action");
        int r4 = y0.r(onEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(x0.e(y0.p(onEach, i4)));
        }
        return onEach;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int T8(int[] reduceRight, p<? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceRight, "$this$reduceRight");
        F.p(operation, "operation");
        ue = C2101p.ue(reduceRight);
        if (ue >= 0) {
            int p4 = u0.p(reduceRight, ue);
            for (int i4 = ue - 1; i4 >= 0; i4--) {
                p4 = operation.c0(t0.e(u0.p(reduceRight, i4)), t0.e(p4)).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> T9(short[] scanIndexed, R r4, q<? super Integer, ? super R, ? super D0, ? extends R> operation) {
        List<R> k4;
        F.p(scanIndexed, "$this$scanIndexed");
        F.p(operation, "operation");
        if (E0.u(scanIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(E0.r(scanIndexed) + 1);
        arrayList.add(r4);
        int r5 = E0.r(scanIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, D0.e(E0.p(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Ta(@l3.d int[] sort, int i4, int i5) {
        F.p(sort, "$this$sort");
        AbstractC2088c.f51901E.d(i4, i5, u0.r(sort));
        kotlin.collections.p0.l(sort, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfUInt")
    @N
    @Y(version = "1.5")
    @f
    private static final int Tb(byte[] sumOf, l<? super p0, t0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int l4 = t0.l(0);
        int r4 = q0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = t0.l(l4 + selector.C(p0.e(q0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <V> List<V> Tc(byte[] zip, byte[] other, p<? super p0, ? super p0, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(q0.r(zip), q0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(p0.e(q0.p(zip, i4)), p0.e(q0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static boolean U0(@e byte[] bArr, @e byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long U1(long[] elementAtOrElse, int i4, l<? super Integer, x0> defaultValue) {
        int ve;
        F.p(elementAtOrElse, "$this$elementAtOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ve = C2101p.ve(elementAtOrElse);
            if (i4 <= ve) {
                return y0.p(elementAtOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).l0();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short U2(short[] first) {
        short Tb;
        F.p(first, "$this$first");
        Tb = C2101p.Tb(first);
        return D0.l(Tb);
    }

    @l3.d
    public static final kotlin.ranges.l U3(@l3.d byte[] indices) {
        kotlin.ranges.l he;
        F.p(indices, "$this$indices");
        he = C2101p.he(indices);
        return he;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte U4(byte[] last, l<? super p0, Boolean> predicate) {
        F.p(last, "$this$last");
        F.p(predicate, "predicate");
        int r4 = q0.r(last) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                byte p4 = q0.p(last, r4);
                if (predicate.C(p0.e(p4)).booleanValue()) {
                    return p4;
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float U5(short[] maxOf, l<? super D0, Float> selector) {
        int xe;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!E0.u(maxOf)) {
            float floatValue = selector.C(D0.e(E0.p(maxOf, 0))).floatValue();
            xe = C2101p.xe(maxOf);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(D0.e(E0.p(maxOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double U6(int[] minOf, l<? super t0, Double> selector) {
        int ue;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!u0.u(minOf)) {
            double doubleValue = selector.C(t0.e(u0.p(minOf, 0))).doubleValue();
            ue = C2101p.ue(minOf);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(t0.e(u0.p(minOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final int[] U7(int[] onEach, l<? super t0, H0> action) {
        F.p(onEach, "$this$onEach");
        F.p(action, "action");
        int r4 = u0.r(onEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(t0.e(u0.p(onEach, i4)));
        }
        return onEach;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long U8(long[] reduceRight, p<? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceRight, "$this$reduceRight");
        F.p(operation, "operation");
        ve = C2101p.ve(reduceRight);
        if (ve >= 0) {
            long p4 = y0.p(reduceRight, ve);
            for (int i4 = ve - 1; i4 >= 0; i4--) {
                p4 = operation.c0(x0.e(y0.p(reduceRight, i4)), x0.e(p4)).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> U9(long[] scanIndexed, R r4, q<? super Integer, ? super R, ? super x0, ? extends R> operation) {
        List<R> k4;
        F.p(scanIndexed, "$this$scanIndexed");
        F.p(operation, "operation");
        if (y0.u(scanIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(y0.r(scanIndexed) + 1);
        arrayList.add(r4);
        int r5 = y0.r(scanIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, x0.e(y0.p(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static /* synthetic */ void Ua(int[] iArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = u0.r(iArr);
        }
        Ta(iArr, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfUInt")
    @N
    @Y(version = "1.5")
    @f
    private static final int Ub(int[] sumOf, l<? super t0, t0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int l4 = t0.l(0);
        int r4 = u0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = t0.l(l4 + selector.C(t0.e(u0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<D0, R>> Uc(@l3.d short[] zip, @l3.d Iterable<? extends R> other) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int r4 = E0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(C2122h0.a(D0.e(E0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static boolean V0(@e long[] jArr, @e long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte V1(byte[] elementAtOrElse, int i4, l<? super Integer, p0> defaultValue) {
        int qe;
        F.p(elementAtOrElse, "$this$elementAtOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            qe = C2101p.qe(elementAtOrElse);
            if (i4 <= qe) {
                return q0.p(elementAtOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).j0();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short V2(short[] first, l<? super D0, Boolean> predicate) {
        F.p(first, "$this$first");
        F.p(predicate, "predicate");
        int r4 = E0.r(first);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(first, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                return p4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void V3(byte[] bArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long V4(long[] last, l<? super x0, Boolean> predicate) {
        F.p(last, "$this$last");
        F.p(predicate, "predicate");
        int r4 = y0.r(last) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                long p4 = y0.p(last, r4);
                if (predicate.C(x0.e(p4)).booleanValue()) {
                    return p4;
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R V5(short[] maxOf, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxOf, "$this$maxOf");
        F.p(selector, "selector");
        if (!E0.u(maxOf)) {
            R C3 = selector.C(D0.e(E0.p(maxOf, 0)));
            xe = C2101p.xe(maxOf);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(D0.e(E0.p(maxOf, it.c())));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float V6(int[] minOf, l<? super t0, Float> selector) {
        int ue;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!u0.u(minOf)) {
            float floatValue = selector.C(t0.e(u0.p(minOf, 0))).floatValue();
            ue = C2101p.ue(minOf);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(t0.e(u0.p(minOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final short[] V7(short[] onEach, l<? super D0, H0> action) {
        F.p(onEach, "$this$onEach");
        F.p(action, "action");
        int r4 = E0.r(onEach);
        for (int i4 = 0; i4 < r4; i4++) {
            action.C(D0.e(E0.p(onEach, i4)));
        }
        return onEach;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short V8(short[] reduceRight, p<? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceRight, "$this$reduceRight");
        F.p(operation, "operation");
        xe = C2101p.xe(reduceRight);
        if (xe >= 0) {
            short p4 = E0.p(reduceRight, xe);
            for (int i4 = xe - 1; i4 >= 0; i4--) {
                p4 = operation.c0(D0.e(E0.p(reduceRight, i4)), D0.e(p4)).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> V9(int[] scanIndexed, R r4, q<? super Integer, ? super R, ? super t0, ? extends R> operation) {
        List<R> k4;
        F.p(scanIndexed, "$this$scanIndexed");
        F.p(operation, "operation");
        if (u0.u(scanIndexed)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(u0.r(scanIndexed) + 1);
        arrayList.add(r4);
        int r5 = u0.r(scanIndexed);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, t0.e(u0.p(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void Va(@l3.d short[] sort) {
        F.p(sort, "$this$sort");
        if (E0.r(sort) > 1) {
            kotlin.collections.p0.k(sort, 0, E0.r(sort));
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfUInt")
    @N
    @Y(version = "1.5")
    @f
    private static final int Vb(long[] sumOf, l<? super x0, t0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int l4 = t0.l(0);
        int r4 = y0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = t0.l(l4 + selector.C(x0.e(y0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<p0, R>> Vc(@l3.d byte[] zip, @l3.d Iterable<? extends R> other) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int r4 = q0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(C2122h0.a(p0.e(q0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean W(byte[] all, l<? super p0, Boolean> predicate) {
        F.p(all, "$this$all");
        F.p(predicate, "predicate");
        int r4 = q0.r(all);
        for (int i4 = 0; i4 < r4; i4++) {
            if (!predicate.C(p0.e(q0.p(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final int W0(@e byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final p0 W1(byte[] elementAtOrNull, int i4) {
        F.p(elementAtOrNull, "$this$elementAtOrNull");
        return m4(elementAtOrNull, i4);
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final t0 W2(@l3.d int[] firstOrNull) {
        F.p(firstOrNull, "$this$firstOrNull");
        if (u0.u(firstOrNull)) {
            return null;
        }
        return t0.e(u0.p(firstOrNull, 0));
    }

    @l3.d
    public static final kotlin.ranges.l W3(@l3.d long[] indices) {
        kotlin.ranges.l me;
        F.p(indices, "$this$indices");
        me = C2101p.me(indices);
        return me;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long W4(long[] last) {
        long yh;
        F.p(last, "$this$last");
        yh = C2101p.yh(last);
        return x0.l(yh);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R W5(byte[] maxOfOrNull, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (q0.u(maxOfOrNull)) {
            return null;
        }
        R C3 = selector.C(p0.e(q0.p(maxOfOrNull, 0)));
        qe = C2101p.qe(maxOfOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(p0.e(q0.p(maxOfOrNull, it.c())));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R W6(int[] minOf, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!u0.u(minOf)) {
            R C3 = selector.C(t0.e(u0.p(minOf, 0)));
            ue = C2101p.ue(minOf);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(t0.e(u0.p(minOf, it.c())));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final byte[] W7(byte[] onEachIndexed, p<? super Integer, ? super p0, H0> action) {
        F.p(onEachIndexed, "$this$onEachIndexed");
        F.p(action, "action");
        int r4 = q0.r(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), p0.e(q0.p(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int W8(int[] reduceRightIndexed, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceRightIndexed, "$this$reduceRightIndexed");
        F.p(operation, "operation");
        ue = C2101p.ue(reduceRightIndexed);
        if (ue >= 0) {
            int p4 = u0.p(reduceRightIndexed, ue);
            for (int i4 = ue - 1; i4 >= 0; i4--) {
                p4 = operation.z(Integer.valueOf(i4), t0.e(u0.p(reduceRightIndexed, i4)), t0.e(p4)).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void W9(@l3.d int[] shuffle) {
        F.p(shuffle, "$this$shuffle");
        X9(shuffle, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void Wa(@l3.d int[] sortDescending) {
        F.p(sortDescending, "$this$sortDescending");
        if (u0.r(sortDescending) > 1) {
            Ka(sortDescending);
            C2101p.Xq(sortDescending);
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @i(name = "sumOfUInt")
    @Y(version = "1.5")
    public static final int Wb(@l3.d t0[] t0VarArr) {
        F.p(t0VarArr, "<this>");
        int i4 = 0;
        for (t0 t0Var : t0VarArr) {
            i4 = t0.l(i4 + t0Var.l0());
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <V> List<V> Wc(int[] zip, int[] other, p<? super t0, ? super t0, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(u0.r(zip), u0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(t0.e(u0.p(zip, i4)), t0.e(u0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean X(long[] all, l<? super x0, Boolean> predicate) {
        F.p(all, "$this$all");
        F.p(predicate, "predicate");
        int r4 = y0.r(all);
        for (int i4 = 0; i4 < r4; i4++) {
            if (!predicate.C(x0.e(y0.p(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final int X0(@e int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final D0 X1(short[] elementAtOrNull, int i4) {
        F.p(elementAtOrNull, "$this$elementAtOrNull");
        return n4(elementAtOrNull, i4);
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final p0 X2(@l3.d byte[] firstOrNull) {
        F.p(firstOrNull, "$this$firstOrNull");
        if (q0.u(firstOrNull)) {
            return null;
        }
        return p0.e(q0.p(firstOrNull, 0));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void X3(long[] jArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int X4(int[] last, l<? super t0, Boolean> predicate) {
        F.p(last, "$this$last");
        F.p(predicate, "predicate");
        int r4 = u0.r(last) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                int p4 = u0.p(last, r4);
                if (predicate.C(t0.e(p4)).booleanValue()) {
                    return p4;
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double X5(byte[] maxOfOrNull, l<? super p0, Double> selector) {
        int qe;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (q0.u(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(p0.e(q0.p(maxOfOrNull, 0))).doubleValue();
        qe = C2101p.qe(maxOfOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(p0.e(q0.p(maxOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final double X6(short[] minOf, l<? super D0, Double> selector) {
        int xe;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!E0.u(minOf)) {
            double doubleValue = selector.C(D0.e(E0.p(minOf, 0))).doubleValue();
            xe = C2101p.xe(minOf);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(D0.e(E0.p(minOf, it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final int[] X7(int[] onEachIndexed, p<? super Integer, ? super t0, H0> action) {
        F.p(onEachIndexed, "$this$onEachIndexed");
        F.p(action, "action");
        int r4 = u0.r(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), t0.e(u0.p(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte X8(byte[] reduceRightIndexed, q<? super Integer, ? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceRightIndexed, "$this$reduceRightIndexed");
        F.p(operation, "operation");
        qe = C2101p.qe(reduceRightIndexed);
        if (qe >= 0) {
            byte p4 = q0.p(reduceRightIndexed, qe);
            for (int i4 = qe - 1; i4 >= 0; i4--) {
                p4 = operation.z(Integer.valueOf(i4), p0.e(q0.p(reduceRightIndexed, i4)), p0.e(p4)).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void X9(@l3.d int[] shuffle, @l3.d Random random) {
        int ue;
        F.p(shuffle, "$this$shuffle");
        F.p(random, "random");
        for (ue = C2101p.ue(shuffle); ue > 0; ue--) {
            int m4 = random.m(ue + 1);
            int p4 = u0.p(shuffle, ue);
            u0.w(shuffle, ue, u0.p(shuffle, m4));
            u0.w(shuffle, m4, p4);
        }
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Xa(@l3.d long[] sortDescending, int i4, int i5) {
        F.p(sortDescending, "$this$sortDescending");
        La(sortDescending, i4, i5);
        C2101p.ar(sortDescending, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfUInt")
    @N
    @Y(version = "1.5")
    @f
    private static final int Xb(short[] sumOf, l<? super D0, t0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        int l4 = t0.l(0);
        int r4 = E0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = t0.l(l4 + selector.C(D0.e(E0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> Xc(byte[] zip, R[] other, p<? super p0, ? super R, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(q0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(p0.e(q0.p(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean Y(int[] all, l<? super t0, Boolean> predicate) {
        F.p(all, "$this$all");
        F.p(predicate, "predicate");
        int r4 = u0.r(all);
        for (int i4 = 0; i4 < r4; i4++) {
            if (!predicate.C(t0.e(u0.p(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final int Y0(@e short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final t0 Y1(int[] elementAtOrNull, int i4) {
        F.p(elementAtOrNull, "$this$elementAtOrNull");
        return o4(elementAtOrNull, i4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final p0 Y2(byte[] firstOrNull, l<? super p0, Boolean> predicate) {
        F.p(firstOrNull, "$this$firstOrNull");
        F.p(predicate, "predicate");
        int r4 = q0.r(firstOrNull);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(firstOrNull, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                return p0.e(p4);
            }
        }
        return null;
    }

    @l3.d
    public static final kotlin.ranges.l Y3(@l3.d short[] indices) {
        kotlin.ranges.l oe;
        F.p(indices, "$this$indices");
        oe = C2101p.oe(indices);
        return oe;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short Y4(short[] last) {
        short Ch;
        F.p(last, "$this$last");
        Ch = C2101p.Ch(last);
        return D0.l(Ch);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float Y5(byte[] maxOfOrNull, l<? super p0, Float> selector) {
        int qe;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (q0.u(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(p0.e(q0.p(maxOfOrNull, 0))).floatValue();
        qe = C2101p.qe(maxOfOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(p0.e(q0.p(maxOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final float Y6(short[] minOf, l<? super D0, Float> selector) {
        int xe;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!E0.u(minOf)) {
            float floatValue = selector.C(D0.e(E0.p(minOf, 0))).floatValue();
            xe = C2101p.xe(minOf);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(D0.e(E0.p(minOf, it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final long[] Y7(long[] onEachIndexed, p<? super Integer, ? super x0, H0> action) {
        F.p(onEachIndexed, "$this$onEachIndexed");
        F.p(action, "action");
        int r4 = y0.r(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), x0.e(y0.p(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short Y8(short[] reduceRightIndexed, q<? super Integer, ? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceRightIndexed, "$this$reduceRightIndexed");
        F.p(operation, "operation");
        xe = C2101p.xe(reduceRightIndexed);
        if (xe >= 0) {
            short p4 = E0.p(reduceRightIndexed, xe);
            for (int i4 = xe - 1; i4 >= 0; i4--) {
                p4 = operation.z(Integer.valueOf(i4), D0.e(E0.p(reduceRightIndexed, i4)), D0.e(p4)).j0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Y9(@l3.d byte[] shuffle) {
        F.p(shuffle, "$this$shuffle");
        ba(shuffle, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Ya(@l3.d byte[] sortDescending, int i4, int i5) {
        F.p(sortDescending, "$this$sortDescending");
        Na(sortDescending, i4, i5);
        C2101p.Qq(sortDescending, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfULong")
    @N
    @Y(version = "1.5")
    @f
    private static final long Yb(byte[] sumOf, l<? super p0, x0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        long l4 = x0.l(0L);
        int r4 = q0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = x0.l(l4 + selector.C(p0.e(q0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <V> List<V> Yc(long[] zip, long[] other, p<? super x0, ? super x0, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(y0.r(zip), y0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(x0.e(y0.p(zip, i4)), x0.e(y0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean Z(short[] all, l<? super D0, Boolean> predicate) {
        F.p(all, "$this$all");
        F.p(predicate, "predicate");
        int r4 = E0.r(all);
        for (int i4 = 0; i4 < r4; i4++) {
            if (!predicate.C(D0.e(E0.p(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final int Z0(@e long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final x0 Z1(long[] elementAtOrNull, int i4) {
        F.p(elementAtOrNull, "$this$elementAtOrNull");
        return p4(elementAtOrNull, i4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final x0 Z2(long[] firstOrNull, l<? super x0, Boolean> predicate) {
        F.p(firstOrNull, "$this$firstOrNull");
        F.p(predicate, "predicate");
        int r4 = y0.r(firstOrNull);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(firstOrNull, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                return x0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void Z3(short[] sArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short Z4(short[] last, l<? super D0, Boolean> predicate) {
        F.p(last, "$this$last");
        F.p(predicate, "predicate");
        int r4 = E0.r(last) - 1;
        if (r4 >= 0) {
            while (true) {
                int i4 = r4 - 1;
                short p4 = E0.p(last, r4);
                if (predicate.C(D0.e(p4)).booleanValue()) {
                    return p4;
                }
                if (i4 < 0) {
                    break;
                }
                r4 = i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R Z5(long[] maxOfOrNull, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (y0.u(maxOfOrNull)) {
            return null;
        }
        R C3 = selector.C(x0.e(y0.p(maxOfOrNull, 0)));
        ve = C2101p.ve(maxOfOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(x0.e(y0.p(maxOfOrNull, it.c())));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R Z6(short[] minOf, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minOf, "$this$minOf");
        F.p(selector, "selector");
        if (!E0.u(minOf)) {
            R C3 = selector.C(D0.e(E0.p(minOf, 0)));
            xe = C2101p.xe(minOf);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(D0.e(E0.p(minOf, it.c())));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final short[] Z7(short[] onEachIndexed, p<? super Integer, ? super D0, H0> action) {
        F.p(onEachIndexed, "$this$onEachIndexed");
        F.p(action, "action");
        int r4 = E0.r(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            action.c0(Integer.valueOf(i5), D0.e(E0.p(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long Z8(long[] reduceRightIndexed, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceRightIndexed, "$this$reduceRightIndexed");
        F.p(operation, "operation");
        ve = C2101p.ve(reduceRightIndexed);
        if (ve >= 0) {
            long p4 = y0.p(reduceRightIndexed, ve);
            for (int i4 = ve - 1; i4 >= 0; i4--) {
                p4 = operation.z(Integer.valueOf(i4), x0.e(y0.p(reduceRightIndexed, i4)), x0.e(p4)).l0();
            }
            return p4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Z9(@l3.d long[] shuffle, @l3.d Random random) {
        int ve;
        F.p(shuffle, "$this$shuffle");
        F.p(random, "random");
        for (ve = C2101p.ve(shuffle); ve > 0; ve--) {
            int m4 = random.m(ve + 1);
            long p4 = y0.p(shuffle, ve);
            y0.w(shuffle, ve, y0.p(shuffle, m4));
            y0.w(shuffle, m4, p4);
        }
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void Za(@l3.d short[] sortDescending, int i4, int i5) {
        F.p(sortDescending, "$this$sortDescending");
        Pa(sortDescending, i4, i5);
        C2101p.er(sortDescending, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfULong")
    @N
    @Y(version = "1.5")
    @f
    private static final long Zb(int[] sumOf, l<? super t0, x0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        long l4 = x0.l(0L);
        int r4 = u0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = x0.l(l4 + selector.C(t0.e(u0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> Zc(long[] zip, Iterable<? extends R> other, p<? super x0, ? super R, ? extends V> transform) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int r4 = y0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(transform.c0(x0.e(y0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean a0(int[] any) {
        boolean l5;
        F.p(any, "$this$any");
        l5 = C2101p.l5(any);
        return l5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.D.m3(kotlin.q0.c(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @l3.d
    @kotlin.InterfaceC2218t
    @kotlin.Y(version = "1.4")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a1(@l3.e byte[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.q0 r0 = kotlin.q0.c(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.C2107u.m3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.c.a1(byte[]):java.lang.String");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void a2(@l3.d int[] fill, int i4, int i5, int i6) {
        F.p(fill, "$this$fill");
        C2100o.K1(fill, i4, i5, i6);
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final x0 a3(@l3.d long[] firstOrNull) {
        F.p(firstOrNull, "$this$firstOrNull");
        if (y0.u(firstOrNull)) {
            return null;
        }
        return x0.e(y0.p(firstOrNull, 0));
    }

    public static final int a4(@l3.d int[] lastIndex) {
        int ue;
        F.p(lastIndex, "$this$lastIndex");
        ue = C2101p.ue(lastIndex);
        return ue;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int a5(long[] lastIndexOf, long j4) {
        int Lh;
        F.p(lastIndexOf, "$this$lastIndexOf");
        Lh = C2101p.Lh(lastIndexOf, j4);
        return Lh;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double a6(long[] maxOfOrNull, l<? super x0, Double> selector) {
        int ve;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (y0.u(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(x0.e(y0.p(maxOfOrNull, 0))).doubleValue();
        ve = C2101p.ve(maxOfOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(x0.e(y0.p(maxOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R a7(byte[] minOfOrNull, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (q0.u(minOfOrNull)) {
            return null;
        }
        R C3 = selector.C(p0.e(q0.p(minOfOrNull, 0)));
        qe = C2101p.qe(minOfOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(p0.e(q0.p(minOfOrNull, it.c())));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] a8(long[] plus, long j4) {
        long[] t3;
        F.p(plus, "$this$plus");
        t3 = C2100o.t3(plus, j4);
        return y0.j(t3);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final t0 a9(int[] reduceRightIndexedOrNull, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        F.p(operation, "operation");
        ue = C2101p.ue(reduceRightIndexedOrNull);
        if (ue < 0) {
            return null;
        }
        int p4 = u0.p(reduceRightIndexedOrNull, ue);
        for (int i4 = ue - 1; i4 >= 0; i4--) {
            p4 = operation.z(Integer.valueOf(i4), t0.e(u0.p(reduceRightIndexedOrNull, i4)), t0.e(p4)).l0();
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void aa(@l3.d long[] shuffle) {
        F.p(shuffle, "$this$shuffle");
        Z9(shuffle, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void ab(@l3.d byte[] sortDescending) {
        F.p(sortDescending, "$this$sortDescending");
        if (q0.r(sortDescending) > 1) {
            Ra(sortDescending);
            C2101p.Pq(sortDescending);
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfULong")
    @N
    @Y(version = "1.5")
    @f
    private static final long ac(long[] sumOf, l<? super x0, x0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        long l4 = x0.l(0L);
        int r4 = y0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = x0.l(l4 + selector.C(x0.e(y0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> ad(byte[] zip, Iterable<? extends R> other, p<? super p0, ? super R, ? extends V> transform) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int r4 = q0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(transform.c0(p0.e(q0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean b0(byte[] any) {
        boolean d5;
        F.p(any, "$this$any");
        d5 = C2101p.d5(any);
        return d5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.D.m3(kotlin.u0.c(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @l3.d
    @kotlin.InterfaceC2218t
    @kotlin.Y(version = "1.4")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b1(@l3.e int[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.u0 r0 = kotlin.u0.c(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.C2107u.m3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.c.b1(int[]):java.lang.String");
    }

    public static /* synthetic */ void b2(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = u0.r(iArr);
        }
        a2(iArr, i4, i5, i6);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final t0 b3(int[] firstOrNull, l<? super t0, Boolean> predicate) {
        F.p(firstOrNull, "$this$firstOrNull");
        F.p(predicate, "predicate");
        int r4 = u0.r(firstOrNull);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(firstOrNull, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                return t0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void b4(int[] iArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int b5(short[] lastIndexOf, short s4) {
        int Nh;
        F.p(lastIndexOf, "$this$lastIndexOf");
        Nh = C2101p.Nh(lastIndexOf, s4);
        return Nh;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float b6(long[] maxOfOrNull, l<? super x0, Float> selector) {
        int ve;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (y0.u(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(x0.e(y0.p(maxOfOrNull, 0))).floatValue();
        ve = C2101p.ve(maxOfOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(x0.e(y0.p(maxOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double b7(byte[] minOfOrNull, l<? super p0, Double> selector) {
        int qe;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (q0.u(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(p0.e(q0.p(minOfOrNull, 0))).doubleValue();
        qe = C2101p.qe(minOfOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(p0.e(q0.p(minOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int[] b8(@l3.d int[] plus, @l3.d Collection<t0> elements) {
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        int r4 = u0.r(plus);
        int[] copyOf = Arrays.copyOf(plus, u0.r(plus) + elements.size());
        F.o(copyOf, "copyOf(...)");
        Iterator<t0> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[r4] = it.next().l0();
            r4++;
        }
        return u0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final p0 b9(byte[] reduceRightIndexedOrNull, q<? super Integer, ? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        F.p(operation, "operation");
        qe = C2101p.qe(reduceRightIndexedOrNull);
        if (qe < 0) {
            return null;
        }
        byte p4 = q0.p(reduceRightIndexedOrNull, qe);
        for (int i4 = qe - 1; i4 >= 0; i4--) {
            p4 = operation.z(Integer.valueOf(i4), p0.e(q0.p(reduceRightIndexedOrNull, i4)), p0.e(p4)).j0();
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void ba(@l3.d byte[] shuffle, @l3.d Random random) {
        int qe;
        F.p(shuffle, "$this$shuffle");
        F.p(random, "random");
        for (qe = C2101p.qe(shuffle); qe > 0; qe--) {
            int m4 = random.m(qe + 1);
            byte p4 = q0.p(shuffle, qe);
            q0.w(shuffle, qe, q0.p(shuffle, m4));
            q0.w(shuffle, m4, p4);
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void bb(@l3.d long[] sortDescending) {
        F.p(sortDescending, "$this$sortDescending");
        if (y0.r(sortDescending) > 1) {
            Sa(sortDescending);
            C2101p.Zq(sortDescending);
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @i(name = "sumOfULong")
    @Y(version = "1.5")
    public static final long bc(@l3.d x0[] x0VarArr) {
        F.p(x0VarArr, "<this>");
        long j4 = 0;
        for (x0 x0Var : x0VarArr) {
            j4 = x0.l(j4 + x0Var.l0());
        }
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> bd(int[] zip, R[] other, p<? super t0, ? super R, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(u0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(t0.e(u0.p(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean c0(byte[] any, l<? super p0, Boolean> predicate) {
        F.p(any, "$this$any");
        F.p(predicate, "predicate");
        int r4 = q0.r(any);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(p0.e(q0.p(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.D.m3(kotlin.E0.c(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @l3.d
    @kotlin.InterfaceC2218t
    @kotlin.Y(version = "1.4")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c1(@l3.e short[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.E0 r0 = kotlin.E0.c(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.C2107u.m3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.c.c1(short[]):java.lang.String");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void c2(@l3.d short[] fill, short s4, int i4, int i5) {
        F.p(fill, "$this$fill");
        C2100o.N1(fill, s4, i4, i5);
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final D0 c3(@l3.d short[] firstOrNull) {
        F.p(firstOrNull, "$this$firstOrNull");
        if (E0.u(firstOrNull)) {
            return null;
        }
        return D0.e(E0.p(firstOrNull, 0));
    }

    public static final int c4(@l3.d byte[] lastIndex) {
        int qe;
        F.p(lastIndex, "$this$lastIndex");
        qe = C2101p.qe(lastIndex);
        return qe;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int c5(byte[] lastIndexOf, byte b4) {
        int Gh;
        F.p(lastIndexOf, "$this$lastIndexOf");
        Gh = C2101p.Gh(lastIndexOf, b4);
        return Gh;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R c6(int[] maxOfOrNull, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (u0.u(maxOfOrNull)) {
            return null;
        }
        R C3 = selector.C(t0.e(u0.p(maxOfOrNull, 0)));
        ue = C2101p.ue(maxOfOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(t0.e(u0.p(maxOfOrNull, it.c())));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float c7(byte[] minOfOrNull, l<? super p0, Float> selector) {
        int qe;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (q0.u(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(p0.e(q0.p(minOfOrNull, 0))).floatValue();
        qe = C2101p.qe(minOfOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(p0.e(q0.p(minOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] c8(short[] plus, short s4) {
        short[] A3;
        F.p(plus, "$this$plus");
        A3 = C2100o.A3(plus, s4);
        return E0.j(A3);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final D0 c9(short[] reduceRightIndexedOrNull, q<? super Integer, ? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        F.p(operation, "operation");
        xe = C2101p.xe(reduceRightIndexedOrNull);
        if (xe < 0) {
            return null;
        }
        short p4 = E0.p(reduceRightIndexedOrNull, xe);
        for (int i4 = xe - 1; i4 >= 0; i4--) {
            p4 = operation.z(Integer.valueOf(i4), D0.e(E0.p(reduceRightIndexedOrNull, i4)), D0.e(p4)).j0();
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void ca(@l3.d short[] shuffle) {
        F.p(shuffle, "$this$shuffle");
        da(shuffle, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void cb(@l3.d int[] sortDescending, int i4, int i5) {
        F.p(sortDescending, "$this$sortDescending");
        Ta(sortDescending, i4, i5);
        C2101p.Yq(sortDescending, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @InterfaceC2218t
    @i(name = "sumOfULong")
    @N
    @Y(version = "1.5")
    @f
    private static final long cc(short[] sumOf, l<? super D0, x0> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        long l4 = x0.l(0L);
        int r4 = E0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = x0.l(l4 + selector.C(D0.e(E0.p(sumOf, i4))).l0());
        }
        return l4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<Pair<t0, t0>> cd(@l3.d int[] zip, @l3.d int[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(u0.r(zip), u0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(t0.e(u0.p(zip, i4)), t0.e(u0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean d0(long[] any, l<? super x0, Boolean> predicate) {
        F.p(any, "$this$any");
        F.p(predicate, "predicate");
        int r4 = y0.r(any);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(x0.e(y0.p(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.D.m3(kotlin.y0.c(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @l3.d
    @kotlin.InterfaceC2218t
    @kotlin.Y(version = "1.4")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d1(@l3.e long[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.y0 r0 = kotlin.y0.c(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.C2107u.m3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.c.d1(long[]):java.lang.String");
    }

    public static /* synthetic */ void d2(short[] sArr, short s4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = E0.r(sArr);
        }
        c2(sArr, s4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final D0 d3(short[] firstOrNull, l<? super D0, Boolean> predicate) {
        F.p(firstOrNull, "$this$firstOrNull");
        F.p(predicate, "predicate");
        int r4 = E0.r(firstOrNull);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(firstOrNull, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                return D0.e(p4);
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void d4(byte[] bArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int d5(int[] lastIndexOf, int i4) {
        int Kh;
        F.p(lastIndexOf, "$this$lastIndexOf");
        Kh = C2101p.Kh(lastIndexOf, i4);
        return Kh;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double d6(int[] maxOfOrNull, l<? super t0, Double> selector) {
        int ue;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (u0.u(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(t0.e(u0.p(maxOfOrNull, 0))).doubleValue();
        ue = C2101p.ue(maxOfOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(t0.e(u0.p(maxOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R d7(long[] minOfOrNull, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (y0.u(minOfOrNull)) {
            return null;
        }
        R C3 = selector.C(x0.e(y0.p(minOfOrNull, 0)));
        ve = C2101p.ve(minOfOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(x0.e(y0.p(minOfOrNull, it.c())));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] d8(int[] plus, int[] elements) {
        int[] s32;
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        s32 = C2100o.s3(plus, elements);
        return u0.j(s32);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final x0 d9(long[] reduceRightIndexedOrNull, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        F.p(operation, "operation");
        ve = C2101p.ve(reduceRightIndexedOrNull);
        if (ve < 0) {
            return null;
        }
        long p4 = y0.p(reduceRightIndexedOrNull, ve);
        for (int i4 = ve - 1; i4 >= 0; i4--) {
            p4 = operation.z(Integer.valueOf(i4), x0.e(y0.p(reduceRightIndexedOrNull, i4)), x0.e(p4)).l0();
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final void da(@l3.d short[] shuffle, @l3.d Random random) {
        int xe;
        F.p(shuffle, "$this$shuffle");
        F.p(random, "random");
        for (xe = C2101p.xe(shuffle); xe > 0; xe--) {
            int m4 = random.m(xe + 1);
            short p4 = E0.p(shuffle, xe);
            E0.w(shuffle, xe, E0.p(shuffle, m4));
            E0.w(shuffle, m4, p4);
        }
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void db(@l3.d short[] sortDescending) {
        F.p(sortDescending, "$this$sortDescending");
        if (E0.r(sortDescending) > 1) {
            Va(sortDescending);
            C2101p.dr(sortDescending);
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @i(name = "sumOfUShort")
    @Y(version = "1.5")
    public static final int dc(@l3.d D0[] d0Arr) {
        F.p(d0Arr, "<this>");
        int i4 = 0;
        for (D0 d02 : d0Arr) {
            i4 = t0.l(i4 + t0.l(d02.j0() & D0.f51794H));
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> dd(short[] zip, R[] other, p<? super D0, ? super R, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(E0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(D0.e(E0.p(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean e0(long[] any) {
        boolean n5;
        F.p(any, "$this$any");
        n5 = C2101p.n5(any);
        return n5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] e1(long[] copyInto, long[] destination, int i4, int i5, int i6) {
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.A0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void e2(@l3.d long[] fill, long j4, int i4, int i5) {
        F.p(fill, "$this$fill");
        C2100o.L1(fill, j4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> e3(byte[] flatMap, l<? super p0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMap, "$this$flatMap");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(flatMap);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(arrayList, transform.C(p0.e(q0.p(flatMap, i4))));
        }
        return arrayList;
    }

    public static final int e4(@l3.d long[] lastIndex) {
        int ve;
        F.p(lastIndex, "$this$lastIndex");
        ve = C2101p.ve(lastIndex);
        return ve;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final t0 e5(@l3.d int[] lastOrNull) {
        F.p(lastOrNull, "$this$lastOrNull");
        if (u0.u(lastOrNull)) {
            return null;
        }
        return t0.e(u0.p(lastOrNull, u0.r(lastOrNull) - 1));
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float e6(int[] maxOfOrNull, l<? super t0, Float> selector) {
        int ue;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (u0.u(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(t0.e(u0.p(maxOfOrNull, 0))).floatValue();
        ue = C2101p.ue(maxOfOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(t0.e(u0.p(maxOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double e7(long[] minOfOrNull, l<? super x0, Double> selector) {
        int ve;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (y0.u(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(x0.e(y0.p(minOfOrNull, 0))).doubleValue();
        ve = C2101p.ve(minOfOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(x0.e(y0.p(minOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] e8(byte[] plus, byte b4) {
        byte[] e32;
        F.p(plus, "$this$plus");
        e32 = C2100o.e3(plus, b4);
        return q0.j(e32);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final p0 e9(byte[] reduceRightOrNull, p<? super p0, ? super p0, p0> operation) {
        int qe;
        F.p(reduceRightOrNull, "$this$reduceRightOrNull");
        F.p(operation, "operation");
        qe = C2101p.qe(reduceRightOrNull);
        if (qe < 0) {
            return null;
        }
        byte p4 = q0.p(reduceRightOrNull, qe);
        for (int i4 = qe - 1; i4 >= 0; i4--) {
            p4 = operation.c0(p0.e(q0.p(reduceRightOrNull, i4)), p0.e(p4)).j0();
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int ea(int[] single) {
        int bt;
        F.p(single, "$this$single");
        bt = C2101p.bt(single);
        return t0.l(bt);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> eb(@l3.d int[] sorted) {
        F.p(sorted, "$this$sorted");
        int[] copyOf = Arrays.copyOf(sorted, sorted.length);
        F.o(copyOf, "copyOf(...)");
        int[] j4 = u0.j(copyOf);
        Ka(j4);
        return kotlin.collections.unsigned.b.a(j4);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> ec(@l3.d byte[] take, int i4) {
        List<p0> k4;
        List<p0> V5;
        List<p0> H3;
        F.p(take, "$this$take");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= q0.r(take)) {
                V5 = D.V5(q0.c(take));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(p0.e(q0.p(take, 0)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int r4 = q0.r(take);
            int i5 = 0;
            for (int i6 = 0; i6 < r4; i6++) {
                arrayList.add(p0.e(q0.p(take, i6)));
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
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<x0, R>> ed(@l3.d long[] zip, @l3.d R[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(y0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            long p4 = y0.p(zip, i4);
            arrayList.add(C2122h0.a(x0.e(p4), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean f0(int[] any, l<? super t0, Boolean> predicate) {
        F.p(any, "$this$any");
        F.p(predicate, "predicate");
        int r4 = u0.r(any);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(t0.e(u0.p(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ long[] f1(long[] copyInto, long[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = y0.r(copyInto);
        }
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.A0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    public static /* synthetic */ void f2(long[] jArr, long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = y0.r(jArr);
        }
        e2(jArr, j4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> f3(long[] flatMap, l<? super x0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMap, "$this$flatMap");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(flatMap);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(arrayList, transform.C(x0.e(y0.p(flatMap, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void f4(long[] jArr) {
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final p0 f5(@l3.d byte[] lastOrNull) {
        F.p(lastOrNull, "$this$lastOrNull");
        if (q0.u(lastOrNull)) {
            return null;
        }
        return p0.e(q0.p(lastOrNull, q0.r(lastOrNull) - 1));
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R f6(short[] maxOfOrNull, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (E0.u(maxOfOrNull)) {
            return null;
        }
        R C3 = selector.C(D0.e(E0.p(maxOfOrNull, 0)));
        xe = C2101p.xe(maxOfOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(D0.e(E0.p(maxOfOrNull, it.c())));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float f7(long[] minOfOrNull, l<? super x0, Float> selector) {
        int ve;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (y0.u(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(x0.e(y0.p(minOfOrNull, 0))).floatValue();
        ve = C2101p.ve(minOfOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(x0.e(y0.p(minOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] f8(byte[] plus, byte[] elements) {
        byte[] g32;
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        g32 = C2100o.g3(plus, elements);
        return q0.j(g32);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final t0 f9(int[] reduceRightOrNull, p<? super t0, ? super t0, t0> operation) {
        int ue;
        F.p(reduceRightOrNull, "$this$reduceRightOrNull");
        F.p(operation, "operation");
        ue = C2101p.ue(reduceRightOrNull);
        if (ue < 0) {
            return null;
        }
        int p4 = u0.p(reduceRightOrNull, ue);
        for (int i4 = ue - 1; i4 >= 0; i4--) {
            p4 = operation.c0(t0.e(u0.p(reduceRightOrNull, i4)), t0.e(p4)).l0();
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte fa(byte[] single) {
        byte Ts;
        F.p(single, "$this$single");
        Ts = C2101p.Ts(single);
        return p0.l(Ts);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> fb(@l3.d byte[] sorted) {
        F.p(sorted, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(sorted, sorted.length);
        F.o(copyOf, "copyOf(...)");
        byte[] j4 = q0.j(copyOf);
        Ra(j4);
        return kotlin.collections.unsigned.b.b(j4);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> fc(@l3.d short[] take, int i4) {
        List<D0> k4;
        List<D0> V5;
        List<D0> H3;
        F.p(take, "$this$take");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= E0.r(take)) {
                V5 = D.V5(E0.c(take));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(D0.e(E0.p(take, 0)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int r4 = E0.r(take);
            int i5 = 0;
            for (int i6 = 0; i6 < r4; i6++) {
                arrayList.add(D0.e(E0.p(take, i6)));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <V> List<V> fd(short[] zip, short[] other, p<? super D0, ? super D0, ? extends V> transform) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int min = Math.min(E0.r(zip), E0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(D0.e(E0.p(zip, i4)), D0.e(E0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean g0(short[] any) {
        boolean r5;
        F.p(any, "$this$any");
        r5 = C2101p.r5(any);
        return r5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] g1(short[] copyInto, short[] destination, int i4, int i5, int i6) {
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.C0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final void g2(@l3.d byte[] fill, byte b4, int i4, int i5) {
        F.p(fill, "$this$fill");
        C2100o.G1(fill, b4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> g3(int[] flatMap, l<? super t0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMap, "$this$flatMap");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(flatMap);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(arrayList, transform.C(t0.e(u0.p(flatMap, i4))));
        }
        return arrayList;
    }

    public static final int g4(@l3.d short[] lastIndex) {
        int xe;
        F.p(lastIndex, "$this$lastIndex");
        xe = C2101p.xe(lastIndex);
        return xe;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final p0 g5(byte[] lastOrNull, l<? super p0, Boolean> predicate) {
        F.p(lastOrNull, "$this$lastOrNull");
        F.p(predicate, "predicate");
        int r4 = q0.r(lastOrNull) - 1;
        if (r4 < 0) {
            return null;
        }
        while (true) {
            int i4 = r4 - 1;
            byte p4 = q0.p(lastOrNull, r4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                return p0.e(p4);
            }
            if (i4 >= 0) {
                r4 = i4;
            } else {
                return null;
            }
        }
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double g6(short[] maxOfOrNull, l<? super D0, Double> selector) {
        int xe;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (E0.u(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(D0.e(E0.p(maxOfOrNull, 0))).doubleValue();
        xe = C2101p.xe(maxOfOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(D0.e(E0.p(maxOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R g7(int[] minOfOrNull, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (u0.u(minOfOrNull)) {
            return null;
        }
        R C3 = selector.C(t0.e(u0.p(minOfOrNull, 0)));
        ue = C2101p.ue(minOfOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(t0.e(u0.p(minOfOrNull, it.c())));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long[] g8(@l3.d long[] plus, @l3.d Collection<x0> elements) {
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        int r4 = y0.r(plus);
        long[] copyOf = Arrays.copyOf(plus, y0.r(plus) + elements.size());
        F.o(copyOf, "copyOf(...)");
        Iterator<x0> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[r4] = it.next().l0();
            r4++;
        }
        return y0.j(copyOf);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final x0 g9(long[] reduceRightOrNull, p<? super x0, ? super x0, x0> operation) {
        int ve;
        F.p(reduceRightOrNull, "$this$reduceRightOrNull");
        F.p(operation, "operation");
        ve = C2101p.ve(reduceRightOrNull);
        if (ve < 0) {
            return null;
        }
        long p4 = y0.p(reduceRightOrNull, ve);
        for (int i4 = ve - 1; i4 >= 0; i4--) {
            p4 = operation.c0(x0.e(y0.p(reduceRightOrNull, i4)), x0.e(p4)).l0();
        }
        return x0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte ga(byte[] single, l<? super p0, Boolean> predicate) {
        F.p(single, "$this$single");
        F.p(predicate, "predicate");
        int r4 = q0.r(single);
        p0 p0Var = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(single, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                if (!z3) {
                    p0Var = p0.e(p4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return p0Var.j0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> gb(@l3.d long[] sorted) {
        F.p(sorted, "$this$sorted");
        long[] copyOf = Arrays.copyOf(sorted, sorted.length);
        F.o(copyOf, "copyOf(...)");
        long[] j4 = y0.j(copyOf);
        Sa(j4);
        return kotlin.collections.unsigned.b.c(j4);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> gc(@l3.d int[] take, int i4) {
        List<t0> k4;
        List<t0> V5;
        List<t0> H3;
        F.p(take, "$this$take");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= u0.r(take)) {
                V5 = D.V5(u0.c(take));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(t0.e(u0.p(take, 0)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int r4 = u0.r(take);
            int i5 = 0;
            for (int i6 = 0; i6 < r4; i6++) {
                arrayList.add(t0.e(u0.p(take, i6)));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, V> List<V> gd(short[] zip, Iterable<? extends R> other, p<? super D0, ? super R, ? extends V> transform) {
        int b02;
        F.p(zip, "$this$zip");
        F.p(other, "other");
        F.p(transform, "transform");
        int r4 = E0.r(zip);
        b02 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, r4));
        int i4 = 0;
        for (R r5 : other) {
            if (i4 >= r4) {
                break;
            }
            arrayList.add(transform.c0(D0.e(E0.p(zip, i4)), r5));
            i4++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final boolean h0(short[] any, l<? super D0, Boolean> predicate) {
        F.p(any, "$this$any");
        F.p(predicate, "predicate");
        int r4 = E0.r(any);
        for (int i4 = 0; i4 < r4; i4++) {
            if (predicate.C(D0.e(E0.p(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ short[] h1(short[] copyInto, short[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = E0.r(copyInto);
        }
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.C0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    public static /* synthetic */ void h2(byte[] bArr, byte b4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = q0.r(bArr);
        }
        g2(bArr, b4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> h3(short[] flatMap, l<? super D0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMap, "$this$flatMap");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(flatMap);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(arrayList, transform.C(D0.e(E0.p(flatMap, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static /* synthetic */ void h4(short[] sArr) {
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final x0 h5(long[] lastOrNull, l<? super x0, Boolean> predicate) {
        F.p(lastOrNull, "$this$lastOrNull");
        F.p(predicate, "predicate");
        int r4 = y0.r(lastOrNull) - 1;
        if (r4 < 0) {
            return null;
        }
        while (true) {
            int i4 = r4 - 1;
            long p4 = y0.p(lastOrNull, r4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                return x0.e(p4);
            }
            if (i4 >= 0) {
                r4 = i4;
            } else {
                return null;
            }
        }
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float h6(short[] maxOfOrNull, l<? super D0, Float> selector) {
        int xe;
        F.p(maxOfOrNull, "$this$maxOfOrNull");
        F.p(selector, "selector");
        if (E0.u(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(D0.e(E0.p(maxOfOrNull, 0))).floatValue();
        xe = C2101p.xe(maxOfOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(D0.e(E0.p(maxOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double h7(int[] minOfOrNull, l<? super t0, Double> selector) {
        int ue;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (u0.u(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(t0.e(u0.p(minOfOrNull, 0))).doubleValue();
        ue = C2101p.ue(minOfOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(t0.e(u0.p(minOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] h8(short[] plus, short[] elements) {
        short[] B3;
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        B3 = C2100o.B3(plus, elements);
        return E0.j(B3);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final D0 h9(short[] reduceRightOrNull, p<? super D0, ? super D0, D0> operation) {
        int xe;
        F.p(reduceRightOrNull, "$this$reduceRightOrNull");
        F.p(operation, "operation");
        xe = C2101p.xe(reduceRightOrNull);
        if (xe < 0) {
            return null;
        }
        short p4 = E0.p(reduceRightOrNull, xe);
        for (int i4 = xe - 1; i4 >= 0; i4--) {
            p4 = operation.c0(D0.e(E0.p(reduceRightOrNull, i4)), D0.e(p4)).j0();
        }
        return D0.e(p4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long ha(long[] single, l<? super x0, Boolean> predicate) {
        F.p(single, "$this$single");
        F.p(predicate, "predicate");
        int r4 = y0.r(single);
        x0 x0Var = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(single, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                if (!z3) {
                    x0Var = x0.e(p4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return x0Var.l0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> hb(@l3.d short[] sorted) {
        F.p(sorted, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sorted, sorted.length);
        F.o(copyOf, "copyOf(...)");
        short[] j4 = E0.j(copyOf);
        Va(j4);
        return kotlin.collections.unsigned.b.d(j4);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> hc(@l3.d long[] take, int i4) {
        List<x0> k4;
        List<x0> V5;
        List<x0> H3;
        F.p(take, "$this$take");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (i4 >= y0.r(take)) {
                V5 = D.V5(y0.c(take));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(x0.e(y0.p(take, 0)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            int r4 = y0.r(take);
            int i5 = 0;
            for (int i6 = 0; i6 < r4; i6++) {
                arrayList.add(x0.e(y0.p(take, i6)));
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
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<Pair<p0, p0>> hd(@l3.d byte[] zip, @l3.d byte[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(q0.r(zip), q0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(p0.e(q0.p(zip, i4)), p0.e(q0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] i0(byte[] asByteArray) {
        F.p(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] i1(byte[] copyInto, byte[] destination, int i4, int i5, int i6) {
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.v0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> i2(byte[] filter, l<? super p0, Boolean> predicate) {
        F.p(filter, "$this$filter");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(filter);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(filter, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                arrayList.add(p0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> List<R> i3(byte[] flatMapIndexed, p<? super Integer, ? super p0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexed, "$this$flatMapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(arrayList, transform.c0(Integer.valueOf(i5), p0.e(q0.p(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short i4(short[] getOrElse, int i4, l<? super Integer, D0> defaultValue) {
        int xe;
        F.p(getOrElse, "$this$getOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            xe = C2101p.xe(getOrElse);
            if (i4 <= xe) {
                return E0.p(getOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).j0();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final x0 i5(@l3.d long[] lastOrNull) {
        F.p(lastOrNull, "$this$lastOrNull");
        if (y0.u(lastOrNull)) {
            return null;
        }
        return x0.e(y0.p(lastOrNull, y0.r(lastOrNull) - 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R i6(long[] maxOfWith, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxOfWith, "$this$maxOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!y0.u(maxOfWith)) {
            Object obj = (R) selector.C(x0.e(y0.p(maxOfWith, 0)));
            ve = C2101p.ve(maxOfWith);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(x0.e(y0.p(maxOfWith, it.c())));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float i7(int[] minOfOrNull, l<? super t0, Float> selector) {
        int ue;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (u0.u(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(t0.e(u0.p(minOfOrNull, 0))).floatValue();
        ue = C2101p.ue(minOfOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(t0.e(u0.p(minOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short[] i8(@l3.d short[] plus, @l3.d Collection<D0> elements) {
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        int r4 = E0.r(plus);
        short[] copyOf = Arrays.copyOf(plus, E0.r(plus) + elements.size());
        F.o(copyOf, "copyOf(...)");
        Iterator<D0> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[r4] = it.next().j0();
            r4++;
        }
        return E0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void i9(int[] reverse) {
        F.p(reverse, "$this$reverse");
        C2101p.Xq(reverse);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long ia(long[] single) {
        long dt;
        F.p(single, "$this$single");
        dt = C2101p.dt(single);
        return x0.l(dt);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int[] ib(@l3.d int[] sortedArray) {
        F.p(sortedArray, "$this$sortedArray");
        if (u0.u(sortedArray)) {
            return sortedArray;
        }
        int[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        F.o(copyOf, "copyOf(...)");
        int[] j4 = u0.j(copyOf);
        Ka(j4);
        return j4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> ic(@l3.d byte[] takeLast, int i4) {
        List<p0> k4;
        List<p0> V5;
        List<p0> H3;
        F.p(takeLast, "$this$takeLast");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int r4 = q0.r(takeLast);
            if (i4 >= r4) {
                V5 = D.V5(q0.c(takeLast));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(p0.e(q0.p(takeLast, r4 - 1)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = r4 - i4; i5 < r4; i5++) {
                arrayList.add(p0.e(q0.p(takeLast, i5)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<Pair<D0, D0>> id(@l3.d short[] zip, @l3.d short[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(E0.r(zip), E0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(D0.e(E0.p(zip, i4)), D0.e(E0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] j0(int[] asIntArray) {
        F.p(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    static /* synthetic */ byte[] j1(byte[] copyInto, byte[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = q0.r(copyInto);
        }
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.v0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> j2(long[] filter, l<? super x0, Boolean> predicate) {
        F.p(filter, "$this$filter");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(filter);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(filter, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                arrayList.add(x0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> List<R> j3(int[] flatMapIndexed, p<? super Integer, ? super t0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexed, "$this$flatMapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(arrayList, transform.c0(Integer.valueOf(i5), t0.e(u0.p(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int j4(int[] getOrElse, int i4, l<? super Integer, t0> defaultValue) {
        int ue;
        F.p(getOrElse, "$this$getOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ue = C2101p.ue(getOrElse);
            if (i4 <= ue) {
                return u0.p(getOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).l0();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final t0 j5(int[] lastOrNull, l<? super t0, Boolean> predicate) {
        F.p(lastOrNull, "$this$lastOrNull");
        F.p(predicate, "predicate");
        int r4 = u0.r(lastOrNull) - 1;
        if (r4 < 0) {
            return null;
        }
        while (true) {
            int i4 = r4 - 1;
            int p4 = u0.p(lastOrNull, r4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                return t0.e(p4);
            }
            if (i4 >= 0) {
                r4 = i4;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R j6(byte[] maxOfWith, Comparator<? super R> comparator, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxOfWith, "$this$maxOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!q0.u(maxOfWith)) {
            Object obj = (R) selector.C(p0.e(q0.p(maxOfWith, 0)));
            qe = C2101p.qe(maxOfWith);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(p0.e(q0.p(maxOfWith, it.c())));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R j7(short[] minOfOrNull, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (E0.u(minOfOrNull)) {
            return null;
        }
        R C3 = selector.C(D0.e(E0.p(minOfOrNull, 0)));
        xe = C2101p.xe(minOfOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(D0.e(E0.p(minOfOrNull, it.c())));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] j8(int[] plus, int i4) {
        int[] q32;
        F.p(plus, "$this$plus");
        q32 = C2100o.q3(plus, i4);
        return u0.j(q32);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final void j9(long[] reverse, int i4, int i5) {
        F.p(reverse, "$this$reverse");
        C2101p.ar(reverse, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int ja(int[] single, l<? super t0, Boolean> predicate) {
        F.p(single, "$this$single");
        F.p(predicate, "predicate");
        int r4 = u0.r(single);
        t0 t0Var = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(single, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                if (!z3) {
                    t0Var = t0.e(p4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return t0Var.l0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] jb(@l3.d byte[] sortedArray) {
        F.p(sortedArray, "$this$sortedArray");
        if (q0.u(sortedArray)) {
            return sortedArray;
        }
        byte[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        F.o(copyOf, "copyOf(...)");
        byte[] j4 = q0.j(copyOf);
        Ra(j4);
        return j4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> jc(@l3.d short[] takeLast, int i4) {
        List<D0> k4;
        List<D0> V5;
        List<D0> H3;
        F.p(takeLast, "$this$takeLast");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int r4 = E0.r(takeLast);
            if (i4 >= r4) {
                V5 = D.V5(E0.c(takeLast));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(D0.e(E0.p(takeLast, r4 - 1)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = r4 - i4; i5 < r4; i5++) {
                arrayList.add(D0.e(E0.p(takeLast, i5)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<p0, R>> jd(@l3.d byte[] zip, @l3.d R[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(q0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            byte p4 = q0.p(zip, i4);
            arrayList.add(C2122h0.a(p0.e(p4), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] k0(long[] asLongArray) {
        F.p(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] k1(int[] copyInto, int[] destination, int i4, int i5, int i6) {
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.z0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> k2(int[] filter, l<? super t0, Boolean> predicate) {
        F.p(filter, "$this$filter");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(filter);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(filter, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                arrayList.add(t0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> List<R> k3(long[] flatMapIndexed, p<? super Integer, ? super x0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexed, "$this$flatMapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(arrayList, transform.c0(Integer.valueOf(i5), x0.e(y0.p(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long k4(long[] getOrElse, int i4, l<? super Integer, x0> defaultValue) {
        int ve;
        F.p(getOrElse, "$this$getOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            ve = C2101p.ve(getOrElse);
            if (i4 <= ve) {
                return y0.p(getOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).l0();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final D0 k5(@l3.d short[] lastOrNull) {
        F.p(lastOrNull, "$this$lastOrNull");
        if (E0.u(lastOrNull)) {
            return null;
        }
        return D0.e(E0.p(lastOrNull, E0.r(lastOrNull) - 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R k6(short[] maxOfWith, Comparator<? super R> comparator, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxOfWith, "$this$maxOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!E0.u(maxOfWith)) {
            Object obj = (R) selector.C(D0.e(E0.p(maxOfWith, 0)));
            xe = C2101p.xe(maxOfWith);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(D0.e(E0.p(maxOfWith, it.c())));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Double k7(short[] minOfOrNull, l<? super D0, Double> selector) {
        int xe;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (E0.u(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.C(D0.e(E0.p(minOfOrNull, 0))).doubleValue();
        xe = C2101p.xe(minOfOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(D0.e(E0.p(minOfOrNull, it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] k8(long[] plus, long[] elements) {
        long[] v3;
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        v3 = C2100o.v3(plus, elements);
        return y0.j(v3);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final void k9(byte[] reverse, int i4, int i5) {
        F.p(reverse, "$this$reverse");
        C2101p.Qq(reverse, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short ka(short[] single) {
        short ht;
        F.p(single, "$this$single");
        ht = C2101p.ht(single);
        return D0.l(ht);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long[] kb(@l3.d long[] sortedArray) {
        F.p(sortedArray, "$this$sortedArray");
        if (y0.u(sortedArray)) {
            return sortedArray;
        }
        long[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        F.o(copyOf, "copyOf(...)");
        long[] j4 = y0.j(copyOf);
        Sa(j4);
        return j4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> kc(@l3.d int[] takeLast, int i4) {
        List<t0> k4;
        List<t0> V5;
        List<t0> H3;
        F.p(takeLast, "$this$takeLast");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int r4 = u0.r(takeLast);
            if (i4 >= r4) {
                V5 = D.V5(u0.c(takeLast));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(t0.e(u0.p(takeLast, r4 - 1)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = r4 - i4; i5 < r4; i5++) {
                arrayList.add(t0.e(u0.p(takeLast, i5)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final <R> List<Pair<D0, R>> kd(@l3.d short[] zip, @l3.d R[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(E0.r(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            short p4 = E0.p(zip, i4);
            arrayList.add(C2122h0.a(D0.e(p4), other[i4]));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] l0(short[] asShortArray) {
        F.p(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    static /* synthetic */ int[] l1(int[] copyInto, int[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = u0.r(copyInto);
        }
        F.p(copyInto, "$this$copyInto");
        F.p(destination, "destination");
        C2100o.z0(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> l2(short[] filter, l<? super D0, Boolean> predicate) {
        F.p(filter, "$this$filter");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(filter);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(filter, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                arrayList.add(D0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> List<R> l3(short[] flatMapIndexed, p<? super Integer, ? super D0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexed, "$this$flatMapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(arrayList, transform.c0(Integer.valueOf(i5), D0.e(E0.p(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte l4(byte[] getOrElse, int i4, l<? super Integer, p0> defaultValue) {
        int qe;
        F.p(getOrElse, "$this$getOrElse");
        F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            qe = C2101p.qe(getOrElse);
            if (i4 <= qe) {
                return q0.p(getOrElse, i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).j0();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final D0 l5(short[] lastOrNull, l<? super D0, Boolean> predicate) {
        F.p(lastOrNull, "$this$lastOrNull");
        F.p(predicate, "predicate");
        int r4 = E0.r(lastOrNull) - 1;
        if (r4 < 0) {
            return null;
        }
        while (true) {
            int i4 = r4 - 1;
            short p4 = E0.p(lastOrNull, r4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                return D0.e(p4);
            }
            if (i4 >= 0) {
                r4 = i4;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R l6(int[] maxOfWith, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxOfWith, "$this$maxOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!u0.u(maxOfWith)) {
            Object obj = (R) selector.C(t0.e(u0.p(maxOfWith, 0)));
            ue = C2101p.ue(maxOfWith);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(t0.e(u0.p(maxOfWith, it.c())));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final Float l7(short[] minOfOrNull, l<? super D0, Float> selector) {
        int xe;
        F.p(minOfOrNull, "$this$minOfOrNull");
        F.p(selector, "selector");
        if (E0.u(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.C(D0.e(E0.p(minOfOrNull, 0))).floatValue();
        xe = C2101p.xe(minOfOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(D0.e(E0.p(minOfOrNull, it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] l8(@l3.d byte[] plus, @l3.d Collection<p0> elements) {
        F.p(plus, "$this$plus");
        F.p(elements, "elements");
        int r4 = q0.r(plus);
        byte[] copyOf = Arrays.copyOf(plus, q0.r(plus) + elements.size());
        F.o(copyOf, "copyOf(...)");
        Iterator<p0> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[r4] = it.next().j0();
            r4++;
        }
        return q0.j(copyOf);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final void l9(short[] reverse, int i4, int i5) {
        F.p(reverse, "$this$reverse");
        C2101p.er(reverse, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short la(short[] single, l<? super D0, Boolean> predicate) {
        F.p(single, "$this$single");
        F.p(predicate, "predicate");
        int r4 = E0.r(single);
        D0 d02 = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(single, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                if (!z3) {
                    d02 = D0.e(p4);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return d02.j0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short[] lb(@l3.d short[] sortedArray) {
        F.p(sortedArray, "$this$sortedArray");
        if (E0.u(sortedArray)) {
            return sortedArray;
        }
        short[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        F.o(copyOf, "copyOf(...)");
        short[] j4 = E0.j(copyOf);
        Va(j4);
        return j4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> lc(@l3.d long[] takeLast, int i4) {
        List<x0> k4;
        List<x0> V5;
        List<x0> H3;
        F.p(takeLast, "$this$takeLast");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int r4 = y0.r(takeLast);
            if (i4 >= r4) {
                V5 = D.V5(y0.c(takeLast));
                return V5;
            }
            if (i4 == 1) {
                k4 = C2108v.k(x0.e(y0.p(takeLast, r4 - 1)));
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = r4 - i4; i5 < r4; i5++) {
                arrayList.add(x0.e(y0.p(takeLast, i5)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<Pair<x0, x0>> ld(@l3.d long[] zip, @l3.d long[] other) {
        F.p(zip, "$this$zip");
        F.p(other, "other");
        int min = Math.min(y0.r(zip), y0.r(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(x0.e(y0.p(zip, i4)), x0.e(y0.p(other, i4))));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] m0(byte[] bArr) {
        F.p(bArr, "<this>");
        return q0.j(bArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] m1(int[] copyOf) {
        F.p(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        F.o(copyOf2, "copyOf(...)");
        return u0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> m2(byte[] filterIndexed, p<? super Integer, ? super p0, Boolean> predicate) {
        F.p(filterIndexed, "$this$filterIndexed");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            byte p4 = q0.p(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), p0.e(p4)).booleanValue()) {
                arrayList.add(p0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R, C extends Collection<? super R>> C m3(int[] flatMapIndexedTo, C destination, p<? super Integer, ? super t0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = u0.r(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(destination, transform.c0(Integer.valueOf(i5), t0.e(u0.p(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final p0 m4(@l3.d byte[] getOrNull, int i4) {
        int qe;
        F.p(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            qe = C2101p.qe(getOrNull);
            if (i4 <= qe) {
                return p0.e(q0.p(getOrNull, i4));
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> m5(byte[] map, l<? super p0, ? extends R> transform) {
        F.p(map, "$this$map");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(q0.r(map));
        int r4 = q0.r(map);
        for (int i4 = 0; i4 < r4; i4++) {
            arrayList.add(transform.C(p0.e(q0.p(map, i4))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R m6(long[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (y0.u(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(x0.e(y0.p(maxOfWithOrNull, 0)));
        ve = C2101p.ve(maxOfWithOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(x0.e(y0.p(maxOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R m7(long[] minOfWith, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minOfWith, "$this$minOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!y0.u(minOfWith)) {
            Object obj = (R) selector.C(x0.e(y0.p(minOfWith, 0)));
            ve = C2101p.ve(minOfWith);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(x0.e(y0.p(minOfWith, it.c())));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int m8(int[] random) {
        F.p(random, "$this$random");
        return n8(random, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void m9(byte[] reverse) {
        F.p(reverse, "$this$reverse");
        C2101p.Pq(reverse);
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final t0 ma(@l3.d int[] singleOrNull) {
        F.p(singleOrNull, "$this$singleOrNull");
        if (u0.r(singleOrNull) == 1) {
            return t0.e(u0.p(singleOrNull, 0));
        }
        return null;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int[] mb(@l3.d int[] sortedArrayDescending) {
        F.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (u0.u(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        F.o(copyOf, "copyOf(...)");
        int[] j4 = u0.j(copyOf);
        Wa(j4);
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> mc(byte[] takeLastWhile, l<? super p0, Boolean> predicate) {
        int qe;
        List<p0> V5;
        F.p(takeLastWhile, "$this$takeLastWhile");
        F.p(predicate, "predicate");
        for (qe = C2101p.qe(takeLastWhile); -1 < qe; qe--) {
            if (!predicate.C(p0.e(q0.p(takeLastWhile, qe))).booleanValue()) {
                return C1(takeLastWhile, qe + 1);
            }
        }
        V5 = D.V5(q0.c(takeLastWhile));
        return V5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] n0(int[] iArr) {
        F.p(iArr, "<this>");
        return u0.j(iArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] n1(byte[] copyOf) {
        F.p(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        F.o(copyOf2, "copyOf(...)");
        return q0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> n2(int[] filterIndexed, p<? super Integer, ? super t0, Boolean> predicate) {
        F.p(filterIndexed, "$this$filterIndexed");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            int p4 = u0.p(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), t0.e(p4)).booleanValue()) {
                arrayList.add(t0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R, C extends Collection<? super R>> C n3(short[] flatMapIndexedTo, C destination, p<? super Integer, ? super D0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = E0.r(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(destination, transform.c0(Integer.valueOf(i5), D0.e(E0.p(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final D0 n4(@l3.d short[] getOrNull, int i4) {
        int xe;
        F.p(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            xe = C2101p.xe(getOrNull);
            if (i4 <= xe) {
                return D0.e(E0.p(getOrNull, i4));
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> n5(long[] map, l<? super x0, ? extends R> transform) {
        F.p(map, "$this$map");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(y0.r(map));
        int r4 = y0.r(map);
        for (int i4 = 0; i4 < r4; i4++) {
            arrayList.add(transform.C(x0.e(y0.p(map, i4))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R n6(byte[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (q0.u(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(p0.e(q0.p(maxOfWithOrNull, 0)));
        qe = C2101p.qe(maxOfWithOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(p0.e(q0.p(maxOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R n7(byte[] minOfWith, Comparator<? super R> comparator, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minOfWith, "$this$minOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!q0.u(minOfWith)) {
            Object obj = (R) selector.C(p0.e(q0.p(minOfWith, 0)));
            qe = C2101p.qe(minOfWith);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(p0.e(q0.p(minOfWith, it.c())));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int n8(@l3.d int[] random, @l3.d Random random2) {
        F.p(random, "$this$random");
        F.p(random2, "random");
        if (!u0.u(random)) {
            return u0.p(random, random2.m(u0.r(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void n9(long[] reverse) {
        F.p(reverse, "$this$reverse");
        C2101p.Zq(reverse);
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final p0 na(@l3.d byte[] singleOrNull) {
        F.p(singleOrNull, "$this$singleOrNull");
        if (q0.r(singleOrNull) == 1) {
            return p0.e(q0.p(singleOrNull, 0));
        }
        return null;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] nb(@l3.d byte[] sortedArrayDescending) {
        F.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (q0.u(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        F.o(copyOf, "copyOf(...)");
        byte[] j4 = q0.j(copyOf);
        ab(j4);
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> nc(long[] takeLastWhile, l<? super x0, Boolean> predicate) {
        int ve;
        List<x0> V5;
        F.p(takeLastWhile, "$this$takeLastWhile");
        F.p(predicate, "predicate");
        for (ve = C2101p.ve(takeLastWhile); -1 < ve; ve--) {
            if (!predicate.C(x0.e(y0.p(takeLastWhile, ve))).booleanValue()) {
                return F1(takeLastWhile, ve + 1);
            }
        }
        V5 = D.V5(y0.c(takeLastWhile));
        return V5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] o0(long[] jArr) {
        F.p(jArr, "<this>");
        return y0.j(jArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] o1(byte[] copyOf, int i4) {
        F.p(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, i4);
        F.o(copyOf2, "copyOf(...)");
        return q0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> o2(long[] filterIndexed, p<? super Integer, ? super x0, Boolean> predicate) {
        F.p(filterIndexed, "$this$filterIndexed");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            long p4 = y0.p(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), x0.e(p4)).booleanValue()) {
                arrayList.add(x0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R, C extends Collection<? super R>> C o3(byte[] flatMapIndexedTo, C destination, p<? super Integer, ? super p0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = q0.r(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(destination, transform.c0(Integer.valueOf(i5), p0.e(q0.p(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final t0 o4(@l3.d int[] getOrNull, int i4) {
        int ue;
        F.p(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            ue = C2101p.ue(getOrNull);
            if (i4 <= ue) {
                return t0.e(u0.p(getOrNull, i4));
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> o5(int[] map, l<? super t0, ? extends R> transform) {
        F.p(map, "$this$map");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(u0.r(map));
        int r4 = u0.r(map);
        for (int i4 = 0; i4 < r4; i4++) {
            arrayList.add(transform.C(t0.e(u0.p(map, i4))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R o6(short[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (E0.u(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(D0.e(E0.p(maxOfWithOrNull, 0)));
        xe = C2101p.xe(maxOfWithOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(D0.e(E0.p(maxOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R o7(short[] minOfWith, Comparator<? super R> comparator, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minOfWith, "$this$minOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!E0.u(minOfWith)) {
            Object obj = (R) selector.C(D0.e(E0.p(minOfWith, 0)));
            xe = C2101p.xe(minOfWith);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(D0.e(E0.p(minOfWith, it.c())));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte o8(byte[] random) {
        F.p(random, "$this$random");
        return r8(random, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final void o9(int[] reverse, int i4, int i5) {
        F.p(reverse, "$this$reverse");
        C2101p.Yq(reverse, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final p0 oa(byte[] singleOrNull, l<? super p0, Boolean> predicate) {
        F.p(singleOrNull, "$this$singleOrNull");
        F.p(predicate, "predicate");
        int r4 = q0.r(singleOrNull);
        p0 p0Var = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(singleOrNull, i4);
            if (predicate.C(p0.e(p4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                p0Var = p0.e(p4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return p0Var;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long[] ob(@l3.d long[] sortedArrayDescending) {
        F.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (y0.u(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        F.o(copyOf, "copyOf(...)");
        long[] j4 = y0.j(copyOf);
        bb(j4);
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> oc(int[] takeLastWhile, l<? super t0, Boolean> predicate) {
        int ue;
        List<t0> V5;
        F.p(takeLastWhile, "$this$takeLastWhile");
        F.p(predicate, "predicate");
        for (ue = C2101p.ue(takeLastWhile); -1 < ue; ue--) {
            if (!predicate.C(t0.e(u0.p(takeLastWhile, ue))).booleanValue()) {
                return E1(takeLastWhile, ue + 1);
            }
        }
        V5 = D.V5(u0.c(takeLastWhile));
        return V5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] p0(short[] sArr) {
        F.p(sArr, "<this>");
        return E0.j(sArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] p1(long[] copyOf) {
        F.p(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        F.o(copyOf2, "copyOf(...)");
        return y0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> p2(short[] filterIndexed, p<? super Integer, ? super D0, Boolean> predicate) {
        F.p(filterIndexed, "$this$filterIndexed");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            short p4 = E0.p(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), D0.e(p4)).booleanValue()) {
                arrayList.add(D0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R, C extends Collection<? super R>> C p3(long[] flatMapIndexedTo, C destination, p<? super Integer, ? super x0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = y0.r(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            A.q0(destination, transform.c0(Integer.valueOf(i5), x0.e(y0.p(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final x0 p4(@l3.d long[] getOrNull, int i4) {
        int ve;
        F.p(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            ve = C2101p.ve(getOrNull);
            if (i4 <= ve) {
                return x0.e(y0.p(getOrNull, i4));
            }
        }
        return null;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> p5(short[] map, l<? super D0, ? extends R> transform) {
        F.p(map, "$this$map");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(E0.r(map));
        int r4 = E0.r(map);
        for (int i4 = 0; i4 < r4; i4++) {
            arrayList.add(transform.C(D0.e(E0.p(map, i4))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R p6(int[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (u0.u(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(t0.e(u0.p(maxOfWithOrNull, 0)));
        ue = C2101p.ue(maxOfWithOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(t0.e(u0.p(maxOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R p7(int[] minOfWith, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minOfWith, "$this$minOfWith");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (!u0.u(minOfWith)) {
            Object obj = (R) selector.C(t0.e(u0.p(minOfWith, 0)));
            ue = C2101p.ue(minOfWith);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(t0.e(u0.p(minOfWith, it.c())));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final long p8(@l3.d long[] random, @l3.d Random random2) {
        F.p(random, "$this$random");
        F.p(random2, "random");
        if (!y0.u(random)) {
            return y0.p(random, random2.m(y0.r(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final void p9(short[] reverse) {
        F.p(reverse, "$this$reverse");
        C2101p.dr(reverse);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final x0 pa(long[] singleOrNull, l<? super x0, Boolean> predicate) {
        F.p(singleOrNull, "$this$singleOrNull");
        F.p(predicate, "predicate");
        int r4 = y0.r(singleOrNull);
        x0 x0Var = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(singleOrNull, i4);
            if (predicate.C(x0.e(p4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                x0Var = x0.e(p4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return x0Var;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short[] pb(@l3.d short[] sortedArrayDescending) {
        F.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (E0.u(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        F.o(copyOf, "copyOf(...)");
        short[] j4 = E0.j(copyOf);
        db(j4);
        return j4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> pc(short[] takeLastWhile, l<? super D0, Boolean> predicate) {
        int xe;
        List<D0> V5;
        F.p(takeLastWhile, "$this$takeLastWhile");
        F.p(predicate, "predicate");
        for (xe = C2101p.xe(takeLastWhile); -1 < xe; xe--) {
            if (!predicate.C(D0.e(E0.p(takeLastWhile, xe))).booleanValue()) {
                return D1(takeLastWhile, xe + 1);
            }
        }
        V5 = D.V5(E0.c(takeLastWhile));
        return V5;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V> Map<p0, V> q0(byte[] associateWith, l<? super p0, ? extends V> valueSelector) {
        int j4;
        int u3;
        F.p(associateWith, "$this$associateWith");
        F.p(valueSelector, "valueSelector");
        j4 = X.j(q0.r(associateWith));
        u3 = u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        int r4 = q0.r(associateWith);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(associateWith, i4);
            linkedHashMap.put(p0.e(p4), valueSelector.C(p0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] q1(short[] copyOf, int i4) {
        F.p(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, i4);
        F.o(copyOf2, "copyOf(...)");
        return E0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super t0>> C q2(int[] filterIndexedTo, C destination, p<? super Integer, ? super t0, Boolean> predicate) {
        F.p(filterIndexedTo, "$this$filterIndexedTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = u0.r(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            int p4 = u0.p(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), t0.e(p4)).booleanValue()) {
                destination.add(t0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C q3(long[] flatMapTo, C destination, l<? super x0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapTo, "$this$flatMapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = y0.r(flatMapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(destination, transform.C(x0.e(y0.p(flatMapTo, i4))));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V> Map<K, List<V>> q4(long[] groupBy, l<? super x0, ? extends K> keySelector, l<? super x0, ? extends V> valueTransform) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = y0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(groupBy, i4);
            K C3 = keySelector.C(x0.e(p4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(x0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> q5(byte[] mapIndexed, p<? super Integer, ? super p0, ? extends R> transform) {
        F.p(mapIndexed, "$this$mapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(q0.r(mapIndexed));
        int r4 = q0.r(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            arrayList.add(transform.c0(Integer.valueOf(i5), p0.e(q0.p(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final t0 q6(@l3.d int[] maxOrNull) {
        int ue;
        int compare;
        F.p(maxOrNull, "$this$maxOrNull");
        if (u0.u(maxOrNull)) {
            return null;
        }
        int p4 = u0.p(maxOrNull, 0);
        ue = C2101p.ue(maxOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int p5 = u0.p(maxOrNull, it.c());
            compare = Integer.compare(p4 ^ Integer.MIN_VALUE, p5 ^ Integer.MIN_VALUE);
            if (compare < 0) {
                p4 = p5;
            }
        }
        return t0.e(p4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R q7(long[] minOfWithOrNull, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minOfWithOrNull, "$this$minOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (y0.u(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(x0.e(y0.p(minOfWithOrNull, 0)));
        ve = C2101p.ve(minOfWithOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(x0.e(y0.p(minOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long q8(long[] random) {
        F.p(random, "$this$random");
        return p8(random, Random.f52425E);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> q9(@l3.d int[] reversed) {
        List<t0> Y5;
        List<t0> H3;
        F.p(reversed, "$this$reversed");
        if (u0.u(reversed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Y5 = D.Y5(u0.c(reversed));
        C.r1(Y5);
        return Y5;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final x0 qa(@l3.d long[] singleOrNull) {
        F.p(singleOrNull, "$this$singleOrNull");
        if (y0.r(singleOrNull) == 1) {
            return x0.e(y0.p(singleOrNull, 0));
        }
        return null;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> qb(@l3.d int[] sortedDescending) {
        F.p(sortedDescending, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        F.o(copyOf, "copyOf(...)");
        int[] j4 = u0.j(copyOf);
        Ka(j4);
        return q9(j4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> qc(byte[] takeWhile, l<? super p0, Boolean> predicate) {
        F.p(takeWhile, "$this$takeWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(takeWhile);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(takeWhile, i4);
            if (!predicate.C(p0.e(p4)).booleanValue()) {
                break;
            }
            arrayList.add(p0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V> Map<x0, V> r0(long[] associateWith, l<? super x0, ? extends V> valueSelector) {
        int j4;
        int u3;
        F.p(associateWith, "$this$associateWith");
        F.p(valueSelector, "valueSelector");
        j4 = X.j(y0.r(associateWith));
        u3 = u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        int r4 = y0.r(associateWith);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(associateWith, i4);
            linkedHashMap.put(x0.e(p4), valueSelector.C(x0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] r1(int[] copyOf, int i4) {
        F.p(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, i4);
        F.o(copyOf2, "copyOf(...)");
        return u0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super D0>> C r2(short[] filterIndexedTo, C destination, p<? super Integer, ? super D0, Boolean> predicate) {
        F.p(filterIndexedTo, "$this$filterIndexedTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = E0.r(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            short p4 = E0.p(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), D0.e(p4)).booleanValue()) {
                destination.add(D0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C r3(short[] flatMapTo, C destination, l<? super D0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapTo, "$this$flatMapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = E0.r(flatMapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(destination, transform.C(D0.e(E0.p(flatMapTo, i4))));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V> Map<K, List<V>> r4(short[] groupBy, l<? super D0, ? extends K> keySelector, l<? super D0, ? extends V> valueTransform) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = E0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(groupBy, i4);
            K C3 = keySelector.C(D0.e(p4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(D0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> r5(int[] mapIndexed, p<? super Integer, ? super t0, ? extends R> transform) {
        F.p(mapIndexed, "$this$mapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(u0.r(mapIndexed));
        int r4 = u0.r(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            arrayList.add(transform.c0(Integer.valueOf(i5), t0.e(u0.p(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final p0 r6(@l3.d byte[] maxOrNull) {
        int qe;
        F.p(maxOrNull, "$this$maxOrNull");
        if (q0.u(maxOrNull)) {
            return null;
        }
        byte p4 = q0.p(maxOrNull, 0);
        qe = C2101p.qe(maxOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte p5 = q0.p(maxOrNull, it.c());
            if (F.t(p4 & 255, p5 & 255) < 0) {
                p4 = p5;
            }
        }
        return p0.e(p4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R r7(byte[] minOfWithOrNull, Comparator<? super R> comparator, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minOfWithOrNull, "$this$minOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (q0.u(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(p0.e(q0.p(minOfWithOrNull, 0)));
        qe = C2101p.qe(minOfWithOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(p0.e(q0.p(minOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte r8(@l3.d byte[] random, @l3.d Random random2) {
        F.p(random, "$this$random");
        F.p(random2, "random");
        if (!q0.u(random)) {
            return q0.p(random, random2.m(q0.r(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> r9(@l3.d byte[] reversed) {
        List<p0> Y5;
        List<p0> H3;
        F.p(reversed, "$this$reversed");
        if (q0.u(reversed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Y5 = D.Y5(q0.c(reversed));
        C.r1(Y5);
        return Y5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final t0 ra(int[] singleOrNull, l<? super t0, Boolean> predicate) {
        F.p(singleOrNull, "$this$singleOrNull");
        F.p(predicate, "predicate");
        int r4 = u0.r(singleOrNull);
        t0 t0Var = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(singleOrNull, i4);
            if (predicate.C(t0.e(p4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                t0Var = t0.e(p4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return t0Var;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> rb(@l3.d byte[] sortedDescending) {
        F.p(sortedDescending, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        F.o(copyOf, "copyOf(...)");
        byte[] j4 = q0.j(copyOf);
        Ra(j4);
        return r9(j4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> rc(long[] takeWhile, l<? super x0, Boolean> predicate) {
        F.p(takeWhile, "$this$takeWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(takeWhile);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(takeWhile, i4);
            if (!predicate.C(x0.e(p4)).booleanValue()) {
                break;
            }
            arrayList.add(x0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V> Map<t0, V> s0(int[] associateWith, l<? super t0, ? extends V> valueSelector) {
        int j4;
        int u3;
        F.p(associateWith, "$this$associateWith");
        F.p(valueSelector, "valueSelector");
        j4 = X.j(u0.r(associateWith));
        u3 = u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        int r4 = u0.r(associateWith);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(associateWith, i4);
            linkedHashMap.put(t0.e(p4), valueSelector.C(t0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] s1(long[] copyOf, int i4) {
        F.p(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, i4);
        F.o(copyOf2, "copyOf(...)");
        return y0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super p0>> C s2(byte[] filterIndexedTo, C destination, p<? super Integer, ? super p0, Boolean> predicate) {
        F.p(filterIndexedTo, "$this$filterIndexedTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = q0.r(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            byte p4 = q0.p(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), p0.e(p4)).booleanValue()) {
                destination.add(p0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C s3(int[] flatMapTo, C destination, l<? super t0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapTo, "$this$flatMapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = u0.r(flatMapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(destination, transform.C(t0.e(u0.p(flatMapTo, i4))));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K> Map<K, List<p0>> s4(byte[] groupBy, l<? super p0, ? extends K> keySelector) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = q0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(groupBy, i4);
            K C3 = keySelector.C(p0.e(p4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(p0.e(p4));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> s5(long[] mapIndexed, p<? super Integer, ? super x0, ? extends R> transform) {
        F.p(mapIndexed, "$this$mapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(y0.r(mapIndexed));
        int r4 = y0.r(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            arrayList.add(transform.c0(Integer.valueOf(i5), x0.e(y0.p(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final x0 s6(@l3.d long[] maxOrNull) {
        int ve;
        int compare;
        F.p(maxOrNull, "$this$maxOrNull");
        if (y0.u(maxOrNull)) {
            return null;
        }
        long p4 = y0.p(maxOrNull, 0);
        ve = C2101p.ve(maxOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long p5 = y0.p(maxOrNull, it.c());
            compare = Long.compare(p4 ^ Long.MIN_VALUE, p5 ^ Long.MIN_VALUE);
            if (compare < 0) {
                p4 = p5;
            }
        }
        return x0.e(p4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R s7(short[] minOfWithOrNull, Comparator<? super R> comparator, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minOfWithOrNull, "$this$minOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (E0.u(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(D0.e(E0.p(minOfWithOrNull, 0)));
        xe = C2101p.xe(minOfWithOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(D0.e(E0.p(minOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short s8(short[] random) {
        F.p(random, "$this$random");
        return t8(random, Random.f52425E);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> s9(@l3.d long[] reversed) {
        List<x0> Y5;
        List<x0> H3;
        F.p(reversed, "$this$reversed");
        if (y0.u(reversed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Y5 = D.Y5(y0.c(reversed));
        C.r1(Y5);
        return Y5;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final D0 sa(@l3.d short[] singleOrNull) {
        F.p(singleOrNull, "$this$singleOrNull");
        if (E0.r(singleOrNull) == 1) {
            return D0.e(E0.p(singleOrNull, 0));
        }
        return null;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> sb(@l3.d long[] sortedDescending) {
        F.p(sortedDescending, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        F.o(copyOf, "copyOf(...)");
        long[] j4 = y0.j(copyOf);
        Sa(j4);
        return s9(j4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> sc(int[] takeWhile, l<? super t0, Boolean> predicate) {
        F.p(takeWhile, "$this$takeWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(takeWhile);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(takeWhile, i4);
            if (!predicate.C(t0.e(p4)).booleanValue()) {
                break;
            }
            arrayList.add(t0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V> Map<D0, V> t0(short[] associateWith, l<? super D0, ? extends V> valueSelector) {
        int j4;
        int u3;
        F.p(associateWith, "$this$associateWith");
        F.p(valueSelector, "valueSelector");
        j4 = X.j(E0.r(associateWith));
        u3 = u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        int r4 = E0.r(associateWith);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(associateWith, i4);
            linkedHashMap.put(D0.e(p4), valueSelector.C(D0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] t1(short[] copyOf) {
        F.p(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        F.o(copyOf2, "copyOf(...)");
        return E0.j(copyOf2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super x0>> C t2(long[] filterIndexedTo, C destination, p<? super Integer, ? super x0, Boolean> predicate) {
        F.p(filterIndexedTo, "$this$filterIndexedTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = y0.r(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            long p4 = y0.p(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), x0.e(p4)).booleanValue()) {
                destination.add(x0.e(p4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C t3(byte[] flatMapTo, C destination, l<? super p0, ? extends Iterable<? extends R>> transform) {
        F.p(flatMapTo, "$this$flatMapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = q0.r(flatMapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            A.q0(destination, transform.C(p0.e(q0.p(flatMapTo, i4))));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V> Map<K, List<V>> t4(int[] groupBy, l<? super t0, ? extends K> keySelector, l<? super t0, ? extends V> valueTransform) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = u0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(groupBy, i4);
            K C3 = keySelector.C(t0.e(p4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(t0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> List<R> t5(short[] mapIndexed, p<? super Integer, ? super D0, ? extends R> transform) {
        F.p(mapIndexed, "$this$mapIndexed");
        F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(E0.r(mapIndexed));
        int r4 = E0.r(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            arrayList.add(transform.c0(Integer.valueOf(i5), D0.e(E0.p(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final D0 t6(@l3.d short[] maxOrNull) {
        int xe;
        F.p(maxOrNull, "$this$maxOrNull");
        if (E0.u(maxOrNull)) {
            return null;
        }
        short p4 = E0.p(maxOrNull, 0);
        xe = C2101p.xe(maxOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short p5 = E0.p(maxOrNull, it.c());
            if (F.t(p4 & D0.f51794H, 65535 & p5) < 0) {
                p4 = p5;
            }
        }
        return D0.e(p4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2218t
    @N
    @Y(version = "1.4")
    @f
    private static final <R> R t7(int[] minOfWithOrNull, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minOfWithOrNull, "$this$minOfWithOrNull");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        if (u0.u(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.C(t0.e(u0.p(minOfWithOrNull, 0)));
        ue = C2101p.ue(minOfWithOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(t0.e(u0.p(minOfWithOrNull, it.c())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final short t8(@l3.d short[] random, @l3.d Random random2) {
        F.p(random, "$this$random");
        F.p(random2, "random");
        if (!E0.u(random)) {
            return E0.p(random, random2.m(E0.r(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> t9(@l3.d short[] reversed) {
        List<D0> Y5;
        List<D0> H3;
        F.p(reversed, "$this$reversed");
        if (E0.u(reversed)) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Y5 = D.Y5(E0.c(reversed));
        C.r1(Y5);
        return Y5;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final D0 ta(short[] singleOrNull, l<? super D0, Boolean> predicate) {
        F.p(singleOrNull, "$this$singleOrNull");
        F.p(predicate, "predicate");
        int r4 = E0.r(singleOrNull);
        D0 d02 = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(singleOrNull, i4);
            if (predicate.C(D0.e(p4)).booleanValue()) {
                if (z3) {
                    return null;
                }
                d02 = D0.e(p4);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return d02;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> tb(@l3.d short[] sortedDescending) {
        F.p(sortedDescending, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        F.o(copyOf, "copyOf(...)");
        short[] j4 = E0.j(copyOf);
        Va(j4);
        return t9(j4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> tc(short[] takeWhile, l<? super D0, Boolean> predicate) {
        F.p(takeWhile, "$this$takeWhile");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(takeWhile);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(takeWhile, i4);
            if (!predicate.C(D0.e(p4)).booleanValue()) {
                break;
            }
            arrayList.add(D0.e(p4));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V, M extends Map<? super t0, ? super V>> M u0(int[] associateWithTo, M destination, l<? super t0, ? extends V> valueSelector) {
        F.p(associateWithTo, "$this$associateWithTo");
        F.p(destination, "destination");
        F.p(valueSelector, "valueSelector");
        int r4 = u0.r(associateWithTo);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(associateWithTo, i4);
            destination.put(t0.e(p4), valueSelector.C(t0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] u1(long[] copyOfRange, int i4, int i5) {
        long[] copyOfRange2;
        F.p(copyOfRange, "$this$copyOfRange");
        if (m.a(1, 3, 0)) {
            copyOfRange2 = C2100o.k1(copyOfRange, i4, i5);
        } else if (i5 <= copyOfRange.length) {
            copyOfRange2 = Arrays.copyOfRange(copyOfRange, i4, i5);
            F.m(copyOfRange2);
        } else {
            throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + copyOfRange.length);
        }
        return y0.j(copyOfRange2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<p0> u2(byte[] filterNot, l<? super p0, Boolean> predicate) {
        F.p(filterNot, "$this$filterNot");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = q0.r(filterNot);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(filterNot, i4);
            if (!predicate.C(p0.e(p4)).booleanValue()) {
                arrayList.add(p0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R u3(long[] fold, R r4, p<? super R, ? super x0, ? extends R> operation) {
        F.p(fold, "$this$fold");
        F.p(operation, "operation");
        int r5 = y0.r(fold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, x0.e(y0.p(fold, i4)));
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K> Map<K, List<x0>> u4(long[] groupBy, l<? super x0, ? extends K> keySelector) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = y0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(groupBy, i4);
            K C3 = keySelector.C(x0.e(p4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(x0.e(p4));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C u5(int[] mapIndexedTo, C destination, p<? super Integer, ? super t0, ? extends R> transform) {
        F.p(mapIndexedTo, "$this$mapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = u0.r(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            destination.add(transform.c0(Integer.valueOf(i5), t0.e(u0.p(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @InterfaceC2218t
    @i(name = "maxOrThrow-U")
    @Y(version = "1.7")
    public static final byte u6(@l3.d byte[] max) {
        int qe;
        F.p(max, "$this$max");
        if (!q0.u(max)) {
            byte p4 = q0.p(max, 0);
            qe = C2101p.qe(max);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(max, it.c());
                if (F.t(p4 & 255, p5 & 255) < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final t0 u7(@l3.d int[] minOrNull) {
        int ue;
        int compare;
        F.p(minOrNull, "$this$minOrNull");
        if (u0.u(minOrNull)) {
            return null;
        }
        int p4 = u0.p(minOrNull, 0);
        ue = C2101p.ue(minOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int p5 = u0.p(minOrNull, it.c());
            compare = Integer.compare(p4 ^ Integer.MIN_VALUE, p5 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                p4 = p5;
            }
        }
        return t0.e(p4);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final t0 u8(int[] randomOrNull) {
        F.p(randomOrNull, "$this$randomOrNull");
        return v8(randomOrNull, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] u9(int[] reversedArray) {
        int[] ur;
        F.p(reversedArray, "$this$reversedArray");
        ur = C2101p.ur(reversedArray);
        return u0.j(ur);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> ua(@l3.d long[] slice, @l3.d Iterable<Integer> indices) {
        int b02;
        List<x0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(x0.e(y0.p(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int ub(int[] sum) {
        int aw;
        F.p(sum, "$this$sum");
        aw = C2101p.aw(sum);
        return t0.l(aw);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] uc(byte[] toByteArray) {
        F.p(toByteArray, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V, M extends Map<? super p0, ? super V>> M v0(byte[] associateWithTo, M destination, l<? super p0, ? extends V> valueSelector) {
        F.p(associateWithTo, "$this$associateWithTo");
        F.p(destination, "destination");
        F.p(valueSelector, "valueSelector");
        int r4 = q0.r(associateWithTo);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(associateWithTo, i4);
            destination.put(p0.e(p4), valueSelector.C(p0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] v1(byte[] copyOfRange, int i4, int i5) {
        byte[] copyOfRange2;
        F.p(copyOfRange, "$this$copyOfRange");
        if (m.a(1, 3, 0)) {
            copyOfRange2 = C2100o.f1(copyOfRange, i4, i5);
        } else if (i5 <= copyOfRange.length) {
            copyOfRange2 = Arrays.copyOfRange(copyOfRange, i4, i5);
            F.m(copyOfRange2);
        } else {
            throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + copyOfRange.length);
        }
        return q0.j(copyOfRange2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<x0> v2(long[] filterNot, l<? super x0, Boolean> predicate) {
        F.p(filterNot, "$this$filterNot");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = y0.r(filterNot);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(filterNot, i4);
            if (!predicate.C(x0.e(p4)).booleanValue()) {
                arrayList.add(x0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R v3(byte[] fold, R r4, p<? super R, ? super p0, ? extends R> operation) {
        F.p(fold, "$this$fold");
        F.p(operation, "operation");
        int r5 = q0.r(fold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, p0.e(q0.p(fold, i4)));
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, V> Map<K, List<V>> v4(byte[] groupBy, l<? super p0, ? extends K> keySelector, l<? super p0, ? extends V> valueTransform) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = q0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(groupBy, i4);
            K C3 = keySelector.C(p0.e(p4));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(p0.e(p4)));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C v5(short[] mapIndexedTo, C destination, p<? super Integer, ? super D0, ? extends R> transform) {
        F.p(mapIndexedTo, "$this$mapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = E0.r(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            destination.add(transform.c0(Integer.valueOf(i5), D0.e(E0.p(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @InterfaceC2218t
    @i(name = "maxOrThrow-U")
    @Y(version = "1.7")
    public static final int v6(@l3.d int[] max) {
        int ue;
        int compare;
        F.p(max, "$this$max");
        if (!u0.u(max)) {
            int p4 = u0.p(max, 0);
            ue = C2101p.ue(max);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(max, it.c());
                compare = Integer.compare(p4 ^ Integer.MIN_VALUE, p5 ^ Integer.MIN_VALUE);
                if (compare < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final p0 v7(@l3.d byte[] minOrNull) {
        int qe;
        F.p(minOrNull, "$this$minOrNull");
        if (q0.u(minOrNull)) {
            return null;
        }
        byte p4 = q0.p(minOrNull, 0);
        qe = C2101p.qe(minOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte p5 = q0.p(minOrNull, it.c());
            if (F.t(p4 & 255, p5 & 255) > 0) {
                p4 = p5;
            }
        }
        return p0.e(p4);
    }

    @e
    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final t0 v8(@l3.d int[] randomOrNull, @l3.d Random random) {
        F.p(randomOrNull, "$this$randomOrNull");
        F.p(random, "random");
        if (u0.u(randomOrNull)) {
            return null;
        }
        return t0.e(u0.p(randomOrNull, random.m(u0.r(randomOrNull))));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte[] v9(byte[] reversedArray) {
        byte[] qr;
        F.p(reversedArray, "$this$reversedArray");
        qr = C2101p.qr(reversedArray);
        return q0.j(qr);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> va(@l3.d int[] slice, @l3.d Iterable<Integer> indices) {
        int b02;
        List<t0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(t0.e(u0.p(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int vb(byte[] sum) {
        F.p(sum, "$this$sum");
        int l4 = t0.l(0);
        int r4 = q0.r(sum);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = t0.l(l4 + t0.l(q0.p(sum, i4) & 255));
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] vc(int[] toIntArray) {
        F.p(toIntArray, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V, M extends Map<? super x0, ? super V>> M w0(long[] associateWithTo, M destination, l<? super x0, ? extends V> valueSelector) {
        F.p(associateWithTo, "$this$associateWithTo");
        F.p(destination, "destination");
        F.p(valueSelector, "valueSelector");
        int r4 = y0.r(associateWithTo);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(associateWithTo, i4);
            destination.put(x0.e(p4), valueSelector.C(x0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] w1(short[] copyOfRange, int i4, int i5) {
        short[] copyOfRange2;
        F.p(copyOfRange, "$this$copyOfRange");
        if (m.a(1, 3, 0)) {
            copyOfRange2 = C2100o.m1(copyOfRange, i4, i5);
        } else if (i5 <= copyOfRange.length) {
            copyOfRange2 = Arrays.copyOfRange(copyOfRange, i4, i5);
            F.m(copyOfRange2);
        } else {
            throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + copyOfRange.length);
        }
        return E0.j(copyOfRange2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<t0> w2(int[] filterNot, l<? super t0, Boolean> predicate) {
        F.p(filterNot, "$this$filterNot");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = u0.r(filterNot);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(filterNot, i4);
            if (!predicate.C(t0.e(p4)).booleanValue()) {
                arrayList.add(t0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R w3(int[] fold, R r4, p<? super R, ? super t0, ? extends R> operation) {
        F.p(fold, "$this$fold");
        F.p(operation, "operation");
        int r5 = u0.r(fold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, t0.e(u0.p(fold, i4)));
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K> Map<K, List<t0>> w4(int[] groupBy, l<? super t0, ? extends K> keySelector) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = u0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(groupBy, i4);
            K C3 = keySelector.C(t0.e(p4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(t0.e(p4));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C w5(byte[] mapIndexedTo, C destination, p<? super Integer, ? super p0, ? extends R> transform) {
        F.p(mapIndexedTo, "$this$mapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = q0.r(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            destination.add(transform.c0(Integer.valueOf(i5), p0.e(q0.p(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @InterfaceC2218t
    @i(name = "maxOrThrow-U")
    @Y(version = "1.7")
    public static final long w6(@l3.d long[] max) {
        int ve;
        int compare;
        F.p(max, "$this$max");
        if (!y0.u(max)) {
            long p4 = y0.p(max, 0);
            ve = C2101p.ve(max);
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(max, it.c());
                compare = Long.compare(p4 ^ Long.MIN_VALUE, p5 ^ Long.MIN_VALUE);
                if (compare < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final x0 w7(@l3.d long[] minOrNull) {
        int ve;
        int compare;
        F.p(minOrNull, "$this$minOrNull");
        if (y0.u(minOrNull)) {
            return null;
        }
        long p4 = y0.p(minOrNull, 0);
        ve = C2101p.ve(minOrNull);
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long p5 = y0.p(minOrNull, it.c());
            compare = Long.compare(p4 ^ Long.MIN_VALUE, p5 ^ Long.MIN_VALUE);
            if (compare > 0) {
                p4 = p5;
            }
        }
        return x0.e(p4);
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final p0 w8(byte[] randomOrNull) {
        F.p(randomOrNull, "$this$randomOrNull");
        return z8(randomOrNull, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] w9(long[] reversedArray) {
        long[] vr;
        F.p(reversedArray, "$this$reversedArray");
        vr = C2101p.vr(reversedArray);
        return y0.j(vr);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> wa(@l3.d short[] slice, @l3.d Iterable<Integer> indices) {
        int b02;
        List<D0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(D0.e(E0.p(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long wb(long[] sum) {
        long cw;
        F.p(sum, "$this$sum");
        cw = C2101p.cw(sum);
        return x0.l(cw);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long[] wc(long[] toLongArray) {
        F.p(toLongArray, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <V, M extends Map<? super D0, ? super V>> M x0(short[] associateWithTo, M destination, l<? super D0, ? extends V> valueSelector) {
        F.p(associateWithTo, "$this$associateWithTo");
        F.p(destination, "destination");
        F.p(valueSelector, "valueSelector");
        int r4 = E0.r(associateWithTo);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(associateWithTo, i4);
            destination.put(D0.e(p4), valueSelector.C(D0.e(p4)));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int[] x1(int[] copyOfRange, int i4, int i5) {
        int[] copyOfRange2;
        F.p(copyOfRange, "$this$copyOfRange");
        if (m.a(1, 3, 0)) {
            copyOfRange2 = C2100o.j1(copyOfRange, i4, i5);
        } else if (i5 <= copyOfRange.length) {
            copyOfRange2 = Arrays.copyOfRange(copyOfRange, i4, i5);
            F.m(copyOfRange2);
        } else {
            throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + copyOfRange.length);
        }
        return u0.j(copyOfRange2);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final List<D0> x2(short[] filterNot, l<? super D0, Boolean> predicate) {
        F.p(filterNot, "$this$filterNot");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int r4 = E0.r(filterNot);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(filterNot, i4);
            if (!predicate.C(D0.e(p4)).booleanValue()) {
                arrayList.add(D0.e(p4));
            }
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R x3(short[] fold, R r4, p<? super R, ? super D0, ? extends R> operation) {
        F.p(fold, "$this$fold");
        F.p(operation, "operation");
        int r5 = E0.r(fold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, D0.e(E0.p(fold, i4)));
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K> Map<K, List<D0>> x4(short[] groupBy, l<? super D0, ? extends K> keySelector) {
        F.p(groupBy, "$this$groupBy");
        F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r4 = E0.r(groupBy);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(groupBy, i4);
            K C3 = keySelector.C(D0.e(p4));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(D0.e(p4));
        }
        return linkedHashMap;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C x5(long[] mapIndexedTo, C destination, p<? super Integer, ? super x0, ? extends R> transform) {
        F.p(mapIndexedTo, "$this$mapIndexedTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = y0.r(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r4) {
            destination.add(transform.c0(Integer.valueOf(i5), x0.e(y0.p(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @InterfaceC2218t
    @i(name = "maxOrThrow-U")
    @Y(version = "1.7")
    public static final short x6(@l3.d short[] max) {
        int xe;
        F.p(max, "$this$max");
        if (!E0.u(max)) {
            short p4 = E0.p(max, 0);
            xe = C2101p.xe(max);
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(max, it.c());
                if (F.t(p4 & D0.f51794H, 65535 & p5) < 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final D0 x7(@l3.d short[] minOrNull) {
        int xe;
        F.p(minOrNull, "$this$minOrNull");
        if (E0.u(minOrNull)) {
            return null;
        }
        short p4 = E0.p(minOrNull, 0);
        xe = C2101p.xe(minOrNull);
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short p5 = E0.p(minOrNull, it.c());
            if (F.t(p4 & D0.f51794H, 65535 & p5) > 0) {
                p4 = p5;
            }
        }
        return D0.e(p4);
    }

    @e
    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final x0 x8(@l3.d long[] randomOrNull, @l3.d Random random) {
        F.p(randomOrNull, "$this$randomOrNull");
        F.p(random, "random");
        if (y0.u(randomOrNull)) {
            return null;
        }
        return x0.e(y0.p(randomOrNull, random.m(y0.r(randomOrNull))));
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] x9(short[] reversedArray) {
        short[] xr;
        F.p(reversedArray, "$this$reversedArray");
        xr = C2101p.xr(reversedArray);
        return E0.j(xr);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> xa(@l3.d byte[] slice, @l3.d Iterable<Integer> indices) {
        int b02;
        List<p0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(p0.e(q0.p(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int xb(short[] sum) {
        F.p(sum, "$this$sum");
        int l4 = t0.l(0);
        int r4 = E0.r(sum);
        for (int i4 = 0; i4 < r4; i4++) {
            l4 = t0.l(l4 + t0.l(E0.p(sum, i4) & D0.f51794H));
        }
        return l4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short[] xc(short[] toShortArray) {
        F.p(toShortArray, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int y0(int[] component1) {
        F.p(component1, "$this$component1");
        return u0.p(component1, 0);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int y1(byte[] count, l<? super p0, Boolean> predicate) {
        F.p(count, "$this$count");
        F.p(predicate, "predicate");
        int r4 = q0.r(count);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            if (predicate.C(p0.e(q0.p(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super x0>> C y2(long[] filterNotTo, C destination, l<? super x0, Boolean> predicate) {
        F.p(filterNotTo, "$this$filterNotTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = y0.r(filterNotTo);
        for (int i4 = 0; i4 < r4; i4++) {
            long p4 = y0.p(filterNotTo, i4);
            if (!predicate.C(x0.e(p4)).booleanValue()) {
                destination.add(x0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R y3(byte[] foldIndexed, R r4, q<? super Integer, ? super R, ? super p0, ? extends R> operation) {
        F.p(foldIndexed, "$this$foldIndexed");
        F.p(operation, "operation");
        int r5 = q0.r(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r5) {
            r4 = operation.z(Integer.valueOf(i5), r4, p0.e(q0.p(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, M extends Map<? super K, List<t0>>> M y4(int[] groupByTo, M destination, l<? super t0, ? extends K> keySelector) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        int r4 = u0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            int p4 = u0.p(groupByTo, i4);
            K C3 = keySelector.C(t0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(t0.e(p4));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C y5(long[] mapTo, C destination, l<? super x0, ? extends R> transform) {
        F.p(mapTo, "$this$mapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = y0.r(mapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            destination.add(transform.C(x0.e(y0.p(mapTo, i4))));
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final p0 y6(@l3.d byte[] maxWithOrNull, @l3.d Comparator<? super p0> comparator) {
        int qe;
        F.p(maxWithOrNull, "$this$maxWithOrNull");
        F.p(comparator, "comparator");
        if (q0.u(maxWithOrNull)) {
            return null;
        }
        byte p4 = q0.p(maxWithOrNull, 0);
        qe = C2101p.qe(maxWithOrNull);
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte p5 = q0.p(maxWithOrNull, it.c());
            if (comparator.compare(p0.e(p4), p0.e(p5)) < 0) {
                p4 = p5;
            }
        }
        return p0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minOrThrow-U")
    @Y(version = "1.7")
    public static final byte y7(@l3.d byte[] min) {
        int qe;
        F.p(min, "$this$min");
        if (!q0.u(min)) {
            byte p4 = q0.p(min, 0);
            qe = C2101p.qe(min);
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(min, it.c());
                if (F.t(p4 & 255, p5 & 255) > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final x0 y8(long[] randomOrNull) {
        F.p(randomOrNull, "$this$randomOrNull");
        return x8(randomOrNull, Random.f52425E);
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> y9(long[] runningFold, R r4, p<? super R, ? super x0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFold, "$this$runningFold");
        F.p(operation, "operation");
        if (y0.u(runningFold)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(y0.r(runningFold) + 1);
        arrayList.add(r4);
        int r5 = y0.r(runningFold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, x0.e(y0.p(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> ya(@l3.d short[] slice, @l3.d kotlin.ranges.l indices) {
        short[] m12;
        List<D0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        m12 = C2100o.m1(slice, indices.c().intValue(), indices.k().intValue() + 1);
        return kotlin.collections.unsigned.b.d(E0.j(m12));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final int yb(byte[] sumBy, l<? super p0, t0> selector) {
        F.p(sumBy, "$this$sumBy");
        F.p(selector, "selector");
        int r4 = q0.r(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 = t0.l(i4 + selector.C(p0.e(q0.p(sumBy, i5))).l0());
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final t0[] yc(@l3.d int[] toTypedArray) {
        F.p(toTypedArray, "$this$toTypedArray");
        int r4 = u0.r(toTypedArray);
        t0[] t0VarArr = new t0[r4];
        for (int i4 = 0; i4 < r4; i4++) {
            t0VarArr[i4] = t0.e(u0.p(toTypedArray, i4));
        }
        return t0VarArr;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte z0(byte[] component1) {
        F.p(component1, "$this$component1");
        return q0.p(component1, 0);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int z1(long[] count, l<? super x0, Boolean> predicate) {
        F.p(count, "$this$count");
        F.p(predicate, "predicate");
        int r4 = y0.r(count);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            if (predicate.C(x0.e(y0.p(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <C extends Collection<? super D0>> C z2(short[] filterNotTo, C destination, l<? super D0, Boolean> predicate) {
        F.p(filterNotTo, "$this$filterNotTo");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int r4 = E0.r(filterNotTo);
        for (int i4 = 0; i4 < r4; i4++) {
            short p4 = E0.p(filterNotTo, i4);
            if (!predicate.C(D0.e(p4)).booleanValue()) {
                destination.add(D0.e(p4));
            }
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R> R z3(short[] foldIndexed, R r4, q<? super Integer, ? super R, ? super D0, ? extends R> operation) {
        F.p(foldIndexed, "$this$foldIndexed");
        F.p(operation, "operation");
        int r5 = E0.r(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < r5) {
            r4 = operation.z(Integer.valueOf(i5), r4, D0.e(E0.p(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <K, M extends Map<? super K, List<p0>>> M z4(byte[] groupByTo, M destination, l<? super p0, ? extends K> keySelector) {
        F.p(groupByTo, "$this$groupByTo");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        int r4 = q0.r(groupByTo);
        for (int i4 = 0; i4 < r4; i4++) {
            byte p4 = q0.p(groupByTo, i4);
            K C3 = keySelector.C(p0.e(p4));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(p0.e(p4));
        }
        return destination;
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final <R, C extends Collection<? super R>> C z5(short[] mapTo, C destination, l<? super D0, ? extends R> transform) {
        F.p(mapTo, "$this$mapTo");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int r4 = E0.r(mapTo);
        for (int i4 = 0; i4 < r4; i4++) {
            destination.add(transform.C(D0.e(E0.p(mapTo, i4))));
        }
        return destination;
    }

    @e
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final t0 z6(@l3.d int[] maxWithOrNull, @l3.d Comparator<? super t0> comparator) {
        int ue;
        F.p(maxWithOrNull, "$this$maxWithOrNull");
        F.p(comparator, "comparator");
        if (u0.u(maxWithOrNull)) {
            return null;
        }
        int p4 = u0.p(maxWithOrNull, 0);
        ue = C2101p.ue(maxWithOrNull);
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int p5 = u0.p(maxWithOrNull, it.c());
            if (comparator.compare(t0.e(p4), t0.e(p5)) < 0) {
                p4 = p5;
            }
        }
        return t0.e(p4);
    }

    @InterfaceC2218t
    @i(name = "minOrThrow-U")
    @Y(version = "1.7")
    public static final int z7(@l3.d int[] min) {
        int ue;
        int compare;
        F.p(min, "$this$min");
        if (!u0.u(min)) {
            int p4 = u0.p(min, 0);
            ue = C2101p.ue(min);
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(min, it.c());
                compare = Integer.compare(p4 ^ Integer.MIN_VALUE, p5 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    p4 = p5;
                }
            }
            return p4;
        }
        throw new NoSuchElementException();
    }

    @e
    @K0(markerClass = {r.class})
    @InterfaceC2218t
    @Y(version = "1.4")
    public static final p0 z8(@l3.d byte[] randomOrNull, @l3.d Random random) {
        F.p(randomOrNull, "$this$randomOrNull");
        F.p(random, "random");
        if (q0.u(randomOrNull)) {
            return null;
        }
        return p0.e(q0.p(randomOrNull, random.m(q0.r(randomOrNull))));
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    @f
    private static final <R> List<R> z9(byte[] runningFold, R r4, p<? super R, ? super p0, ? extends R> operation) {
        List<R> k4;
        F.p(runningFold, "$this$runningFold");
        F.p(operation, "operation");
        if (q0.u(runningFold)) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(q0.r(runningFold) + 1);
        arrayList.add(r4);
        int r5 = q0.r(runningFold);
        for (int i4 = 0; i4 < r5; i4++) {
            r4 = operation.c0(r4, p0.e(q0.p(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> za(@l3.d long[] slice, @l3.d kotlin.ranges.l indices) {
        long[] k12;
        List<x0> H3;
        F.p(slice, "$this$slice");
        F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        k12 = C2100o.k1(slice, indices.c().intValue(), indices.k().intValue() + 1);
        return kotlin.collections.unsigned.b.c(y0.j(k12));
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.3")
    @f
    private static final int zb(long[] sumBy, l<? super x0, t0> selector) {
        F.p(sumBy, "$this$sumBy");
        F.p(selector, "selector");
        int r4 = y0.r(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < r4; i5++) {
            i4 = t0.l(i4 + selector.C(x0.e(y0.p(sumBy, i5))).l0());
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final p0[] zc(@l3.d byte[] toTypedArray) {
        F.p(toTypedArray, "$this$toTypedArray");
        int r4 = q0.r(toTypedArray);
        p0[] p0VarArr = new p0[r4];
        for (int i4 = 0; i4 < r4; i4++) {
            p0VarArr[i4] = p0.e(q0.p(toTypedArray, i4));
        }
        return p0VarArr;
    }
}
