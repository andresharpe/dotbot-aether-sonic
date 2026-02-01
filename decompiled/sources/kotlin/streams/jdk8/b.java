package kotlin.streams.jdk8;

import W2.i;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.Y;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.sequences.m;

@i(name = "StreamsKt")
/* loaded from: classes2.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stream f52697a;

        public a(Stream stream) {
            this.f52697a = stream;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            Iterator<T> it = this.f52697a.iterator();
            F.o(it, "iterator(...)");
            return it;
        }
    }

    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0470b implements m<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntStream f52698a;

        public C0470b(IntStream intStream) {
            this.f52698a = intStream;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f52698a.iterator();
            F.o(it, "iterator(...)");
            return it;
        }
    }

    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements m<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LongStream f52699a;

        public c(LongStream longStream) {
            this.f52699a = longStream;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f52699a.iterator();
            F.o(it, "iterator(...)");
            return it;
        }
    }

    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class d implements m<Double> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DoubleStream f52700a;

        public d(DoubleStream doubleStream) {
            this.f52700a = doubleStream;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f52700a.iterator();
            F.o(it, "iterator(...)");
            return it;
        }
    }

    @l3.d
    @Y(version = "1.2")
    public static final m<Double> b(@l3.d DoubleStream doubleStream) {
        F.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @l3.d
    @Y(version = "1.2")
    public static final m<Integer> c(@l3.d IntStream intStream) {
        F.p(intStream, "<this>");
        return new C0470b(intStream);
    }

    @l3.d
    @Y(version = "1.2")
    public static final m<Long> d(@l3.d LongStream longStream) {
        F.p(longStream, "<this>");
        return new c(longStream);
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T> m<T> e(@l3.d Stream<T> stream) {
        F.p(stream, "<this>");
        return new a(stream);
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T> Stream<T> f(@l3.d final m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Spliterator g4;
                g4 = b.g(m.this);
                return g4;
            }
        }, 16, false);
        F.o(stream, "stream(...)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator g(m this_asStream) {
        F.p(this_asStream, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(this_asStream.iterator(), 16);
    }

    @l3.d
    @Y(version = "1.2")
    public static final List<Double> h(@l3.d DoubleStream doubleStream) {
        List<Double> p4;
        F.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        F.o(array, "toArray(...)");
        p4 = C2100o.p(array);
        return p4;
    }

    @l3.d
    @Y(version = "1.2")
    public static final List<Integer> i(@l3.d IntStream intStream) {
        List<Integer> r4;
        F.p(intStream, "<this>");
        int[] array = intStream.toArray();
        F.o(array, "toArray(...)");
        r4 = C2100o.r(array);
        return r4;
    }

    @l3.d
    @Y(version = "1.2")
    public static final List<Long> j(@l3.d LongStream longStream) {
        List<Long> s4;
        F.p(longStream, "<this>");
        long[] array = longStream.toArray();
        F.o(array, "toArray(...)");
        s4 = C2100o.s(array);
        return s4;
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T> List<T> k(@l3.d Stream<T> stream) {
        F.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        F.o(collect, "collect(...)");
        return (List) collect;
    }
}
