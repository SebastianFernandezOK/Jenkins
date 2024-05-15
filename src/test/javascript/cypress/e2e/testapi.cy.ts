describe('Login and navigate to a page', () => {
  it('Logs in, navigates to entities, clicks on product, and views the first product', () => {
    const username = 'admin';
    const password = 'admin';

    const LoginSesion = {
      username: 'admin',
      password: 'admin',
      rememberMe: true,
    };

    cy.request({
      method: 'POST',
      url: '/api/authenticate',
      body: LoginSesion,
      headers: {
        'Content-Type': 'application/json',
      },
    }).then(response => {
      expect(response.status).to.eq(200);
      cy.visit('/admin/health');
    });
  });
});
