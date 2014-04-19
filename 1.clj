; Project Euler, Question 1
;
; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.
;
; https://projecteuler.net/problem=1
;
; Code written by Parker Moore (@parkr)

(reduce + (filter (fn [num]
                    (some (fn [modder]
                            (= (mod num modder) 0))
                     [3 5]))
                  (range 100)))
