(defproject petrol "0.1.4"
  :description "A simple event-handling framework for ClojureScript projects."
  :url "https://github.com/krisajenkins/petrol"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [org.clojure/core.async "0.3.465"]
                 [bidi "2.1.2"] ;[bidi "1.24.0"]
                 [com.cemerick/url "0.1.1"]
                 [kibu/pushy "0.3.8"]
                 ]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.14"] ; enable this for emacs/cider
            ]

  :cljsbuild {:builds {:petrol {:source-paths ["src"]
                                :compiler {:main petrol.core
                                           :asset-path "js/compiled/out"
                                           :output-to "resources/public/js/compiled/petrol.js"
                                           :output-dir "resources/public/js/compiled/out"
                                           :optimizations :none}}}}


  :figwheel {:repl true
             :nrepl-port 7888})
