package androidx.activity.result;

import androidx.annotation.N;
import b.AbstractC1000a;

/* loaded from: classes.dex */
public interface c {
    @N
    <I, O> i<I> registerForActivityResult(@N AbstractC1000a<I, O> abstractC1000a, @N ActivityResultRegistry activityResultRegistry, @N b<O> bVar);

    @N
    <I, O> i<I> registerForActivityResult(@N AbstractC1000a<I, O> abstractC1000a, @N b<O> bVar);
}
