(require '[cljs.build.api :as b])

(b/build "src" {:main 'bugrep.main1
                :output-to "main.js"
                :output-dir "out"
                :target :nodejs
                :verbose true})
