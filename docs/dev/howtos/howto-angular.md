# Eclipse Winery Angular Apps

TODO: generisch für beide apps

## Prerequisites
1. Install [git](https://git-scm.com)
2. Install and setup [Node.js](https://nodejs.org/en/) and [NPM](https://www.npmjs.com) which ships with Node.js
3. **optional** Install the [Angular-CLI](https://cli.angular.io) globally. 

### Backend
The frontend assumes that the backend server is running on
- the same host,
- the same protocol,
- the same port
- and is reachable under the context `/winery`.

#### Development
If the frontend runs via npm on the development ports, the backend MUST be running at port `8080`.

An example request to the backend, if it runs locally, looks like this: `http://localhost:8080/winery/servicetemplates`.


### Topologymodeler
During development, the repository UI depends on the development version of the topologymodeler. Therefore,
you need to have both angular apps running with the local development server outlined below.

Otherwise, the repository UI assumes that the topologymodeler runs on
- the same host,
- the same protocol,
- the same port
- and is reachable under the context `/winery-topologymodeler-ui`

#### Old Topologymodeler
Currently, there is a link to the old topologymodeler in the repository UI, since the new one does not support
all features yet. Please use the old topologymodeler only in those edge cases and create bugs, if something isn't working
as expected in the angular app.

The old topologymodeler should run on
1. the same machine as the backend and
1. and must be reachable under the context `/winery-topologymodeler`

This will be removed in near future!


## Setup Local Development Server
1. `npm install`
2. `npm start` or `ng serve`
    - be sure that no other application is listening on port 4200
    - if you want to run using `--aot`, run `npm run dev-aot` or `ng serve --aot`
3. Now the server is running on `http://localhost:4200`
    
### Setup IntelliJ
1. Add a new run configuration
   1. To to `Run > Edit Configurations...`
   1. Click the green plus in the upper left corner
   1. Choose NPM
   1. Set the name
   1. Choose the package.json from the corresponding modules (UI/topologyModeler)
   1. Select `start` from the Command dropdown
   1. Approve by clicking `Apply`
1. Now choose the created run configuration and press the green triangle to run the angular app


## TSLint
1. Go to `File -> Settings -> Language and Frameworks -> TypeScript -> TSLint`
2. Set `Enabled` to true
3. Press `OK` 

Usually IntelliJ finds the `tslint.json` automatically, otherwise configure it in the same window yourself.  

### Auto-format and fix TsLint issues
- Use <kbd>Strg</kbd> + <kbd>Shift</kbd> + <kbd>Alt</kbd> + <kbd>L</kbd> and ensure that the checkmark at `Optimize Imports` is set.
- Now you can use the <kbd>Strg</kbd> + <kbd>Alt</kbd> + <kbd>L</kbd> shortcut to auto-format your code
- If there are still TsLint errors, you can fix them by pressing <kbd>Alt</kbd> + <kbd>Enter</kbd> and select `TSLint: Fix current ...`
- Or you can use the auto fix functionality provided by TSLint. You can do this by running `ng lint --fix`.

## Production Build
After step 3 at setting up local development server do
1. `npm run build` or `ng build`

### API Documentation
The documentation gets build by running `npm run doc`. The generated Documentation can be found at `/doc/index.html`.
It is generated by the comments describing a class/method/member. Examples can be found in the `WineryTableComponent` 
or the `WineryModalComponent`.
    
## Just do Linting
Simply use `npm run lint` or `ng lint`.

You can also set up a IntelliJ run configuration as outlined above. Instead of choosing `start` in step 6, choose
`run` and select `lint` from the script dropdown.

## Generate war files
Execute `mvn package`.


## Development Hints
- [Exiting a for-each loop early](https://stackoverflow.com/a/2641374/6592788) 


## License

Copyright (c) 2017 Contributors to the Eclipse Foundation

See the NOTICE file(s) distributed with this work for additional
information regarding copyright ownership.

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
which is available at https://www.apache.org/licenses/LICENSE-2.0.

SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
