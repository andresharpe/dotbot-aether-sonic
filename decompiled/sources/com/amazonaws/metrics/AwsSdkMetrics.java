package com.amazonaws.metrics;

import com.amazonaws.auth.InterfaceC1029g;
import com.amazonaws.auth.InterfaceC1030h;
import com.amazonaws.auth.z;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.c;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSServiceMetrics;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public enum AwsSdkMetrics {
    ;

    public static final String AWS_CREDENTAIL_PROPERTIES_FILE = "credentialFile";
    public static final String CLOUDWATCH_REGION = "cloudwatchRegion";
    private static final boolean DEFAULT_METRICS_ENABLED;
    private static final String DEFAULT_METRIC_COLLECTOR_FACTORY = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";
    public static final String DEFAULT_METRIC_NAMESPACE = "AWSSDK/Java";
    public static final String EXCLUDE_MACHINE_METRICS = "excludeMachineMetrics";
    public static final String HOST_METRIC_NAME = "hostMetricName";
    public static final String INCLUDE_PER_HOST_METRICS = "includePerHostMetrics";
    public static final String JVM_METRIC_NAME = "jvmMetricName";
    private static final String MBEAN_OBJECT_NAME = "com.amazonaws.management:type=" + AwsSdkMetrics.class.getSimpleName();
    public static final String METRIC_NAME_SPACE = "metricNameSpace";
    public static final String METRIC_QUEUE_SIZE = "metricQueueSize";
    public static final String QUEUE_POLL_TIMEOUT_MILLI = "getQueuePollTimeoutMilli";
    private static final int QUEUE_POLL_TIMEOUT_MILLI_MINUMUM = 1000;
    private static final b REGISTRY;
    public static final String USE_SINGLE_METRIC_NAMESPACE = "useSingleMetricNamespace";
    private static volatile String credentialFile;
    private static volatile InterfaceC1030h credentialProvider;
    private static boolean dirtyEnabling;
    private static volatile String hostMetricName;
    private static volatile String jvmMetricName;
    private static volatile boolean machineMetricsExcluded;
    private static volatile c mc;
    private static volatile String metricNameSpace;
    private static volatile Integer metricQueueSize;
    private static volatile boolean perHostMetricsIncluded;
    private static volatile Long queuePollTimeoutMilli;
    private static volatile Regions region;
    private static volatile boolean singleMetricNamespace;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC1030h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f23815a;

        a(z zVar) {
            this.f23815a = zVar;
        }

        @Override // com.amazonaws.auth.InterfaceC1030h
        public InterfaceC1029g a() {
            return this.f23815a;
        }

        @Override // com.amazonaws.auth.InterfaceC1030h
        public void refresh() {
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Set<f> f23816a;

        /* renamed from: b, reason: collision with root package name */
        private volatile Set<f> f23817b;

        b() {
            HashSet hashSet = new HashSet();
            this.f23816a = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientPoolAvailableCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientPoolLeasedCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientPoolPendingCount);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            f();
        }

        private void f() {
            this.f23817b = Collections.unmodifiableSet(new HashSet(this.f23816a));
        }

        public boolean a(f fVar) {
            boolean add;
            synchronized (this.f23816a) {
                try {
                    add = this.f23816a.add(fVar);
                    if (add) {
                        f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return add;
        }

        public <T extends f> boolean b(Collection<T> collection) {
            boolean addAll;
            synchronized (this.f23816a) {
                try {
                    addAll = this.f23816a.addAll(collection);
                    if (addAll) {
                        f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return addAll;
        }

        public Set<f> c() {
            return this.f23817b;
        }

        public boolean d(f fVar) {
            boolean remove;
            synchronized (this.f23816a) {
                try {
                    remove = this.f23816a.remove(fVar);
                    if (remove) {
                        f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return remove;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:17:0x0005, B:11:0x001e, B:13:0x0029, B:14:0x002c, B:4:0x000e, B:6:0x0016, B:10:0x001a), top: B:16:0x0005 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T extends com.amazonaws.metrics.f> void e(java.util.Collection<T> r3) {
            /*
                r2 = this;
                java.util.Set<com.amazonaws.metrics.f> r0 = r2.f23816a
                monitor-enter(r0)
                if (r3 == 0) goto Le
                int r1 = r3.size()     // Catch: java.lang.Throwable -> Lc
                if (r1 != 0) goto L1e
                goto Le
            Lc:
                r3 = move-exception
                goto L2e
            Le:
                java.util.Set<com.amazonaws.metrics.f> r1 = r2.f23816a     // Catch: java.lang.Throwable -> Lc
                int r1 = r1.size()     // Catch: java.lang.Throwable -> Lc
                if (r1 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            L18:
                if (r3 != 0) goto L1e
                java.util.List r3 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lc
            L1e:
                java.util.Set<com.amazonaws.metrics.f> r1 = r2.f23816a     // Catch: java.lang.Throwable -> Lc
                r1.clear()     // Catch: java.lang.Throwable -> Lc
                boolean r3 = r2.b(r3)     // Catch: java.lang.Throwable -> Lc
                if (r3 != 0) goto L2c
                r2.f()     // Catch: java.lang.Throwable -> Lc
            L2c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            L2e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.metrics.AwsSdkMetrics.b.e(java.util.Collection):void");
        }
    }

    static {
        boolean z3;
        metricNameSpace = DEFAULT_METRIC_NAMESPACE;
        String property = System.getProperty(com.amazonaws.i.f23715b);
        if (property != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        DEFAULT_METRICS_ENABLED = z3;
        if (z3) {
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (String str : property.split(",")) {
                String trim = str.trim();
                if (!z4 && EXCLUDE_MACHINE_METRICS.equals(trim)) {
                    z4 = true;
                } else if (!z5 && INCLUDE_PER_HOST_METRICS.equals(trim)) {
                    z5 = true;
                } else if (!z6 && USE_SINGLE_METRIC_NAMESPACE.equals(trim)) {
                    z6 = true;
                } else {
                    String[] split = trim.split("=");
                    if (split.length == 2) {
                        String trim2 = split[0].trim();
                        String trim3 = split[1].trim();
                        try {
                            if (AWS_CREDENTAIL_PROPERTIES_FILE.equals(trim2)) {
                                E(trim3);
                            } else if (CLOUDWATCH_REGION.equals(trim2)) {
                                region = Regions.b(trim3);
                            } else if (METRIC_QUEUE_SIZE.equals(trim2)) {
                                Integer num = new Integer(trim3);
                                if (num.intValue() >= 1) {
                                    metricQueueSize = num;
                                } else {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                            } else if (QUEUE_POLL_TIMEOUT_MILLI.equals(trim2)) {
                                Long l4 = new Long(trim3);
                                if (l4.intValue() >= 1000) {
                                    queuePollTimeoutMilli = l4;
                                } else {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                            } else if (METRIC_NAME_SPACE.equals(trim2)) {
                                metricNameSpace = trim3;
                            } else if (JVM_METRIC_NAME.equals(trim2)) {
                                jvmMetricName = trim3;
                            } else if (HOST_METRIC_NAME.equals(trim2)) {
                                hostMetricName = trim3;
                            } else {
                                LogFactory.c(AwsSdkMetrics.class).a("Ignoring unrecognized parameter: " + trim);
                            }
                        } catch (Exception e4) {
                            LogFactory.c(AwsSdkMetrics.class).b("Ignoring failure", e4);
                        }
                    } else {
                        continue;
                    }
                }
            }
            machineMetricsExcluded = z4;
            perHostMetricsIncluded = z5;
            singleMetricNamespace = z6;
        }
        REGISTRY = new b();
    }

    public static boolean A() {
        return singleMetricNamespace;
    }

    public static boolean B(f fVar) {
        if (fVar == null) {
            return false;
        }
        return REGISTRY.d(fVar);
    }

    public static <T extends f> void C(Collection<T> collection) {
        REGISTRY.e(collection);
    }

    public static void D(String str) throws IOException {
        E(str);
    }

    private static void E(String str) throws IOException {
        z zVar = new z(new File(str));
        synchronized (AwsSdkMetrics.class) {
            credentialProvider = new a(zVar);
            credentialFile = str;
        }
    }

    public static synchronized void F(InterfaceC1030h interfaceC1030h) {
        synchronized (AwsSdkMetrics.class) {
            credentialProvider = interfaceC1030h;
        }
    }

    public static void G(String str) {
        hostMetricName = str;
    }

    public static void H(String str) {
        jvmMetricName = str;
    }

    public static void I(boolean z3) {
        machineMetricsExcluded = z3;
    }

    public static synchronized void J(c cVar) {
        synchronized (AwsSdkMetrics.class) {
            c cVar2 = mc;
            mc = cVar;
            if (cVar2 != null) {
                cVar2.e();
            }
        }
    }

    public static void K(String str) {
        if (str != null && str.trim().length() != 0) {
            metricNameSpace = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void L(Integer num) {
        metricQueueSize = num;
    }

    public static void M(boolean z3) {
        perHostMetricsIncluded = z3;
    }

    public static void N(Long l4) {
        queuePollTimeoutMilli = l4;
    }

    public static void O(Regions regions) {
        region = regions;
    }

    public static void P(boolean z3) {
        singleMetricNamespace = z3;
    }

    public static boolean b(f fVar) {
        if (fVar == null) {
            return false;
        }
        return REGISTRY.a(fVar);
    }

    public static <T extends f> boolean e(Collection<T> collection) {
        if (collection != null && collection.size() != 0) {
            return REGISTRY.b(collection);
        }
        return false;
    }

    public static void f() {
        J(c.f23822a);
    }

    public static synchronized boolean g() {
        synchronized (AwsSdkMetrics.class) {
            try {
                if (mc != null) {
                    if (!mc.c()) {
                    }
                    return false;
                }
                if (!dirtyEnabling) {
                    dirtyEnabling = true;
                    try {
                        try {
                            c a4 = ((c.b) Class.forName(DEFAULT_METRIC_COLLECTOR_FACTORY).newInstance()).a();
                            if (a4 != null) {
                                J(a4);
                                return true;
                            }
                        } catch (Exception e4) {
                            LogFactory.c(AwsSdkMetrics.class).j("Failed to enable the default metrics", e4);
                        }
                        return false;
                    } finally {
                        dirtyEnabling = false;
                    }
                }
                throw new IllegalStateException("Reentrancy is not allowed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String i() {
        return credentialFile;
    }

    public static InterfaceC1030h j() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(DEFAULT_METRIC_COLLECTOR_FACTORY)) {
                return credentialProvider;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.c(AwsSdkMetrics.class).j("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    public static String k() {
        return hostMetricName;
    }

    static c l() {
        return mc;
    }

    public static String m() {
        return jvmMetricName;
    }

    public static <T extends c> T n() {
        if (mc == null && v()) {
            g();
        }
        if (mc == null) {
            return (T) c.f23822a;
        }
        return (T) mc;
    }

    public static String o() {
        return metricNameSpace;
    }

    public static Integer p() {
        return metricQueueSize;
    }

    public static Set<f> q() {
        return REGISTRY.c();
    }

    public static Long r() {
        return queuePollTimeoutMilli;
    }

    public static Regions s() {
        return region;
    }

    public static <T extends g> T t() {
        if (mc == null && v()) {
            g();
        }
        if (mc == null) {
            return (T) g.f23826a;
        }
        return (T) mc.a();
    }

    public static <T extends j> T u() {
        if (mc == null && v()) {
            g();
        }
        if (mc == null) {
            return (T) j.f23830a;
        }
        return (T) mc.b();
    }

    public static boolean v() {
        return DEFAULT_METRICS_ENABLED;
    }

    public static boolean w() {
        return machineMetricsExcluded;
    }

    public static boolean x() {
        c cVar = mc;
        if (cVar != null && cVar.c()) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        String trim;
        if (perHostMetricsIncluded) {
            return true;
        }
        String str = hostMetricName;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (trim.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean z() {
        return perHostMetricsIncluded;
    }
}
