package jetbrains.buildServer.dotTrace.server;

import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public interface MetricComparer {
  boolean isMeasuredValueWithinThresholds(@Nullable final BigDecimal prevValue, @NotNull final BigDecimal measuredValue, @NotNull final ThresholdValue threshold);
}
