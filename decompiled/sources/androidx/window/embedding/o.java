package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
final class o implements ActivityEmbeddingComponent {
    public void a(@l3.d Set<EmbeddingRule> splitRules) {
        F.p(splitRules, "splitRules");
    }

    public void b(@l3.d Consumer<List<SplitInfo>> consumer) {
        F.p(consumer, "consumer");
    }
}
