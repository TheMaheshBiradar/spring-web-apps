class App extends React.Component {
    constructor(props) {
        super(props);
        this.checkLoanDefaulter = this.checkLoanDefaulter.bind(this);
        this.state = {
            isLoading: true,
            isDefaulter:false,
            showDefaulterResult:false,
        };
    }

    componentDidMount() {
        setTimeout(() => this.setState({ isLoading: false }), 1000); // simulates an async action, and hides the spinner
      }

    // Check Default Defaulter
    checkLoanDefaulter(customer) {
        console.log(customer);
        fetch('http://localhost:9090/loan-defaulter-check', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(customer)
        })
        .then((response) => response.json())
        .then((responseData) => {
            this.setState({
               //response loan: responseData.loanStatus.
                isLoading: false,
                isDefaulter:responseData.defaulter,
                showDefaulterResult:true
            });

        }).catch(err => console.error(err));
           
    }   
    render() {  

        let isContentLoading = this.state.isLoading;

        let resultTable =this.state.showDefaulterResult && <DefaulterResultTable results={this.state.results} />
        return (
            <div>
                {isContentLoading ? (null) :

                    (<div>
                        <DefaulterForm checkLoanDefaulter={this.checkLoanDefaulter} />
                        {resultTable}
                    </div>)}
       </div>
        );
    }
}

class DefaulterResultTable extends React.Component {
    constructor(props) {
        super(props);
    }
    //  <tbody>{results}</tbody>

    render() {
        return (
            <div>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>Customer ID</th><th>Defaulter Status</th><th>Client Advisor</th><th> </th>
                        </tr>
                    </thead>
                   
                </table>
            </div>);
    }
}

class ResultEntry extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
           <div>---</div>

        );
    }
}

class DefaulterForm extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
                gender: '', age: '', debtAmount: '', married: '', bankCustomer: '', 
                educateLevel: '', enthinicity: '', yearsEmployed: '', priorDefault: '', 
                employed: '',creditScore: '', citizen: '', zipcode: '', income: ''
        };

        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event) {
        console.log("NAME: " + event.target.id + " VALUE: " + event.target.value)
        this.setState(
            { [event.target.id]: event.target.value }
        );
    }

    handleSubmit(event) {
        event.preventDefault();
        this.props.checkLoanDefaulter(this.state);
    }

    render() {
        return (
            <form className="card card-block bg-faded" onSubmit={this.handleSubmit}>
                <legend className="m-b-1 text-xs-center">Loand Defaulter Prediction</legend>

			    <div className="form-group input-group">
                    <span className="has-float-label">
                        <input  value={this.state.gender} className="form-control" id="gender" type="text" placeholder="Enter Your Gender" onChange={this.handleChange} />
                        <label for="gender">Gender</label>
                    </span>
                </div>
			


                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input  value={this.state.age} className="form-control" id="age" type="text" placeholder="Enter your age" onChange={this.handleChange} />
                        <label for="age">Age</label>
                    </span>
                </div>


                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.debtAmount} id="debtAmount" type="text" placeholder="Debt Amount" onChange={this.handleChange} />
                        <label for="debtAmount">Debt Amount</label>
                    </span>
                </div>


                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.married} id="married" type="text" placeholder="Marital Status" onChange={this.handleChange} />
                        <label for="married">Marital Status</label>
                    </span>
                </div>

			     <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.bankCustomer} id="bankCustomer" type="text" placeholder="Is a Bank Customer" onChange={this.handleChange} />
                        <label for="bankCustomer">Bank Customer</label>
                    </span>
                </div>
			
			     <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.educateLevel} id="educateLevel" type="text" placeholder="Educate Level" onChange={this.handleChange} />
                        <label for="educateLevel">Educate Level</label>
                    </span>
                </div>
			
                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control"  value={this.state.enthinicity} id="enthinicity" type="text" placeholder="Enthinicity" onChange={this.handleChange} />
                        <label for="enthinicity">Enthinicity</label>
                    </span>
                </div>




                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control"  value={this.state.yearsEmployed} id="yearsEmployed" type="text" placeholder="Years Employed" onChange={this.handleChange} />
                        <label for="yearsEmployed">Years Employed</label>
                    </span>
                </div>


                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control"  value={this.state.priorDefault} id="priorDefault" type="text" placeholder="Prior Default" onChange={this.handleChange} />
                        <label for="priorDefault">Prior Default</label>
                    </span>
                </div>



				                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control"  value={this.state.employed} id="employed" type="text" placeholder="Is Employed" onChange={this.handleChange} />
                        <label for="employed">Employed</label>
                    </span>
                </div>
				
                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.creditScore} id="creditScore" type="text" placeholder="Credit Score" onChange={this.handleChange} />
                        <label for="creditScore">Credit Score</label>
                    </span>
                </div>
                
                	
                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.citizen} id="citizen" type="text" placeholder="Is Citizen" onChange={this.handleChange} />
                        <label for="citizen">Citizen</label>
                    </span>
                </div>

                


                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.zipcode} id="zipcode" type="text" placeholder="Zipcode" onChange={this.handleChange} />
                        <label for="zipcode">Zipcode</label>
                    </span>
                </div>


                <div className="form-group input-group">
                    <span className="has-float-label">
                        <input className="form-control" value={this.state.income} id="income" type="number" placeholder="Income" onChange={this.handleChange} />
                        <label for="income">Income</label>
                    </span>
                </div>
                <button className="btn btn-primary" type="submit">Predict Loan Default</button>
            </form>
        );
    }
}

ReactDOM.render(<App />, document.getElementById('root'));