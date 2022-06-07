public class AscendingSequence {
    // создать массив 0, 1, 2, 3, 4 ,5

    public int [] ascendingSequenceAlgorithm(int start, int end, int step) {
    // основные условия построения проверяем
        if (step > 0 && start < end) {
     // создаем новый массив
            int [] result = new int [(end - start + 1)/step];

            for (int i = start; i < result.length; i ++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }
            return result;

         /**   int j = 0;

            for (int i = start; i < result.length; i += step) {
                if (j < result.length) {
                    result[i] = i;
                    j++;
                }
            }
          return result; */

        }
       // если условия не соблюдаются возвращем пустой массив
        return new int [] {};
    }
}
