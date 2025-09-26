class _2187MinimumTimetoCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = (long) 1e14;
        long result = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canComplete(time, mid, totalTrips)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private boolean canComplete(int[] time, long givenTime, int totalTrips) {
        long trips = 0;
        for (int t : time) {
            trips += givenTime / t;
            if (trips >= totalTrips) return true;
        }
        return trips >= totalTrips;
    }
}
