(ns linq-2-clojure.t-core
  (:use midje.sweet)
  (:require [linq-2-clojure.linq40 :refer :all]
            [linq-2-clojure.linq41 :refer :all]
            [linq-2-clojure.linq91 :refer :all]
            ))




(fact "example 40"
    (with-out-str (linq40)) => 
"Numbers with a remainder of 0 when divided by 5:
5
0
Numbers with a remainder of 4 when divided by 5:
4
9
Numbers with a remainder of 1 when divided by 5:
1
6
Numbers with a remainder of 3 when divided by 5:
3
8
Numbers with a remainder of 2 when divided by 5:
7
2
")

(fact "example 41"
      (with-out-str (linq41)) =>
"Words that start with the letter 'b':
blueberry
banana
Words that start with the letter 'c':
chimpanzee
cheese
Words that start with the letter 'a':
abacus
apple
")

(fact "example 91"
  (linq91) =>
[
 {:Category "Beverages"      :AveragePrice 37.979166666666666666666666667}
 {:Category "Condiments"     :AveragePrice 23.0625}
 {:Category "Produce"        :AveragePrice 32.3700}
 {:Category "Meat/Poultry"   :AveragePrice 54.006666666666666666666666667}
 {:Category "Seafood"        :AveragePrice 20.6825}
 {:Category "Dairy Products" :AveragePrice 28.7300}
 {:Category "Confections"    :AveragePrice 25.1600}
 {:Category "Grains/Cereals" :AveragePrice 20.2500}
]
  )
