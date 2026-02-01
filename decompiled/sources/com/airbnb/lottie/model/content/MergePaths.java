package com.airbnb.lottie.model.content;

import androidx.annotation.P;

/* loaded from: classes.dex */
public class MergePaths implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21608a;

    /* renamed from: b, reason: collision with root package name */
    private final MergePathsMode f21609b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21610c;

    /* loaded from: classes.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode b(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z3) {
        this.f21608a = str;
        this.f21609b = mergePathsMode;
        this.f21610c = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    @P
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        if (!jVar.w()) {
            com.airbnb.lottie.utils.f.e("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.airbnb.lottie.animation.content.l(this);
    }

    public MergePathsMode b() {
        return this.f21609b;
    }

    public String c() {
        return this.f21608a;
    }

    public boolean d() {
        return this.f21610c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f21609b + '}';
    }
}
