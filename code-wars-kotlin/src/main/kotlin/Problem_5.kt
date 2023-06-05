object Problem_5 {
    fun formatDuration(seconds: Int): String {
        var result = ""
        val hours = seconds / 3600
        val minutes = seconds % 3600 / 60
        val seconds = seconds % 60
        result += if (hours > 0) {
            String.format("%02d:%02d:%02d", hours, minutes, seconds)
        } else {
            String.format("%02d:%02d", minutes, seconds)
        }

        return result
    }
}